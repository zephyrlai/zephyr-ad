package cn.zephyr.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @ClassName: IgnoreResponseBodyAdvice
 * @Author: laizonghao
 * @Description: 忽略结果转化注解
 * @Date: 2019/9/24 19:05
 */
@Target(ElementType.METHOD)
public @interface IgnoreResponseBodyAdvice {
}
