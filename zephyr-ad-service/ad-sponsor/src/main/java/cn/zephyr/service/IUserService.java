package cn.zephyr.service;

import cn.zephyr.exception.AdException;
import cn.zephyr.vo.req.CreateUserRequest;
import cn.zephyr.vo.res.CreateUserResponse;

/**
 * @ClassName: IUserService
 * @Author: laizonghao
 * @Description: 用户服务
 * @Date: 2019/9/29 10:56
 */
public interface IUserService {
    /**
     * 新增用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
