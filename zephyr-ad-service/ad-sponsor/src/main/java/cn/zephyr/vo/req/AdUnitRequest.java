package cn.zephyr.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @ClassName: AdUnitRequest
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitRequest {
    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    public boolean createValidate() {
        return null != planId && !StringUtils.isEmpty(unitName)
                && positionType != null && budget != null;
    }
}
