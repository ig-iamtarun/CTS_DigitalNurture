import java.util.Scanner;

public class palin {

    static boolean isPalin(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int count = 0;

        for (int day = n1; day <= n2; day++) {

            for (int hh = 0; hh < 24; hh++) {

                for (int mm = 0; mm < 60; mm++) {

                    for (int ss = 0; ss < 60; ss++) {

                        String time =
                                day +
                                        String.format("%02d", hh) +
                                        String.format("%02d", mm) +
                                        String.format("%02d", ss);

                        if (isPalin(time)) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}