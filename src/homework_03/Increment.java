package homework_03;

public class Increment {
    public static void main(String[] args) {

        int x = 3;
//        x =+ x++;
        System.out.println(x);

        int a = 5;

        x = x + 1;
        System.out.println(x);

//        x++; // x = x + 1; Инкременит - увеличение
//        x++ -> постинкремент - сначала берется текущее значение х, которое участвует в дальнейшем вычислениях
//        ++x -> преинкремент - сначала значение х увеличивается на 1, только потом новое значение участвует в дальнейшем вычислении.

        a = ++x; // a = x; x = x + 1;

        System.out.println("a = " + a);
        System.out.println("x = " + x);

        a = x++;
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        // декременты, пост и пре

        x--;
        --x;


        x = x + 5;
        x += 5; // x = x + 5;
        x -= 5;
        x *= 5;
        x /= 5;

        int y = 5;
        y = y++ + y++; // 5+(y=6) + 6 = 11; (y=7)
        System.out.println("y = " + y);

    }
}
