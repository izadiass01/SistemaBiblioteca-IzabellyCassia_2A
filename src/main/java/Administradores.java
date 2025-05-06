public class Administradores {
    //ATRIBUTOS
    private int id;
    private String nome;
    private String email;
    private String cargo;
    
    //CONSTRUTOR
    public Administradores(int id, String nome, String email, String cargo){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
    
    //METODO GETTER
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    
    //METODO SETTER
    public void setId(int novoId ){
        this.id=novoId;
    }
    
    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    
    public void setEmail(String novoEmail){
        this.email=novoEmail;
    }
    
    public void setCargo(String novoCargo){
        this.cargo=novoCargo;
    }
}
