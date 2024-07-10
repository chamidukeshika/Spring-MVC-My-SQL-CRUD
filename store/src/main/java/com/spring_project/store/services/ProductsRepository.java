package com.spring_project.store.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_project.store.models.Product;

public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
