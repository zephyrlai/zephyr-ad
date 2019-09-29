package cn.zephyr.constrants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CreativeMetrialType
 * @Author: laizonghao
 * @Description: 创意材料类型枚举
 * @Date: 2019/9/29 10:50
 */
@AllArgsConstructor
@Getter
public enum CreativeMetrialType {
    JPG("1", "jpg"),
    BMP("2", "bmp"),

    MP4("3", "mp4"),
    AVI("4", "avi"),

    TXT("5", "txt");

    private String key;
    private String desc;
}
