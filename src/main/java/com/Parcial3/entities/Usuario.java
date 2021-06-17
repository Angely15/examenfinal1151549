package com.Parcial3.entities;

import lombok.Data;

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
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@XmlRootElement
@Data
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", length = 20)
    private Integer id;

    @Column(name = "usuario", length = 100)
    private String usuario;

    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "pass")
    private String pass;
    @Column(name = "state")
    private Short state;
    @JoinColumn(name = "role", referencedColumnName = "id")
    @ManyToOne
    private Rol role;
    @OneToMany(mappedBy = "user")
    private Collection<Connectiontoken> connectiontokenCollection;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }
}
