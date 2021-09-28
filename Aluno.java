public class Aluno extends Pessoa{
	
	//atrinbutos
	private int numero;
	
	//construtor
	public Aluno(String nome, String apelido, int idade, int numero){
		super(nome, apelido, idade);
		this.numero = numero;
	}
	
	//set
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int num){
		this.numero = num;
	}
	
	public String toString(){
			return " aluno[nome = " + this.getNome() + " | apelido = " + this.getApelido() + " |  idade= " + this.fezAnos() + "| numero:" + this.getNumero() + "]";
	}
	

}