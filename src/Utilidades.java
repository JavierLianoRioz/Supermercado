import java.util.Random;

public class Utilidades {

    public static double doubleAleatorio() {
        return new Random().nextDouble();
    }

    public static int aleatorioEntre(int[] rango) {
        return new Random().nextInt(rango[1] - rango[0] + 1) + rango[0];
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void divisor(String x) {
        System.out.println(x.repeat(50));
    }

}
