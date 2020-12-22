package StringProblems;

/**
 * Created by satyam mishra, Data Structure on 09/12/17.
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa"));
        String str;

    }

    public static int strStr(final String haystack, final String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                int k = 0;
                int count = 0;
                while (k<needle.length() && (i+k)<haystack.length() && needle.charAt(k) == haystack.charAt(i + k)) {
                    count++;
                    k++;
                }
                if (count == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}

