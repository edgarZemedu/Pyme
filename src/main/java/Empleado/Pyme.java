package Empleado;


import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import Empleado.Empleado.Sexo;     

public class Pyme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Scanner z = new Scanner(System.in); 

        ArrayList<Empleado> listaE = new ArrayList<>();
        
        int op;
        
            do{
                System.out.println("******* MENU ******"
                            + "\n 1.- INGRESAR EMPLEADO "
                            + "\n 2.- LISTAR EMPLEADO "
                            + "\n 3.- SALIR DEL PROGRAMA");
                    op = z.nextInt();
                    
                if(op==1){        //Ingresar
                    char respuesta;//seguir ingresando más empleados
                    do {                        
                        Pyme.ingresar(z,listaE);                         
                                
                        System.out.println("Quieres seguir ingresando mas empleados: Si(s)/No(n)");
                        respuesta = z.next().charAt(0); 
                        
                   }while(respuesta == 's');
     
                }else if (op == 2) {
                    //Pyme.listar(z, empleado);
                }         
                
            }while(op == 1 || op == 2);                
        
        
    }
    public static void ingresar(Scanner z, ArrayList<Empleado> listaE) throws ParseException{
              
        String fecha = "2010-02-02"; 
        String[] lenguajes = {"JAVA","PYTHON"};
        String[] idiomas = null;
        
        //lenguajes[0] = 
        //lenguajes[1] = ;
        Empleado e1 = new Programador("Pedro","Perez","Gomez",22,Sexo.HOMBRE,LocalDate.parse("2020-10-11"),lenguajes);
        idiomas[0] = "chino";
        idiomas[1] = "Mandarín";
        Empleado e2 = new Comercial("Santiago","Gomez","Gomez",22,Sexo.HOMBRE,LocalDate.parse(fecha),idiomas);
        listaE.add(e1);
        listaE.add(e2);
        
        //visualizar lo que meti
        for (Empleado i: listaE) {
            System.out.println(i.getNombre()+" "+i.getApellido1()+" "+i.getApellido2()+" "+i.getEdad()+" "+i.getSexo()+" "+i.getFinFecha());
            //
        }
        
        //CREAR EMPLEADOS A MANO
            System.out.println("Dime el nombre del empleado: ");
                String nombre = z.nextLine();
                System.out.println(nombre);
                            //empleado.add(1,empleado.get(nombre));
            System.out.println("Primer apellido: ");
                String apellido1 = z.nextLine();
            System.out.println("Segundo apellido: ");
                String apellido2 = z.nextLine();
            System.out.println("Edad: ");
                int edad = z.nextInt();
                            //empleado.add(1, empleado.get(edad));
            System.out.println("Sexo: h/m");
                String sexo = z.nextLine();

                            //empleado.add(1, empleado.get(sexo));
            System.out.println("Fecha de nacimiento: (0000-00-00)");
                String fecha1 = z.nextLine();
            System.out.println("Dime el titulo: p(Programador)/c(Comercial): ");
                String titulo = z.nextLine();
        
        int x = 2;      //xq ya hay dos empleado
        if(titulo.compareToIgnoreCase("p")==0){
            String mas = null;
            while(mas.contentEquals("s")){
                System.out.println("En que lenguaje trabajas: ");
                    String leng = z.nextLine();
                    lenguajes[x] = leng;
                    
                if (sexo.contentEquals("m")) {
                    listaE.add(new Programador(nombre,apellido1,apellido2,edad,Sexo.MUJER,LocalDate.parse(fecha1),lenguajes[]));
                }else{
                    listaE.add(new Programador(nombre,apellido1,apellido2,edad,Sexo.HOMBRE,LocalDate.parse(fecha1),lenguajes));
                }
                
                System.out.println("En alguno más? (sí/s)(no/n) "); 
                    mas = z.nextLine();
   
              x++;
            } 
            
            
        }else if (titulo.compareToIgnoreCase("c")==0){
            System.out.println(": ");
            String mas = null;
            while(mas.contentEquals("s")){
                System.out.println("Que idiomas sabes: ");
                    String leng = z.nextLine();
                    idiomas[x] = leng;
                    
                if (sexo.contentEquals("m")) {
                    listaE.add(new Comercial(nombre,apellido1,apellido2,edad,Sexo.MUJER,LocalDate.parse(fecha1),idiomas[x]));
                }else{
                    listaE.add(new Comercial(nombre,apellido1,apellido2,edad,Sexo.HOMBRE,LocalDate.parse(fecha1),idiomas));
                }
                
                System.out.println("En alguno más? (sí/s)(no/n) "); 
                    mas = z.nextLine();
   
              x++;
            }
        }          
    }
    
    
    public static void listar(Scanner z, ArrayList<Empleado> listaE){
            
        for (Empleado i: listaE) {
            /*if (i.getNombre().equalsIgnoreCase(i.getNombre(+1)==0) {
                
            }
               /*System.out.println(i.getNombre()+ " -> "+i.getEdad()+" -> "+i.getSexo()
                    +" -> "+i.getTitulación()+" -> "+i.getFecha()+" -> "+ i.());
                */
        }
    }
       
}
