package cn.zephyr.controller;

import cn.zephyr.service.ICreativeService;
import cn.zephyr.vo.req.CreativeRequest;
import cn.zephyr.vo.res.CreativeResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CreativeController
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/10/2 21:06
 */
@Slf4j
@RestController
public class CreativeController {
    @Autowired
    private ICreativeService creativeService;


    @PostMapping("/create/creative")
    public CreativeResponse createCreative(@RequestBody CreativeRequest request) {
        log.info("ad-sponsor: createCreative -> {}",JSON.toJSONString(request));
        return creativeService.createCreative(request);
    }
}

