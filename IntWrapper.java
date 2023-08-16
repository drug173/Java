public class IntWrapper {

    //Метод меняет значения переменных местами, но вне метода не меняются значения
    public static void swap_1(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Внутри swap_1 значения переменных поменялись:       a = " + a + ", b = " + b);
    }


    public int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    //Метод меняет значения переменных местами, но с использованием дополнительного метода
    public static void swap_2(IntWrapper a, IntWrapper b) {
        a.value = a.value + b.value;
        b.value = a.value - b.value;
        a.value = a.value - b.value;
    }



    public static void main(String[] args) {
        int a_1 = 5;
        int b_1 = 10;
        System.out.println("До swap_1:       a = " + a_1 + ", b = " + b_1);
        swap_1(a_1, b_1);
        System.out.println("После swap_1:      a = " + a_1 + ", b = " + b_1);
        System.out.println("Значения переменных не поменялись");


        IntWrapper a_2 = new IntWrapper(a_1);
        IntWrapper b_2 = new IntWrapper(b_1);
        System.out.println("До swap_2: a = " + a_2.value + ", b = " + b_2.value);
        swap_2(a_2, b_2);
        System.out.println("После swap_2: a = " + a_2.value + ", b = " + b_2.value);
        System.out.println("Значения переменных  поменялись");

    }
}