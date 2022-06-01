package com.rohini.generics;

public class Test{
	public static void main (String[] args)
    {
       Generics <String> obj =new Generics<String>();
  
        obj.method("two","ten");
        Generics <Integer> obj1 =new Generics<Integer>();
        obj1.method(01, 1029874);
        
        Genericskey <String,Integer> key =new Genericskey<String,Integer>();
        key.main("puppy", 10);
    }
}
