public class prime {
    private int id;
    private int per;
    private String name;
    public prime(){
        this(01,2001,"dilshad");
        System.out.println("deafulat constructor called");
    }
    public prime(String name){
        this(01,2001,name);
        System.out.println("two parameters called");
    }

    public prime(int id,int per,String name){
        this.id=id;
        this.per=per;
        this.name=name;
        System.out.println("three parameters called");
    }
   public String  getname(){
        return name;
   }
    public static void main(String[] args){
        prime p= new prime();
        System.out.println(p.getname());
        prime p1=new prime("son");
        System.out.println(p1.getname());
    }
}
