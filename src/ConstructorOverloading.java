import java.util.Scanner;

public class ConstructorOverloading {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the desired time (in hours and minutes) separated by a space");
        TimeOfDay now = new TimeOfDay(keyboard.nextInt(),keyboard.nextInt());


        System.out.println("The current time of day is" +
                " "+now.getmHour()+": "+now.getmMinutes());


    }
}
