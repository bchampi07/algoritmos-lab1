package ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner archivo = new Scanner(new File("datos.txt"));

            int filas = archivo.nextInt();
            int columnas = archivo.nextInt();

            MatrizMinera mapa = new MatrizMinera(filas, columnas);

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    String mineral = archivo.next();
                    double cantidad = archivo.nextDouble();
                    double pureza = archivo.nextDouble();

                    Zona z = new Zona(mineral, cantidad, pureza);

                    mapa.setZona(i, j, z);
                }
            }

            archivo.close();

            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese tamaño de región k: ");
            int k = teclado.nextInt();

            ValorMinero.analizar(mapa, k);

        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }
    }
}