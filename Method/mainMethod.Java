public static void main(String[] args)
  
  /** 
  
    the keyword public indicates that the method can be invoked from everywhere;
    the keyword static indicates the method can be invoked without creating an instance of the class;
    the keyword void indicates the method doesn't return any value;
    the array variable args contains arguments entered at the command line, the array is empty if there are no arguments.

Your program cannot be compiled. It is a case when the main method declaration breaks the syntax of Java.

Examples:

    invalid method declaration: no returning value (even void).

public static main(String[] args)

    invalid method declaration: a mistake in the keyword (pubic instead of public).

pubic static void main(String[] args)


A program can be compiled but cannot be run. It is a case when the main method has a correct declaration as a regular method but doesn't satisfy the specific requirement of the main method.

Examples:

    invalid arguments (should be String[] args)

public static void main(String args) {
    System.out.println("Hello, Java");
}

    the method declaration has no keyword static

public void main(String[] args) { 
    System.out.println("Hello, Java");
} 

**/
