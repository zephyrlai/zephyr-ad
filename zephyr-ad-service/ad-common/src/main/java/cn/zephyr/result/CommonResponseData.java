package cn.zephyr.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: CommonResponseData
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/24 19:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseData<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public CommonResponseData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
