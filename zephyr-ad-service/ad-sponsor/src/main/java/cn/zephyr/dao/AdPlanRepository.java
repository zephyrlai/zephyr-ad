package cn.zephyr.dao;

import cn.zephyr.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: AdPlanRepository
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 10:43
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {
    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
