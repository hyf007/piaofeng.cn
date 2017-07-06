package test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;





/**
 * Servlet implementation class ShoppingServlet
 */
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		      Map map=new HashMap();
              map.put("mm", "a相纸");
              map.put("2", "b相纸");
              map.put("3", "c相纸");
              map.put("4", "d相纸");
              map.put("5", "e相纸");
			  map.put("6", "f相纸");
	   		  List list=new ArrayList();
	   		  list.add(map);
		     response.setCharacterEncoding("UTF-8");
		     response.setContentType("text/html;charset=UTF-8");
		     response.getWriter().println(new Gson().toJson(list));
             request.getRequestDispatcher("test.html").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	  public void init() 
	  {
	      // 执行必需的初始化
	      String message = "Hello World";
	      System.out.println(message);
	  }
}
