// public class TypeConversion {
//     public static void main(String[] args) {
//          int a = 25;
//          long b = a;
//         //  long a = 25;
//         // int b = a;
//     }
// }


// byte -> short -> int -> float -> long -> double

// import java.util.Scanner;

// /**
//  * TypeConversion
//  */
// public class TypeConversion {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float a = 25.12f;
// //         int b = (int)a;
// //         System.out.println(b);
// //     }
// // }

// ////////  typecasting

// /**
//  * InnerTypeConversion
//  */
// public class TypeConversion {

//     public static void main(String[] args) {
//         char ch = 'a';
//         int number = ch;
//         int number = ch2;
//         System.out.println(number);
//         System.out.println(number2);
//     }
// }

public class JavaBasics {
    public static void main(String args[]){
        byte b = 5;
        byte a = (byte) (b*2);
        System.out.println(a);
    }
}

//how code running?

// source code .java --->  Compiler --->  byte code .class ---> java virtual machine --->  Native Code
               
                // Compilation                                           Execuation