package com.example.bazar_setu.repository;

import com.example.bazar_setu.entity.Request;
import com.example.bazar_setu.entity.RequestId;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, RequestId> {
}
