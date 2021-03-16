package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_6", urlPatterns = {"/Ejercicio_6"})
public class Ejercicio_6 extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 6</h1>");
            out.println("<form action='Ejercicio_6' method='post'>");
            out.println("<strong><label>JUEGO DE DADOS</label></strong>");
            out.println("<br>");
            out.println("<input type='submit' value='LANZAR DADOS'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<strong><a href='Main'>Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int dado1, dado2, s;
        dado1=(int)(Math.random()*6+1);
        dado2=(int)(Math.random()*6+1);
        s=dado1+dado2;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 6</h1>");
            out.println("<p>El valor del Primer Dado es: <strong> " +dado1+ " </strong></p>");
            out.println("<p>El calor del Segundo Dado es: <strong> " +dado2+ " </strong></p>");
            out.println("<p>La suma de ambos dados es: <strong> " +s+ " </strong></p>");
            out.println("<br>");

            if(s==7 || s==11){
                out.println("<strong><h3>GANASTE</h3></strong>");
            }
            else{
                out.println("<strong><h3>PERDISTE</h3></strong>");
            }

            out.println("<br>");
            out.println("<strong><a href='Ejercicio_6'>Volver</a></strong>");
            out.println("</body>");
            out.println("</html>");

        }

    }
}
