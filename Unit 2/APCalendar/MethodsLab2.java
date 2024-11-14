public class MethodsLab2 {
    public static void forloop(int start, int end, int delta) {
        System.out.println("Start " + start + " : Stop " + end + " : Increment " + delta);
        for (int i = start; i < end; i = i + delta) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void whileloop(int number) {
        int sum = 0;
        int digits = 0;
        while (number > 0) {
            int digit_value = number % 10;
            sum += digit_value;
            digits++;
            number /= 10;
        }

        System.out.println(digits + " digits totaling " + sum);
    }

    public static void addHyphen(String first, String second) {
        System.out.println(first + " " + second);
        System.out.println(first.toUpperCase() + " " + second.toUpperCase());
        System.out.println(first.toUpperCase() + "-" + second.toUpperCase());

    }

    public static void main(String[] args) {
        forloop(2, 90, 5);
        forloop(3, 76, 4);
        forloop(-10, 8, 2);
        forloop(5, 30, 2);
        forloop(100, 150, 5);

        whileloop(234);
        whileloop(10000);
        whileloop(123456789);
        whileloop(222222);

        addHyphen("Hello", "World");
        addHyphen("Jim", "Bob");
        addHyphen("Computer", "Science");
        addHyphen("UIL", "TCEA");
        addHyphen("State", "Champions");
    }
    
}
