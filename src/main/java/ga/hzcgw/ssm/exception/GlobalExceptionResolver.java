package ga.hzcgw.ssm.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("ex", "默认的错误信息");

        if (ex instanceof ParamsException) {
            mv.setViewName("params_error");
            mv.addObject("ex", ((ParamsException) ex).getMsg());
        }

        if (ex instanceof BusinessException) {
            mv.setViewName("business_error");
            mv.addObject("ex", ((BusinessException) ex).getMsg());
        }

        return mv;
    }
}
