public class Find_Max_Min {
    public static void main(String[] args) {
        int[] marks = {39, 66, 55, 75, 75, 85, 81, 85, 42};

        int max = marks[0], min = marks[0], maxCount = 0, minCount = 0;
        for (int mark : marks) {
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }

        for (int mark : marks) {
            if (mark == max) maxCount++;
            if (mark == min) minCount++;
        }

        System.out.println("Max ICP Mark: " + max + ", Count: " + maxCount);
        System.out.println("Min ICP Mark: " + min + ", Count: " + minCount);

        System.out.print("Max Positions: ");
        for (int i = 0; i < marks.length; i++)
            if (marks[i] == max) System.out.print(i + " ");
        System.out.println();

        System.out.print("Min Positions: ");
        for (int i = 0; i < marks.length; i++)
            if (marks[i] == min) System.out.print(i + " ");
        System.out.println();

        for (int mark : marks) {
            System.out.print(mark + "---");
            if (mark >= 90) System.out.print("O ");
            else if (mark >= 80) System.out.print("A ");
            else if (mark >= 70) System.out.print("B ");
            else if (mark >= 60) System.out.print("C ");
            else if (mark >= 50) System.out.print("D ");
            else if (mark >= 40) System.out.print("E ");
            else System.out.print("F ");
        }
    }
}
