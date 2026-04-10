import  java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Id");
        int EmployeeID = in.nextInt();
        System.out.println("Please Enter Your department ");
        String Department = in.next();

        switch (EmployeeID) {
            case 1 -> System.out.println("Hello Omkar"); // lambda expression
            case 2 -> System.out.println("Hello Shweta");
            case 3 -> {
                switch (Department) {
                    case "It" -> System.out.println("It Department");
                    case "Manager" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Your department");
                }
            }
            default -> System.out.println("Invalid Id");
        }
    }
}
