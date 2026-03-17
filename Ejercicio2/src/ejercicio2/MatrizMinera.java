package ejercicio2;

public class MatrizMinera {

    private Zona[][] matriz;
    private int filas;
    private int columnas;

    public MatrizMinera(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new Zona[filas][columnas];
    }

    public void setZona(int i, int j, Zona z) {
        matriz[i][j] = z;
    }

    public Zona getZona(int i, int j) {
        return matriz[i][j];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
