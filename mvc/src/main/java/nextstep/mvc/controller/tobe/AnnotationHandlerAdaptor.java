package nextstep.mvc.controller.tobe;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nextstep.mvc.HandlerAdaptor;
import nextstep.mvc.view.ModelAndView;

public class AnnotationHandlerAdaptor implements HandlerAdaptor {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof HandlerExecution;
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
        Exception {
        return ((HandlerExecution) handler).handle(request, response);
    }
}
