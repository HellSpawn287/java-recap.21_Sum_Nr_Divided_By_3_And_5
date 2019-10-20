public class Challenge {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Nr " + i + " can be divided by 3 and 5");
                sum += i;
                count ++;
                if (count == 5) {
                    System.out.println(
                            "\nThe sum of five number dividable by 3 and 5 \n IS :" + sum);
                    break;
                }
            }
        }
    }
}
