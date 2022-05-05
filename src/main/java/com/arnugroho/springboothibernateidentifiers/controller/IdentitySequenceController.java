package com.arnugroho.springboothibernateidentifiers.controller;

import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Departemen;
import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Fakultas;
import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Mahasiswa;
import com.arnugroho.springboothibernateidentifiers.entity.identitysequence.Cabang;
import com.arnugroho.springboothibernateidentifiers.entity.identitysequence.Toko;
import com.arnugroho.springboothibernateidentifiers.repository.identitysequence.CabangRepository;
import com.arnugroho.springboothibernateidentifiers.repository.identitysequence.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/identitysequence")
public class IdentitySequenceController {
    private final CabangRepository cabangRepository;
    private final TokoRepository tokoRepository;

    public IdentitySequenceController(CabangRepository cabangRepository, TokoRepository tokoRepository) {
        this.cabangRepository = cabangRepository;
        this.tokoRepository = tokoRepository;
    }


    @PostMapping("/insert-toko")
    public ResponseEntity insertToko(@RequestBody Toko toko){
        tokoRepository.save(toko);
        return new ResponseEntity(toko, HttpStatus.OK);
    }

    @PostMapping("/insert-cabang")
    public ResponseEntity insertCabang(@RequestBody Cabang cabang){
        cabangRepository.save(cabang);
        return new ResponseEntity(cabang, HttpStatus.OK);
    }

}
