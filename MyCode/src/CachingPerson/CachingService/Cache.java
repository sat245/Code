package CachingPerson.CachingService;

import CachingPerson.DTO.Person;

public abstract class Cache {


    public abstract  Person getValue(long id) throws Exception;
    public abstract  void insertValue(long id,Person person)throws Exception;

}