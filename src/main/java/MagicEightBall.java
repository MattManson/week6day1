import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

       private ArrayList<String> answers;

       public MagicEightBall() {
        this.answers = new ArrayList<>();
        }

        public int getAnswerCount() {
            return this.answers.size();
        }

        public void addAnswer(String answer) {
            this.answers.add(answer);
        }


        public Object getRandomAnswer() {
            Collections.shuffle(answers);
            return answers.get(1);
        }

        public void removeAnswer(String answer){
           this.answers.remove(answer);
        }
}


