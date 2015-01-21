package manage.util;
import java.io.IOException;

import javax.servlet.Filter; 
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginFilter implements Filter{
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest  httpReq  = (HttpServletRequest) request;  
         HttpServletResponse httpResp = (HttpServletResponse) response;  
         httpResp.setContentType("text/html"); 
         //��ȡ��ת������ҳ������
         String servletPath = httpReq.getServletPath();  
         //�ж��Ƿ��ǵ�½ҳ��  
         //flag:��Ϊ��½ҳ���action·�� showloginPath/nologinPath,��ֵtrue������ֵfalse  
         boolean flag = false;  
         if(servletPath.equals("/showLogin.jsp") ){  
             chain.doFilter(request, response);  
             flag = true;  
             return;  
         }  
         else  
         {   //������ǵ�¼ҳ�棬�������ж��û��Ƿ��ѵ�¼  
             //String url = servletPath;  
             Object loginId = httpReq.getSession().getAttribute("user");  
             if(loginId != null){//�����Ϊ��,������ѵ�¼����  
                 chain.doFilter(request, response);  
             }else{//���Ϊ��,�����δ��¼����  
                 if ( httpReq.getQueryString() != null )  
                 {  
                     servletPath += "?"+httpReq.getQueryString();  
                 }  
                 httpReq.getSession().setAttribute("returnUri", servletPath);  
                 if ( flag == false )  
                 {    
                    httpReq.getRequestDispatcher("/showLogin.jsp").forward(httpReq,httpResp);  
                 }   
             }  
         }  
		
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

}
