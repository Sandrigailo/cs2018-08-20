package by.it.sandrigailo.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/

import java.util.Scanner;
class TaskC2 {
public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int sn,fn,result;
    fn = sc.nextInt();
    sn = sc.nextInt();
    result = fn + sn;
    System.out.println ("DEC"+":"+fn+"+"+sn+"="+result);
    System.out.println("BIN"+":"+Integer.toBinaryString(fn)+"+"+Integer.toBinaryString(sn)+"="+Integer.toBinaryString(result));
    System.out.println("HEX"+":"+Integer.toHexString(fn)+"+"+Integer.toHexString(sn)+"="+Integer.toHexString(result));
    System.out.println("OCT"+":"+Integer.toOctalString(fn)+"+"+Integer.toOctalString(sn)+"="+Integer.toOctalString(result));

}


}
