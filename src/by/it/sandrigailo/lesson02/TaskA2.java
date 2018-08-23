package by.it.sandrigailo.lesson02;

/*
напишите тело main программы которая выводит на экран 5 строк
"Я начинаю изучать Java!"

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/

class TaskA2 {

    public static void main(String[] args) {
        System.out.println("Я начинаю изучать Java");
    String s = "Я начинаю изучать Java";
    printTextMoreTimes(s,5);
    }

        public static void printTextMoreTimes (String s, int count ){
        for (int i = 0; i<4; i++){
            System.out.println(s);
        }

    }
}
