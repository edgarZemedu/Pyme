package Empleado;

import java.time.LocalDate;



public class Programador extends Empleado{
        
    private String[] lenguajes;
    
    //Constructor

    public Programador(String nombre, String apellido1, String apellido2, int edad, Sexo sexo, LocalDate finFecha,String[] lenguajes) {
        super(nombre, apellido1, apellido2, edad, sexo, finFecha);
        this.lenguajes = lenguajes;
    }
    
    
    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
    
}

