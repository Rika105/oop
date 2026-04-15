package problem5;

import java.util.ArrayList;
import java.util.List;

class PersonRegistry {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Реестр системы:\n");
        for (Person p : people) {
            sb.append("- ").append(p).append("\n");
        }
        return sb.toString();
    }
}
