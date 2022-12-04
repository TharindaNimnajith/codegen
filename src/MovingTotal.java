import java.util.ArrayList;

public class MovingTotal {
    ArrayList<Integer> numbers = new ArrayList<>();

    int count = 0;
    int temp = 0;

    /**
     * Adds/appends list of integers at the end of internal list.
     */
    public void append(int[] list) {
        for (int i = 0; i < list.length; i++) {
            temp += list[i];
            count++;
            if (count == 3) {
                numbers.add(temp);
                count = 0;
                temp = 0;
                if (i - 2 > -1) {
                    i -= 2;
                }
            }
        }
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        return numbers.contains(total);
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[]{1, 2, 3, 4});

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[]{5});

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}
