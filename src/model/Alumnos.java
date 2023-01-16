package model;
// Generated 02-dic-2022 10:19:33 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Alumnos generated by hbm2java
 */
public class Alumnos  implements java.io.Serializable {


     private String ccodalu;
     private String cnomalu;
     private Set matriculases = new HashSet(0);

    public Alumnos() {
    }

	
    public Alumnos(String ccodalu, String cnomalu) {
        this.ccodalu = ccodalu;
        this.cnomalu = cnomalu;
    }
    public Alumnos(String ccodalu, String cnomalu, Set matriculases) {
       this.ccodalu = ccodalu;
       this.cnomalu = cnomalu;
       this.matriculases = matriculases;
    }
   
    public String getCcodalu() {
        return this.ccodalu;
    }
    
    public void setCcodalu(String ccodalu) {
        this.ccodalu = ccodalu;
    }
    public String getCnomalu() {
        return this.cnomalu;
    }
    
    public void setCnomalu(String cnomalu) {
        this.cnomalu = cnomalu;
    }
    public Set getMatriculases() {
        return this.matriculases;
    }
    
    public void setMatriculases(Set matriculases) {
        this.matriculases = matriculases;
    }

    // Metodos anadidos
    public void addMatricula(Matriculas matricula){
        this.matriculases.add(matricula);
    }

    public ArrayList<Matriculas> getListMatriculas(){
        ArrayList<Matriculas> matriculas = new ArrayList<>(this.matriculases);
        return matriculas;
    }
}


