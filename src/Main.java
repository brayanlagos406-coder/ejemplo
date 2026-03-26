public class Main {
    public static void main(String[] args) {

        Entidad e1 = new Zombie("Zombie 1", 20);
        Entidad e2 = new Esqueleto("Esqueleto 1", 15);

        e1.mostrarEstado();
        e1.atacar();
        e1.moverse();

        System.out.println();

        e2.mostrarEstado();
        e2.atacar();
        e2.moverse();
    }
}