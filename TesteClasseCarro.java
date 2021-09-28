public class TesteClasseCarro{
    public static void main(String[] args){
    
	//instanciar o objeto c1 do tipo de dados Carro
	Carro c1 = new Carro();  
	Carro c2 = new Carro();
	Carro c3 = new Carro();
	
	//testar métodos setter
	c1.setMatricula("AA-AA-02");
	c1.setMarca("Mercedes-Benz");
	c1.setModelo("Class A180");
	c1.setCor("Vermelho");
	
	c2.setMatricula("BB-TA-11");
	c2.setMarca("Audi");
	c2.setModelo("Class A3");
	c2.setCor("Azul");

	c3.setMatricula("PA-LO-14");
	c3.setMarca("Mini");
	c3.setModelo("Cooper");
   	c3.setCor("Preto");
	
	//testar metodos getter
	System.out.println(c1.toString());
	
	System.out.println(c2.toString());
	
	System.out.println(c3.toString());
	
	}
}