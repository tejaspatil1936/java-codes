/*
syntax:-
 [AccessSpecifier] [Modifier] returntype functionName(datatype arg1)
 {
    statement
    ----------
    return value;
 }
 */
//program to create 3 rectangles a , b, c of size 5*7, 4*6 and 8*8 
// find the total area 
// design a class rectangle 
//data member = length , breadth

class rectangle {
   private int length, breadth;

   public int area() {
      int a = length * breadth;
      return a;
   }

   public void setdimension(int m, int n) {
      length = m;
      breadth = n;
   }

   public void setdimension(int m) {
      length = m;
      breadth = m;
   }
}

public class MethodOverloading {
   public static void main(String[] args) {
      rectangle a = new rectangle();
      rectangle b = new rectangle();
      rectangle c = new rectangle();
      a.setdimension(5, 7);
      b.setdimension(4, 6);
      c.setdimension(8);
      int z = a.area() + b.area() + c.area();
      System.out.println("Total area is " + z);
   }
}
