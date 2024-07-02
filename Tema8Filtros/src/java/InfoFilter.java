
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;


@WebFilter("/*")

public class InfoFilter implements Filter{
    

@Override 
    public void init (FilterConfig filterCongig) throws ServletException {
        
    }
    
    @Override 
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest httpRequest=(HttpServletRequest)request;
        String nombreServidor=httpRequest.getServerName();
        String puerto=Integer.toString(httpRequest.getLocalPort());
        String direccion=httpRequest.getServletPath();
        
        System.out.println("Nombre del Servidor: " + nombreServidor);
        System.out.println("Puerto: " + puerto);
        System.out.println("Direccion: " + direccion);
 
        chain.doFilter(request, response);
    }
    
    @Override
    public void destroy(){
        
    }
}
