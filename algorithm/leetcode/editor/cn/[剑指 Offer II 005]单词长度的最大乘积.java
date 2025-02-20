package leetcode.editor.cn;

//给定一个字符串数组 words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，它们长度的乘积的最大值。假设字符串中只包含英语
//的小写字母。如果没有不包含相同字符的一对字符串，返回 0。
//
// 
//
// 示例 1:
//
//
//输入: words = ["abcw","baz","foo","bar","fxyz","abcdef"]
//输出: 16
//解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。
//
// 示例 2:
//
//
//输入: words = ["a","ab","abc","d","cd","bcd","abcd"]
//输出: 4
//解释: 这两个单词为 "ab", "cd"。
//
// 示例 3:
//
//
//输入: words = ["a","aa","aaa","aaaa"]
//输出: 0
//解释: 不存在这样的两个单词。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= words.length <= 1000 
// 1 <= words[i].length <= 1000 
// words[i] 仅包含小写字母 
// 
//
// 
//
// 注意：本题与主站 318 题相同：https://leetcode-cn.com/problems/maximum-product-of-word-
//lengths/ 
// Related Topics 位运算 数组 字符串 👍 32 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class maxProductOffer2Solution {
    public static void main(String[] args) {
        maxProductOffer2Solution solution = new maxProductOffer2Solution();
        System.out.println(
                solution.maxProduct(
                        new String[]{"abcw", "baz", "foo", "bar", "fxyz", "abcdef"}));
    }

    public int maxProduct(String[] words) {
        int[] bits = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                bits[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        System.out.println(Arrays.toString(bits));
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((bits[i] & bits[j]) == 0) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
