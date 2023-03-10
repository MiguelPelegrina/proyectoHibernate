package model;
// Generated 02-dic-2022 10:19:33 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Examenes generated by hbm2java
 */
public class Examenes  implements java.io.Serializable, Comparable<Examenes> {


     private ExamenesId id;
     private Matriculas matriculas;
     private Date dfecexam;
     // Modificado de BigDecimal a Long
     private Long nnotaexam;

    public Examenes() {
    }

	
    public Examenes(ExamenesId id, Matriculas matriculas, Long nnotaexam) {
        this.id = id;
        this.matriculas = matriculas;
        this.nnotaexam = nnotaexam;
    }
    public Examenes(ExamenesId id, Matriculas matriculas, Date dfecexam, Long nnotaexam) {
       this.id = id;
       this.matriculas = matriculas;
       this.dfecexam = dfecexam;
       this.nnotaexam = nnotaexam;
    }
   
    public ExamenesId getId() {
        return this.id;
    }
    
    public void setId(ExamenesId id) {
        this.id = id;
    }
    public Matriculas getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Matriculas matriculas) {
        this.matriculas = matriculas;
    }
    public Date getDfecexam() {
        return this.dfecexam;
    }
    
    public void setDfecexam(Date dfecexam) {
        this.dfecexam = dfecexam;
    }
    public Long getNnotaexam() {
        return this.nnotaexam;
    }
    
    public void setNnotaexam(Long nnotaexam) {
        this.nnotaexam = nnotaexam;
    }

    // Metodo anadido
    @Override
    public int compareTo(Examenes t) {
        return this.id.getNnumexam() - t.id.getNnumexam();
    }




}


