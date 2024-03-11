public class 将标题首字母大写 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if (words[i].length() > 2) {
                words[i] = (char)(words[i].charAt(0) - 32) + words[i].substring(1);
            }
        }
        StringBuilder s = new StringBuilder();
        for(int j = 0; j < words.length; j++){
            s.append(words[j]);
            if(j != words.length - 1){
                s.append(' ');
            }
        }
        return s.toString();
    }
}