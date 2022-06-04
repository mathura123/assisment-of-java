package Problem1;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

class Main {
	
	
	
	String string ="Java is a high-level, class-based, object-oriented programming language that is designed to have\r\n"
			+ "\r\n"
			+ "as few implementation dependencies as possible. It is a general-purpose programming language\r\n"
			+ "intended to let programmers write once, run anywhere (WORA),\r\n"
			+ "meaning that compiled Java code can run on all platforms that support Java without the need to\r\n"
			+ "recompile. Java applications are typically compiled to bytecode that can run on any Java virtual\r\n"
			+ "machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to\r\n"
			+ "C and C++, but has fewer low-level facilities than either of them. The Java runtime provides\r\n"
			+ "dynamic capabilities (such as reflection and runtime code modification) that are typically not\r\n"
			+ "available in traditional compiled languages. As of 2019, Java was one of the most popular\r\n"
			+ "programming languages in use according to GitHub, particularly for client�server web applications,\r\n"
			+ "with a reported 9 million developers.";
	

	  public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("Enter string for check which is time");
		 

	    Main main = new Main();
	    


	    
	    Pattern p = Pattern.compile("Java");
//	    System.out.println(p);
	    Matcher m = p.matcher(main.string);
//	    System.out.println(m);
	    int count = 0;
	    
	    while(m.find()) {
	    	count++;
	    	System.out.println(m.start()+"-------"+m.end() + "----"+m.group());
	    	
	    }
	    System.out.println("the no of occurences :"+count);
	  }
	}