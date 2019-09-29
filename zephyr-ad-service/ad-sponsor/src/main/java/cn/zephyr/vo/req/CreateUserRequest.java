package cn.zephyr.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @ClassName: CreateUserRequest
 * @Author: laizonghao
 * @Description: 新增用户请求类
 * @Date: 2019/9/29 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String username;

    public boolean validate() {
        return !StringUtils.isEmpty(username);
    }
}
