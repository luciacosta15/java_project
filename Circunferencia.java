public class Circunferencia{
	
	//declarar os atributos
	private double raio;
	private String cor;
	
	//construtores
	public Circunferencia(){
		this.raio = 1.0;
		this.cor = "azul";
	}
	
	public Circunferencia(double r){
		this.raio = r;
		this.cor = "azul";
	}
	
	public Circunferencia(double r, String c){
		this.raio = r;
		this.cor = c;
	}
	
	
	
	//Getters
	public double getRaio(){ return this.raio; }
	public String getCor(){	return this.cor; }
	
	//ToString
	public String toString(){
		return "Circunferencia [ raio = " + this.getRaio() + " | cor =  " + this.getCor() + " ] "; 
	}
	
}