
package Clases;

import java.util.ArrayList;

public class Maestro {
    String nombre, titulo, maestria, usuario, contraseña;
    double salario;
    int maxClases;
    ArrayList<String> listaClases = new ArrayList();
    
    public Maestro(){
    }
    
    //sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setMaestria(String maestria){
        this.maestria = maestria;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void setMaxClases(int maxClases){
        this.maxClases = maxClases;
    }
    
    //gets
    public String getNombre(){
        return nombre;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getMaestria(){
        return maestria;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public int getMaxClases(){
        return maxClases;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nTitulo: "+titulo+"\nMaestria: "+maestria;
    }
}
