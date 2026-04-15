package problem6;

import java.io.Serializable;


public class Animal implements Identifiable, Serializable, Cloneable {
 private String id;
 private String species;

 public Animal(String id, String species) {
     this.id = id;
     this.species = species;
 }

 @Override
 public String getId() { return id; }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }

 @Override
 public String toString() {
     return "Animal [" + species + ", ID: " + id + "]";
 }
}
