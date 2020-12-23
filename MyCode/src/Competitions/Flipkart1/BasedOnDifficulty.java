package Competitions.Flipkart1;

import java.util.*;

public class BasedOnDifficulty implements CreateQuestion {

    static  Double totalSum;
    @Override
    public QuestionPaper getQuestion(List<Question> questionBank, Double marks) {

        if(questionBank==null || questionBank.size()==0){
            System.out.println("No questions in bank");
            return null;
        }
        QuestionPaper questionPaper = new QuestionPaper();
        Scanner scanner = new Scanner(System.in);
        List<Question> prepareListOfQuestions = questionPaper.questionPaper;

        System.out.println("Enter percentage for ");

        System.out.println(java.util.Arrays.asList(Difficulty.values()));
        try {
        int easy  = scanner.nextInt();
        int medium = scanner.nextInt();
        int hard = scanner.nextInt();

        if(easy+medium+hard > 100){
            System.out.println("Error in percentage");
            throw new Exception();
        }
        Map<Difficulty,List<Question>> map  = getAllQuestions(questionBank);


        if(easy>0){
            List list1 = getQuestionBasedOnCriteria(map.get(Difficulty.EASY),((easy*marks)/100));
            if(list1!=null){
                prepareListOfQuestions.addAll(list1);
            }
        }

            if(medium>0){
                List list1 = getQuestionBasedOnCriteria(map.get(Difficulty.MEDIUM),((medium*marks)/100));
                if(list1!=null){
                    prepareListOfQuestions.addAll(list1);
                }
            }

            if(hard>0){
                List list1 = getQuestionBasedOnCriteria(map.get(Difficulty.HARD),((hard*marks)/100));
                if(list1!=null){
                    prepareListOfQuestions.addAll(list1);
                }
            }


        }catch (IllegalArgumentException e){

        }catch (Exception e1){

        }
        return questionPaper;

    }

    public static List<Question> getQuestionBasedOnCriteria(List<Question> questions,Double marks){
        Collections.sort(questions, new Comparator<Question>() {
            @Override
            public int compare(Question o1, Question o2) {
                return (int) (o1.getMarks()-o2.getMarks());
            }
        });

        List<Question> listOfQuestions = new ArrayList<>();
        int sum=0;
        for(int i = 0;i<questions.size();i++){
            sum = (int) (sum+questions.get(i).getMarks());
            if(sum>marks){
                return listOfQuestions;
            } else if(sum==marks){
                listOfQuestions.add(questions.get(i));
                return listOfQuestions;
            }else
            listOfQuestions.add(questions.get(i));

        }
        System.out.println("We dont have enough question in this criteria...Adding whole set");
        System.out.println("Total marks/out of"+sum+"/"+marks);
       // totalSum+=sum;
        return listOfQuestions;
    }

    public static Map<Difficulty,List<Question>> getAllQuestions(List<Question> questionBank) {
        Map<Difficulty, List<Question>> map = new HashMap<>();

        for (int i = 0; i < questionBank.size(); i++) {
            Question question = questionBank.get(i);
            if (question.getDifficulty().equals(Difficulty.EASY)) {
                if (map.containsKey(Difficulty.EASY)) {
                    map.get(Difficulty.EASY).add(question);
                } else {

                    List<Question> list = new ArrayList<>();
                    list.add(question);
                    map.put(Difficulty.EASY, list);
                }
            }
            if (question.getDifficulty().equals(Difficulty.MEDIUM)) {
                if (map.containsKey(Difficulty.MEDIUM)) {
                    map.get(Difficulty.MEDIUM).add(question);
                } else {

                    List<Question> list = new ArrayList<>();
                    list.add(question);
                    map.put(Difficulty.MEDIUM, list);
                }
            }

            if (question.getDifficulty().equals(Difficulty.HARD)) {
                if (map.containsKey(Difficulty.HARD)) {
                    map.get(Difficulty.HARD).add(question);
                } else {

                    List<Question> list = new ArrayList<>();
                    list.add(question);
                    map.put(Difficulty.HARD, list);
                }

            }

        }
        return map;
    }
}
