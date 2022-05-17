package Animal;

public class mainAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for(Animal animal:animals){
            if(animal instanceof Tiger){
                System.out.println( animal.makeSound());
                System.out.println(((Tiger) animal).howEat());
            }
            else if(animal instanceof Chicken){
                System.out.println(animal.makeSound());
                System.out.println(((Chicken) animal).howEat());
            }
        }
    }
}
