package Mygrade;
import java.util.*;

public class Mygradeusingfunc {
	static int percentage=0;
	static char grade;
	static String name=null;
	static int maths=0;
	static int physics=0;
        static int chemistry=0;
        static int cs=0;
	static void myinput() {
		Scanner sc=new Scanner(System.in);
   		System.out.println("Enter the student name");
   		name=sc.nextLine();
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
	}
	static void mygrade(int percentage) {
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
	}
	public static void main(String[] args) {
            myinput();
   	    mygrade(percentage);
   	    System.out.println("Name : "+name);
   	    System.out.println("Grade : "+grade);
   	    }
	
   		
}

