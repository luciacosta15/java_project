public class Carro{

	private String matricula;
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro(){}
	
	public Carro(String mat, String marca, String model, String cor){
		this.matricula = mat;
		this.marca = marca;
		this.modelo = model;
		this.cor = cor;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getCor(){
		return this.cor;
	}
	
	public void setMatricula(String mat){
		this.matricula = mat;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String model){
		this.modelo = model;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	
	
	public String toString(){
		return "Carro [ " + this.getMatricula() + " | " + this.getMarca() + " | " + this.getModelo() + " | " + this.getCor() + "]";
	}
	
}