package com.example.bazar_setu.repository;

import com.example.bazar_setu.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsumerRepository extends JpaRepository<Consumer, String> {

    List<Consumer> findByContactNumber(String contactNumber);
}
