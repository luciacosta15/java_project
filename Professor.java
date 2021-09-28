public class Professor extends Pessoa{
	
	//atrinbuto   
    private String disciplinas;
    

    //construtor
	public Professor(String nome, String apelido, int idade, String disciplinas){
		super(nome, apelido, idade);
		this.disciplinas = new disciplinas[5];
	}
    
    
	//set
    public String getDisciplinas(){
		return ("As disciplinas são " + this.disciplinas[0] + this.disciplinas[1] + this.disciplinas[2] + this.disciplinas[3] + this.disciplinas[4] + this.disciplinas[5]);
	}
    public void setDisciplinas(){
		this.disciplinas = disciplinas;
	}
    public void adicionarDisciplina(String disciplina){
        \
    }
    public void removerDisciplina(String disciplina){

    }

	public String toString(){
			return " aluno[nome = " + this.getNome() + " | apelido = " + this.getApelido() + " |  idade= " + this.getIdade() + "| disciplina:" + this.getDisciplinas() + "]";
	}
	

}