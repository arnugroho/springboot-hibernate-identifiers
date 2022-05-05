package com.arnugroho.springboothibernateidentifiers.entity.tablegeneration;

import javax.persistence.*;

@Entity
@Table(name = "table_penerbit")
public class Penerbit {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "table-generator")
    @TableGenerator(name = "table-generator",
            table = "table_sequence",
            pkColumnName = "seq_id",
            valueColumnName = "seq_value")
    @Column(name = "id_penerbit")
    private Long penerbitId;
    private String nama;

    public Long getPenerbitId() {
        return penerbitId;
    }

    public void setPenerbitId(Long penerbitId) {
        this.penerbitId = penerbitId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
