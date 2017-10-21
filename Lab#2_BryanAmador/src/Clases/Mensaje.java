package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensaje {
    String titulo, emisor, receptor, cuerpo;
    int nivelImportancia;
     
    public Mensaje(){
    }
    
    //sets
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setEmisor(String emisor){
        this.emisor = emisor;
    }
    
    public void setReceptor(String receptor){
        this.receptor = receptor;
    }
    
    public void setCuerpo(String cuerpo){
        this.cuerpo = cuerpo;
    }
            
    public void setNivelImportancia(int nivelImportancia){
        Scanner sc = new Scanner(System.in);
        while(nivelImportancia<0 && nivelImportancia>5){
            System.out.println("El nivel debe estar entre 1-5, ingreselo de nuevo:");
            nivelImportancia = sc.nextInt();
        }
        this.nivelImportancia = nivelImportancia;
    }
    
    //gets
    public String getTitulo(){
        return titulo;
    }
    
    public String getEmisor(){
        return emisor;
    }
    
    public String getReceptor(){
        return receptor;
    }
    
    public String getCuerpo(){
       return cuerpo;
    }
            
    public int getNivelImportancia(){
        return nivelImportancia;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nEmisor: "+emisor+"\nNivel de importancia: "+nivelImportancia;
    }   
}
