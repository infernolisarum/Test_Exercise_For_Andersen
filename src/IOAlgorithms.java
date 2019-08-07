import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOAlgorithms {

    private static String testValueName = "Вячеслав";
    private static List <Object> resultArray = new ArrayList <> ();
    private static int[] testIntArray = {1, 20, 30, 96, 13, 9, 26, 90, 3, 0};

    public static void main(String[] args) {
    }

    /*
    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */
    static void firstExercise() {
        Scanner input = new Scanner (System.in);
        if (input.hasNextDouble () && input.nextDouble () > 7) System.out.println ("Привет");
    }

    /*
    Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
    если нет, то вывести "Нет такого имени"
     */
    static void secondExercise() {
        Scanner input = new Scanner (System.in);
        if (input.hasNext () && input.next ().equals (testValueName)) System.out.println ("Привет, " + testValueName);
        else System.out.println ("Нет такого имени");
    }

    /*
    Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */
    static void thirdExercise(int[] array) {
        try {
            for (int i : array) {
                if (i % 3 == 0) resultArray.add (i);
            }
        } catch (NullPointerException e) {
            System.out.println ("The passed array is empty");
        }
        try {
            System.out.println (resultArray);
        } catch (NullPointerException e) {
            System.out.println ("The result array is empty");
        }
    }

    static void thirdExercise(double[] array) {
        try {
            for (double d : array) {
                if (d % 3 == 0) resultArray.add (d);
            }
        } catch (NullPointerException e) {
            System.out.println ("The passed array is empty");
        }
        try {
            System.out.println (resultArray);
        } catch (NullPointerException e) {
            System.out.println ("The result array is empty");
        }
    }
}
