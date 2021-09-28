public class AnimalEstimacao{
    
    private String nome;
    private String especie;
    private int idade;
    
    //construtores
	public AnimalEstimacao(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    public String getNome(){ return this.nome; }
	public String getEspecie(){ return this.especie; }
    public int getIdade(){ return this.idade; }
    public String emiteSom(){ return "Som nao defenido"; }
    public String pedeComida(){ return " Animal pede comida ";}
 
    public double fezAnos(){
		idade = this.idade + 1;
		return this.idade;
	}
    public String toString(){
        return " animal[nome = " + this.getNome() + " | especie = " + this.getEspecie() + " |  idade = " + this.getIdade() + " anos]";
    }
}