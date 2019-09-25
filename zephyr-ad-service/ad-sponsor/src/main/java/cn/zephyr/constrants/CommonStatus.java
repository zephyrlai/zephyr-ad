package cn.zephyr.constrants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CommonStatus
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/25 10:56
 */
@AllArgsConstructor
@Getter
public enum CommonStatus {
    VALID(0,"有效"),
    INVALID(-1,"无效"),
    ;

    private Integer code;
    private String desc;


}
