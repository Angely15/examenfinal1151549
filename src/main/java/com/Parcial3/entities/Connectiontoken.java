package com.Parcial3.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "connectiontoken")
@XmlRootElement
public class Connectiontoken implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",length = 200)
    private Integer id;
    @Column(name = "host",length = 50)
    private String host;
    @Column(name = "userdb",length = 100)
    private String userdb;
    @Column(name = "pass",length = 50)
    private String pass;
    @Column(name = "db",length = 50)
    private String db;
    @Column(name = "token")
    private String token;
    @Column(name = "port")
    private Short port;
    @Column(name = "state")
    private Short state;
    @JoinColumn(name = "type", referencedColumnName = "id")
    @ManyToOne
    private Typedb type;
    @JoinColumn(name = "user", referencedColumnName = "id")
    @ManyToOne
    private Usuario user;
    @OneToMany(mappedBy = "conexion")
    private Collection<Reporte> reporteCollection;

    public Connectiontoken() {
    }

    public Connectiontoken(Integer id) {
        this.id = id;
    }

}
