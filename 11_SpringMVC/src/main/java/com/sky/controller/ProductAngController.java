package com.sky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.domain.Product;
import com.sky.service.ProductService;

@Controller
@RequestMapping("/products")    //service
public class ProductAngController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public @ResponseBody List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@RequestMapping( value = "/product",method = RequestMethod.POST)
	public @ResponseBody Product addProduct(@RequestBody Product product) {
	 System.out.print(product);
	productService.addProduct(product);
	return product;
}
}
