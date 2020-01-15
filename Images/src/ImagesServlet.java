

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImagesServlet
 */
@WebServlet("/ImagesServlet")
public class ImagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImagesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String animal = request.getParameter("animal");
		
		/* Image of elephant*/
		if(animal.equals("elephant"))
		{
			getAttribute("elephant");	
			out.print("<br>");
			out.print("<img src=\"elephant.jpg\">");
		}
		
		/* Image of giraffe*/
		if(animal.equals("giraffe"))
		{
			getAttribute("giraffe");	
			out.print("<br>");
			out.print("<img src=\"giraffe.jpg\">");
		}
		
		/* Image of wolf*/
		if(animal.equals("wolf"))
		{
			getAttribute("wolf");
			out.print("<br>");

			out.print("<img src=\"wolf.jpg\">");
		}
		
}	
	private void getAttribute(String string) {
		// TODO Auto-generated method stub
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
