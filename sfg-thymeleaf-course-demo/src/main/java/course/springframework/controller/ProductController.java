package course.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import course.springframework.services.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable int id, Model model) {
		var product = productService.getProduct(id);

		System.out.print(product.getCourseName());
		
		model.addAttribute("product", model);
		return "product";
	}

}
