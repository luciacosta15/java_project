public class Retangulo{
	
	//declarar os atributos
	private double base;
	private double altura;
	private static int numRetangulos;
	
	
	//construtores
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
		numRetangulos++;
	}
	public calculaArea(double base, double altura){
		this.base() * this.altura();
	}
	
	public calculaPerimetro(double base, double altura){
		2 * this.base() +  this.altura();
	}
	
	public boolean isQuadrado(){
		true this.base = base == this.altura = altura;
		false 
	}
	
	public double getBase(){
		return this.base;
	}
	public double getAltura(){
		return this.altura;
	}
	
	public double getNumRetangulos(){
		return this.numRet;
	}
	
	public String toString(){
		return "retangulo[base = " + this.getBase() + " | altura = " + this.getAltura() + " ] "; 
	}


}