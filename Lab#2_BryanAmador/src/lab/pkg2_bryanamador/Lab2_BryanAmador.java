
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
            if(listaMaestros.isEmpty() && listaAlumnos.isEmpty() && opcion == 3){
                System.out.println("No hay usuarios disponibles");
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
            
            System.out.print("Desea ir al menu principal [S/N]: ");
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
            System.out.println("");
            System.out.println(x.getNombre()+" se ha registrado con exito");
            char res;
            int posClase;
            do{
                System.out.println("\n**Secciones disponibles");
                for (int i = 0; i < listaClases.size(); i++) {
                    System.out.println("("+(i+1)+")"+" *"+listaClases.get(i));
                }
                do {
                    System.out.print("Ingrese el numero de clase donde desea inscribirse\n->");
                    posClase = sc1.nextInt();
                } while (posClase<1 && posClase>listaClases.size());
                if(listaClases.get(posClase-1).cupoDisponible()){
                    x.clasesCursando.add(listaClases.get(posClase-1).getSeccion());
                    listaClases.get(posClase-1).listaAlumnos.add(x.getNombre());    
                }else{
                    //crear una nueva clase por saturacion
                        Clase c = new Clase();
                        c.setNombre(listaClases.get(posClase-1).getNombre());
                        c.setCosto(listaClases.get(posClase-1).getCosto());
                        c.setMaxAlumnos(listaClases.get(posClase-1).getMaxAlumnos());
                        c.setUnidadesValorativas(listaClases.get(posClase-1).getUnidadesValorativas());
                        System.out.println("");
                }
                System.out.println("Ha matriculado "+listaClases.get(posClase-1).getNombre());
                System.out.println("\n Desea matricular otra clase [S/N]: ");
                res = sc1.next().charAt(0);
            }while(res == 's' || res == 'S');
            System.out.print("\nDesea ejecutar otra opcion [S/N]: ");
            resp = sc1.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }
    
    public static void LogIn(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nLogIn\n");
        char resp,op;
        String usuario, contraseña;
        do {
            System.out.println("Ingrese su nombre de usuario:");
            usuario = sc1.next();
            System.out.println("Ingrese su contraseña:");
            contraseña = sc1.next();
            for (int i = 0; i < listaMaestros.size(); i++) {
                if(listaMaestros.get(i).getUsuario().equals(usuario)){
                    if(contraseña.equals(listaMaestros.get(i).getContraseña())){
                        serMaestro(i);
                    }else{
                        System.out.println("Datos incorrectos");
                    }
                }else{
                    if(listaAlumnos.get(i).getUsuario().equals(usuario)){
                        if(contraseña.equals(listaAlumnos.get(i).getContraseña())){
                            serAlumno(i);
                        }else{
                            System.out.println("Datos incorrectos");
                        }
                    }
                }
            }
            System.out.print("\nDesea ingresar con otro usuario [S/N]: ");
            resp = sc1.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }
    
    public static void serMaestro(int pos){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("MENU MAESTROS\nBienvenido "+listaMaestros.get(pos).getNombre());
        char r;
        System.out.println("\n(1)Modificar datos");
        System.out.println("(2)Ver secciones asignadas");
        System.out.println("Ingrese su opcion: ");
        int op = sc2.nextInt();
        if(op==1){
            do {
                System.out.println("(1)Nombre"
                        + "\n(2)Titulo"
                        + "\n(3)Maestria"
                        + "\n(4)Usuario"
                        + "\n(5)Contraseña"
                        + "\n(6)Salario");
                System.out.println("Ingrese lo que desea modificar");
                String opcion = sc2.next();
                switch (opcion){
                    case "1":
                        System.out.println("Ingrese el nuevo nombre: ");
                        listaMaestros.get(pos).setNombre(sc2.next());
                        break;
                    case "2":
                        System.out.println("Ingrese el nuevo titulo: ");
                        listaMaestros.get(pos).setTitulo(sc2.next());
                        break;
                    case "3":
                        System.out.println("Ingrese la nueva Maestria: ");
                        listaMaestros.get(pos).setMaestria(sc2.next());
                        break;
                    case "4":
                        System.out.println("Ingrese el nuevo usuario: ");
                        listaMaestros.get(pos).setUsuario(sc2.next());
                        break;
                    case "5":
                        System.out.println("Ingrese la nueva contraseña: ");
                        listaMaestros.get(pos).setContraseña(sc2.next());
                        break;
                    case "6":
                        System.out.println("Ingrese el nuevo salario: ");
                        listaMaestros.get(pos).setSalario(sc2.nextDouble());
                        break;
                } 
            
                System.out.println("Desea modificar algo mas [S/N]: ");
                r = sc2.next().charAt(0);
            } while (r == 'S' || r == 's');
        }else{ if(op==2){
                for (int i = 0; i < listaMaestros.get(pos).listaClases.size(); i++) {
                    String seccion = listaMaestros.get(pos).listaClases.get(i);
                    System.out.println("Seccion: "+seccion);
                    for (int cont = 0;cont < listaClases.size();cont++) {
                        if(listaClases.get(cont).getSeccion().equals(seccion)){
                            System.out.println("Nombre: "+listaClases.get(cont).getNombre());
                            System.out.println("Alumnos: ");
                            for (int j = 0; j < listaClases.get(cont).listaAlumnos.size(); j++) {
                                System.out.println((j+1)+"-"+listaClases.get(cont).listaAlumnos.get(j));
                            }
                            break;
                        }
                    }
                }
            }
        }
        
        
    }
    
    public static void serAlumno(int pos){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("MENU Alumnos\nBienvenido "+listaAlumnos.get(pos).getNombre());
        char r;
        System.out.println("\n(1)Modificar datos");
        System.out.println("(2)Retirar clases");
        System.out.println("(3)Adicionar clases");
        System.out.println("(4)Mensajeria");
        System.out.println("Ingrese su opcion: ");
        int op = sc2.nextInt();
        switch(op){
            case 1:
                System.out.println("**Modificar datos");
                do {
                System.out.println("(1)Nombre"
                        + "\n(2)Numero de cuenta"
                        + "\n(3)Carrera"
                        + "\n(4)Usuario"
                        + "\n(5)Contraseña"
                        + "\n(6)Dinero disponible"
                        + "\n(7)Edad");
                System.out.println("Ingrese lo que desea modificar");
                String opcion = sc2.next();
                switch (opcion){
                    case "1":
                        System.out.println("Ingrese el nuevo nombre: ");
                        listaAlumnos.get(pos).setNombre(sc2.next());
                        break;
                    case "2":
                        System.out.println("Ingrese el nuevo numero de cuenta: ");
                        listaAlumnos.get(pos).setNumeroCuenta(sc2.next());
                        break;
                    case "3":
                        System.out.println("Ingrese la nueva carrera: ");
                        listaAlumnos.get(pos).setCarrera(sc2.next());
                        break;
                    case "4":
                        System.out.println("Ingrese el nuevo usuario: ");
                        listaAlumnos.get(pos).setUsuario(sc2.next());
                        break;
                    case "5":
                        System.out.println("Ingrese la nueva contraseña: ");
                        listaAlumnos.get(pos).setContraseña(sc2.next());
                        break;
                    case "6":
                        System.out.println("Ingrese el nuevo Dinero disponible: ");
                        listaAlumnos.get(pos).setDineroDis(sc2.nextDouble());
                        break;
                    case "7":
                        System.out.println("Ingrese la nueva edad: ");
                        listaAlumnos.get(pos).setEdad(sc2.nextInt());
                        break;
                } 
            
                System.out.println("Desea modificar algo mas [S/N]: ");
                r = sc2.next().charAt(0);
            } while (r == 'S' || r == 's');
        }
        
    }
    
}
