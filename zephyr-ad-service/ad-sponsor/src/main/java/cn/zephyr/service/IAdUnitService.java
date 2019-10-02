package cn.zephyr.service;

import cn.zephyr.exception.AdException;
import cn.zephyr.vo.req.*;
import cn.zephyr.vo.res.*;

/**
 * @ClassName: IAdUnitService
 * @Author: laizonghao
 * @Description: 推广单元服务
 * @Date: 2019/9/29 19:15
 */
public interface IAdUnitService {
    /**
     * 新增广告推广单元
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    /**
     * 新增推广单元关键词限制
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    /**
     * 推广单元地域限制
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

    /**
     * 新增创意单元
     * @param request
     * @return
     * @throws AdException
     */
    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
            throws AdException;
}
