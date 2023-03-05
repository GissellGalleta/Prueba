import java.util.Scanner;
import java.util.Vector;

public class Main {
        public static Scanner scan = new Scanner(System.in);
        public static Scanner text = new Scanner(System.in);
        static int aid = 0;
        static String nombre;

        //vectores
        public static Vector<Alumno>alumnos = new Vector<Alumno>();
        public static Vector<Catedratico>catedraticos = new Vector<Catedratico>();
        public static Vector<Materia>materias = new Vector<Materia>();
        public static Vector<Grupo>grupos = new Vector<Grupo>();
        public static Vector<Especialidad>especialidades = new Vector<Especialidad>();
        //------------


    public static void main(String[] args) {
        int opc = 0;
        do {
            opc = menu();

            switch (opc){
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    altaAlumno();
                    break;
                case 3:
                    altaCatedratico();
                    break;
                case 4:
                    altaMateria();
                    break;
                case 5:
                    altaGrupo();
                    break;
                case 6:
                    System.out.println("\nElija que registro quiere ver\n");

                    System.out.println("1.- Especialidad");
                    System.out.println("2.- Alumno");
                    System.out.println("3.- Catedratico");
                    System.out.println("4.- Materia ");
                    System.out.println("5.- Grupo");
                    opc=scan.nextInt();

                    switch(opc){
                        case 1:
                            impEsp();
                            System.out.println("\n");
                            break;

                        case 2:
                            impAlu();
                            System.out.println("\n");
                            break;

                        case 3:
                            impCat();
                            System.out.println("\n");
                            break;

                        case 4:
                            impMat();
                            System.out.println("\n");
                            break;

                        case 5:
                            impGru();
                            System.out.println("\n");
                            break;
                    }

                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("...Opcion no valida !");
                    break;
            }
        }while (opc != 7);

    }

    public static int menu(){
        int opcion=0;
        System.out.println("\nMENU PRINCIPAL\n");
        System.out.println("1.- Alta especialidad");
        System.out.println("2.- Alta alumno");
        System.out.println("3.- Alta catedratico");
        System.out.println("4.- Alta materia ");
        System.out.println("5.- Alta grupo");
        System.out.println("6.- Desplegar registros");
        System.out.println("7.- Salir");
        System.out.print("\n Seleccione la opcion deseada: ");
        opcion = scan.nextInt();
        return opcion;

    }
    // - - - - - - - - - - - - -

    public static void altaAlumno(){
        String nombre;
        int numcontrol;
        System.out.println("\n- Alta Alumno -\n");
        System.out.print("Num. Control Alumno");
        numcontrol=scan.nextInt();
        System.out.print("Nombre del Alumno");
        nombre=text.nextLine();
        alumnos.addElement(new Alumno(nombre, numcontrol));
    }
    public static void impAlu(){
        System.out.println("\n=== Registro de Alumnos ===\n");
        for(int i=0; i<alumnos.size(); i++){
            alumnos.elementAt(i).imprimir();
        }
    }
    // - - - - - - - - - - - - -

    public static void altaEspecialidad(){
        int id;
        String nombre;
        System.out.println("- Alta especialidad -");
        System.out.print("Clave especialidad:");
        id=scan.nextInt();
        System.out.print("Nombre de la especialidad:");
        nombre=text.nextLine();
        especialidades.addElement(new Especialidad(id,nombre));
    }
    public static void impEsp(){
        System.out.println("\n=== Registro de Especialidades ===\n");
        for(int i=0; i<especialidades.size(); i++){
            especialidades.elementAt(i).imprimir();

        }
    }
 // - - - - - - - - - - - - -
    public static void altaCatedratico(){
        String RFC;
        String nombre;
        System.out.println("\n- Alta Catedratico -\n");
        System.out.print("RFC Catedratico: ");
        RFC=scan.nextLine();
        System.out.print("Nombre del Catedratico: ");
        nombre=text.nextLine();
        catedraticos.addElement(new Catedratico(RFC, nombre));
    }
    public static void impCat(){
        System.out.println("\n=== Registro de Especialidad ===\n");
        for(int i=0; i<catedraticos.size(); i++){
            catedraticos.elementAt(i).imprimir();
        }
    }

    // - - - - - - - - - - - - -
    public static void altaMateria(){
        int id;
        String nombre;
        System.out.println("\n- Alta Materia -\n");
        System.out.print("Id de la materia: ");
        id=scan.nextInt();
        System.out.print("Nombre de la materia: ");
        nombre=text.nextLine();
        materias.addElement(new Materia(id,nombre));
    }
    public static void impMat(){
        System.out.println("\n=== Registro de Especialidad ===\n");
        for(int i=0; i<materias.size(); i++){
            materias.elementAt(i).imprimir();
        }
    }
    // - - - - - - - - - - - - -
    public static void altaGrupo(){
        String clave;
        int hora;
        int salon;
        System.out.println("\n- Alta Grupo -\n");
        System.out.print("Clave del grupo: ");
        clave=scan.nextLine();
        System.out.print("Horario del grupo: ");
        hora=text.nextInt();
        System.out.println("Salon:");
        salon=text.nextInt();
        grupos.addElement(new Grupo(clave, hora, salon));
    }
    public static void impGru(){
        System.out.println("\n=== Registro de Especialidad ===\n");
        for(int i=0; i<grupos.size(); i++){
            grupos.elementAt(i).imprimir();
        }
    }
    // - - - - - - - - - - - - -

}

