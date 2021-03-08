
import java.io.*;
import java.sql.Date;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//attempting to create a tag and branch
@WebServlet(name = "PageCountServlet", urlPatterns = "/count")
public class PageCountServlet extends HttpServlet{


    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }


//    Create a page that displays a number that goes up by one every time the /count page is viewed.

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        hitCount++;

        PrintWriter out = response.getWriter();

        String title = "Total number of hits";

        String docType = "Total number of views:<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType + hitCount);
    }
}
