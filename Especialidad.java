public class Especialidad {
    private int id;
    private String nombre;

    public Especialidad(){

    }
    public Especialidad(int id){
        this.id = id;
    }
    public Especialidad(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "\n Especialidad{" + "id=" + id + ", Nombre=" + nombre + "} \n";
    }

    public void imprimir(){
        System.out.println(toString());
        //mod
    }
}
