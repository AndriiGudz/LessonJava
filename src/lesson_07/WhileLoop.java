package lesson_07;

public class WhileLoop {
    public static void main(String[] args) {

//        while (condition) { // condition - условие
//            // тело цикла
//        }

//        while (true){ // бесконечный цикл
//            System.out.println("Hello!");
//        }

        // Вывести на экран цифры от 0 до 10
        int i = 0;
        while (i < 10){
            System.out.println("i = " + i);
            i++; // увеличивается на 1
        }

        System.out.println("Конец цикла while");

        String str = "Привет, Петя!";
        int idx = 0;
        while (idx < str.length()){
            System.out.print(str.charAt(idx) + " ");
            idx++; // увеличивается на 1
        }

        System.out.println();

    }
}
