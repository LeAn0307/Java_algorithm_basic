
import java.util.*; //Scanner


public class Main {

    public static void main(String[] ags) {

        //Array
//        int n = 4;
//        Integer[] arr = new Integer[n];
//        Input(arr, n);
//        CheckPrimeArr(arr, arr.length);
//        Arrays.sort(arr);
//        Output(arr, n);

        //Class
        Student A = new Student();
        A.InputStudent();
        A.OutputStudent();

    }


    public static void Input(Integer[] arr, Integer n) {
        Scanner scanner = new Scanner(System.in);

        for (Integer i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void Output(Integer[] arr, Integer n) {
        for (Integer i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static boolean CheckPrime(Integer x) {
        if (x < 2) return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void CheckPrimeArr(Integer[] arr, Integer n) {
        //Check arr is interger arr
        for (Integer i = 0; i < n; i++) {
            if (CheckPrime(arr[i]) == false) {
                System.out.print("Khong la mang nguyen to");
                return;
            }
        }
        System.out.print("La mang so nguyen to");
    }
}
