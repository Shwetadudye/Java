public class FuncOverloading {
    public static void main(String[] args){
        func(21);
        func("Shweta");
    }
    static void func( int a){
        System.out.println(a);
    }

    static void func( String name){
        System.out.println(name);
    }
}

//On Compile time decide which function have to run