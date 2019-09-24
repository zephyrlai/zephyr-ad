package cn.zephyr.advice;

import cn.zephyr.exception.AdException;
import cn.zephyr.result.CommonResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionAdvice
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/24 19:15
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler()
    public CommonResponseData<String> adExceptionHandler(HttpServletRequest request, AdException exception){
        CommonResponseData<String> responseData = new CommonResponseData<>(-1, "business exception");
        responseData.setData(exception.getMessage());
        return responseData;
    }
}
