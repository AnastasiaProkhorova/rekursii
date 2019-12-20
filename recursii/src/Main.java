import java.util.Scanner;

//Zadacha 7.92
//Напишите программу, перемножающую два натуральных числа, которая не использует операции умножения.
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("a*b = " + f(b,a));
    }
    public static int f(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + f(b - 1, a);
        }
    }
}


////Zadacha 7.94
////Напишите программу, вводящую целое число a и натуральное n, вычисляющую и печатающую степень a
////n без использования вызова функции возведения в степень.
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int n = in.nextInt();
//        System.out.println("Введите степень числа: ");
//        int a = in.nextInt();
//        System.out.println("n в  степени a: " + second(n,a));
//    }
//    public static int second(int n, int a){
//        if (n == 0){
//            return 1;
//        }
//        else {
//            return a * second(n - 1,a);
//        }
//    }
//}
//
////Zadacha 7.109
////Напишите программу, находящую наибольший общий делитель gcd(X, Y ) двух натуральных чисел X и Y
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int a = in.nextInt();
//        System.out.println("Введите второе число: ");
//        int n = in.nextInt();
//        System.out.println("Среднее арифметическое этих чисел равно: " + third(n,a));
//    }
//    public static int third(int n, int a){
//        if (n == 0){
//            return a;
//        }
//        else {
//            return third(a % n,n);
//        }
//    }
//}