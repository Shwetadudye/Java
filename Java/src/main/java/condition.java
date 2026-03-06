 // Oops 
// Encapsulation
public class condition {
    private int marks ;
    private String name;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getMarks() {
    	return marks;
    }
    
    public void setMarks(int marks) {
    if(marks>=0 && marks<=100) {
    	this.marks =  marks;
    }
    }
}