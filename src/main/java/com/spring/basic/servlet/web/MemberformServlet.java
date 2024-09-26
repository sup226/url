package com.spring.basic.servlet.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/member/form")
public class MemberformServlet {
    @Override
    protected void service(HttpServletReauest reauest,
                           HttpServletResponse response) throws ServletException, IOException)

    {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter w = response.getWriter();

        w.write(<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원가입 form</title>
  </head>
  <body>
    <form action="/servlet/member/form" method ="\"post\">\n">
            아이디: <input type="text" name="id" /> <br />
            비밀번호: <input type="password" name="pw" /> <br />
            이름: <input type="text" name="username" /> <br />
            나이: <input type="text" name="age" /> <br />
      <button type="submit">회원가입</button>
    </form>
  </body>
</html>);


    }
}
