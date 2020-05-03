package com.uca.capas.modelo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Product;

@Controller
public class ProductController {
	
	private List<Product> productos = new ArrayList<>();
	
	@GetMapping("/compraProducto")
	public ModelAndView comprarProducto() {
		ModelAndView mav = new ModelAndView();
		
		productos.add(new Product(0, "Luna de Pluton", 13));
		productos.add(new Product(1, "Overlord volumen uno", 32));
		productos.add(new Product(2, "No game no life volumen diez", 23));
		productos.add(new Product(3, "kono subbarashi sekai volumen catorce", 32));
		productos.add(new Product(4, "Re zero Volumen veintitres", 5));
		
		mav.setViewName("select");
		mav.addObject("product", new Product());
		mav.addObject("producto", productos);

		return mav;
	}
	
	@PostMapping("/validar")
	public ModelAndView validar(Product product) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", productos.get(product.getId()).getNombre());
		if(productos.get(product.getId()).getCantidad() >= product.getCantidad() && product.getCantidad() > 0) {
			mav.setViewName("compra");
		}else {
			mav.setViewName("error");
		}
		return mav;
	}

}