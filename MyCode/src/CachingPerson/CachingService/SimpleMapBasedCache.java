package CachingPerson.CachingService;

import CachingPerson.DTO.Person;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBasedCache extends Cache{

    static Map<Long,Person> cachedObject = new HashMap<>();
    @Override
    public synchronized Person getValue(long id) throws Exception{
        if(cachedObject.containsKey(id)){
            return cachedObject.get(id);
        }else {
            //call DAO layer
            insertValue(id, new Person(id,"AB"+id));
        }
        return null;
    }

    @Override
    public synchronized void insertValue(long id, Person person) throws Exception{
        cachedObject.put(id,person);
        return ;
    }
}
