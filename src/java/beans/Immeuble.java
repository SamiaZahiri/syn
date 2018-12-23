/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author a
 */
@Entity
@Table(name = "immeuble")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Immeuble.findAll", query = "SELECT i FROM Immeuble i")
    , @NamedQuery(name = "Immeuble.findById", query = "SELECT i FROM Immeuble i WHERE i.id = :id")
    , @NamedQuery(name = "Immeuble.findByNum", query = "SELECT i FROM Immeuble i WHERE i.num = :num")
    , @NamedQuery(name = "Immeuble.findByNom", query = "SELECT i FROM Immeuble i WHERE i.nom = :nom")
    , @NamedQuery(name = "Immeuble.findByAdresse", query = "SELECT i FROM Immeuble i WHERE i.adresse = :adresse")
    , @NamedQuery(name = "Immeuble.findByCodePostal", query = "SELECT i FROM Immeuble i WHERE i.codePostal = :codePostal")
    , @NamedQuery(name = "Immeuble.findByNbrEtage", query = "SELECT i FROM Immeuble i WHERE i.nbrEtage = :nbrEtage")})
public class Immeuble implements Serializable {

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
    @Size(min = 1, max = 100)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "codePostal")
    private String codePostal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nbrEtage")
    private int nbrEtage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "immeuble", fetch = FetchType.EAGER)
    private List<Appartement> appartementList;
    @JoinColumn(name = "quartier", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Quartier quartier;

    public Immeuble() {
    }

    public Immeuble(Integer id) {
        this.id = id;
    }

    public Immeuble(Integer id, int num, String nom, String adresse, String codePostal, int nbrEtage) {
        this.id = id;
        this.num = num;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.nbrEtage = nbrEtage;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }

    @XmlTransient
    public List<Appartement> getAppartementList() {
        return appartementList;
    }

    public void setAppartementList(List<Appartement> appartementList) {
        this.appartementList = appartementList;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
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
        if (!(object instanceof Immeuble)) {
            return false;
        }
        Immeuble other = (Immeuble) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Immeuble[ id=" + id + " ]";
    }
    
}
