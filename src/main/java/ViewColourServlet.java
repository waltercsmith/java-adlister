import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewcolour")
public class ViewColourServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
     String favoriteColour =   request.getParameter("favorite-colour");

     request.setAttribute("favoriteColour", favoriteColour);

     request.getRequestDispatcher("/viewcolour.jsp").forward(request,response);



    }
}