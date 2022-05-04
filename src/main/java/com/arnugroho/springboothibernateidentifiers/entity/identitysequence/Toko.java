package com.arnugroho.springboothibernateidentifiers.entity.identitysequence;

import javax.persistence.*;

@Entity
@Table(name = "table_toko")
public class Toko {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "toko_sequence")
    @Column(name = "id_toko")
    private Long tokoId;
    private String nama;

    public Long getTokoId() {
        return tokoId;
    }

    public void setTokoId(Long tokoId) {
        this.tokoId = tokoId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
