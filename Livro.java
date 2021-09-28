public class Livro{
	//atributos
	private String titulo;
	private int ano_edi;
	private String autor;
	
	
	
	//metodos construtores
	public Livro(){}

	public Livro(String tt){
		this.titulo = tt;
		this.autor = autor;
	}
	
	public Livro(String t, int ano, String autor){
		this.titulo = t;
		this.ano_edi = ano;
		this.autor = autor;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	public int getAno(){
		return this.ano_edi;
	}
	public String getAutor(){
		return this.autor;
	}
	
	
	
	public void setTitulo(String t){
		this.titulo = t;
	}
	public void setAno(int ano){
		this.ano_edi = ano;
	}
	public void setAutor(String x){
		this.autor = x;
	}
	
	public String toString(){
		return "Livro[" + this.getTitulo() + " | " + this.getAno() + " | " + this.getAutor() + "]";
	}
	
}