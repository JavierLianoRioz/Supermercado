
public class Restaurante {

    private static final int NUMERO_DE_CAJAS = 4;
    private static final double PROBABILIDAD_DE_QUE_LLEGUE_ALGUIEN = 0.4;
    Caja[] cajas;
    Cola cola;
    Hora hora;

    public Restaurante() {
        hora = new Hora(9, 21);
        cola = new Cola();
        cajas = new Caja[NUMERO_DE_CAJAS];
        for (int index = 0; index < cajas.length; index++) {
            cajas[index] = new Caja();
        }
    }

    public void abrir() {
        Utilidades.limpiarConsola();
        do {
            imprimirEstado();
            llegarPersona();
            pasarPersona();
            atender();
            hora.avanzar();
        } while (estaAbierto());
    }

    private void imprimirEstado() {
        cola.mostrar();
        for (Caja caja : cajas) {
            caja.mostrar();
        }
        hora.mostrar();
        Utilidades.divisor("-");
    }

    private void pasarPersona() {
        if (!cola.vacia()) {
            for (Caja caja : cajas) {
                if (caja.vacia()) {
                    cola.sacar(caja);
                    caja.pasar();
                    return;
                }
            }
        }
    }

    private void llegarPersona() {
        if (Utilidades.doubleAleatorio() > PROBABILIDAD_DE_QUE_LLEGUE_ALGUIEN) cola.poner();
    }

    private void atender() {
        final int[] RANGO_PAQUETES = {5, 15};
        for (Caja caja : cajas) {
            if (!caja.vacia()) caja.añadirPaquetes(Utilidades.aleatorioEntre(RANGO_PAQUETES));
        }
    }

    private boolean estaAbierto() {
        return !hora.terminado();
    }

}
