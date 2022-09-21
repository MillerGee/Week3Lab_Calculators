
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
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("age") == ""){
           request.setAttribute("age", "You must give your current age");
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
           
        }else{
        try{
        int age = Integer.parseInt(request.getParameter("age"));
        request.setAttribute("age","Your age next birthday will be " + (age+1));
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        }catch(NumberFormatException e){
            String x = "You must enter a number.";
            request.setAttribute("age",x);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

       }
      }
    }

    

}
