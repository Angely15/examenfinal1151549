package com.Parcial3.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;



    @Entity
    @Table(name = "rol")
    @XmlRootElement
    @Data
    public class Rol implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id", length = 100)
        private Integer id;
        @Column(name = "description")
        private String description;
        @OneToMany(mappedBy = "role")
        private Collection<Usuario> usuarioCollection;

        public Rol() {
        }

        public Rol(Integer id) {
            this.id = id;
        }
    }