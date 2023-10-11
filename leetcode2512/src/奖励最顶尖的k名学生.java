import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 奖励最顶尖的k名学生 {
    public static void main(String[] args) {
        String[] positive_feedback = {"fkeofjpc","qq","iio"};
        String[] negative_feedback = {"jdh","khj","eget","rjstbhe","yzyoatfyx","wlinrrgcm"};
        String[] report = {"rjstbhe eget kctxcoub urrmkhlmi yniqafy fkeofjpc iio yzyoatfyx khj iio",
                "gpnhgabl qq qq fkeofjpc dflidshdb qq iio khj qq yzyoatfyx",
                "tizpzhlbyb eget z rjstbhe iio jdh jdh iptxh qq rjstbhe",
                "jtlghe wlinrrgcm jnkdbd k iio et rjstbhe iio qq jdh",
                "yp fkeofjpc lkhypcebox rjstbhe ewwykishv egzhne jdh y qq qq",
                "fu ql iio fkeofjpc jdh luspuy yzyoatfyx li qq v",
                "wlinrrgcm iio qq omnc sgkt tzgev iio iio qq qq",
                "d vhg qlj khj wlinrrgcm qq f jp zsmhkjokmb rjstbhe"};
        int[] student_id = {96537918,589204657,765963609,613766496,43871615,189209587,239084671,908938263};
        int k=3;
        System.out.println(topStudents(positive_feedback, negative_feedback, report, student_id, k));
    }

    public static List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        List result = new ArrayList<Integer>();
        int[] student_score = new int[student_id.length];

        Map<String,Integer> scores = new HashMap<String,Integer>();
        for (int i = 0; i < positive_feedback.length; i++) {
            scores.put(positive_feedback[i],3);
        }
        for (int i = 0; i < negative_feedback.length;i++){
            scores.put(negative_feedback[i],-1);
        }

        for (int i = 0; i < report.length; i++) {
            int score = 0;
            for (String s : report[i].split(" ")) {
                if (scores.get(s) != null){
                    score += scores.get(s);
                }
            }
            student_score[i] = score;
        }

        for (int i = 0; i < k; i++) {
            for(int j = 0; j < student_id.length-i-1; j++){
                if(student_score[j]>student_score[j+1]||(student_score[j]==student_score[j+1]&&student_id[j]<student_id[j+1])){
                    int temp = student_score[j+1];
                    student_score[j+1] = student_score[j];
                    student_score[j] = temp;
                    temp = student_id[j+1];
                    student_id[j+1] = student_id[j];
                    student_id[j] = temp;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            result.add(student_id[student_id.length-1-i]);
        }
        return result;
    }
}
