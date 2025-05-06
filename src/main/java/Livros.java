 public class Livros {
    //ATRIBUTOS
    private static int proximoIsbn = 1;
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    
    //CONSTRUTOR
    public Livros(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
                
    }
    //MOTODOS GETTER
    public String getTitulo(){
        return this.titulo;   
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    //METODO SETTER 
    public void setTitulo(String novoTitulo){
        this.titulo=novoTitulo;
    }
    
    public void setAutor(String novoAutor){
        this.autor=novoAutor;
    }
    
    public void setAno(String novoAno){
        this.ano=novoAno;
    }
}
