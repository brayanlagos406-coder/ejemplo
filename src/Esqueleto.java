public class Esqueleto extends Entidad {

    public Esqueleto(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public String toString() {
        return "Esqueleto{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                '}';
    }


    public void atacar() {
        System.out.println(nombre + " dispara flechas");
    }


    public void moverse() {
        System.out.println(nombre + " se mueve ágilmente");
    }
}