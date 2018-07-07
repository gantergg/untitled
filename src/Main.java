public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сначала сколько значения для двух раличных рублей, затем для двух различных копеек");
        Money money = new Money();
        money.summa();
        money.substract();
        System.out.println("Введите на какое число необходимо разделить денежную единицу");
        money.divisionNumber();
        money.divisionMoney();
        System.out.println("Введите на какое число необходимо умножить денежную единицу");
        money.multiplyNumber();
        money.comparison();
    }
}
