public class Usuarios {
    //ATRIBUTOS
    private int id;
    private String nome;
    private String email;
    
    //CONSTRUTOR
    public Usuarios(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
    //METODOS GETTER
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    //METODO SETTER
    public void setId(int novoId){
        this.id=novoId;
    }
    
    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    
    public void setEmail(String novoEmail){
        this.email=novoEmail;
    }
    
}
