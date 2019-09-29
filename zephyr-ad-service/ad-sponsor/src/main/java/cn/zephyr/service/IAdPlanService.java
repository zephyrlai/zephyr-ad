package cn.zephyr.service;

import cn.zephyr.entity.AdPlan;
import cn.zephyr.exception.AdException;
import cn.zephyr.vo.req.AdPlanGetRequest;
import cn.zephyr.vo.req.AdPlanRequest;
import cn.zephyr.vo.res.AdPlanResponse;

import java.util.List;

/**
 * @ClassName: IAdPlanService
 * @Author: laizonghao
 * @Description: 推广计划服务
 * @Date: 2019/9/29 11:06
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
