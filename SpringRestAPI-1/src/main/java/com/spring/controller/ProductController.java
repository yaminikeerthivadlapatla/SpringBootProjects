package com.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.Product;
import com.spring.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;

	@GetMapping("/home")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/product")
	public List<Product> getproduct() {
		return this.productservice.getProduct();
	}
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product p) {
		return this.productservice.addproduct(p);
	}
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product p) {
		return this.productservice.updateProduct(p);
	}
	@DeleteMapping("/delete/{id}")
	public void del(@PathVariable  Integer id) {
		productservice.del(id);
	}

	@GetMapping("/sproduct/{pid}")
	public Product getProduct(@PathVariable  Integer pid) {
		return this.productservice.getProduct(pid);
}
}