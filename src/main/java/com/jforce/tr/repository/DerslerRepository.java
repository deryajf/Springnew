package com.jforce.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jforce.tr.modal.Dersler;

@Repository
public interface DerslerRepository extends JpaRepository<Dersler, Integer>{

}
