public abstract class Entidad implements Atacante {

    protected String nombre;
    protected int vida;

    public Entidad(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Entidad{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                '}';
    }

    public void mostrarEstado() {
        System.out.println(nombre + " tiene " + vida + " de vida");
    }


    public abstract void moverse();
}