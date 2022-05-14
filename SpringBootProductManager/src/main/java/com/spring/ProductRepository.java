package com.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value = "select * from Product p where p.name like %:keyword% or p.price like %:keyword%", nativeQuery=true)
	List<Product> findByKeyword(@Param("keyword") String keyword);

}