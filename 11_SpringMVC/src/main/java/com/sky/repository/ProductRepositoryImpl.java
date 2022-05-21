package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private List<Product> products= new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		System.out.println("in repository");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}

}
