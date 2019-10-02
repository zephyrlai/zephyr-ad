package cn.zephyr.vo.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdUnitItResponse
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 19:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitItResponse {
    private List<Long> ids;
}
