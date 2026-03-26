public class Zombie extends Entidad {

    public Zombie(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                '}';
    }


    public void atacar() {
        System.out.println(nombre + " ataca con golpes");
    }


    public void moverse() {
        System.out.println(nombre + " camina lento");
    }
}