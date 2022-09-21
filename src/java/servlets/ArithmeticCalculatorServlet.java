/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miller Gee
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                request.setAttribute("calc","---");

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int f;
        int s;
        int x = 0;
        try{
        f = Integer.parseInt(request.getParameter("first"));
        s = Integer.parseInt(request.getParameter("second"));
        switch(request.getParameter("calc")){
            case "*":
                x = f*s;
                break;
            case "+":
                x = f+s;
                break;
            case "-":
                x = f-s;
                break;
            case "%":
                x = f/s;
                break;
        }
        String y = x+"";
        request.setAttribute("calc",x);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);

        }catch(NumberFormatException e){
        request.setAttribute("calc","invalid");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);


        }
    }

  

}
