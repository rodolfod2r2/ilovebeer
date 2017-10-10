package br.com.ilovebeer.servlets;

import br.com.ilovebeer.controller.ControllerProduto;
import br.com.ilovebeer.model.entity.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "produtos", urlPatterns = "/ilovebeer/produtos")
public class ServletProdutos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Produto produto = new Produto();
        ControllerProduto contProduto = new ControllerProduto();
        List<Produto> resultadosClasse = contProduto.exibir(produto);
        request.setAttribute("produtos", resultadosClasse);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
