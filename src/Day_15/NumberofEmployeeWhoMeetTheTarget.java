package Day_15;

public class NumberofEmployeeWhoMeetTheTarget {
    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        int ans = Employee(hours, target);
        System.out.println(ans);


    }

    static int Employee(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i >= target) {
                count++;
            }

        }
        return count;
    }
}
