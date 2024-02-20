package sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 FirstServlet " + request);
		//request가 두번 일어남
		//response.sendRedirect("http://www.naver.com"); //지정된 리디렉션 위치 URL을 사용하여 클라이언트에 임시 리디렉션 응답을 보내고 버퍼를 지웁니다.
//		response.sendRedirect("http://localhost:8090/pro08/second");
		
		// 1)redirect 방법
		response.sendRedirect("second?name=hong");
		
		
		
		
		// 2)refresh
//		response.addHeader("Refresh", 	"1;url=second");
//		response.addHeader("Refresh", 	"5;url=http://www.naver.com");
//		
//		Collection<String> coll=response.getHeaderNames();
//		System.out.println(coll);
		
		// 3)자바스크립트의 location 객체 
		
//		PrintWriter pw=response.getWriter();
//		pw.write("<script> location.href = 'second' </script>");
	}

}
