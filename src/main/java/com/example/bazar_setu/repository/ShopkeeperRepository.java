package com.example.bazar_setu.repository;

import com.example.bazar_setu.entity.Shopkeeper;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShopkeeperRepository extends CrudRepository<Shopkeeper, String> {

    List<Shopkeeper> findByContactNumber(String contactNumber);
}
