public class 最大单词长度乘积 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxProduct(String[] words) {
            int length = words.length;
            int[] masks = new int[length];
            for (int i = 0; i < length; i++) {
                String word = words[i];
                int wordLength = word.length();
                for (int j = 0; j < wordLength; j++) {
                    masks[i] |= 1 << (word.charAt(j) - 'a');
                }
            }
            int maxProd = 0;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if ((masks[i] & masks[j]) == 0) {
                        maxProd = Math.max(maxProd, words[i].length() * words[j].length());
                    }
                }
            }
            return maxProd;
        }
    }

//    class Solution {
//        public int maxProduct(String[] words) {
//            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//            int length = words.length;
//            for (int i = 0; i < length; i++) {
//                int mask = 0;
//                String word = words[i];
//                int wordLength = word.length();
//                for (int j = 0; j < wordLength; j++) {
//                    mask |= 1 << (word.charAt(j) - 'a');
//                }
//                if (wordLength > map.getOrDefault(mask, 0)) {
//                    map.put(mask, wordLength);
//                }
//            }
//            int maxProd = 0;
//            Set<Integer> maskSet = map.keySet();
//            for (int mask1 : maskSet) {
//                int wordLength1 = map.get(mask1);
//                for (int mask2 : maskSet) {
//                    if ((mask1 & mask2) == 0) {
//                        int wordLength2 = map.get(mask2);
//                        maxProd = Math.max(maxProd, wordLength1 * wordLength2);
//                    }
//                }
//            }
//            return maxProd;
//        }
//    }

}
