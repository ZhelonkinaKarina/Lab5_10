package Lab5_10;

public class Cycles {
	public static void main(String[] args) {
        //Завдання 1
        //оператор for
        for(int i = 500; i <= 650; i += 10){
            System.out.println(i);
        }

        //оператор while
        int i = 490;
        while(i < 650){
            System.out.println(i += 10);
        }

        //oператор do while
        i = 490;
        do{
            System.out.println(i += 10);
        } while (i < 650);

        //Завдання 2
        for(int a = 2; a < 5000; a=2*a-1){
            System.out.println(a);
        }

        //Завдання 3
        int num = 10;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        //Завдання 4
        //оператор for
        int d = 10;
        int factorial = 1;
        for (i = 1; i <= d; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа 10 дорівнює " + factorial);
        
        //оператор while
        d = 10;
        i = 1;
        factorial = 1;
        while (i <= d) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал числа 10 дорівнює " + factorial);

        //Завдання 5
        int count = 0;
        for (i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String hour = String.format("%02d", i);
                String minute = String.format("%02d", j);
                if (hour.charAt(0) == minute.charAt(1) && hour.charAt(1) == minute.charAt(0)) {
                    System.out.println(hour + ":" + minute);
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь симетричних комбінацій цифр на електронному годиннику: " + count);
    }
}
