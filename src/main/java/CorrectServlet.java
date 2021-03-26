import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet(name = "CorrectServlet", value = "/correct")
public class CorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("correct", true);
        request.setAttribute("incorrect", false);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}