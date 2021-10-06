package javaapplication1.animalshelter;

import javaapplication1.animalshelter.Animal;

/**
 *
 * @author Ideapad
 */
public class Cat extends Animal {
  public Cat(String n) {
    super(n);
  }

  public String name() {
    return "Cat: " + name;
  }
}
