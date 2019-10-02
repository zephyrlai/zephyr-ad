package cn.zephyr.vo.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: CreativeUnitResponse
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 19:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitResponse {
    private List<Long> ids;
}
