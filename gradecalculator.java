import java.util.Scanner;

public class gradecalculator {
  public static void main(String[] args){
    int i ,count;
    float totalmarks = 0, percentage = 0, average = 0;
    Scanner scanner ;
    scanner = new scanner(System.in);
    System.out.println("enter the number of subjects");
    count = Scanner.nextInt();
    System.out.println("enter the marks of" +count + " subjects");
    for (int i = 0; i < count; i++){
      totalmarks = totalmarks+count;
    }
    System.out.println("the total marks of" +totalmarks);



  }