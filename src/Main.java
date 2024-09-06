/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Aydan Lau
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum_two = add(3, 5);
        System.out.println(sum_two);

        int sum_four = add(1, 2, 3, 4);
        System.out.println(sum_four);

        String my_morning_greeting = morningGreeting("Aydan");
        System.out.println(my_morning_greeting);

        String my_afternoon_greeting = afternoonGreeting("John");
        System.out.println(my_afternoon_greeting);

        String triple_text = triple("hello");
        System.out.println(triple_text);

        float half_x = half(5);
        System.out.println(half_x);

        int roundedPositiveInt = roundPositiveValueToNearestInteger(5.1);
        System.out.println(roundedPositiveInt);

        int roundedNegativeInt = roundNegativeValueToNearestInteger(-4.49);
        System.out.println(roundedNegativeInt);
    }

    // 1. add
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        return add(add(num1, num2), add(num3, num4));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name;
    }

    // 5. triple
    public static String triple(String phrase) {
        return phrase + phrase + phrase;
    }

    // 6. half
    public static float half(int x) {
        return (float) x / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double x) {
        return (int) (x + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double x) {
        return (int) (x - 0.5);
    }
}
