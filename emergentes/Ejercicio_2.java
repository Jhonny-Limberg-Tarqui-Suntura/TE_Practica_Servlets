package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_2", urlPatterns = {"/Ejercicio_2"})
public class Ejercicio_2 extends HttpServlet {
@Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 2</h1>");
            out.println("<form action='Ejercicio_2' method='post'>");
            out.println("<label> INGRESE UN NUMERO:  </label>");
            out.println("<input type='number' min='0' name='numero'>");
            out.println("<br>");
            out.println("<input type='submit' value='SACAR FACTORIAL'>");
            out.println("</form>");
            out.println("<strong><a href='Main'>Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numero=request.getParameter("numero");
        int n=Integer.parseInt(numero);
        int fac=Factorial(n);
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 2</h1>");
            out.println("<p>El número ingresado es: "+n+"</p>");
            out.println("<p>Su factorial es: "+fac+"</p>");
            out.println("<strong><a href='Ejercicio_2'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public static int Factorial(int num){
        int fac;
        if(num>0){
            fac=1;
            for(int i=1;i<=num;i++){
                fac*=i;
            }
        }
        else{
            fac=1;
        }
        return fac;
    }
}
