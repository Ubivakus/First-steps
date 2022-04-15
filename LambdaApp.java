public class LambdaApp {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.multiply.apply(36, 93);
        int d = calc.divide.apply(a, b);

        calc.println.accept(d);
        //ошибка в том что происходит деление на ноль,
        //можно написать тернарный оператор и при делении на ноль вернуть ноль.
        //или написать блок с выбрасыванием исключения


    }
}
