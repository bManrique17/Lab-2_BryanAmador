/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno {
    String nombre, numeroCuenta, carrera, usuario, contraseña;
    double dineroDis;
    int edad;
    public ArrayList<String> clasesCursando = new ArrayList();
    public ArrayList<String> buzon = new ArrayList();
    
    public Alumno(){
    }
    
    //sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public void setDineroDis(double dineroDis){
        this.dineroDis = dineroDis;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //gets
    public String getNombre(){
        return nombre;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public double getDineroDis(){
        return dineroDis;
    }
    
    public int getEdad(){
        return edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nCarrera: "+carrera+"\nNumero de cuenta: "+numeroCuenta;
    } 
}