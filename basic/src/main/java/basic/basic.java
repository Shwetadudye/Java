package basic;
////import java.util.Scanner;
////
////public class basic {
//////
//////	public static void main(String[] args) {
//////		Scanner sc = new Scanner(System.in);
//////		System.out.print("Enter your Name :");
//////		String name = sc.nextLine();
//////		System.out.println("Welcome " + name);
//////
//////	}
//
//
////public static void main(String[] args) {
////int  marks = 40;
////String name = "Shweta";
////double price = 99.50;
////char grade = 'A';
////	System.out.println(grade);
////}
////}
////
//
////   public class basic {
////	   
////	   public static void main(String[] args) {
////	   int a = 10 ;
////	    Integer obj = Integer.valueOf(a);
////	    System.out.println(obj);
////	    
////	    Integer b = 20;
////	    int c = b.intValue();
////	    System.out.println(c);
////	   }
////   }
//// Robust means secure
//
////  Conditional statement 
////
////      public class basic {
////    	  
////    	  public static void main(String[] args) {
////    		  int a = 3;
////    		  int b = 3;
////    		  
////    		  if (a>b) {
////    			  System.out.println("a is greater than b"); 
////    	  }else if (a<b) {
////    		  System.out.println("b is greater");
////    	  }else {
////    		  System.out.println("Both are equal");
////    	  }
////      }
////    	 
////      }
//
//
//// For loop 
//
////   
//
//
//   // Arithmatic operators  + , - ,* ,/, %
//
////     public class basic {
////    	public static void main(String[] args) {
////    	int price = 250;
////    	int tickets = 3;
////    	
////    	
////    	int total = price* tickets;
////    	int add = price+ tickets;
////    	int sub = price - tickets;
////    	int div = price / tickets;
////    	int mod = price % tickets;
////    	
////    	
////    	
////    	System.out.println("Total of your ticket "+ total);
////    	System.out.println("Addition " + add);
////    	System.out.println("Sub " + sub);
////    	System.out.println("div " + div);
////    	System.out.println("mod " + mod);
////    	
////    	}
////    	
////     }
//     // Relational Operators (==,!=, < ,> ,>= ,<=)
//
////     public class basic {
////    	public static void main(String[] args) {
////    	   	int a = 10;
////    	   	int b = 20 ;
////    	   	
////    	   	System.out.println(a==b);
////    	   	System.out.println(a!=b);
////    	   	System.out.println(a<b);
////    	   	System.out.println(a>b);
////    	   	System.out.println(a>=b);
////    	   	System.out.println(a<=b);
////    	}
////     }
//     // Logical Operators (And , Or , Not)
//     
//     
//     
//     // Ternary Operators 
//  
//
////public class basic {
////    public static void main(String[] args) {
////    	 int age = 10;
////    	 
////    	 String result = (age>=18) ? "Adult" : "Minor";
////    	 System.out.println(result);
////    	 
////    }
////}
//
//       // Switch case 
////
////   public class basic{
////	   public static void main(String[] args) {
////		   
////		   int day = 78;
////		   
////		   switch(day){
////		   case 1:
////			   System.out.println("Monday");
////			   break;
////		   case 2:
////			   System.out.println("Tuesday");
////			   break;
////		   case 3 :
////			   System.out.println("Wenesday");
////			   break;
////		   case 4:
////			   System.out.println("Tuesday");
////			   break;
////		   case 5:
////			   System.out.println("Friday");
////			   break;
////		   case 6:
////			   System.out.println("Saturday");
////			   break;
////		   case 7:
////			   System.out.println("Sunday");
////			   break;
////		   default :
////			   System.out.println("Please enter 1 to 7");
////			   break;
////		   }
////	   }
////   }
//
////   Array  = 1 d array and 2d array 
//
//// public class basic {
////	 public static void main(String[] args) {
////		 // 1d array 
////		 
//////		 int arr[] = {10, 20, 30 , 45, 67};
//////		 
//////		 System.out.println("Index 2 value " + arr[2]);
//////		 
//////		 // for each 
//////		 
//////		 for(int array:arr) {
//////			System.out.println(array);
////			 
////		// 2D array 
////			 int[][]matrix = { {10,3},
////					 {4,5}};
////			 
////			 for(int i= 0 ; i<matrix.length;i++) { // rows
////				 for(int j= 0; j<matrix.length;j++) { //columns
////					 System.out.println(matrix[i][j] + "");
////					 
////				 }
////				 System.out.println();
////			 }
////		 }
////	 }
//  //  Do While loop 
// 
////      public class basic {
////    	  public static void main(String[] args) {
////    		  int i = 1 ;
////    		  
////    		  do {
////    			  System.out.println(i);
////    		  }while(i<=5);
////    	  }
////      }
//
//  //Break
////     public class basic {
////    	 public static void main(String[] args) {
////    		 
////    		 for (int i=1;i<=10;i++) {
////    			 if(i==5) {
////    				 System.out.println(i);
////    				 break;
////    			 }
////    			 System.out.println(i);
////    		 }
////    	 }
////     }
//
//     // Continue
//
////public class basic{
////	public static void main(String[] args) {
////		for(int i = 1;i<=5;i++) {
////			if(i==3) {
////				continue;
////			}
////			System.out.println(i);
////		}
////	}
////}
//     
//     // Oops 
//  // Encapsulation
//  public class basic {
//	 private int marks;
//		    private String name;
//
//		    public String getName() {
//		        return name;
//		    }
//
//		    public void setName(String name) {
//		        this.name = name;
//		    }
//
//		    public int getMarks() {
//		        return marks;
//		    }
//
//		    public void setMarks(int marks) {
//		        if(marks >= 0 && marks <= 100) {
//		            this.marks = marks;
//		        }
//		    }
//
//		    public static void main(String[] args) {
//		        basic s = new basic();
//
//		        s.setName("Shweta");
//		        s.setMarks(86);
//
//		        System.out.println("Name " + s.getName());
//		        System.out.println("Marks " + s.getMarks());
//		    }
//	  }
//  


 
  // Reverse an array 
   