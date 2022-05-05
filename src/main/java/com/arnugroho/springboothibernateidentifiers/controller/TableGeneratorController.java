package com.arnugroho.springboothibernateidentifiers.controller;

import com.arnugroho.springboothibernateidentifiers.entity.identitysequence.Cabang;
import com.arnugroho.springboothibernateidentifiers.entity.identitysequence.Toko;
import com.arnugroho.springboothibernateidentifiers.entity.tablegeneration.Buku;
import com.arnugroho.springboothibernateidentifiers.entity.tablegeneration.Penerbit;
import com.arnugroho.springboothibernateidentifiers.repository.identitysequence.CabangRepository;
import com.arnugroho.springboothibernateidentifiers.repository.identitysequence.TokoRepository;
import com.arnugroho.springboothibernateidentifiers.repository.tablegeneration.BukuRepository;
import com.arnugroho.springboothibernateidentifiers.repository.tablegeneration.PenerbitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tablegenerator")
public class TableGeneratorController {
    private final BukuRepository bukuRepository;
    private final PenerbitRepository penerbitRepository;

    public TableGeneratorController(BukuRepository bukuRepository, PenerbitRepository penerbitRepository) {
        this.bukuRepository = bukuRepository;
        this.penerbitRepository = penerbitRepository;
    }


    @PostMapping("/insert-buku")
    public ResponseEntity insertToko(@RequestBody Buku buku){
        bukuRepository.save(buku);
        return new ResponseEntity(buku, HttpStatus.OK);
    }

    @PostMapping("/insert-penerbit")
    public ResponseEntity insertCabang(@RequestBody Penerbit penerbit){
        penerbitRepository.save(penerbit);
        return new ResponseEntity(penerbit, HttpStatus.OK);
    }

}
