import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
public static void main(String [] args)
{
  Scanner input = new Scanner(System.in);
    ArrayList<String> car = new ArrayList<String>();
    
  System.out.print("enter the number of element you want to add: ");
  int x = input.nextInt();
  input.nextLine();
  
  for(int y = 0; y < x; y++)
  {
    System.out.print("Enter the name of the car: ");
    String Car = input.nextLine();
    car.add(Car);
}
  System.out.println(car);
}}