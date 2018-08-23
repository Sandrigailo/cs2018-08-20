package by.it.sandrigailo.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args){
        System.out.println("Введите чиало 1");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum"+" "+"="+" "+sum);
    }
}
