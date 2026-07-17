public class Main {



    public static Integer findMissingNumber(String s) {
        int n = s.length();

        // Try different starting lengths
        for (int len = 1; len <= n / 2; len++) {

            int first = Integer.parseInt(s.substring(0, len));
            int expected = first;
            int i = 0;
            Integer missing = null;

            while (i < n) {
                String expectedStr = String.valueOf(expected);
                int l = expectedStr.length();

                // Check if substring matches expected number
                if (i + l <= n && s.startsWith(expectedStr, i)) {
                    i += l;
                } else {
                    // Allow only one missing number
                    if (missing != null) {
                        break;
                    }
                    missing = expected;
                    expected--;
                    continue;
                }

                expected--;
            }

            // If full string is processed and one number is missing
            if (i == n && missing != null) {
                return missing;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String s = "1000999997";
        Integer result = findMissingNumber(s);

        if (result != null) {
            System.out.println("Missing number: " + result);
        } else {
            System.out.println("No valid sequence found");
        }
    }
}