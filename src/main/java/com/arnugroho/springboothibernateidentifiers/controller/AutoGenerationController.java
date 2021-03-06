package com.arnugroho.springboothibernateidentifiers.controller;

import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Departemen;
import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Fakultas;
import com.arnugroho.springboothibernateidentifiers.entity.autogeneration.Mahasiswa;
import com.arnugroho.springboothibernateidentifiers.repository.autogeneration.DepartemenRepository;
import com.arnugroho.springboothibernateidentifiers.repository.autogeneration.FakultasRepository;
import com.arnugroho.springboothibernateidentifiers.repository.autogeneration.MahasiswaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autogeneration")
public class AutoGenerationController {
    private final DepartemenRepository departemenRepository;
    private final FakultasRepository fakultasRepository;
    private final MahasiswaRepository mahasiswaRepository;

    public AutoGenerationController(DepartemenRepository departemenRepository, FakultasRepository fakultasRepository, MahasiswaRepository mahasiswaRepository) {
        this.departemenRepository = departemenRepository;
        this.fakultasRepository = fakultasRepository;
        this.mahasiswaRepository = mahasiswaRepository;
    }

    @PostMapping("/insert-departemen")
    public ResponseEntity insertDepartemen(@RequestBody Departemen departemen){
        departemenRepository.save(departemen);
        return new ResponseEntity(departemen, HttpStatus.OK);
    }

    @PostMapping("/insert-fakultas")
    public ResponseEntity insertFakultas(@RequestBody Fakultas fakultas){
        fakultasRepository.save(fakultas);
        return new ResponseEntity(fakultas, HttpStatus.OK);
    }

    @PostMapping("/insert-mahasiswa")
    public ResponseEntity insertMahasiswa(@RequestBody Mahasiswa mahasiswa){
        mahasiswaRepository.save(mahasiswa);
        return new ResponseEntity(mahasiswa, HttpStatus.OK);
    }
}
