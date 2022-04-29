package com.arnugroho.springboothibernateidentifiers.entity.autogeneration;

import javax.persistence.*;

@Entity
@Table(name = "table_fakultas")
public class Fakultas {

    @Id
    @GeneratedValue
    @Column(name = "id_fakultas")
    private Long fakultasId;
    private String nama;

    public Long getFakultasId() {
        return fakultasId;
    }

    public void setFakultasId(Long fakultasId) {
        this.fakultasId = fakultasId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
