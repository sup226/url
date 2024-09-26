package com.spring.basic.servlet.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/member/join")
public class MemberJoinServlet extends HttpServlet {
    @Override
    protected void service(HtppServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberJoinServlet의 service 호출!");
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(id, pw, username, age);
        System.out.println(member);

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter w = response.getWriter();

        w.write("<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <h2>회원 가입 성공!</h2>
    <ul>
        <li>" +member.getUserName() + "님 환영합니다!</li>\n" +
        <li>id: ???</li>
        <li>나이: ???</li>
    </ul>
</body>
</html>");
    }


}
