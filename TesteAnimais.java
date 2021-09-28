public class TesteAnimais{
    public static void main(String[] args) {
    
	//instanciar objetos. 
        Cao c1 = new Cao("Bobby", "canino", 5);
        Gato g1 = new Gato("Tareco", "felino", 17);
        Passaro p1 = new Passaro("Felismino","Ave","azul, vermelho e amarelo", 10);

        //testar método getIdade(), getNome() e getEspecie() nos objetos cao e gato
        System.out.println( c1.getNome() + " " + c1.getEspecie() + " com idade  " + c1.getIdade());
		System.out.println( g1.getNome() + " " + g1.getEspecie() + " com idade  " + g1.getIdade());
		System.out.println( p1.getNome() + " " + p1.getEspecie() + " com idade  " + p1.getIdade());
		
	    //testar método fezAnos() nos objetos cao e gato
        c1.fezAnos();
        g1.fezAnos();
        p1.fezAnos();

    	//testar método toString() nos objetos cao e gato
        System.out.println(c1.toString());
        System.out.println(g1.toString());
        System.out.println(p1.toString());
	    //testar método emiteSom() nos objetos cao e gato
        System.out.println("O cao faz " + c1.emiteSom());
        System.out.println("O gato faz " + g1.emiteSom());
        System.out.println("O passaro faz " + p1.emiteSom());
	    //testar metodo pedeComida nos objetos cao e gato
        System.out.println("O cao para pedir comida " + c1.pedeComida());
        System.out.println("O gato para pedir comida" + g1.pedeComida());
	    System.out.println("O passaro para pedir comida" + p1.pedeComida());
	    System.out.println(p1.voar());
	    
    }
}