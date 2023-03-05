
    public class Alumno {
        private String nombre;
        private int numcontrol;

        Especialidad especialidadObj = new Especialidad();

        public Alumno() {

        }

        public Alumno(String nombre, int numcontrol) {
            this.nombre = nombre;
            this.numcontrol = numcontrol;
        }

        public String getnombre() {
            return nombre;
        }

        public void setnumcontrol(int numcontrol) {
            this.numcontrol = numcontrol;
        }

        public String getNombre() {
            return nombre;
        }

        public void intnumcontrol(int numcontrol) {
            this.numcontrol = numcontrol;
        }

        @Override
        public String toString() {
            return "Alunmo{" + "nombre= " + nombre + ", numcontrol= '" + numcontrol + '\'' + '}';
        }

        public void imprimir() {
            System.out.println(toString());
        }
    }

