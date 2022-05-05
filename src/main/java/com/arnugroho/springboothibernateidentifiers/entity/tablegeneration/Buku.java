package com.arnugroho.springboothibernateidentifiers.entity.tablegeneration;

import javax.persistence.*;

@Entity
@Table(name = "table_buku")
public class Buku {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "table-generator")
    @TableGenerator(name = "table-generator",
            table = "table_sequence",
            pkColumnName = "seq_id",
            valueColumnName = "seq_value")
    @Column(name = "id_buku")
    private Long bukuId;
    private String nama;

    public Long getBukuId() {
        return bukuId;
    }

    public void setBukuId(Long bukuId) {
        this.bukuId = bukuId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
