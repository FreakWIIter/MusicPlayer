package School;
public class Student {
    private String name;
    private String old;
    private String shkola;
    private String klass;
    
    public String getName(){
        return name;
    }
    public Student setName(String name){
        this.name=name;
        return this;
    }
    
    public String getOld(){
        return old;
    }
    public Student setOld(String old){
        this.old=old;
        return this;
    }
    
    public String getShkola(){
        return shkola;
    }
    public Student setShkola(String shkola){
        this.shkola=shkola;
        return this;
    }
    
    public String getKlass(){
        return klass;
    }
    public Student setKlass(String klass){
        this.klass = klass;
        return this;
    }
}
