
package lab.pkg2_bryanamador;

import java.util.Scanner;

public class Lab2_BryanAmador {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char opcion;
        do{
            System.out.print("******HARVARD******\n"
                    + "(1)Administracion\n"
                    + "(2)Matricula\n"
                    + "(3)LogIn\n"
                    + "(4)Salir\n\n"
                    + "Ingrese su opcion:"
                    );
            opcion = sc.next().charAt(0);
            while(opcion!= '1' && opcion!= '2' && opcion!= '3' &&
                opcion!= '4'){
                System.out.println("Opcion invalida, de nuevo:");
                opcion = sc.next().charAt(0);
            }
            switch(opcion){
                case '1':
                    Administracion();
                    break;
                case '2':
                    Matricula();
                    break;
                case '3':
                    LogIn();
                    break; 
            }
        }while(opcion!= '4');
        
    }
    
    public static void Administracion(){
        
    }
    
    public static void Matricula(){
        
    }
    
    public static void LogIn(){
        
    }
    
}
