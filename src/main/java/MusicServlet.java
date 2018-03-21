import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="MusicServlet", urlPatterns = "/")
public class MusicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setContentType("text/html");

        req.getRequestDispatcher("index.jsp").include(req, resp);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
//        requestDispatcher.include(req,resp);


    }

}
