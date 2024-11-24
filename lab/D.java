// interface aarea{
//     void setarea(int length , int breadth);
// }
// class rectangle implements aarea{
//      public void setarea(int length , int breadth){
//             System.out.println("area of rectangle = " + (length*breadth));
//     }
//     public static void main(String[] args) {
//         rectangle r1 = new rectangle();
//         r1.setarea(50,30);
//     }
// }
interface A {
    void printmethodA();
}
interface B extends A{
    void printmethodB();
}
interface C extends A {
    void printmethodC();
}
class D implements B,C{

    public void printmethodA(){
        System.out.println("this is class a ");
    }
    public void printmethodB(){
        System.out.println("this is class B");
    }
    public void printmethodC(){
        System.out.println("this is class c");
    }
    public void printmethodD(){
        System.out.println("class D implemnts B & C");
    }   

    public static void main(String[] args) {
        D obj1 = new D();
        obj1.printmethodA();
        obj1.printmethodB();
        obj1.printmethodC();
        obj1.printmethodD();
    }
}