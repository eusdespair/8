import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class LoggingFilter implements Filter {
    
    @Override 
    public void init (FilterConfig filterCongig) throws ServletException {
        
    }
    
    @Override 
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        System.out.println("Solicitud recibida a las: " + new java.util.Date());
        
        chain.doFilter(request, response);
        
        System.out.println("Respuesta enviada a las: " + new java.util.Date());
        
    }
    
    @Override
    public void destroy(){
        
    }
    
}
