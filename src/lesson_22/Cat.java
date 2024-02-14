package lesson_22;

public class Cat extends Animal {

    // переопределение родительского метода voice
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }

    public void eat() {
        System.out.println("Cat eating");
    }

}
