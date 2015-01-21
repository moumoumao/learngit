package  manage.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ��¼������
 * @author jy
 *
 */
public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest  httpReq  = (HttpServletRequest) request;  
        HttpServletResponse httpResp = (HttpServletResponse) response; 
        HttpSession session=httpReq.getSession();//��ȡsession
        String path = httpReq.getServletPath();//��ȡ��ǰ����ҳ���ַ
        String name = httpReq.getServerName();
        System.out.println("path:"+path+"\nname:"+name);
        if(path.equals("/login.jsp")){
        	chain.doFilter(request, response);//Ϊ��¼���������ò���
        }else if(session==null||session.getAttribute("userSession")==null){
        	//�û���δ��½
        	httpResp.sendRedirect("login.jsp");
        }else{
        	chain.doFilter(request, response);
        }

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
