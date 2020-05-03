package com.uca.capas.modelo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Product());
		mav.setViewName("index");
		return mav;
	}	
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Product product , BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { 
			mav.setViewName("/index");
		}
		else { 
			mav.addObject("producto", product);
			mav.setViewName("/result");
		}
		return mav;
	}
}