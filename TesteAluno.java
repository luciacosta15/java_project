public class TesteAluno{
	public static void main(String[] args){
		
		Pessoa p1 = new Pessoa("Ana", "Josefina", 21);
		System.out.println(p1.toString());
		
		Aluno a1 = new Aluno("Barbudo", "Manel", 53, 1234);
		System.out.println(a1.toString());
		
		System.out.println(a1.getNome() + "" + a1.getApelido());
		
	}
}