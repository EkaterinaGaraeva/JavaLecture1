/**
* многострочные комментарии
*/

// однострочные комментарии

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Goodbye world");
//     }
// }

// class Program
// {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);        //10
//         System.out.println(salary);     //123456
//     }
// }

// class Program
// {
//     public static void main(String[] args) {
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e);        // 2.7
//         System.out.println(pi);       // 3.1415
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         char ch = 123;
//         System.out.println(ch);
//     }
// }

// class Program
// {
//   public static void main(String[] args) {
//       char ch = '1';
//       System.out.println(Character.isDigit(ch));  // true
//       ch = 'a';
//       System.out.println(Character.isDigit(ch));  // false
//   }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);  // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2);  // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);  // false
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String msg ="Hello world";
//         System.out.println(msg); // Hello world
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     } 
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// class program
// {
//   public static void main(String[] args) {
//       System.out.println(Integer.MAX_VALUE); // 2147483647
//       System.out.println(Integer.MIN_VALUE); // -2147483648
//   }
// }

// class program
// {
//     public static void main(String[] args) {
//         int a = 123;
//         a = a-- - --a;
//         System.out.println(a);
//     }
// }

// class program
// {
//     public static void main(String[] args) {
//         int a = 8;
//         // 1000
//         // a = a << 1;
//         System.out.println(a << 1);
//         // 10000
//         int b = 18;
//         System.out.println(b >> 1);
//     }
// }

// class program
// {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b);
//         // 101
//         // 010
//         // 111
//         System.out.println(a & b);
//         // 000
//         System.out.println(a ^ b);
//         // 111
//     }
// }

// class program
// {
//     public static void main(String[] args) {
//         String s = "qww1"; // 4, 0...3
//         // boolean b = s.length() >= 5 && s.charAt(4) == '1';
//         boolean b = s.length() >= 5 & s.charAt(4) == '1';
//         System.out.println(b);
//     }
// }

// Массивы
// Одномерные
// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//         for (int index = 0; index < arr.length; index++) {
//             System.out.println(arr[index]);
//         }
//     }
// }

// Многомерные
// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// Преобразования
// public class program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
//  }

// НО
// class Program
// {
//   public static void main(String[] args) {
//    int[] a = new int[10];
//    double[] d = a;   // ИЗУЧАЕМ ковариантность и контравариантность
//   }
// }

// Получение данных из терминала
// Строки
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//    }
// }

// Некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//     } 
// }

// Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String s = "qwe"; // одна строка
//         int a = 123;
//         String q = s + a; 
//         // преобразование a к строке
//         // s + a будет где-то размещено в памяти - третья строка
//         // q строка = 4 строки
//         // операция конкатинации (склеивания) для строк опасная операция,
//         // может дать просадку по производительности
//         // в цикле скорее всего надо переписывать код, есть StringBuilder
//         System.out.println(q);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, 
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// public class program {
//     public static void main(String[] args) {
       
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);    // 3,141500
//         System.out.printf("%.2f\n", pi);  // 3,14
//         System.out.printf("%.3f\n", pi);  // 3,141
//         System.out.printf("%e\n", pi);    // 3,141500e+00
//         System.out.printf("%.2e\n", pi);  // 3,14e+00
//         System.out.printf("%.3e\n", pi);  // 3,141e+00
//     }
// }

// Область видимости переменных
// У переменных существует понятие «область видимости». 
// Если переменную объявили внутри некоторого блока фигурных скобок { }, 
// то снаружи этого блока переменная будет недоступна.

// public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);           
//         }     
//         // int i = 222; // заработает
//         System.out.println(i);  // error: cannot find symbol
//     }
// }

// Функции и методы
// Функции и методы — это технически одно и то же. Функции могут 
// не принадлежать классам, а методы принадлежат. 
// В java все функции являются методами. 

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

// Управляющие конструкции: 
// условный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;

//         System.out.println(c);
//     }
// }

// тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

// Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
// 		...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         switch (a) {
//             case 1: 
//             case 2:
//             case 3:
//                 System.out.println("a");
//                 break;
//             case 10: System.out.println("b");
//                 break;
//             default:
//                 break;
//         }
//     }
// }

// Циклы
// Цикл — это многократное выполнение одинаковой последовательности действий.

// В java доступны следующие циклы:
// цикл while;
// цикл do while;
// цикл for; и его модификация for in

// Цикл while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Цикл do while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break. 
// * ближайшего к оператору

// Оператор цикла for
// public class program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         for (int i = 0; i < 10; i++) {
//             if (i%2 != 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 5; j++) {
//                 break;
//             }
//             break;
//         }
//     }
// }

// Вложенные циклы
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }

// for :
// Работает только для коллекций
// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[] {1, 2, 3, 4, 5, 77};
//         // for (int i = 0; i < arr.length; i++) {
//         //     arr[i] = 10;
//         // }

//         for (int item : arr) {
//             item = 13; // только с локальной переменной
//             // System.out.println(item);
//         }
//         for (int item : arr) {
//             System.out.println(item);
//         }
//     }
// }

// Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// Чтение, Вариант посимвольно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     } 
// }

// Вариант построчно
// import java.io.*;

// public class program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }

