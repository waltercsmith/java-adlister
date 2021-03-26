import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("pizza-form.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        String crustType = request.getParameter("crust_types");
        String sauceType = request.getParameter("sauce-type");
        String PieType = request.getParameter("size");


        System.out.println(crustType);
    }
}
