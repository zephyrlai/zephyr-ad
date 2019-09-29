package cn.zephyr.dao;

import cn.zephyr.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: AdUserRepository
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 10:45
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);
}
