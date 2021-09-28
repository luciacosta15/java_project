public class TesteArrayObjetos{
	public static void main(String[] args){
		
		// array de objetos do tipo Livro
		Livro[] livros = new Livro[10];
			
		// declaração e inicialização de variaveis do tipo Livro
		Livro lv1 = new Livro("Programas de Java para tótos", 13.45, 2, "Major Toto", 2);
		Livro lv2 = new Livro("Algoritmos para tótos", 9.45, 4, "Major Toto", 1);
		Livro lv3 = new Livro("Classes e Objetos em Java", 39.99, 1, "Dr. Java", 9);
		Livro lv4 = new Livro("OO em Java", 45.10, 4, "Dr. Java", 1);
		Livro lv5 = new Livro("Exercicios e Algoritmos em Pseudocodigo", 19.45, 3, "Maria Antonio", 1);
			
		// inserir no array de objetos 4 objetos do tipo generico Publicacao (Livro e Revista são compativeis)
		livros[0] = lv1;
		livros[1] = lv2;
		livros[2] = lv3;
		livros[3] = lv4;
		livros[4] = lv5;
			
		//Percorrer o array e imprimir o elemento através do metodo toString()
		// com for-loop
		for(int i = 0; i < livros.length; i++){
			if(livros[i] != null)
			System.out.println(livros[i].toString());
		}
		
		// com foreach-loop
                System.out.println("\nCOM FOREACH-LOOP");
		for(Livro l: livros){
			if ( l != null ){
				System.out.println(l.toString());
			}
		}
	}	
}