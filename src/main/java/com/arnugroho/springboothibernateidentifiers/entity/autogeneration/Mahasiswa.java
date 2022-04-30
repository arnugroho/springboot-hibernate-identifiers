package com.arnugroho.springboothibernateidentifiers.entity.autogeneration;

import javax.persistence.*;

@Entity
@Table(name = "table_mahasiswa")
public class Mahasiswa {

    @Id
    @GeneratedValue(generator = "mahasiswa_sequence")
    @Column(name = "id_mahasiswa")
    private Long mahasiswaId;
    private String nama;

    public Long getMahasiswaId() {
        return mahasiswaId;
    }

    public void setMahasiswaId(Long mahasiswaId) {
        this.mahasiswaId = mahasiswaId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
