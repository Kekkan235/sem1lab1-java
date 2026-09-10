package edu.course.lab01;
public class palindrome{
    public static void checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char c1 = str.charAt(left);
            char c2 = str.charAt(right);

            if (!Character.isLetterOrDigit(c1)) {
                left++;
            } else if (!Character.isLetterOrDigit(c2)) {
                right--;
            } else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    System.out.println("false");
                    return;
                }
                left++;
                right--;
            }
        }
        System.out.println("true");
    }
}