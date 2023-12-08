package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugudantable") //url 호출
public class GugudanTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Gugudan 입니다");
		//localhost:8080/ServletStudy/gugudan?num=2
		//?num=11: 뒤에 추가시 11단으로 바뀜
		String snum = req.getParameter("num");
		int num =2;//default값
		if(snum!=null) num = Integer.parseInt(snum);
		
		String dir = req.getParameter("dir");
		if(dir==null) dir="hor";
	
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		
		String direction;
		out.println("<table>");
		if(dir.equals("hor")) {
			for(int n=num;n<10;n++) {
				out.println("<th>"+n+"단입니다"+"</th>");
			}
			for(int i=1;i<10;i++) {
				out.println("<tr>");
				
				for(int n=num;n<10;n++) {
					out.println("<td>"+"● "+n+"*"+i+"="+n*i+"</td>");
				}
			out.println("</tr>");
			}
		}
		else {
			for(int n=num;n<10;n++) {
				out.println("<th>"+n+"단입니다"+"</th>");
				for(int i=1;i<10;i++) {
					out.println("<tr>");
						out.println("<td>"+"● "+n+"*"+i+"="+n*i+"</td>");
				out.println("</tr>");
				}
			}
		}
		out.println("</table>");
		
		out.close();
	}
}
//service ctrl shift o
