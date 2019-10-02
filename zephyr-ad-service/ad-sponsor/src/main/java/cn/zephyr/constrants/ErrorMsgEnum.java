package cn.zephyr.constrants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: ErrorMsgEnum
 * @Author: laizonghao
 * @Description: 错误信息枚举
 * @Date: 2019/9/29 10:49
 */
@AllArgsConstructor
@Getter
public enum ErrorMsgEnum {
    REQUEST_PARAM_ERROR("REQUEST_PARAM_ERROR","参数请求错误"),
    SAME_NAME_ERROR("SAME_NAME_ERROR","存在同名的用户"),
    CAN_NOT_FIND_RECORD("CAN_NOT_FIND_RECORD","数据不存在"),
    SAME_NAME_PLAN_ERROR("SAME_NAME_PLAN_ERROR","存在同名的推广计划"),
    SAME_NAME_UNIT_ERROR("SAME_NAME_UNIT_ERROR","存在同名的推广单元"),

    ;
    private String key;
    private String desc;
}
