package cn.zephyr.dao;

import cn.zephyr.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: CreativeRepository
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 10:46
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
