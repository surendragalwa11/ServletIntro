
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class squareServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse rs) throws IOException
  {
      //int i=Integer.parseInt(req.getParameter("num1"));
      int i=Integer.parseInt(req.getParameter("k"));
      int j=i*i;
      rs.getWriter().println("Square is: "+j);
      //int m=(int)req.getAttribute("k");
     // m=m*m;
      //rs.getWriter().println("\n\nSquare of addition is: "+m);
  }
}
