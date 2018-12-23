/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a
 */
@Entity
@Table(name = "appartement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appartement.findAll", query = "SELECT a FROM Appartement a")
    , @NamedQuery(name = "Appartement.findById", query = "SELECT a FROM Appartement a WHERE a.id = :id")
    , @NamedQuery(name = "Appartement.findByNum", query = "SELECT a FROM Appartement a WHERE a.num = :num")
    , @NamedQuery(name = "Appartement.findByDimension", query = "SELECT a FROM Appartement a WHERE a.dimension = :dimension")
    , @NamedQuery(name = "Appartement.findByEtage", query = "SELECT a FROM Appartement a WHERE a.etage = :etage")})
public class Appartement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num")
    private int num;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dimension")
    private int dimension;
    @Basic(optional = false)
    @NotNull
    @Column(name = "etage")
    private int etage;
    @JoinColumn(name = "immeuble", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Immeuble immeuble;

    public Appartement() {
    }

    public Appartement(Integer id) {
        this.id = id;
    }

    public Appartement(Integer id, int num, int dimension, int etage) {
        this.id = id;
        this.num = num;
        this.dimension = dimension;
        this.etage = etage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public Immeuble getImmeuble() {
        return immeuble;
    }

    public void setImmeuble(Immeuble immeuble) {
        this.immeuble = immeuble;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appartement)) {
            return false;
        }
        Appartement other = (Appartement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Appartement[ id=" + id + " ]";
    }
    
}
