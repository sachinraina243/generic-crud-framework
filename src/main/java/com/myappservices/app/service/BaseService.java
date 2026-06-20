package com.myappservices.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import java.util.List;

public interface BaseService<T, ID> {
    T save(T entity);
    List<T> findAll();
    Page<T> findAll(Specification<T> spec, Pageable pageable); // Dynamic Search + Pagination [cite: 111, 232]
    T findById(ID id);
    void deleteById(ID id);
}