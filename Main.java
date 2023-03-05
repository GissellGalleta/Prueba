import java.util.Scanner;

public class Main {
        public static Scanner scan = new Scanner(System.in);
        public static Scanner text = new Scanner(System.in);
        static int aid = 0;
        static String nombre;

        //vectores

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
}
