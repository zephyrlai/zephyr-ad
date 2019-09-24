package cn.zephyr.advice;

import cn.zephyr.annoation.IgnoreResponseBodyAdvice;
import cn.zephyr.result.CommonResponseData;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @ClassName: CommonResponseDataAdvice
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/24 19:04
 */
@RestControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice {
    /**
     * advice增强的忽略条件
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        if(methodParameter.getMethod().getAnnotation(IgnoreResponseBodyAdvice.class) != null)
            return false;
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        CommonResponseData<Object> responseData = new CommonResponseData<Object>(0,"succ");
        if(o == null){
            // no data,do nothing.
        }
        else if(o instanceof CommonResponseData){
            responseData = (CommonResponseData<Object>)o;
        }else {
            responseData.setData(o);
        }
        return responseData;
    }
}
