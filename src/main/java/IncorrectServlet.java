import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet(name = "IncorrectServlet", value = "/incorrect")
public class IncorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("correct", false);
        request.setAttribute("incorrect", true);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}