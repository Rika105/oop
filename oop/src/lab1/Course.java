 package lab1;
public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return name + " " + description;
    }

    public String getName() { return name; }
}