package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MENU DE EJERCICIOS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>PRACTICA 1 SERVLETS</h1>");
            out.println("<ol>");
            out.println("<li> Usando servlets mostrar la edad de una persona a partir del año de nacimiento. El formulario debe solicitar nombre y año de nacimiento <strong><a href='Ejercicio_1'> VER </a></strong></li>");
            out.println("<br>");
            out.println("<li>Con servlets crear un programa para leer un número y calcular su factorial <strong><a href='Ejercicio_2'> VER </a></strong> </li>");
            out.println("<br>");
            out.println("<li> Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento doGet(HttpServletRequest request, HttpServletResponse response) <strong><a href='Ejercicio_3'> VER </a></strong> </li>");
            out.println("<br>");
            out.println("<li>Usando servlets realizar un programa que permita realizar el cambio de Bolivianos a Dólares y viceversa <strong><a href='Ejercicio_4'> VER </a></strong></li>");
            out.println("<br>");
            out.println("<li>Crear un servlet para solicitar dos números y un operador (suma, resta, producto, división) en un cuadro desplegable ComboBox y un botón con el texto “Procesar”. Al pulsar el botón debe aparecer el resultado de la operación<strong><a href='Ejercicio_5'> VER </a></strong></li>");
            out.println("<br>");
            out.println("<li>Crear un programa utilizando Servlets para simular el juego con dos dados. (Regla principal si la suma es 7 u 11 gana otro número pierde) <strong><a href='Ejercicio_6'> VER </a></strong></li>");
            out.println("<br>");
            out.println("<li> Programar un servlet que solicite un valor y pulsando el botón “Procesar” genere la matriz caracol. <strong><a href='Ejercicio_7'> VER </a></strong></li>");
            out.println("</ol>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
