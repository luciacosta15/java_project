public class TesteHerancaPolimorfismo{
	public static void main(String[] args){

        Cao[] caes = new Cao[10];

        Cao c1 = new Cao("Bobby", "canino", 5);
        Cao c2 = new Cao("Laika", "canino", 7);
        Cao c3 = new Cao("Dezik", "canino", 2);
        Cao c4 = new Cao("Tsigan", "canino", 1);
        Cao c5 = new Cao("Lisa", "canino", 11);
       
        caes[0] = c1;
        caes[1] = c2;
        caes[2] = c3;
        caes[3] = c4;		
        caes[4] = c5;       

        for(int i = 0; i < caes.length; i++){
			if(caes[i] != null)
			System.out.println(caes[i].toString());
        }
        
        Gato[] gatos = new Gato[6];

        Gato g1 = new Gato("Tareco", "felino", 17);
        Gato g2 = new Gato("Félicette", "felino", 3);
        Gato g3 = new Gato("Bob", "felino", 19);

        gatos[0] = g1;
        gatos[1] = g2;
        gatos[2] = g3;

        
        for(int i = 0; i < gatos.length; i++){
			if(gatos[i] != null)
			System.out.println(gatos[i].toString());
        }


        Passaro[] passaros = new Passaro[6];

        Passaro p1 = new Passaro("Zé Carioca", "ave","azul, vermelho e amarelo", 1);
        Passaro p2 = new Passaro("Woodstock", "ave","azul, preto e amarelo", 2);
       
        passaros[0] = p1;
        passaros[1] = p2;
        
        for(int i = 0; i < passaros.length; i++){
			if(passaros[i] != null)
			System.out.println(passaros[i].toString());
        }

        AnimalEstimacao[] animais = new AnimalEstimacao[10];

        animais[0] = c1;
        animais[1] = c2;
        animais[2] = c3;
        animais[3] = c4;
        animais[4] = c5;
        animais[5] = g1;
        animais[6] = g2;
        animais[7] = g3;
        animais[8] = p1;
        animais[9] = p2;

        for(int i = 0; i < animais.length; i++){
            if(animais[i] != null)
            System.out.println("******************** os animais pedem comida como *****************************");
             System.out.println("O animail " + animais[i].getNome() +" pede comida:  " + animais[i].pedeComida());
            System.out.println("********************************************************************************");

        }
        for(int i = 0; i < animais.length; i++){
            if(animais[i] != null)
            System.out.println(" ******************** os animais emitem som como ***************************** ");
			System.out.println(" O animail " + animais[i].getNome() + " emite som:  "  + animais[i].emiteSom());
            System.out.println(" ******************************************************************************** ");
        }

    }
}