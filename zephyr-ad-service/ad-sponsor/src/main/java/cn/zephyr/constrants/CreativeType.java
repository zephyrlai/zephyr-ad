package cn.zephyr.constrants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CreativeType
 * @Author: laizonghao
 * @Description: 创意类型枚举
 * @Date: 2019/9/29 10:51
 */
@AllArgsConstructor
@Getter
public enum CreativeType {
    IMAGE("1", "图片"),
    VIDEO("2", "视频"),
    TEXT("3", "文本");

    private String key;
    private String desc;

}
