package com.arnugroho.springboothibernateidentifiers.repository.tablegeneration;

import com.arnugroho.springboothibernateidentifiers.entity.tablegeneration.Buku;
import org.springframework.data.repository.CrudRepository;

public interface BukuRepository extends CrudRepository<Buku, Long> {
}
