package com.pepe.dao.model;
// Generated 31.10.2016 12:07:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Players generated by hbm2java
 */
@Entity
@Table(name="players"
    ,catalog="dbs"
)
public class Players  implements java.io.Serializable {


     private Integer id;
     private Teams teams;
     private String meno;
     private String priezvisko;
     private int cislo;
     private Date datumNarodenia;
     private Set<Teams> teamses = new HashSet<Teams>(0);

    public Players() {
    }

	
    public Players(String meno, String priezvisko, int cislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.cislo = cislo;
    }
    public Players(Teams teams, String meno, String priezvisko, int cislo, Date datumNarodenia, Set<Teams> teamses) {
       this.teams = teams;
       this.meno = meno;
       this.priezvisko = priezvisko;
       this.cislo = cislo;
       this.datumNarodenia = datumNarodenia;
       this.teamses = teamses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TEAM_ID")
    public Teams getTeams() {
        return this.teams;
    }
    
    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    
    @Column(name="meno", nullable=false, length=128)
    public String getMeno() {
        return this.meno;
    }
    
    public void setMeno(String meno) {
        this.meno = meno;
    }

    
    @Column(name="priezvisko", nullable=false, length=128)
    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    
    @Column(name="cislo", nullable=false)
    public int getCislo() {
        return this.cislo;
    }
    
    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datum_narodenia", length=10)
    public Date getDatumNarodenia() {
        return this.datumNarodenia;
    }
    
    public void setDatumNarodenia(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="players")
    public Set<Teams> getTeamses() {
        return this.teamses;
    }
    
    public void setTeamses(Set<Teams> teamses) {
        this.teamses = teamses;
    }




}


