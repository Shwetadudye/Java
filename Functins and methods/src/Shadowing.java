public class Shadowing {
    static  int x = 90;
    public  static  void main(String[] args){
        System.out.println(x);
        int x = 40;
        System.out.println(x); // this will be override line 2
         func();
    }

    static  void func(){
        System.out.println(x);
    }
}
