package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Ejercicio_7", urlPatterns = {"/Ejercicio_7"})
public class Ejercicio_7 extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJERCICIO Nº 7</h1>");
            out.println("<h3>MATRIZ CARACOL </h3>");
            out.println("<form action='Ejercicio_7' method='post'>");
            out.println("<label>DIMENSION DE LA MATRIZ: </label>");
            out.println("<input type='number' min='1' name='numero'>");
            out.println("<br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("<strong><a href='Main' >Volver al Inicio</a></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numero=request.getParameter("numero");
        int n;
        if(numero!=null){
            n=Integer.parseInt(numero);
        }
        else{
            n=4;
        }
        int m[][];
        m=Caracol(n);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJERCICIO 7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LA MATRIZ CARACOL ES LA SIGUIENTE</h1>");
            out.println("<p><strong> MATRIZ DE "+n+" POR "+n+ " CUADRADA </strong></p>");
            out.println("<table border='1'>");
            out.println("<tbody>");
            
            for(int i=1;i<=n;i++){
                out.println("<tr>");
                for(int j=1;j<=n;j++){
                    out.println("<th> " + m[i][j] + " </th>");
                }
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("<strong><a href='Ejercicio_7' > Volver </a><strong/>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public static int[][] Caracol(int n){
        int num=1;
        int mat[][]=new int [n+1][n+1];
        for (int a = 1; a <= n/2; a++) {
            for(int i=a; i<=n-a ;i++){
                mat[a][i] = num;
                num++;
            }
            for(int i=a; i<=n-a;i++){
                mat[i][n-a+1]=num;
                num++;
            }
            for(int i=n-a+1;i>=a+1;i--){
                mat[n-a+1][i]=num;
                num++;
            }
            for(int i=n-a+1;i>=a+1;i--){
                mat[i][a]=num;
                num++;
            }
        }
        if(n%2==1){
            mat[n/2+1][n/2+1]=num;
        }
        return mat;
    }
}
