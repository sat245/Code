package Competitions.Flipkart1;

import java.util.List;

public interface CreateQuestion {
    static Double totalMarks=0.0;
    public List<Question> getQuestion(List<Question> questionBank, Double marks);
}
