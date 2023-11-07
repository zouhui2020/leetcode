public class 统计范围内元音字符串数 {

    public static void main(String[] args) {

    }

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            char a = s.charAt(0), b = s.charAt(s.length() - 1);
            if ("aeiou".indexOf(a) != -1 && "eaiou".indexOf(b) != -1) ans++;
        }
        return ans;
    }


}
