package com.rohini.algorithem.backtracking;

public class Permutation {
  public static void main(String[] args) {
	String str="ABCD";
	mutation(str,0,str.length()-1);	
	//permute("ABCD",0,str.length()-1);
  }

  public static void mutation(String str,int l,int r) { 
	 if(l==r) {
		 System.out.println(str); 
		 }
	 else { 
		 for(int i=l;i<=r;i++) { 
		 	str=swap(str,l,i);
		 	mutation(str,l+1,r); 
 			str=swap(str,l,i); 
 			
		 }
	 }
  }
  public static String swap1(String str,int i,int r) { 
	 char[] ar=str.toCharArray(); 
	 char temp=ar[i];
	 ar[i]=ar[r]; ar[r]=temp; 
	 return String.valueOf(ar); }
 
  public static void permute(String str, int l, int r) { 
    if (l == r)
        System.out.println(str);
    else
    {
        for (int i = l; i <= r; i++)
        {
            str = swap(str,l,i);
            permute(str, l+1, r);
            str = swap(str,l,i);
        }
    }
  }
  public static String swap(String a, int i, int j) {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i] ;
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }
}
