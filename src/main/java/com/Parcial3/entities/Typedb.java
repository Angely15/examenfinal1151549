package com.Parcial3.entities;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "typedb")
@XmlRootElement
@Data
public class Typedb implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id",length = 100)
    private String id;
    @Column(name = "description",length = 200)
    private String description;
    @Column(name = "driver", length = 500)
    private String driver;
    @Column(name = "aditional")
    private String aditional;
    @OneToMany(mappedBy = "type")
    private Collection<Connectiontoken> connectiontokenCollection;

    public Typedb() {
    }

    public Typedb(String id) {
        this.id = id;
    }
}
