package com.example.bazar_setu.repository;

import com.example.bazar_setu.entity.Slot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SlotRepository extends CrudRepository<Slot, String> {

    List<Slot> findByContactNumberOrderByDateDesc(String contactNumber);
}
