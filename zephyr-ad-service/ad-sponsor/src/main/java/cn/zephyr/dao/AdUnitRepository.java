package cn.zephyr.dao;

import cn.zephyr.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdUnitRepository
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 10:45
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
