import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet", urlPatterns = "/calculate")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float number1 = Integer.parseInt(request.getParameter("number1"));
        float number2 = Integer.parseInt(request.getParameter("number2"));

        char operator = request.getParameter("operator").charAt(0);

        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        writer.println("<h1>Result</h1>");

        //float result = Calculator.clculate(number1, number2, operator);
        try {
            float result = Calculator.clculate(number1, number2, operator);
            writer.println(number1 + " " + operator + " " + number2 + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }

    //    writer.println(number1 + " " + operator + " " + number2 + " = " + result);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
