import java.util.Random;

public class Utilidades {

    public static double doubleAleatorio() {
        return new Random().nextDouble();
    }

    public static Object aleatorioEntre(int[] rango) {
        return new Random().nextInt(rango[1] - rango[0] + 1) + rango[0];
    }

}
