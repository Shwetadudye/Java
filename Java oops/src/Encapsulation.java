// encapsulation : private data
//we can get data by getter setter method
//this keyword
class Customer{
    private String name ;
    private  String email;
    private int id;
    private double salary;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public  String getEmail(){
        return email;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary= salary;
    }
    public double getSalary(){
        return salary;
    }
}

public class Encapsulation {
    public static  void main(String[] args){
            Customer s1 = new Customer();
            s1.setName("shweta");
            s1.setEmail("dudyeshweta@gmail.com");
            s1.setId(10);
            s1.setSalary(90000);

            System.out.println("Name " + s1.getName());
            System.out.println("Email" + s1.getEmail());
            System.out.println("Id" + s1.getId());
            System.out.println("Salary " + s1.getSalary());


    }
}
