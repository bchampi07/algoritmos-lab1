package lab1;

public class Rectangulo {
	
	private Coordenada esquina1;
	private Coordenada esquina2;
	
	//constructor
	
	public Rectangulo (Coordenada c1, Coordenada c2) {
		setEsquina1(c1);
		setEsquina2(c2);
		
	}
	
	 public void setEsquina1 (Coordenada coo) {
		 this.esquina1 = coo;
	}
	 public void setEsquina2 (Coordenada coo) {
		 this.esquina2 = coo;
	 }
	 public Coordenada getEsquina1 () {
		 return esquina1;
	 }
	 public Coordenada getEsquina2 () {
		 return esquina2;
	 }
	 
	 public double calcularArea() {
		 double b = Math.max(esquina1.getX(), esquina2.getX()) - Math.min(esquina1.getX(), esquina2.getX()) ;
		 double h = Math.max(esquina1.getY(), esquina2.getY()) - Math.min(esquina1.getY(), esquina2.getY());
		 
		 return b*h;
	 }
	 
	 @Override
	 public String toString() {
	 // fill in the code here
		 
		 return "([" + esquina1 + ", " + esquina2 + "])";
	 
	 }
	 
}
