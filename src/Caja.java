
public class Caja {

    private boolean ocupada;
    private int paquetes;

    public boolean vacia() {
        return !ocupada;
    }

    public void añadirPaquetes(int cantidad) {
        paquetes = cantidad;
    }

    public void pasar() {
        ocupada = true;
    }

}
