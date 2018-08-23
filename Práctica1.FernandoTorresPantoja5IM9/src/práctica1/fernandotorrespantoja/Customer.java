/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1.fernandotorrespantoja;

/**
 *
 * @author Alumno
 */
public class Customer extends CustomerAbstract{
    
    private String Nombre;
    private String Edad;
    private String Equipo;
    private String Nacionalidad;
    private String Peso;
    
// constructor vacio
    public Customer(){
        this.Nombre = "Sin nombre";
        this.Edad = "";
        this.Equipo = "Sin equipo";
        this.Nacionalidad = "Sin Nacionalidad";
        this.Peso = "";
    }
// constructor que recibe un parametro
    public Customer(String nomParam){
        this.Nombre = nomParam;
        this.Edad = "";
        this.Equipo = "Sin equipo";
        this.Nacionalidad = "Sin Nacionalidad";
        this.Peso = "";
    }
// constructor que recibe dos parametros
    public Customer(String nomParam, String edadParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Equipo = "Sin equipo";
        this.Nacionalidad = "Sin Nacionalidad";
        this.Peso = "";
    }
// constructor que recibe tres parametros
    public Customer(String nomParam, String edadParam, String equiParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Equipo = equiParam;
        this.Nacionalidad = "Sin Nacionalidad";
        this.Peso = "";
    }
// constructor que recibe cuatro parametros
    public Customer(String nomParam, String edadParam, String equiParam, String nacParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Equipo = equiParam;
        this.Nacionalidad = nacParam;
        this.Peso = "";
    }
// constructor que recibe cinco parametros
    public Customer(String nomParam, String edadParam, String equiParam, String nacParam, String pesParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Equipo = equiParam;
        this.Nacionalidad = nacParam;
        this.Peso = pesParam;
    }
    
    @Override
    public String toString(){
        StringBuilder value = new StringBuilder();
        value.append(String.format("Nombre: %s%n", this.Nombre));
        value.append(String.format("Edad: %s%n", this.Edad));
        value.append(String.format("Equipo: %s%n", this.Equipo));
        value.append(String.format("Nacionalidad: %s%n",this.Nacionalidad));
        value.append(String.format("Peso: %s%n", this.Peso));
        return value.toString();
    }    
    
    @Override
    void Nombre() {
        System.out.println(Nombre);
    }

    @Override
    void Edad() {
        System.out.println(Edad);
    }

    @Override
    void Equipo() {
        System.out.println(Equipo);
    }

    @Override
    void Nacionalidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Peso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Naciomiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

