class Solution {
    public boolean isPalindrome(String s) {

        int first = 0;
        int second = s.length() - 1;

        while (first < second) {

            while (first < second && !isAlphaNum(s.charAt(first))) {
                first++;
            }

            while (first < second && !isAlphaNum(s.charAt(second))) {
                second --;
            }

            if (Character.toLowerCase(s.charAt(first))!= Character.toLowerCase(s.charAt(second))) {
                return false;
            }
            first++;
            second--;
        }

        return true;
        
    }


    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z'
        || c >= 'a' && c <= 'z'
        || c >= '0' && c <= '9');
    }
}
