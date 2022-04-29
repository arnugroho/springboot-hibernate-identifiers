package com.arnugroho.springboothibernateidentifiers.entity.autogeneration;

import javax.persistence.*;

@Entity
@Table(name = "table_departemen")
public class Departemen {

    @Id
    @GeneratedValue
    @Column(name = "id_departemen")
    private Long departemenId;
    private String nama;

    public Long getDepartemenId() {
        return departemenId;
    }

    public void setDepartemenId(Long departemenId) {
        this.departemenId = departemenId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
