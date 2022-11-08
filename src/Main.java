public class Main {
    public static void main(String[] args) {

        {System.out.println("задание 1");}
        int sumPerMonth = 15000;
        int total = 0;
         int month = 0;
        while( total < 2_459_000 ) {
            total = total + total / 100;
            total = total + sumPerMonth;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        {System.out.println("задание 2");}
        int x = 0;
        while (x<10) {
            x = x + 1;
            System.out.print(x);
        }
        System.out.println("");
        for (int c=10; c>=1; c--) {
            System.out.print(c);
        }
        System.out.println("");
        {System.out.println("задание 3");}
        int totalPeople = 12_000_000;
        int yearBorn = 204_000;
        int yearDeath = 98000;
        for(int y= 1; y <=10; y++) {
            totalPeople = totalPeople +yearBorn - yearDeath;
            System.out.println("Год " + y + ", численность населения составляет " + totalPeople );
        }

        {System.out.println("задание 4");}
        int sumPerMonth1 = 15000;
        int total1 = 0;
                for( int m = 0; total1 <= 12_000_000; m++ ) {
            total1 = total1 + total1 * 7/100;
            total1 = total1 + sumPerMonth1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total1 + " рублей.");
        }

        {System.out.println("задание 5");}
        int sumPerMonth2 = 15000;
        int total2 = 0;
        for( int m = 0; total2 <= 12_000_000; m++ ) {
            total2 = total2 + total2 * 7/100;
            total2 = total2 + sumPerMonth2;
            if (m%6==0) {
                System.out.println("Месяц " + m + ", сумма накоплений равна " + total2 + " рублей.");
            }
        }
        {System.out.println("задание 6");}
        int sumPerMonth3 = 15000;
        int total3 = 0;
        for( int m = 0; m <= 108; m++ ) {
            total3 = total3 + total3 * 7/100;
            total3 = total3 + sumPerMonth3;
            if (m%6==0) {
                System.out.println("Месяц " + m + ", сумма накоплений равна " + total3 + " рублей.");
            }
        }
        {System.out.println("задание 7");}
        for (int firstFriday = 3; firstFriday <= 31; firstFriday++ ) {
            if(firstFriday % 7 == 3) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }
        }

        {System.out.println("задание 8");}
        int last200Year = 1822;
        for (int yearOfComet = 0; yearOfComet <= 2122; yearOfComet= yearOfComet+ 79 ) {
            if(yearOfComet>last200Year) {
                System.out.println(yearOfComet);
            }
        }

        {System.out.println("задание 9");}
        int w = 2;
        for (int y = 1; y <= 10; y++ ) {
            int n = w * y;
            System.out.println(w+ "*" +y+ "=" + n );
        }



    }
}