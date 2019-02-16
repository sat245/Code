package Competitions.Flipkart1;

public class Question {

    private Long questionId;
    private String text;
    private Subject subject;
    private Topic topic;
    private  Difficulty difficulty;
    private Double marks;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
}
