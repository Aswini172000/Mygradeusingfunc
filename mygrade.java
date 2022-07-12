//package Mygrade;
import java.util.*;

public class Mygrade {
	public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
   		String name=null;
   		System.out.println("Enter the student name");
   		name=sc.nextLine();
   		int maths=0;
   		int physics=0;
   		int chemistry=0;
   		int cs=0;
   		int percentage=0;
   		char grade;
   		System.out.println("Enter the maths marks");
   		maths=sc.nextInt();
   		System.out.println("Enter the physics marks");
   		physics=sc.nextInt();
   		System.out.println("Enter the chemistry marks");
   	    chemistry=sc.nextInt();
   	    System.out.println("Enter the cs marks");
   	    cs=sc.nextInt();
   	    try {
   	    if((maths<0 || maths>101) ||(physics<0 || physics>101)||(chemistry<0 || chemistry>101)||(cs<0 || cs>101)) {
   	    	System.out.println("Enter the valid marks");
   	    }
   	    else {
   	    	percentage=(maths+physics+chemistry+cs)/4;
   	    }
   	    }catch(Exception e) {
   	    	System.out.println(e);
   	    }
   	    if(percentage>90) {
   	    	grade='A';
   	    }else if(percentage>80 && percentage<91) {
   	    	grade='B';
   	    }else if(percentage>70 && percentage<81) {
   	    	grade='C';
   	    }else if(percentage>60 && percentage<71) {
   	    	grade='D';
   	    }else {
   	    	grade='F';
   	    }
   	    
   	    System.out.println("Name : "+name);
   	    System.out.println("Grade : "+grade);
   	    }
   		
	}

