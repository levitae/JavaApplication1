package javaapplication1.animalshelter;

import javaapplication1.animalshelter.Animal;
import java.util.LinkedList;
import java.util.Queue;

public class AnimalQueue {
    public Queue<Animal> cats;
    public Queue<Animal> dogs;
    public int order;

    public AnimalQueue() {
        cats = new LinkedList<Animal>();
        dogs = new LinkedList<Animal>();
        order = 0;
    }

    public void enqueue(Animal animal) {
        order++;
        animal.setOrder(order);
        if (animal instanceof Cat) {
            System.out.println("kucing");
            cats.add(animal);
        } else {
            System.out.println("anjing");
            dogs.add(animal);
        }
    }

    public Animal dequeueAny() {
        Animal r = null;
        if (!cats.isEmpty() && !dogs.isEmpty()) {
            Animal headCat = cats.peek();
            Animal headDog = dogs.peek();
            if (headCat.isOlderThan(headDog)) {
                r = cats.remove();
            } else {
                r = dogs.remove();
            }
            return r;
        }
        if (cats.isEmpty()) {
            r = dogs.remove();
        }
        if (dogs.isEmpty()) {
            r = cats.remove();
        }
        return r;
    }
    
    public Animal dequeueCats() {
        Animal r = null;
        if (!cats.isEmpty()) {
            r = cats.remove();
        }
        return r;
    }
    
    public Animal dequeueDogs() {
        Animal r = null;
        if (!dogs.isEmpty()) {
            r = dogs.remove();
        }
        return r;
    }

}
