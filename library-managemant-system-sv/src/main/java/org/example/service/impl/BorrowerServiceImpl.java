package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.repository.BorrowerRepository;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    BorrowerRepository repository;

    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity borrowerEntity = mapper.convertValue(borrower, BorrowerEntity.class);
        repository.save(borrowerEntity);
    }

    @Override
    public List<BorrowerEntity> getBorrowers() {
        return (List<BorrowerEntity>) repository.findAll();
    }

    @Override
    public boolean deleteBorrower(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        Optional<BorrowerEntity> byId = repository.findById(id);
        return mapper.convertValue(byId, Borrower.class);
    }
}
