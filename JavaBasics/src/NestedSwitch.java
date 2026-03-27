import  java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Id");
        int EmployeeID = in.nextInt();
        System.out.println("Please Enter Your department ");
        String Department = in.next();

        switch (EmployeeID){
            case 1:
                System.out.println("Hello Omkar");
                break;
            case  2 :
                System.out.println("Hello Shweta");
                break;
            case 3 :
                switch (Department){
                    case "It":
                        System.out.println("It Department");
                        break;
                    case "Manager":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid Your department");
                }
                break;
            default:
                System.out.println("Invalid Id");

        }
    }
}
