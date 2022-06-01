package com.rohini.reference;

public class Garbage {
    public static void main(String[] args){


        // Calling finalize method Explicitly.
    Garbage g=new Garbage();
        g.finalize();



        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overriden");
        try {
            System.out.println(10 / 0);
        }
        catch(Exception e){
            System.out.println("exception");
        }
    }
}
