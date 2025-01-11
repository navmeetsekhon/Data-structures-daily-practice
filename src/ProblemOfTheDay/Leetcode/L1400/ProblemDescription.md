# [1400. Construct K Palindrome Strings](https://leetcode.com/problems/construct-k-palindrome-strings/description)

## Problem Description

Given a string `s` and an integer `k`, return `true` if you can use all the characters in `s` to construct exactly `k` palindrome strings, and `false` otherwise.

### Palindrome String

A **palindrome** is a string that reads the same backward as forward. For example, "racecar", "level", and "madam" are palindromes.

### Problem Constraints:

- A **palindrome string** can have at most one character with an odd frequency. For example:
    - "aa" is a valid palindrome, as both characters are the same (even frequency).
    - "aba" is a valid palindrome, as there is one odd-frequency character ('b') in the middle, and the other characters ('a') have even frequencies.

- To construct `k` palindrome strings:
    - You need to ensure there are enough characters with even frequencies to form pairs (pairs are required for both sides of the palindrome).
    - At most one character with an odd frequency is allowed in each palindrome string.

### Example 1:
* `Input: s = "annabelle", k = 2`
* `Output: true`
* `Explanation: You can construct two palindromes using all characters in s, Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"`

### Example 2:
* `Input: s = "leetcode", k = 3`
* `Output: false`
* `Explanation: It is impossible to construct 3 palindromes using all the characters of s.`

### Example 3:
* `Input: s = "true", k = 4`
* `Output: true`
* `Explanation: The only possible solution is to put each character in a separate string.`

### Constraints:

* 1 <= s.length <= 105
* s consists of lowercase English letters.
* 1 <= k <= 105