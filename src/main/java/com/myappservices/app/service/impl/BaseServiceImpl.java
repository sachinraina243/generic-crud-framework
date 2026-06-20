package com.myappservices.app.service.impl;


import com.myappservices.app.repository.BaseRepository;
import com.myappservices.app.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional 
public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    protected final BaseRepository<T, ID> repository;

    protected BaseServiceImpl(BaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) { return repository.save(entity); }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() { return repository.findAll(); }

    @Override
    @Transactional(readOnly = true)
    public Page<T> findAll(Specification<T> spec, Pageable pageable) {
        return repository.findAll(spec, pageable); // Dynamic query automation [cite: 88, 120]
    }

    @Override
    @Transactional(readOnly = true)
    public T findById(ID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found!"));
    }

    @Override
    public void deleteById(ID id) { repository.deleteById(id); }
}
