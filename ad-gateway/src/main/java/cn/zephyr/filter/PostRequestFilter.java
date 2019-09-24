package cn.zephyr.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @ClassName: PostRequestFilter
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/24 18:32
 */
public class PostRequestFilter extends ZuulFilter {
    /**
     * 过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    /**
     * 过滤器执行顺序（数值越小优先级越高）
     * @return
     */
    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    /**
     * 是否开启过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        Long startTime = (Long)context.get("startTime");
        System.err.println("请求执行时间："+(System.currentTimeMillis()-startTime)+"ms");
        return null;
    }
}
