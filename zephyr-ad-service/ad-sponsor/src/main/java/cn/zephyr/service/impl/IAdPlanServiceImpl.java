package cn.zephyr.service.impl;

import cn.zephyr.constrants.CommonStatus;
import cn.zephyr.constrants.ErrorMsgEnum;
import cn.zephyr.dao.AdPlanRepository;
import cn.zephyr.dao.AdUserRepository;
import cn.zephyr.entity.AdPlan;
import cn.zephyr.entity.AdUser;
import cn.zephyr.exception.AdException;
import cn.zephyr.service.IAdPlanService;
import cn.zephyr.utils.CommonUtils;
import cn.zephyr.vo.req.AdPlanGetRequest;
import cn.zephyr.vo.req.AdPlanRequest;
import cn.zephyr.vo.res.AdPlanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName: IAdPlanServiceImpl
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 11:11
 */
@Service
public class IAdPlanServiceImpl implements IAdPlanService {

    @Autowired
    private AdPlanRepository planRepository;
    
    @Autowired
    private AdUserRepository userRepository;

    /**
     * <h2>创建推广计划</h2>
     *
     * @param request
     */
    @Override
    @Transactional
    public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {
        if (!request.createValidate()) {
            throw new AdException(ErrorMsgEnum.REQUEST_PARAM_ERROR.getDesc());
        }
        // 确保关联的 User 是存在的
        Optional<AdUser> adUser =
                userRepository.findById(request.getUserId());
        if (!adUser.isPresent()) {
            throw new AdException(ErrorMsgEnum.CAN_NOT_FIND_RECORD.getDesc());
        }

        AdPlan oldPlan = planRepository.findByUserIdAndPlanName(
                request.getUserId(), request.getPlanName()
        );
        if (oldPlan != null) {
            throw new AdException(ErrorMsgEnum.SAME_NAME_PLAN_ERROR.getDesc());
        }

        AdPlan newAdPlan = planRepository.save(
                new AdPlan(request.getUserId(), request.getPlanName(),
                        CommonUtils.parseStringDate(request.getStartDate()),
                        CommonUtils.parseStringDate(request.getEndDate())
                )
        );

        return new AdPlanResponse(newAdPlan.getId(),
                newAdPlan.getPlanName());
    }

    /**
     * <h2>获取推广计划</h2>
     *
     * @param request
     */
    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(ErrorMsgEnum.REQUEST_PARAM_ERROR.getDesc());
        }

        return planRepository.findAllByIdInAndUserId(
                request.getIds(), request.getUserId()
        );
    }

    /**
     * <h2>更新推广计划</h2>
     *
     * @param request
     */
    @Override
    @Transactional
    public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {
        if (!request.updateValidate()) {
            throw new AdException(ErrorMsgEnum.REQUEST_PARAM_ERROR.getDesc());
        }

        AdPlan plan = planRepository.findByIdAndUserId(
                request.getId(), request.getUserId()
        );
        if (plan == null) {
            throw new AdException(ErrorMsgEnum.CAN_NOT_FIND_RECORD.getDesc());
        }

        if (request.getPlanName() != null) {
            plan.setPlanName(request.getPlanName());
        }
        if (request.getStartDate() != null) {
            plan.setStartDate(
                    CommonUtils.parseStringDate(request.getStartDate())
            );
        }
        if (request.getEndDate() != null) {
            plan.setEndDate(
                    CommonUtils.parseStringDate(request.getEndDate())
            );
        }

        plan.setUpdateTime(new Date());
        plan = planRepository.save(plan);

        return new AdPlanResponse(plan.getId(), plan.getPlanName());
    }

    /**
     * <h2>删除推广计划</h2>
     *
     * @param request
     */
    @Override
    @Transactional
    public void deleteAdPlan(AdPlanRequest request) throws AdException {
        if (!request.deleteValidate()) {
            throw new AdException(ErrorMsgEnum.REQUEST_PARAM_ERROR.getDesc());
        }

        AdPlan plan = planRepository.findByIdAndUserId(
                request.getId(), request.getUserId()
        );
        if (plan == null) {
            throw new AdException(ErrorMsgEnum.CAN_NOT_FIND_RECORD.getDesc());
        }

        plan.setPlanStatus(CommonStatus.INVALID.getCode());
        plan.setUpdateTime(new Date());
        planRepository.save(plan);
    }
}
