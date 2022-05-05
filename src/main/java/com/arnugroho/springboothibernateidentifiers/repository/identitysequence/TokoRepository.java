package com.arnugroho.springboothibernateidentifiers.repository.identitysequence;

import com.arnugroho.springboothibernateidentifiers.entity.identitysequence.Toko;
import org.springframework.data.repository.CrudRepository;

public interface TokoRepository extends CrudRepository<Toko, Long> {
}
