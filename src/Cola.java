
public class Cola {

    private static final String PERSONA_EMOJI = "_o_";
    private static final String SPACE = " ";
    private int cantidad;

    public boolean vacia() {
        return cantidad == 0;
    }

    public void sacar(Caja caja) {
        cantidad--;
    }

    public void poner() {
        cantidad++;
    }

    public void mostrar() {
        String mensaje = "Cola:" + SPACE;
        if (vacia()) mensaje += "vacía"; else mensaje += (PERSONA_EMOJI+SPACE).repeat(cantidad);
        System.out.println(mensaje);
    }

}
