package com.example.bazar_setu.repository;

import com.example.bazar_setu.model.Request;
import com.example.bazar_setu.model.RequestId;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, RequestId> {
}
