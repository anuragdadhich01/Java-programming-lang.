// Arthmatics Operrators//
/* There are Two types of Arthmetics overeaters'
  Binary                       Unary
  
  +                             ++    a = a+1 a++ ,++a
  -                             --    a = a-1 a-- ,--a
  *
  /
  % (Modulo):- a%b = 10%5=0 Remender provide karta hai


*/ 

/*
  Arrthmetic_op

public class Arrthmetic_op {

    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("Modulo =" + (A%B));
    }
}

*/

public class Arrthmetic_op {

    public static void main(String[] args) {
        // int a = 10;
        // int b = ++a;  //(pre)
        // System.out.println(a);
        // System.out.println(b);    
      
        int a = 10;
        int b = a++;        // post
        System.out.println(a);
        System.out.println(b); 
   
   
   
    }
}