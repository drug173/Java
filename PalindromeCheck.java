public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " является палиндромом: " + isPalindrome(str1));
        System.out.println(str2 + " является палиндромом: " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Удаление всех символов, кроме букв и цифр, и перевод в нижний регистр
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
