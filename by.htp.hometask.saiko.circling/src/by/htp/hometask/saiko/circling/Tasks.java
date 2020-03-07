package by.htp.hometask.saiko.circling;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
		
		
		
		
	}

	public static void task01() {
		
		// Необходимо вывести на экран числа от 1 до 5.  
		
		int x;
		
		for (x = 1; x <= 5; x++) {
			System.out.print(" x = " + x);
		}
	}
	
	public static void task02() {
		
		// Необходимо вывести на экран числа от 5 до 1.  
		
		int x;
		System.out.println();
		
		for (x = 5; x >= 1; x--) {
			System.out.print(" x = " + x);
		}
	}
	
	public static void task03() {
		
		// Необходимо вывести на экран таблицу умножения на 3.
		
		int x;
		int y = 3;
		System.out.println();
		
		for (x = 1; x <= 10; x++) {
			System.out.print(" x = " + x * y);
		}
	}
	
	public static void task04() {
		
		// С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно. 
		
		int x = 0;
		System.out.println();
		
		
		while(x <= 98) {
			x += 2;
			
			System.out.print(" x = " + x);
		}
	}
	
	public static void task05() {
	
		// С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно. 
	
		int x = 1;
		int sum = 0;
		System.out.println();

		while(x <= 99) {
			
			sum = sum + x;
			x += 2;
		} 
		System.out.print(" Сумма = " + sum);
	}
	
	public static void task06() {
	
		// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа. 
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число :");
	
		int n = sc.nextInt();
		int sum = 0;
		int x;
		
		for (x = 1; x <= n; x++) {
			sum = sum + x;
		}
		System.out.print(sum);
	}
	
	public static void task07() {
	
		// Вычислить значения функции на отрезке [а,b] c шагом h.
	
		System.out.println();
		int a = -2;
		int b = 10;
		int h = 2;
		int y;
		int x;
		for (x = a; (x >= a) && (x <= b); x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.print(" y = " + y);
		}
	}
	
	public static void task08() {
		
		// Вычислить значения функции на отрезке [а,b] c шагом h.
		
		System.out.println();
		
		int a = -1;
		int b = 20;
		int c = 3;
		int h = 3;
		int y;
		int x;
		
		for (x = a; (x >= a) && (x <= b); x += h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
			System.out.print(" y = " + y);
		}
	}
	
	public static void task09() {
		
		// Найти сумму квадратов первых ста чисел.  
		
		System.out.println();
		int x;
		int y = 0;
		
		for (x = 1; x <= 100; x++) {
			y += x * x;
		}
		System.out.println("Сумма = " + y);
	}
	
	public static void task10() {
		
		// Составить программу нахождения произведения квадратов первых двухсот чисел. 
		
		System.out.println();
		 
		long pr = 1;
	        
		for (int x = 1; x <= 200; x++) {
	            pr *= Math.pow(x, 2);
	        }
	        System.out.print("Произведение = " + pr);
	}
	
	public static void task11() {
		
		// Составить программу нахождения разности кубов первых двухсот чисел.
		
		System.out.println();
		
		long raz = 0;
        
		for (int x = 1; x <= 200; x++) {
            raz -= Math.pow(x, 3);
        }
        System.out.print("Разность = " + raz);
	}
	
	public static void task12() {
		
		// Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности. 
		
		System.out.println();
		long mult = 1;

        for (int n = 1; n <= 10; n++) {
            long a = (n - 1)*6 + 1;
            mult = mult * a;
        }
        System.out.print("Произведение = " + mult);
	}
	
	public static void task13() {
		
		// Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. 
		
		System.out.println();
		double y = 0;
		double a = 0.5;
		
		for (double x = -5; x <= 5; x += a) {
			 y = 5 - (x * x) / 2;
			 System.out.print("y = " + y + "\n");
		}
	}
	
	public static void task14() {
		
		// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. 
		
		System.out.println();
		double rez = 0;
		
		for (double n = 1; n <= 10; n++) {
			rez = rez + 1 / n;
		}
		System.out.print("Результат = " + rez);
	}
	
	public static void task15() {
		
		// Вычислить : 1+2+4+8+...+ 2 в 10 степени. 
		System.out.println();
		
		int sum = 0;
		
		for (int x = 0; x <= 10; x++) {
			sum += Math.pow(2, x);
		}
		System.out.print("Сумма = " + sum);
	}
	
	public static void task16() {
		
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 
		
		System.out.println();
		
		int i = 2;
        long sum = 1 + i;
        long pr = sum;
       
        for (i = 3; i <= 10; i++) {
            sum += i;
            pr *= sum;
        }
        System.out.print("Произведение = " + pr);
	}
	
	public static void task17() {
		
		// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) 
		
		System.out.println();
		
		int a = 1;
		int n = 10;
		int pr = 1;

		for (int i = 0; i < n; i++) {
			pr = pr * (a + i);
		}
		System.out.print("Результат = " + pr);
	}
		
	public static void task18() {
		
		// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид: an =  (−1n)n−1 
		
		System.out.println();
		
	    double e = 0.05;
        double sum = 0;

        for (int n = 1; n < 10; n++) {
            double a = (Math.pow(-1, n - 1)) / n;
            if (Math.abs(a) < e) {
                break;
            } else {
                 sum += a;
             }
         }
        System.out.print("Cумма членов ряда, модуль которых больше или равен е: " + sum);
    }
	
	public static void task19() {
		
		// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид: 
		
		System.out.println();
		
		double e = 0.01;
		double sum = 0;
		
		for (int n = 1; n < 10; n++) {
			
			double a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(a) < e) {
				break;
			} else {
				sum += a;
			}
		}
		System.out.print("Cумма членов ряда, модуль которых больше или равен е: " + sum);
	}
	
	public static void task20() {
		
		// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид: 
		
		System.out.println();
		
		double e = 0.05;
		double sum = 0;
		
		for (int n = 1; n < 10; n++) {
			
			double a = 1 / (3 * n -2) * (3 * n + 1);
			if (Math.abs(a) < e) {
				break;
			} else {
				sum += a;
			}
		}
		System.out.print("Cумма членов ряда, модуль которых больше или равен е: " + sum);
	}
	
	public static void task21() {
		
		// Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции: F(x) =x−sin(x)  
	
		System.out.println();
	
		int a = -2;
		int b = 10;
		int h = 2;
		
		for (int x = a; x <= b; x += h) {
			double y = x - Math.sin(x);
			
			System.out.println("x = " + x + "     " + " y = " + y);
		}
	}
	
	public static void task22() {
		
		// Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции: F(x) =sin2(x) 
	
		System.out.println();
		
		int a = -4;
		int b = 12;
		int h = 4;
		
		for (int x = a; x <= b; x += h) {
			double y = Math.sin(x) * Math.sin(x);
			
			System.out.println("x = " + x + "     " + " y = " + y);
		}
	}
	
	public static void task23() {
		
		// Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции: F(x) = ctg(x)/3+1/2(sinx)
	
		System.out.println();
	
		int a = -6;
		int b = 14;
		int h = 4;
		
		for (int x = a; x <= b; x += h) {
			double y = (1 / Math.tan(x)) / 3 + Math.sin(x) / 2;
			
			System.out.println("x = " + x + "     " + " y = " + y);
		}
	}
	
	public static void task24() {
		
		// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом. 
	
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число : ");
			
		int x = sc.nextInt();
		
		int xn = x;
		int sum = 0;
		int y = 0;
		
		while (x > 0) {
			int z = x % 10;
			x = (x / 10);
			if (z % 2 == 0) {
				sum = sum + z;
			}
			y = y * 10 + z;
		}	
		 System.out.println(" Сумма четных цифр числа " + xn + " равна " + sum);
		 System.out.println(" Число " + xn + " в обратном порядке: " + y);
	}
	
	public static void task25() {
		
		//Требуется определить факториал числа, которое ввел пользователь
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		
		int x = sc.nextInt();
		int rez = 1;
		
		for (int i = 1; i <= x; i++) {
			rez *= i;
		}
		System.out.print("Факториал числа " + x + " является число " + rez);
	}
	
	public static void task26() {
		
		// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII). 
		
		System.out.println();
		
		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " (" + (byte) ch + "), ");
		}
	}
	
	public static void task27() {
		
		// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры. 
	
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int m = sc.nextInt();
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();
        
        int j;
        int i;
	
        for (i = m; i <= n; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(j + " делитель числа " + i);
				}
			}
        }
	}
	
	public static void task28() {
		
		//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ арифметической операции или 0 для завершения работы: ");
        char s = sc.next().charAt(0);

        if (s == '0')
            System.out.println("Вы ввели символ окончания работы программы (0)");
            else {

            switch (s) {
                case '+':
                    System.out.print("Введите первое число: ");
                    int n1 = sc.nextInt();
                    System.out.print("Введите второе число: ");
                    int n2 = sc.nextInt();

                    int sum = n1 + n2;
                    System.out.println("Сумма = " + sum);

                case '-':
                    System.out.print("Введите первое число: ");
                    int n3 = sc.nextInt();
                    System.out.print("Введите второе число: ");
                    int n4 = sc.nextInt();

                    int diff = n3 - n4;
                    System.out.println("Разность = " + diff);

                case '*':
                    System.out.print("Введите первое число: ");
                    int n5 = sc.nextInt();
                    System.out.print("Введите второе число: ");
                    int n6 = sc.nextInt();

                    int pr = n5 * n6;
                    System.out.println("Произведение = " + pr);
                    
                case '/':
                    System.out.print("Введите первое число: ");
                    int n7 = sc.nextInt();
                    System.out.print("Введите второе число: ");
                    int n8 = sc.nextInt();
                   
                    if (n8 != 0) {
                        double del = (double) n7 / n8;
                        System.out.println("Деление = " + del);
                    } else 
                    	System.out.println("Деление на ноль запрещено");
                    break;
            	}	
            }
		}
	
	public static void task29() {
		
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
		
			System.out.println();
		
		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Введите первое число: ");
	        String a = sc.nextLine();
	        System.out.println("Введите второе число: ");
	        String b = sc.nextLine();

	        for (int f = 0; f < a.length(); f++) {
	            a.charAt(f);
	        }
	    
	        for (int g = 0; g < b.length(); g++) {
	            b.charAt(g);
	        }
	        System.out.println("Цифры, входящие в запись как первого, так и второго числа: ");
	        for (int i = 0; i < a.length(); i++) {
	            for (int j = 0; j < b.length(); j++) {
	                if (a.charAt(i) == b.charAt(j)) {
	                    System.out.print("" + b.charAt(j) + "; ");
	                } 
	            }
	        } 
		}
		
	public static void task30() {
		
		// Написать программу, переводящую римские цифры в арабские. 
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите цифру от 1 до 9: ");
		
		int x = scan.nextInt();
		while (x <= 0 || x > 9) {
			System.out.print("Введите цифру от 1 до 9: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print("Введите цифру от 1 до 9: ");
			}
			x = scan.nextInt();
		}
		switch (x) {
		case (1):
			System.out.println("Арабская цифра \"1\" соответствует римской цифре \"I\"");
			break;
		case (2):
			System.out.println("Арабская цифра \"2\" соответствует римской цифре \"II\"");
			break;
		case (3):
			System.out.println("Арабская цифра \"3\" соответствует римской цифре \"III\"");
			break;
		case (4):
			System.out.println("Арабская цифра \"4\" соответствует римской цифре \"IV\"");
			break;
		case (5):
			System.out.println("Арабская цифра \"5\" соответствует римской цифре \"V\"");
			break;
		case (6):
			System.out.println("Арабская цифра \"6\" соответствует римской цифре \"VI\"");
			break;
		case (7):
			System.out.println("Арабская цифра \"7\" соответствует римской цифре \"VII\"");
			break;
		case (8):
			System.out.println("Арабская цифра \"8\" соответствует римской цифре \"VIII\"");
			break;
		case (9):
			System.out.println("Арабская цифра \"9\" соответствует римской цифре \"IX\"");
			break;
		}
	}
	
	public static void task31() {
		
		// Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также ошибочные числа пользователя. 
		
		System.out.println();
		
		int a = 1 + (int) (Math.random() * 15);
		int b = 1 + (int) (Math.random() * 15);
		int c = 1 + (int) (Math.random() * 15);
		int d = 1 + (int) (Math.random() * 15);
		int e = 1 + (int) (Math.random() * 15);
		int x;
		int i;

		Scanner sc = new Scanner(System.in);

		for (i = 1; i <= 5; i = i + 1) {
			System.out.println("Введите число от 1 до 15: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введено некорректное число. Введите число от 1 до 15:");
			}
			x = sc.nextInt();
			
			if ((x < 1) || (x > 15)) {
				System.out.println("Ошибка");
			} else if ((x == a) || (x == b) || (x == c) || (x == d) || (x == e)) {
				System.out.println(x + " - угаданное число");
				
				if (x == a) {
					a = 16;
					continue;
				}
				if (x == b) {
					b = 16;
					continue;
				}
				if (x == c) {
					c = 16;
					continue;
				}
				if (x == d) {
					d = 16;
					continue;
				}
				if (x == e) {
					e = 16;
					continue;
				}
			} else {
				System.out.println(x + " - неугаданное число");
			}
		}
	}
	
	public static void task32() {
		
		// Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания. 
		
		System.out.println();

		int i;
		boolean s;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите строку: ");
		
		String ark = scan.next();
		
		for (i = 0; i < ark.length(); i++) {
			char ch = ark.charAt(i);
			if (i == 1) {
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == '_') {
					s = true;
				} else {
					s = false;
				}
			} if (i > 1) {
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == '_') {
					s = true;
				} else {
					s = false;
				}
			}
		}
		if (s = true) {
			System.out.println("Строка \"" + ark + "\" не содержит недопустимых символов");
		} else {
			System.out.println("Строка \"" + ark + "\" содержит недопустимые символы");
		}
	}
	
	public static void task33() {
		
		// Найдите наибольшую цифру данного натурального числа. 
		
		System.out.println();
		
		int a = 912123467;
		int a1 = a;
		int ost;
		int max = 0;
		while (a1 % 10 > 0) {
			ost = a1 % 10;
			if (max < ost) {
				max = ost;
			}
			a1 = a1 / 10;
		}
		System.out.println("Наибольшая цифра числа " + a + " равна " + max);
	}
	
	public static void task34() {
		
		// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. 
		
		int x;
		int sum = 0;
		for (x = 1000; x < 10000; x++) {
			int xn = x;
			while (xn > 0) {
				sum = sum + xn % 10;
				xn = xn / 10;
			}
			if (sum == 15) {
				System.out.print(x + ", ");
			}
			sum = 0;
		}
	}
	
	public static void task35() {
		
		// Найдите количество четных цифр данного натурального числа. 
		
		System.out.println();
		
		int x = 2222526;
        int count = 0;
        int y = x;
        while (y > 0) {
            if ((y % 10) % 2 == 0)
                count++;
            y /= 10;
        }
        System.out.print("в числе " + x +" "+count + " четных цифр ");
	}
	
	public static void task36() {
		
	
	// Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа. 

		System.out.println();
		
		for (int x = 10; x < 100; x++) {
            for (int y = 10; y < 100; y++) {
                int pr = x * y;
                int xy = 100 * x + y;

                if ((xy % pr) == 0) {
                    System.out.println(xy);
                }
            }
        }
	}
	
	public static void task37() {
		
		// Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49. 
		
		System.out.println();
		
		for (int a = 10; a < 100; a++) {
            for (int b = 10; b < 100; b++) {
                int ab = a * 100 + b;
                int ba = b * 100 + a;

                if (ab % 99 == 0 && ba % 49 == 0)
                    System.out.println("Число A = " + a + " Число B = "+ b);
            }
        }
	}
	
	public static void task38() {
		
		// Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963. 
		
		System.out.println();
		
		int a = 135;
		int b;
		int c;
		int d;

		b = a % 10;
		a = a / 10;
		c = a % 10;
		a = a / 10;
		d = a % 10;
		a = a / 10;

		if (b - c == c - d) {
			System.out.println("Цифры числа образуют арифметическую прогрессию");
		} else {
			System.out.println("Цифры числа не образуют арифметическую прогрессию");
		}
	}
	
	public static void task39() {
		
		// В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число. 
		
		System.out.println();
		
		int y;
		int x;

		for (x = 100; x < 1000; x++) {
			y = x % 100;
			if (7 * y == x) {
				System.out.println("Исходное число: " + x);
			}
		}
	}
	
	public static void task40() {
		
		// Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.  
		
		System.out.println();
		
		int n = 100;
		int i;
		int j;
		int a;
		int k = 0;

		for (i = 1; i <= n; i = i + 1) {
			j = i;
			while (j / 10 > 0) {
				a = j % 10;
				if ((a == 0) || (i % a != 0)) {
					k = 1;
					break;
				}
				j = j / 10;
			}
			if ((i % j == 0) && (k == 0)) {
				System.out.println(i);
			}
			k = 0;
		}
	}
}
