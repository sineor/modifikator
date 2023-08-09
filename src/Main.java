import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Circle деген класс тузунуз, анын PI деген свойствасы, area
        //жана circumference деген статик методдору болсун.
        //areaны табуу учун: PI * (radius * radius)
        //circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат

      Circle circle = new Circle();
       Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedi radius:");
        int radius = scanner.nextInt();
        System.out.println("Ploshad kruga:");
        Circle.area(radius);
        System.out.println("Dlina okrujnosti");
        Circle.circumference(radius);
    }
}