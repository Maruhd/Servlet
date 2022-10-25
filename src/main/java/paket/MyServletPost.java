package paket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Servlet", urlPatterns = {"/qwerty"})
public class MyServletPost extends HttpServlet{
    private Logger logger = LogManager.getLogger(MyServletPost.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/view/user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("username");
        String age = req.getParameter("userage");

        req.setAttribute("username", name);
        req.setAttribute("userage", age);
        logger.info("Test LOG!!!");
        logger.debug("Test log");

       if ((name == "") | (age == "")) {
           req.getRequestDispatcher("/WEB-INF/view/return.jsp").forward(req, resp);
       }
       else
           req.getRequestDispatcher("/WEB-INF/view/applicationSaved.jsp").forward(req, resp);
    }

}
