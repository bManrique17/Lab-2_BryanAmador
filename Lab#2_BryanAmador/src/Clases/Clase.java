package Clases;

import java.util.ArrayList;

public class Clase {
    String nombre, seccion, maestro;
    double costo;
    int maxAlumnos, unidadesValorativas;
    ArrayList<String> listaAlumnos = new ArrayList();
    
    
    public Clase(){
    }
    
    //sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
    
    public void setMaestro(String maestro){
        this.maestro = maestro;
    }
        
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public void setMaxAlumnos(int maxAlumnos){
        this.maxAlumnos = maxAlumnos;
    }
    
    public void setUnidadesValorativas(int unidadesValorativas){
        this.unidadesValorativas = unidadesValorativas;
    }
    
    //gets
    public String getNombre(){
        return nombre;
    }
    
    public String getSeccion(){
        return seccion;
    }
    
    public String getMaestro(){
        return maestro;
    }
        
    public double getCosto(){
        return costo;
    }
    
    public int getMaxAlumnos(){
        return maxAlumnos;
    }
    
    public int getUnidadesValorativas(){
        return unidadesValorativas;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nMaestro: "+maestro+"\nUV: "+unidadesValorativas;
    }     
}

