package paket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NextServlet", urlPatterns = {"/qwert"})
public class MyServlet2 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("WTF");
//        String name1 = req.getParameter("BWQ");
//        int i = Integer.parseInt(name.trim());
//        int a = Integer.parseInt(name1.trim());
//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>draste cto bydet dalshe<h1>");
//        req.setAttribute("name", "Pasha");
//        req.setAttribute("age", "29");

        String name1 = req.getParameter("name");
        String  str1 = req.getParameter("str");

        req.setAttribute("name", name1);
        req.setAttribute("str", str1);

        getServletContext().getRequestDispatcher("/WEB-INF/viev/welcom.jsp").forward(req, resp);
    }
}
