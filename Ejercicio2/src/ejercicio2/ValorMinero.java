package ejercicio2;

import java.util.HashMap;

public class ValorMinero {

    public static void analizar(MatrizMinera mapa, int k) {

        double maxValor = -1;
        int mejorFila = 0;
        int mejorCol = 0;

        for (int i = 0; i <= mapa.getFilas() - k; i++) {
            for (int j = 0; j <= mapa.getColumnas() - k; j++) {

                double suma = 0;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        suma += mapa.getZona(x, y).calcularValor();
                    }
                }

                if (suma > maxValor) {
                    maxValor = suma;
                    mejorFila = i;
                    mejorCol = j;
                }
            }
        }

        mostrarResultado(mapa, mejorFila, mejorCol, k, maxValor);
    }

    private static void mostrarResultado(MatrizMinera mapa, int fila, int col, int k, double valor) {

        System.out.println("Región más valiosa encontrada:");
        System.out.println("Posición inicial: (" + fila + "," + col + ")");
        System.out.println("Tamaño de la región: " + k + " x " + k);

        HashMap<String, Integer> conteo = new HashMap<>();

        System.out.println("\nZonas analizadas:");

        for (int i = fila; i < fila + k; i++) {
            for (int j = col; j < col + k; j++) {

                Zona z = mapa.getZona(i, j);
                System.out.println(z);

                conteo.put(z.getMineral(),
                        conteo.getOrDefault(z.getMineral(), 0) + 1);
            }
        }

        String predominante = "";
        int max = 0;

        for (String mineral : conteo.keySet()) {
            if (conteo.get(mineral) > max) {
                max = conteo.get(mineral);
                predominante = mineral;
            }
        }

        System.out.println("\nValor total estimado: " + valor);
        System.out.println("Mineral predominante en la región: " + predominante);
    }
}