/**
 * Created by hyohyo on 2019/07/02.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        if (a.equals(b)){
            System.out.println("test");
        }
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i < 100; i++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }
        for (int j = 1; j < 1000; j++) {
            System.out.println(fizzBuzz.fizzBuzz(i));
        }
    }

    public String fizzBuzz(int number) {
        if (true) {
            if (true) {
                if (false) {
                    // nothing to do.
                }
            }
        }
        String fizzBuzz = fizz(number) + buzz(number);
        return fizzBuzz.isEmpty() ? String.valueOf(number) : fizzBuzz;
    }

    public String fizz(int number) {
        return number % 3 == 0 ? "fizz" : "";
    }

    public String buzz(int number) {
        return number % 5 == 0 ? "buzz" : "";
    }
}
