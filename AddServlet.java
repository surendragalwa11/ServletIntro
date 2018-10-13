

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        int k=i+j;
        res.getWriter().println("Output is : "+k);
        //System.out.println(k);
        
      /* Request dispatcher method  
        req.setAttribute("k", k);
        RequestDispatcher r=req.getRequestDispatcher("Square");
        r.forward(req, res);
     */
      
      //redirect method
     // res.sendRedirect("Square?k="+k);
     
     res.getWriter().println("\n\n\nHello,this is an example of ServletContext and ServletConfig");
     ServletContext ctx=getServletContext();
     String name=ctx.getInitParameter("Name");
     res.getWriter().println(name);
     String number=ctx.getInitParameter("Phone");
     res.getWriter().println(number);
     
    }
}
