
public class Caja {

    private static final String PAQUETES_EMOJI = "[x]";
    private static final String SPACE = " ";
    private boolean ocupada = false;
    private int paquetes = 0;

    public boolean vacia() {
        return !ocupada;
    }

    public void añadirPaquetes(int cantidad) {
        paquetes = cantidad;
    }

    public void pasar() {
        ocupada = true;
    }

    public void mostrar() {
        System.out.println("Caja " + (ocupada ? "ocupada" : "libre") + ", paquetes: " + (PAQUETES_EMOJI+SPACE).repeat(paquetes));
    }

}
