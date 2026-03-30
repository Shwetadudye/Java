import  java.util.Arrays;

public class VarArgs {
    public  static  void main(String[] args){
     //  func(2,3,4,5,6,8,0,6);
        func(12,34,"shweta");
    }
// normal Arguments
//    static void func( int ...v){
//        System.out.println(Arrays.toString(v));
//    }

    // Key arguments

    static void func(int a, int b, String... v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
