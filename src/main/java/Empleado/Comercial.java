package Empleado;

import java.time.LocalDate;
 

public class Comercial extends Empleado {
    
    private String[] idiomas;

    //Contructor    
    public Comercial( String nombre, String apellido1, String apellido2, int edad, Sexo sexo, LocalDate finFecha,String[] idiomas) {
        super(nombre, apellido1, apellido2, edad, sexo, finFecha);
        this.idiomas = idiomas;
    }
    
    
    public String[] getIdiomas(){
        return idiomas;
    }
    public void setIdiomas(String[] idiomas){
        this.idiomas = idiomas;
    }
    
}
