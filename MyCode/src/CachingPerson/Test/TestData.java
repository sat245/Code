package CachingPerson.Test;

import CachingPerson.CachingService.Cache;
import CachingPerson.CachingService.SimpleMapBasedCache;
import CachingPerson.Controller.Controller;
import CachingPerson.DTO.Person;

import java.util.Scanner;

public class TestData {
    public static void  main(String [] args){
        while (true) {
            //addDataToCache();
            Scanner scanner = new Scanner(System.in);
            long id = scanner.nextLong();

            Controller con = new Controller();
            Person person = con.getPerson(id);

            if (person == null) {
                System.out.println("new insertion");
            } else {
                System.out.println(person.getId() + " " + person.getName());
            }
        }
    }
    private static void addDataToCache(){
//        Cache cache = new SimpleMapBasedCache();
//        for(int i = 0;i<5;i++){
//            Person person = new Person();
//            person.setId(i);
//            person.setName("AB"+i);
//            cache.insertValue(i,person);
//        }
    }
}
