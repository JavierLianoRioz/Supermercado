
public class Restaurante {

    private static final int NUMERO_DE_CAJAS = 4;
    private static final double PROBABILIDAD_DE_QUE_LLEGUE_ALGUIEN = 0.4;
    Caja[] cajas;
    Cola cola;
    Hora hora;

    public Restaurante() {
        cola = new Cola();
        cajas = new Caja[NUMERO_DE_CAJAS];
        for (int index = 0; index < cajas.length; index++) {
            cajas[index] = new Caja();
        }
    }

    public void abrir() {
        do {
            llegarPersona();
            pasarPersona();
            atender();
        } while (estaAbierto());
    }

    private void pasarPersona() {
        if (!cola.vacia()) {
            for (Caja caja : cajas) {
                if (caja.vacia()) {
                    cola.sacar(caja);
                    return;
                }
            }
        }
    }

    private void llegarPersona() {
        if (Utilidades.numeroAleatorio() > PROBABILIDAD_DE_QUE_LLEGUE_ALGUIEN) cola.poner();
    }

    private void atender() {
        final int[] RANGO_PAQUETES = {5, 15};
        for (Caja caja : cajas) {
            if (!caja.vacia()) caja.añadirCajas(Utilidades.aleatorioEntre(RANGO_PAQUETES));
        }
    }

    private boolean estaAbierto() {
        return hora.cerrado();
    }

}
