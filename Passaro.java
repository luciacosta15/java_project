public class Passaro extends AnimalEstimacao{

    private String corpenas;

    public Passaro(String nome, String especie, String corpenas, int idade){
        super(nome,especie,idade);
        this.corpenas = corpenas;
    }

    public String getCorPenas(String corpenas){
        this.corpenas = corpenas;
        return "azul, vermelho e amrelo";
	}

    public String emiteSom(){
        return  "piu - piu";
    }

    public String voar(){
        return  "Houston, o passaro levantou com sucesso";
    }
    
    public String pedeComida(){
        return " Fica Olhar para o dono";
    } 

    public String toString(){
        return " Passaro nome = " + this.getNome() + " | especie = " + this.getEspecie() + " | cor das penas = " + this.corpenas + " |  idade = " + this.getIdade() + " anos]";
    }

}
    