public class Gato extends AnimalEstimacao{

    public Gato(String nome, String especie, int idade){
        super(nome,especie,idade);
    }

    public String emiteSom(){
        return  "Miau Miau";
    }

    public String pedeComida(){
        return " faz um olhar triste";
    } 

    public String toString(){
        return " gato[nome = " + this.getNome() + " | especie = " + this.getEspecie() + " |  idade = " + this.getIdade() + " anos]";
    }

}
    