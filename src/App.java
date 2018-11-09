import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       getUserInput(scanner,1,5);
//       getUserInputNoRecursion(scanner, 1,5);
createArray(scanner);


    }
    public  static int getUserInput(Scanner sc, int min, int max ){
        System.out.println("введите число от "+min+" до "+max);
        int result;
        try {
            result=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("вы ввели не число");
             return getUserInput(sc, min, max);
        }
        if (result<min || result>max){
            System.out.printf("вы ввели число не от %d до %d \n", min, max);
             return getUserInput(sc, min, max);

        }
        return result;
    }
    public static int getUserInputNoRecursion(Scanner scanner, int min, int max) {
        System.out.println("enter number from " + min + " to " + max);
        int result;
        while (true) {
            try {
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("not a number");
//                scanner.next();  //для предотвращения зацикливания
                continue;
            }
            if (result < min || result > max) {
                System.out.println("number not from " + min + " to " + max);
                continue;
            }
            return result;
        }
    }

    private static int[] createArray(Scanner sc) {
        System.out.println("введите длину");
        int leight = sc.nextInt();
        int[] array = new int[leight];
        if (leight == 0 || leight > 10) {
            System.out.println("длина массива олжна быть от 0 до 10");
            array = createArray(sc);
        }
        System.out.println("последний элемент массива = " + array[leight - 1]);
        return array;
    }
}
