
public class Hora {

    private int hora;
    private int termina;

    public Hora(int inicio, int termina) {
        this.hora = inicio;
        this.termina = termina;
    }

    public boolean terminado() {
        return hora >= termina;
    }

    public void avanzar() {
        hora++;
    }

    public void mostrar() {
        System.out.println("Hora actual: " + hora + ":00, cierra a las " + termina + ":00");
    }

}
