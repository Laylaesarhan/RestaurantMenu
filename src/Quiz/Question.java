package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
private String prompt;
private String answer;
private ArrayList options;
private String userAnswer;

    public Question(String prompt, String answer,ArrayList<String> options) {
        this.prompt = prompt;
        this.answer = answer;
        this.options = options;
    }

    public questionPrompt() {
        System.out.println(this.prompt);
    }

    public displayOptions() {
        //use for loop to print options
        for ();
    }
    public askUserForAnswer() {
        // prompts user for answer
        // stores in userAnswer
    }
}
