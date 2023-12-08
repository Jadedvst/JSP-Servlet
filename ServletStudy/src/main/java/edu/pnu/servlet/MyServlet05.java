package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet05") //url 호출
public class MyServlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("MyServlet05 입니다");
		
		res.setContentType("text/html; charset=utf-8");
		//text가 html형식으로
		PrintWriter out = res.getWriter();
		out.println("""
				<style>
				table, th, td {
				border: 1px solid;
				}
				th{
				background-color:grey
				}
				th, td {
				width:10%;
				}
				</style>
				""");
		out.println("""
				<body>
					<table>
						<tr>
							<th>번호</th>
							<th>나라</th>
							<th>수도</th>
							<th>인구</th>
						</tr>
						<tr>
							<td>1</td>
							<td>대한민국</td>
							<td>서울</td>
							<td>1000</td>
						</tr>
						<tr>
							<td>2</td>
							<td>미국</td>
							<td>워싱턴</td>
							<td>70</td>
						</tr>
						<tr>
							<td>3</td>
							<td>일</td>
							<td>도</td>
							<td>1400</td>
						</tr>
						<tr>
							<td>4</td>
							<td>중</td>
							<td>베</td>
							<td>2100</td>
						</tr>
					</table>
				</body>
 """);
		out.close();
	}
}
//service ctrl shift o
