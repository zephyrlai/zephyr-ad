package cn.zephyr.service.impl;

import cn.zephyr.dao.CreativeRepository;
import cn.zephyr.entity.Creative;
import cn.zephyr.service.ICreativeService;
import cn.zephyr.vo.req.CreativeRequest;
import cn.zephyr.vo.res.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ICreativeServiceImpl
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/10/2 21:01
 */
@Service
public class ICreativeServiceImpl implements ICreativeService {
    @Autowired
    private CreativeRepository creativeRepository;
    /**
     * 单条创建
     * @param request
     * @return
     */
    @Override
    public CreativeResponse createCreative(CreativeRequest request) {
        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );
        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
