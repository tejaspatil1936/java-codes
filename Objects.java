// there are different ways to create objects in java
// using new keyword -> this is the most common way to create an object in java almost 99% of object are created in this way  
// syntax: MyObject object = new Object()

// using class. for name if we know the name of the class and if it has a public defaulr constructor we can create a object in this way 
// syntax: Myobject obj = (MyObject)class.forName("object").newInstance 

// using clone();
// clone can be used to create a copy of an existing object 
// syntax: MyObject obj = new Object()
//    MyObject object = (MyObject)obj.clone

// using object deserialization
// object deserialization is nothing but creating an object from its serialized form
// syntax:  objectInputStream istream = new objectInputStream(some data);
// MyObject object = (MyObject) instream.readObject();

// using newInstance() method
// syntax : Object obj = DemoClass.class.getClassLoader().loadClass("DemoClass").newInstance

public class Objects {
    public static void main(String[] args) {

    }
}
