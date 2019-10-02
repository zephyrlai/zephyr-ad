package cn.zephyr.service;

import cn.zephyr.vo.req.CreativeRequest;
import cn.zephyr.vo.res.CreativeResponse;

/**
 * @ClassName: ICreativeService
 * @Author: laizonghao
 * @Description: 创意服务
 * @Date: 2019/10/2 21:00
 */
public interface ICreativeService {

    /**
     * 单条创建
     * @param request
     * @return
     */
    CreativeResponse createCreative(CreativeRequest request);
}
