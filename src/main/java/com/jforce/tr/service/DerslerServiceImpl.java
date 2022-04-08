package com.jforce.tr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.modal.Dersler;

import com.jforce.tr.repository.DerslerRepository;


@Service
public class DerslerServiceImpl implements DerslerService{

	@Autowired
	DerslerRepository derslerRepository;

	@Override
	public List<Dersler> getList() {
		return derslerRepository.findAll();
	}
	

	
}
