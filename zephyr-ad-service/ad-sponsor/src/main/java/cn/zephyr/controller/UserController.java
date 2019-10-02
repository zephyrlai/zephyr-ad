package cn.zephyr.controller;

import cn.zephyr.exception.AdException;
import cn.zephyr.service.IUserService;
import cn.zephyr.vo.req.CreateUserRequest;
import cn.zephyr.vo.res.CreateUserResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/10/2 21:07
 */
@Slf4j
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}",
                JSON.toJSONString(request));
        return userService.createUser(request);
    }
}

