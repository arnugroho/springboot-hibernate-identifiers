package com.arnugroho.springboothibernateidentifiers.entity.identitysequence;

import javax.persistence.*;

@Entity
@Table(name = "table_cabang")
public class Cabang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cabang_identity")
    @Column(name = "id_cabang")
    private Long cabangId;
    private String nama;

    public Long getCabangId() {
        return cabangId;
    }

    public void setCabangId(Long cabangId) {
        this.cabangId = cabangId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
