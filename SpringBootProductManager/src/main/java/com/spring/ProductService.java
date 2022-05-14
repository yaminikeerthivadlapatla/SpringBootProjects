package com.spring;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> listAll() {
		return repo.findAll();
	}

	public void save(Product product) {
		repo.save(product);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	public List<Product> getByKeyword(String keyword) {
		return repo.findByKeyword(keyword);
	}
}