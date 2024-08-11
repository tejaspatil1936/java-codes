// there are two ways to create vector 
// 1. genric 
// 2. non generic 

// non generic vector can store any type of object like integer string data etc 
// generic vecror can store only specific the class name

//  generic syntax : vector <classname> vec = new.vector <> ();
//  non generic : vector vec = new vector();

// vectror constructor : v = new vector ();

// create a vector whose initial capacity is specified by size 
// syntax :  v = new vector (50);

// create a vector whose initial capacity is specified by size and increment is specified by incr
// v = new vector(10,5);

// vector (collection c)
// create a vector that contain elements of collection c 

// get method is to get an element at a particular index
// get method also throws ArrayIndex out of bound exception if we provide the index beyond the range of the vector   

// wap to create a vector of 6 elements set values 2.5, 2.4, 8.6, 12.4, 24.9, 50.8 find sum of elements 

import java.util.Vector;
import java.util.*;

public class vector {
    public static void main(String[] args) {
        vector vec = new vector();
        vec.add(2.5);
        vec.add(2.4);
        vec.add(8.6);
        vec.add(12.4);
        vec.add(24.9);
        vec.add(50.8);
        double s = 0 ;
        for (int i = 0; i < vec.size(); i++) {
            s = s + (double) vec.get(i); 
        }
        System.out.println("sum is " + s);
    }
}
