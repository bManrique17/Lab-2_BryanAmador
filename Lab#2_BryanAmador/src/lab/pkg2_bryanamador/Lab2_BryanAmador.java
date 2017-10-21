
package lab.pkg2_bryanamador;
import Clases.Alumno;
import Clases.Clase;
import Clases.Maestro;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_BryanAmador {

    static ArrayList<Alumno> listaAlumnos = new ArrayList();
    static ArrayList<Clase> listaClases = new ArrayList();
    static ArrayList<Maestro> listaMaestros = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char opcion, resp;
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
            if(listaClases.isEmpty() && opcion == 2){
                System.out.println("No hay clases disponibles para matricularse");
                opcion = 9;
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
            
            System.out.print("Desea salir [S/N]: ");
            resp = sc.next().charAt(0);
        }while(resp== 's' || resp== 'S');
        
    }
    
    public static void Administracion(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nADMINISTRACION");
        char resp,op;
        do {
            System.out.print("(1)Crear maestros\n(2)Crear clases\nIngrese su opcion: ");
            op = sc1.next().charAt(0);
            if(op == '2' && listaMaestros.isEmpty()){
                System.out.println("No se pueden crear clases si no hay maestros");
                op = 3;
            }
            if(op == '1'){
                Maestro x = new Maestro();
                listaMaestros.add(x);
                System.out.println("**Crear maestros");
                System.out.print("Ingrese el nombre del maestro\n->");
                x.setNombre(sc1.next());
                System.out.print("Ingrese el titulo del maestro\n->");
                x.setTitulo(sc1.next());
                System.out.print("Ingrese la maestria del maestro\n->");
                x.setMaestria(sc1.next());
                System.out.print("Ingrese el usuario del maestro\n->");
                x.setUsuario(sc1.next());
                System.out.print("Ingrese la contraseña del maestro\n->");
                x.setContraseña(sc1.next());
                System.out.print("Ingrese el salario del maestro\n->");
                x.setSalario(sc1.nextDouble());
                System.out.print("Ingrese el maximo de clases que tendra asigandas el maestro\n->");
                x.setSalario(sc1.nextDouble());
                System.out.print("\nConfirmacion\n"+x);
            }else{ if(op == '2'){
                Clase x = new Clase();
                listaClases.add(x);
                System.out.println("**Crear Clases");
                System.out.print("Ingrese el nombre de la clase\n->");
                x.setNombre(sc1.next());
                System.out.print("Ingrese la seccion de la clase\n->");
                x.setSeccion(sc1.next());
                System.out.println("***Lista de maestros disponibles");
                for (int i = 0; i < listaMaestros.size(); i++) {
                    System.out.println("("+(i+1)+")"+" *"+listaMaestros.get(i));
                }
                int posMaestro;
                do {
                    System.out.print("Ingrese el numero de maestro que la impartira\n->");
                    posMaestro = sc1.nextInt();
                } while (posMaestro<1 && posMaestro>listaMaestros.size());
                x.setMaestro(listaMaestros.get(posMaestro-1).getNombre());
                System.out.print("Ingrese el costo de la clase\n->");
                x.setCosto(sc1.nextDouble());
                System.out.print("Ingrese el numero maximo de alumnos de la clase\n->");
                x.setMaxAlumnos(sc1.nextInt());
                System.out.print("Ingrese el numero de UV de la clase\n->");
                x.setUnidadesValorativas(sc1.nextInt());
                System.out.print("\nConfirmacion\n"+x);
                } 
            }
            System.out.print("\nDesea ejectucar otra opcion [S/N]: ");
            resp = sc1.next().charAt(0);
        } while (resp == 's' || resp == 'S');
        
    }
    
    public static void Matricula(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nMATRICULA");
        char resp,op;
        do {
            Alumno x = new Alumno();
            listaAlumnos.add(x);
            System.out.println("**Matricula");
            System.out.print("Ingrese el nombre del alumno\n->");
            x.setNombre(sc1.next());
            System.out.print("Ingrese el  numero de cuenta del alumno\n->");
            x.setNumeroCuenta(sc1.next());
            System.out.print("Ingrese la carrera del alumno\n->");
            x.setCarrera(sc1.next());
            System.out.print("Ingrese el usuario del alumno\n->");
            x.setUsuario(sc1.next());
            System.out.print("Ingrese la contraseña del alumno\n->");
            x.setContraseña(sc1.next());
            System.out.print("Ingrese el dinero disponible del alumno\n->");
            x.setDineroDis(sc1.nextDouble());
            System.out.print("Ingrese la edad del alumno\n->");
            x.setEdad(sc1.nextInt());
            System.out.print("\nConfirmacion\n"+x);
            System.out.print("\nDesea ejectucar otra opcion [S/N]: ");
            resp = sc1.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }
    
    public static void LogIn(){
        
    }
    
}
