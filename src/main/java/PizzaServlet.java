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
        String[] toppings = request.getParameterValues("toppings");
        String addressOfUser = request.getParameter("address");


        if (crustType != null && sauceType != null && PieType != null && toppings != null && addressOfUser != null){

            System.out.println(crustType);
            System.out.println(sauceType);
            System.out.println(PieType);


            for (int i = 0; i <= toppings.length - 1; i++){
                System.out.println(toppings[i]);
            }
            System.out.println("Your address is: " + addressOfUser);
        }   else {
            System.out.println("User did not fill form completely");
        }



    }
}
