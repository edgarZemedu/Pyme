package Empleado;


import Empleado.Comercial;
import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Empleado  {
    
    static enum Sexo{HOMBRE,MUJER}
    
    private String nombre,apellido1,apellido2;
    private int edad;
    private Sexo sexo;   
    private LocalDate finFecha;    
    private ArrayList<Programador> programador;
    private ArrayList<Comercial> comercial = new ArrayList<Comercial>();

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, int edad, Sexo sexo, LocalDate finFecha) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.sexo = sexo;
        this.finFecha = finFecha;
        this.programador = new ArrayList<>();
        comercial = new ArrayList();
    }
   
    
    //Getter y Setter
    public void setProgramador(ArrayList<Programador> programador) {
     this.programador = new ArrayList<>();
    }    
    public ArrayList<Programador> getProgramador() {
        return programador;
    }
    
    public void setComercial(ArrayList<Comercial> comercial) {
        this.comercial = new ArrayList<>();
    }    
    public ArrayList<Comercial> getComercial() {
        return comercial;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public LocalDate getFinFecha() {
        return finFecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setFecha(LocalDate finFecha) {
        this.finFecha = finFecha;
    } 
    
    
}
