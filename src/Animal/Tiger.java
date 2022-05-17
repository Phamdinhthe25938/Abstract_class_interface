package Animal;

public class Tiger extends Animal implements Ediable {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howEat() {
        return "could eat Grilled";
    }
}
