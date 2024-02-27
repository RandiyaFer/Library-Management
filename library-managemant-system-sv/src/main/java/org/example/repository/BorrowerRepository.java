package org.example.repository;

import org.example.entity.BorrowerEntity;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends CrudRepository<BorrowerEntity,Long> {
}
