package School;
public class Lessons {
    private String nome;
    private String time;
    
    public String getNome(){
        return nome;   
    }
    public Lessons setNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public String getTime(){
        return time;
    } 
    public Lessons setTime(String time){
        this.time = time;
        return this;
    }
}
