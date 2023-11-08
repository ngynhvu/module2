package ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.animal;

import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck- cluck";
    }

    @Override
    public String howToEat() {
        return "Fried";
    }
}
