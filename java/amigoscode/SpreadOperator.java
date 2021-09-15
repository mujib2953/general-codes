public class SpreadOperator {
    public static void main(String args[]) {

        int [] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 1;
        numbers[4] = 1;
        // numbers[5] = 1;

        for (int x: numbers) {
            System.out.println(x);
        }

        System.out.println("Add Then : " + addThen(1, 1, 1, 1, 1));
        System.out.println("Add Then : " + addThen(1, 1, 1, 1, 1, 5));
    }

    static double addThen(double ...data) {
        double counter = 0;

        for (double x: data) {
            counter += x;
        }

        return counter;
    }
}