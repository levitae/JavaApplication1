package javaapplication1.animalshelter;

import javaapplication1.animalshelter.Animal;

/**
 *
 * @author Ideapad
 */
public class Dog extends Animal {
  public Dog(String n) {
    super(n);
  }

  public String name() {
    return "Dog: " + name;
  }
}
