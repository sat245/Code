package Competitions.Flipkart1;

public class Factory {

    public static CreateQuestion getCriteria(String criterion) throws IllegalArgumentException{

        if (Criterias.valueOf(criterion).equals(Criterias.DIFFICULTY)){
           return new BasedOnDifficulty();
        }

        if (Criterias.valueOf(criterion).equals(Criterias.SUBJECT)){
            return new BasedOnSubject();
        }

        if (Criterias.valueOf(criterion).equals(Criterias.TOPIC)){
            return new BasedOnTopic();
        }

        System.out.println("Illegal critrion Exit");
        throw  new IllegalArgumentException();
    }
}
