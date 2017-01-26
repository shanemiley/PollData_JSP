package poll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.InputStream;
import java.io.Serializable;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Shane
 */
@Named
@SessionScoped
public class PollData implements Serializable {

    String title;
    ArrayList<String> answers = new ArrayList<>();
    ArrayList<String> questions = new ArrayList<>();

    @PostConstruct
    void myPollData() {

        InputStream is = getClass().getResourceAsStream("poll.json");
        JsonReader jReader = Json.createReader(is);
        JsonObject jObject = jReader.readObject();
        JsonObject pollDat = jObject.getJsonObject("poll");

        title = pollDat.getString("title");
        JsonArray question = pollDat.getJsonArray("questions");
        for (int i = 0; i < question.size(); i++) {
            String questionsString = question.getString(i);
            questions.add(questionsString);
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }


  

    void setAnswers(String[] parameterValues) {
       
        this.answers.addAll(Arrays.asList(parameterValues));
    }
}
