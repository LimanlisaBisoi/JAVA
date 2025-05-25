public class Find_Second_Max {
    public static void main(String[] args) {
        int[] marks = {36, 66, 55, 75, 75, 85, 81, 85, 42};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > max) {
                secondMax = max;
                max = mark;
            } else if (mark > secondMax && mark != max) {
                secondMax = mark;
            }
        }

        int count = 0;
        System.out.println("Second Max ICP Mark: " + secondMax);

        System.out.print("Positions: ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == secondMax) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nCount: " + count);
    }
}
