package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

//retrieve data from product table and display it in table format to user
public class ShowProduct extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ProductService pservice=new ProductServiceImpl();
		List<Product> plist=pservice.getAllProducts();
		if(plist!=null) {
			out.println("<table><tr><th>Product Id</th><th>Name</th><th>Qty</th><th>price</th><th>expiry date</th><th>Catid</th><th>Actions</th></tr>");
			for(Product p:plist) {
				out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"/td><td>"+p.getPrice()+"</td>");
				String dt=p.getExpdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				out.println("<td>"+dt+"</td><td>"+p.getCid()+"</td>");
				out.println("<td><a href='#'>edit</a>/<a href='#'>delete</a></td></tr>");
			}
			out.print("</table>");
			out.println("<form action='addproduct.html'>");
			  out.println("<button type='submit' name='btn' id='btn' value='add'>Add new Product</button>");
			out.println("</form>");
		}
	}

}
