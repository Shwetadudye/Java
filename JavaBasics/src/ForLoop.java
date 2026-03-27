import java.util.Scanner;

public class ForLoop {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Number");
        int n = input.nextInt();

        for(int num= 1;num<=n;num++){
            System.out.println(num);
        }

    }
}
