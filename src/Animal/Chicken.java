package Animal;

public class Chicken extends Animal implements Ediable{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howEat() {
        return "could be fried";
    }
}
