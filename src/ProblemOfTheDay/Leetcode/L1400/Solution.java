package ProblemOfTheDay.Leetcode.L1400;
public class Solution {
    public static boolean canConstruct(String s, int k) {
        if(s.length() < k)
            return false;
        else if(s.length() == k)
            return true;
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        int oddCount = 0;
        for(int i : count){
            if(i < 2 || i % 2 != 0)
                oddCount++;
        }
        return oddCount <= k;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("annabelle", 2));
    }
}

