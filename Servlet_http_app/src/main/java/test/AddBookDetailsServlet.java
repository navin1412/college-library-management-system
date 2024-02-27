package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookDetailsServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
	HttpSession hs = req.getSession(false);//Accessing existing session
	if(hs==null) {
		req.setAttribute("msg", "session Expired...<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
		rd.forward(req, res);
	}
	else {
		BookBean bb =new BookBean();
		bb.setCode(req.getParameter("code"));
		bb.setName(req.getParameter("name"));
		bb.setAuthor(req.getParameter("author"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k = new AddBookDetailsDAO().insert(bb);
		if(k>0) {
			req.setAttribute("msg", "book deatails is added..<br>");
		}
		RequestDispatcher rd =

				req.getRequestDispatcher("AddBookDetails.jsp");

				rd.forward(req, res);
	}
	
	}
}
