package CachingPerson.Controller;

import CachingPerson.CachingService.Cache;
import CachingPerson.CachingService.SimpleMapBasedCache;
import CachingPerson.DTO.Person;

public class Controller {


    public static Person getPerson(long id){
        Person person = null;
        try {
            Cache cache = new SimpleMapBasedCache();
           person = cache.getValue(id);

        }
        catch (Exception e ){
            System.out.println("Failure");
        }
        return person;
    }



}
