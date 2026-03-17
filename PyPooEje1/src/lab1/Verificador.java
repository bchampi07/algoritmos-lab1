package lab1;

public class Verificador {

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {

        double xmin1 = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double xmax1 = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double ymin1 = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double ymax1 = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

        double xmin2 = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double xmax2 = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double ymin2 = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double ymax2 = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());

        return (xmax1 < xmin2 || xmax2 < xmin1 || ymax1 < ymin2 || ymax2 < ymin1);
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {

        double xmin1 = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double xmax1 = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double ymin1 = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double ymax1 = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

        double xmin2 = Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double xmax2 = Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX());
        double ymin2 = Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY());
        double ymax2 = Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY());

        boolean tocaVertical =
                (xmax1 == xmin2 || xmax2 == xmin1) &&
                (ymin1 <= ymax2 && ymax1 >= ymin2);

        boolean tocaHorizontal =
                (ymax1 == ymin2 || ymax2 == ymin1) &&
                (xmin1 <= xmax2 && xmax1 >= xmin2);

        return tocaVertical || tocaHorizontal;
    }

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        return !esDisjunto(r1, r2) && !esJunto(r1, r2);
    }
}