package springmvc.week3.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShowController {

	@PostMapping("/show")
	public String show(Model m,HttpServletRequest req) {

		int ProductId=Integer.parseInt(req.getParameter("productId"));
        String ProductName=req.getParameter("productName");
         int ProductPrice=Integer.parseInt(req.getParameter("productPrice"));
		//m.addAttribute("product",product);
		m.addAttribute("ProductId",ProductId);
		m.addAttribute("ProductName",ProductName);
		m.addAttribute("ProductPrice",ProductPrice);
		return "show";
	}
	
	@GetMapping("/hello")
	public void hello(HttpServletResponse res) throws IOException
	{
		res.getWriter().println("Hello World");
	}
}
