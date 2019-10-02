import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People implements Iterable {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person : personList){
            if (person.getId() == id) return person;
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for (Person person : personList){
            if (person.getId() == id){
                personList.remove(person);
                break;
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        int size = personList.size();
        Person[] people = new Person[size];
        for (int x = 0; x < size; x++){
            people[x] = personList.get(x);
        }
        return people;
    }

    public Iterator iterator() {
        return personList.iterator();
    }

    public void forEach(Consumer action) {

    }

    public Spliterator spliterator() {
        return null;
    }
}
