package lab1;

import java.util.*;

public class Coordenada{
	private double x;
	private double y;
	
	 //Constructor, initialize x, y attributes to zero
	public Coordenada( )
	{
		x = 0;
		y = 0;
	}
	
	//Constructor
	public Coordenada(double x, double y )
	{
		this.x = x;
		this.y = y;
	}
	//Constructor
	
	public Coordenada(Coordenada c )
	{
		this.x = c.getX();
		this.y = c.getY();
	}
	
	//métodos setter
	
	void setX(double x) {
		
		this.x = x;
	 // fill in the code here
	}
	void setY(double y){
	 // fill in the code here
		this.y = y;
	}
	//métodos getter
	double getX(){
	 // fill in the code here
		return x;
	}
	double getY(){
	 // fill in the code here
		
		return y;
	}
	
	//método de instancia que calcula la distancia euclideana
	
	double distancia(Coordenada c ){
		return Math.sqrt(Math.pow(c.getX() - this.x, 2) + Math.pow(c.getY() - this.y,2));
	}
	
	
	//método de clase que calcula la distancia euclideana
	static double distancia(Coordenada c1, Coordenada c2){
	 // fill in the code here
		return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(),2));
		
	}
	//método que devuelve los valores de una coordenada en determinado formato
	@Override
	public String toString(){
	 // fill in the code her
		return "(" + x + ", " + y + ")";
	}
	
	
}