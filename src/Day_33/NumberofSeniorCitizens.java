package Day_33;

public class NumberofSeniorCitizens {
    public static void main(String[] args) {
        String[] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = citizen(arr);
        System.out.println(ans);

    }

    static int citizen(String[] details) {
        int num = 0;
        for (String str : details) {
            int age = Integer.parseInt(str.substring(11, 13));
            if (age > 60) {
                num++;
            }
        }
        return num;


    }
}

