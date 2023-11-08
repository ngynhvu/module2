package ss7_abstract_interface.thuc_hanh.animal_interfaceEdible;

import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.animal.Animal;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.animal.Chicken;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.animal.Tiger;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.edible.Edible;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.fruit.Apple;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.fruit.Fruit;
import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
