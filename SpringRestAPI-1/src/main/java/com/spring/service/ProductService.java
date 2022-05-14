package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductRepository;
import com.spring.main.Product;

@Service
	public class ProductService {
		@Autowired
		private ProductRepository productRepository;

		public ProductService() {

		}

		public Product addproduct(Product p) {
			return productRepository.save(p);
		}
		
		public List<Product> getProduct() {
			return productRepository.findAll();
		}
		public Product updateProduct( Product p) {
			return  productRepository.save(p);
		}
		public void del(Integer id) {
			productRepository.deleteById(id);
			
		}

		public Product getProduct(Integer pid) {
			return productRepository.findById(pid).orElseThrow(null);
		}

		
}