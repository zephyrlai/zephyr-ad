package cn.zephyr.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdUnitItRequest
 * @Author: laizonghao
 * @Description: 推广单元与兴趣关联
 * @Date: 2019/9/29 19:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitItRequest {
    private List<UnitIt> unitIts;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitIt {

        private Long unitId;
        private String itTag;
    }
}
