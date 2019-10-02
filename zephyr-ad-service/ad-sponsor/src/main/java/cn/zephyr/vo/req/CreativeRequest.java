package cn.zephyr.vo.req;

import cn.zephyr.constrants.CommonStatus;
import cn.zephyr.entity.Creative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: CreativeRequest
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/30 15:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreativeRequest {
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Long size;
    private Integer duration;
    private Long userId;
    private String url;

    public Creative convertToEntity() {

        Creative creative = new Creative();
        creative.setName(name);
        creative.setType(type);
        creative.setMaterialType(materialType);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setSize(size);
        creative.setDuration(duration);
        creative.setAuditStatus(CommonStatus.VALID.getCode());
        creative.setUserId(userId);
        creative.setUrl(url);
        creative.setCreateTime(new Date());
        creative.setUpdateTime(creative.getCreateTime());

        return creative;
    }
}
