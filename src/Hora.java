
public class Hora {

    private int hora;
    private int termina;

    public Hora(int inicio, int termina) {
        this.hora = inicio;
        this.termina = termina;
    }

    public boolean cerrado() {
        return hora >= termina;
    }

    public void avanzar() {
        hora++;
    }

}
