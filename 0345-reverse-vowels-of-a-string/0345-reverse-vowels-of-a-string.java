class Solution {
    private boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);

    return ch == 'a' ||
           ch == 'e' ||
           ch == 'i' ||
           ch == 'o' ||
           ch == 'u';
}
    public String reverseVowels(String s) {
    int n = s.length();
    char[] arr = s.toCharArray();
    int l =0;
    int r = arr.length-1;

    while(l<r){
        if (!isVowel(arr[l])) {
        l++;
        continue;
    }

    if (!isVowel(arr[r])) {
        r--;
        continue;
    }

        
        char temp = arr[l];
        arr[l]= arr[r];
        arr[r]=temp;

        l++;
        r--;

    }

        return new String(arr);
    }
}