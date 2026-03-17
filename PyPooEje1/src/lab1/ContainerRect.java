package lab1;

public class ContainerRect {

    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;

    public static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }

    public void addRectangulo(Rectangulo r) {

        if (numRec < n) {

            rectangulos[numRec] = r;

            distancias[numRec] =
                r.getEsquina1().distancia(r.getEsquina2());

            areas[numRec] = r.calculoArea();

            numRec++;
        }
        else {
            System.out.println("No se pueden agregar mas rectangulos");
        }
    }

    public String toString() {

        String s = "Rectangulo  Coordenadas  Distancia  Area\n";

        for (int i = 0; i < numRec; i++) {
            s += (i + 1) + " "
                + rectangulos[i] + " "
                + distancias[i] + " "
                + areas[i] + "\n";
        }

        return s;
    }
}