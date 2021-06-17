package com.Parcial3.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Johan
 */
@Entity
@Table(name = "reporte")
@XmlRootElement
@Data
public class Reporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", length = 100)
    private Integer id;
    @Column(name = "file")
    private String file;
    @Column(name = "datecreate", length = 50)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreate;
    @Column(name = "state",length = 500)
    private String state;
    @Column(name = "description",length = 200)
    private String description;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "report")
    private Collection<Seguimiento> seguimientoCollection;
    @JoinColumn(name = "conexion", referencedColumnName = "id")
    @ManyToOne
    private Connectiontoken conexion;

    public Reporte() {
    }

    public Reporte(Integer id) {
        this.id = id;
    }
}
