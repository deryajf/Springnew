package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.modal.Dersler;

import com.jforce.tr.service.DerslerService;

@RestController
public class DerslerController {
	
	@Autowired
	DerslerService derslerService;
		
	@RequestMapping(path = "/getDerslerList", method = RequestMethod.GET)
	public List<Dersler> getListStudents() {
		return derslerService.getList();
	}
	
}
