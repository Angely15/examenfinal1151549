package com.Parcial3.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "seguimiento")
@XmlRootElement
@Data
public class Seguimiento implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dategenerate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dategenerate;
    @Column(name = "state", length = 500)
    private Short state;
    @Column(name = "result", length = 1000)
    private String result;
    @Column(name = "detailrequest", length = 10)
    private String detailrequest;
    @Column(name = "type", length = 100)
    private String type;
    @Column(name = "filegenerate")
    private String filegenerate;
    @JoinColumn(name = "report", referencedColumnName = "id")
    @ManyToOne
    private Reporte report;

    public Seguimiento() {
    }

    public Seguimiento(Integer id) {
        this.id = id;
    }
}

