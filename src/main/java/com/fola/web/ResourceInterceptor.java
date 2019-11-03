package com.fola.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class ResourceInterceptor extends HandlerInterceptorAdapter {
  @Override
  public boolean preHandle(HttpServletRequest requestServlet, HttpServletResponse responseServlet, Object handler)
      throws Exception {
    System.out.println("Resource: PREHANDLE *******");

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    System.out.println("STATUS = " + response.getStatus());
    System.out.println("Resource: POSTHANDLE ******");
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
      Exception exception) throws Exception {
    System.out.println("Resource: AFTERCOMPLETION *******");
  }
}
