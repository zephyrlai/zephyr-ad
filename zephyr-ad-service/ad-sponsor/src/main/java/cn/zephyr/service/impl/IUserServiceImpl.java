package cn.zephyr.service.impl;

import cn.zephyr.constrants.ErrorMsgEnum;
import cn.zephyr.dao.AdUserRepository;
import cn.zephyr.entity.AdUser;
import cn.zephyr.exception.AdException;
import cn.zephyr.service.IUserService;
import cn.zephyr.utils.CommonUtils;
import cn.zephyr.vo.req.CreateUserRequest;
import cn.zephyr.vo.res.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: IUserServiceImpl
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 10:59
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private AdUserRepository userRepository;

    /**
     * 新增用户
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(ErrorMsgEnum.REQUEST_PARAM_ERROR.getDesc());
        }

        AdUser oldUser = userRepository.
                findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(ErrorMsgEnum.SAME_NAME_ERROR.getDesc());
        }

        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
