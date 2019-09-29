package cn.zephyr.vo.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: AdPlanResponse
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanResponse {
    private Long id;
    private String planName;
}
