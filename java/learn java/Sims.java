import java.util.Scanner;
import java.util.ArrayList;

public class Sims
{
  public static void main(String[] args)
  {
    int choice = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<String> Student = new ArrayList<String>();
    
   
    do
    {
      System.out.println("1: Add students");
      System.out.println("2: Read Students");
      System.out.println("3: Exit");
      System.out.println("choose the choice above");
      choice = input.nextInt();
      
      
      
       switch(choice)
    {
      case 1:
        System.out.println("welcome to add the student");
        System.out.print("Enter the number of student you want to add: ");
        int u = input.nextInt();
        input.nextLine();
        for(int z = 0; z < u; z++)
        {
          System.out.print("Name: ");
          String o = input.nextLine();
          Student.add(o);
        }
        
        break;
      case 2:
        System.out.println("welcome to read the student");
        if(Student.isEmpty())
        {
          System.out.println("no any Student registered");
        }
        else
        {
          System.out.println("Student List");
          
          for(String s: Student)
          {
            System.out.println(s);
          }
        }
        break;
      case 3:
        System.out.println("exting the program");
      default:
          System.out.println("incorrect choice");
      
       
    }
     
  }
    while(choice !=3);
    
  System.out.println("Goodbye");
     
   
    
}
}    
    
    
    