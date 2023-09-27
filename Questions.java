//
/*
  Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers
 */

// import java.util.Scanner;

// public class Questions {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int average = (a + b + c) / 3;
//         System.out.println("average is : " + average);
//     }
//  }


/*
 Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare
 */

import java.util.Scanner;

/**
  * Questions
  */
//  public class Questions {
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();

//         int area = side * side;
//         System.out.println("Area of the Square is :-" + area);
//     }
//  }



 /*
  *Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill?
 
  */
  /**
   * InnerQuestions
   */
  public class Questions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();

    float total = pencil + pen + eraser;
    System.out.println(total);
  }
    
  }