
public class Cola {

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

}
