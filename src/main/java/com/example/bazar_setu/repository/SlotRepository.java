package com.example.bazar_setu.repository;

import com.example.bazar_setu.model.Slot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SlotRepository extends CrudRepository<Slot, Integer> {

    List<Slot> findByContactNumberOrderByDateDesc(String contactNumber);
}
