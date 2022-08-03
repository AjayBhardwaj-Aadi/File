
class Animals{
    public void GetAnimals(){
        System.out.println("get animals");
    }
}

class Dog extends Animals{
    public void animalCategory(){
        System.out.println("dog");
    }
}

class Cat extends Animals{
    public void animalCategory(){
        System.out.println("Cat");
    }
}
public class AnimalsH {
    public static void main(String a[]) {
        Dog dog = new Dog();
        dog.GetAnimals();
        dog.animalCategory();

        Cat cat = new Cat();
        cat.GetAnimals();
        cat.animalCategory();
        
    }
    
}