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
              map.put("mm", "a��ֽ");
              map.put("2", "b��ֽ");
              map.put("3", "c��ֽ");
              map.put("4", "d��ֽ");
              map.put("5", "e��ֽ");
			  map.put("6", "f��ֽ");
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
	      // ִ�б���ĳ�ʼ��
	      String message = "Hello World";
	      System.out.println(message);
	  }
}
