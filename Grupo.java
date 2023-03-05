public class Grupo {

    private String clave;
    private int hora, salon;

    Catedratico catedraticoObj = new Catedratico();

    public Grupo(){

    }

    public Grupo(String clave, int hora, int salon){
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Grupo{ " + "clave= " + clave + ", hora=" + hora + "salon= "+salon+'}';
    }

    public void imprimir(){
        System.out.println(toString());
    }

}
