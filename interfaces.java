// interface is a user defined data type just like class except that it have only abstract method and final data members 
// syntax : interfacename {} final data members and abstract data members 
// we cannot create object of interface 
// an interface does not contain any construcor
// all of the methods in an interface are abstarct 
// u cannot have private members in interface 
// an interface can be extended from multiple interfaces by using keywords extends 
// a class can be implemented from multiple interfaces by using keywords extends
// extends keyword is used to inherit the class or interface while implement keyword is to implement the interface 
// class can extend only one class but implement any no of interface 
// abstract class is a restricted class that cannot be used to create object 
// the purpose of the abstract class is to provide a common definition of the base class that multiple derieved class can share   
// design different classes rectanzgle circle and box by implementing standard defined in interfaces solid , surface
public class interfaces {

} 
// 8. What are different expection handling mechanism? Explain each with a program.
// checked Exception (IOException)

// Importing required classes
import java.io.*;

class SuperClass {

// SuperClass doesn't declare any exception
void method() {
	System.out.println("SuperClass");
}
}

// SuperClass inherited by the SubClass
class SubClass extends SuperClass {

// method() declaring Checked Exception IOException
void method() throws IOException {

	// IOException is of type Checked Exception
	// so the compiler will give Error

	System.out.println("SubClass");
}
}
public class Code_08a {
// Driver code
public static void main(String args[]) {
	SuperClass s = new SubClass();
	s.method();
}
}