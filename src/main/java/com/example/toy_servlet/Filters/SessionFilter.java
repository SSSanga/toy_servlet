package com.example.toy_servlet.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") // 모든 URL 패턴에 필터를 적용합니다.
public class SessionFilter implements Filter  {
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            System.out.println(request.getRemoteHost()); // 클라이언트의 호스트 정보를 출력합니다.
            System.out.println(request.getRemoteAddr()); // 클라이언트의 IP 주소를 출력합니다.
            
            // 필터 체인을 계속 진행하고, 다음 필터 또는 실제 서블릿으로 제어를 전달합니다.
            // chain.doFilter(request, response);
            
            // 만약 필터 체인의 마지막 필터인 경우, 아래의 코드를 사용하여 실제 서블릿으로 제어를 전달할 수도 있습니다.
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LoginPage");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // 예외가 발생했을 때 적절한 예외 처리를 수행해야 합니다.
        }
        // throw new UnsupportedOperationException("Unimplemented method 'doFilter'"); -> 이 부분은 주석 처리하였습니다.
    }
}
