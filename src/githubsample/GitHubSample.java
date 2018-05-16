package githubsample;

public class GitHubSample {

    static int romanToInteger(String roman) {
        int integerValue = 0;
        int last = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            int number = letterToNumber(ch);

            if (last < number) {
                number -= last * 2;
            }
            integerValue += number;
            last = number;
        }
        return integerValue;
    }

    static int letterToNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("CMMIV"));
    }

}
