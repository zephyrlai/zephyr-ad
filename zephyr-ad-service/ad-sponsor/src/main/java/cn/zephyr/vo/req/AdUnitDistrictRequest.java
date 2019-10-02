package cn.zephyr.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: AdUnitDistrictRequest
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/29 19:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitDistrictRequest {
    private List<UnitDistrict> unitDistricts;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitDistrict {

        private Long unitId;
        private String province;
        private String city;
    }
}
