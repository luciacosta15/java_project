public class Cao extends AnimalEstimacao{

    public Cao(String nome, String especie, int idade){
        super(nome,especie,idade);
    }

    public String emiteSom(){
        return "Au-Au";
    }

    public String pedeComida(){
        return " abana a cauda";
    } 

    public String toString(){
        return " cao[nome = " + this.getNome() + " | especie = " + this.getEspecie() + " |  idade = " + this.getIdade() + " anos]";
        
    }

}
    