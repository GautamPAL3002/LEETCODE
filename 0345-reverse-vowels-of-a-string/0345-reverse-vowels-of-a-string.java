class Solution {
    public String reverseVowels(String s) {
      char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (isVowel(arr[start]) && isVowel(arr[end])) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (!isVowel(arr[start])) {
                start++;
            } else {
                end--;
            }
        }

        return new String(arr);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}