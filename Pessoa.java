public class Pessoa{
	private String nome;  
	private String apelido;  
	private int idade;
	
	
	//construtores
	public Pessoa(String nome, String apelido, int idade){
		this.nome = nome;
		this.apelido = apelido;
		this.idade = idade;
	} 
	
	public String getNome(){ return this.nome; }
	public String getApelido(){ return this.apelido; }
	public int getIdade(){ return this.idade; }
	public int fezAnos(){
		idade = this.idade + 1;
		return this.idade;
	}

	public String toString(){
		return " pessoa[nome = " + this.getNome() + " | apelido= " + this.getApelido() + " |  idade= " + this.getIdade() + "]";
	}
	
	public boolean maioridade(){
		if(idade >= 18){
			return true;
		}else{
			return false;
		}
	
	}
}
