import java.util.Scanner;

public class Money implements Realize {
    Scanner scanner = new Scanner(System.in);
    private long rub = scanner.nextLong();
    private long rub1 = scanner.nextLong();
    private String kop = scanner.next();
    private String kop1 = scanner.next();


    public void summa() {
        long sum = rub + rub1;
        System.out.println("Сложение рублей: " + sum);
        long sum1 = Long.valueOf(kop) + Long.valueOf(kop1);
        System.out.println("Сложение копеек:" + sum1);
    }

    public void substract() {
        long sub = rub - rub1;
        System.out.println("Вычитание рублей: " + sub);
        long sub1 = Long.valueOf(kop) - Long.valueOf(kop1);
        System.out.println("Вычитание копеек: " + sub1);
    }

    public void divisionNumber() {

        Scanner scanner1 = new Scanner(System.in);
        long number = scanner.nextLong();
        long divR = rub / number;
        long divK = Long.valueOf(kop) / number;
        System.out.println("Деление денежной единицы на число: " + divR + " " + divK);
    }

    public void divisionMoney() {
        long divR = rub / rub1;
        long divK = Long.valueOf(kop) / Long.valueOf(kop1);
        System.out.println("Деление одной денежной единицы на другую денежную единицу: " + divR + " " + divK);
    }

    public void multiplyNumber() {
        Scanner scanner1 = new Scanner(System.in);
        long number = scanner.nextLong();
        long mulR = rub * number;
        long mulK = Long.valueOf(kop) * number;
        System.out.println("Деление денежной единицы на число: " + mulR + " " + mulK);
    }

    public void comparison() {
        if (rub > rub1) {
            System.out.println("Первая денежная единица больше второй");
        }
        else if (rub == rub1) {
            if (Long.valueOf(kop) > Long.valueOf(kop1)) {
                System.out.println("Первая денежная единица больше второй");
            } else if (Long.valueOf(kop) < Long.valueOf(kop1)) {
                System.out.println("Первая денежная единица меньше второй");
            } else if (Long.valueOf(kop) == Long.valueOf(kop1)) {
                System.out.println("Денежные единицы равны");
            }
        }
        else if(rub < rub1) {
            System.out.println("Первая денежная единица меньше второй");
        }
    }
}


