package homework_18;

/*
Написать класс Собака.

Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.
Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

public class Dog {

    private String name;
    private int jumpHeight;
    private static int increasePerOneTraining;
    private int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    static {
        increasePerOneTraining = 10;
    }

    public void jump() {
        System.out.println("Собака прыгает на " + jumpHeight + " см.");
    }

    private void train() {
        this.jumpHeight += increasePerOneTraining;

//        jumpHeight = (jumpHeight > maxJumpHeight) ? maxJumpHeight : jumpHeight;
        jumpHeight = Math.min(jumpHeight, maxJumpHeight); // метод возвращает меньшее из двух чисел
        System.out.println(" ==== прыжок после тренировки ==== " + jumpHeight);
    }

    public boolean takeBarrier(int heightBarrier) {
        if (jumpHeight >= heightBarrier) {
            jump();
            return true;
        } else {
            if (maxJumpHeight >= heightBarrier) {
                do { // начинаем цикл тренировок
                    System.out.println(name + " не может сразу взять барьер и идет тренироваться.");
                    train(); // каждая тренировка увеличивает высоту прыжка на 10 см
                } while (jumpHeight < heightBarrier); // проверяем - достаточно ли высота прыжка для взятия барьера
                jump();
                return true;
            } else {
                System.out.println("Барьер невозможно взять, он слишком высокий для " + name);
                return false;
            }
        }
    }

    public void info() {
        System.out.println("Собаку зовут " + name + ". Текущий прыжок " + jumpHeight + " см. Максимальная высота прыжка " + maxJumpHeight + " см.");
    }


}
