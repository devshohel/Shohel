
package jan05;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        
        List<Person> list = new ArrayList<>();
        
        Person p1 = new Person(101, "Shohel", 35000.50);
        Person p2 = new Person(102, "Akib", 30000.50);
        Person p3 = new Person(103, "Masud", 40000.50);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        for(Person p : list){
            p.show();
        }
    }
}


