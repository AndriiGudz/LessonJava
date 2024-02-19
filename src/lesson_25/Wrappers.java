package lesson_25;

public class Wrappers {
    /*
    Byte - обертка для byte
    Short - обертка для short
    Integer - обертка для int
    Long - обертка для long
    Float - обертка для float
    Double - обертка для double
    Character - обертка для char
    Boolean - обертка для boolean
     */
    public static void main(String[] args) {
        Integer integer;

        int maxValue = Integer.MAX_VALUE;
        System.out.println("max" + maxValue);
        System.out.println("min" + Integer.MIN_VALUE);

        integer = null; // поддержка null

        // автоматическое приведение типов
        // Авто-упаковка и Авто-распаковка

        Integer wrappedInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrappedInt);

        int primitiveInt = wrappedInt; // автораспаковка - из типа Integer автоматически преобразовало в примитив int

        // Сравнение объектов == сравнение по ссылке
        // -128...127 - сравнение по ссылкам может работать не так, как мы ожидаем.

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true - происходит кеширование

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false - не происходит кеширования
        System.out.println(c.equals(d)); // true


        // Схожие методы для всех оберточных типов
        // 1. valueOf() - преобразует явным образом примитив или строку в соответствующую обертку.
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf" + (e == f));

        Integer g = new Integer(127);
        Integer h = new Integer(127);
        System.out.println(g == h); // false

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100);

        // 2. parseXXX() - преобразует строку в соответствующий примитив.
        System.out.println(Integer.parseInt("456"));
        System.out.println(Double.parseDouble("344.56") + 2.0);

        // 3. toString - возвращает строковое представление числа.
        System.out.println(intStr.toString() + ", hello");

        // 4. equals - сравнивает два объекта по значению.

        // 5. compareTo() - сравнивает текущий объект с другим объектом.
        System.out.println(e.compareTo(f)); // 127 vs 127 --> 0
        System.out.println(e.compareTo(d)); // 127 vs 128 --> отрицательное значение

        // 6. xxxValue() - возвращает объект как примитив (принудительная распаковка)
        Double d1 = Double.valueOf(125.67); // явная / принудительная упаковка
        double dPrimitive = d1.doubleValue(); // явная / принудительная распаковка

//        ======================================================
        // Все числовые (кроме boolean и char) обертки над примитивами наследуются от абстрактного класса Number.

        Number number = Integer.valueOf(125);

        /*
        Методы для приведения любого числового оберточного типа к примитиву
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer1 = 31844;
        Double dvValue = 345.78;

        System.out.println(integer1.doubleValue());
        short sh = integer1.shortValue();

        int intFromDouble = dvValue.intValue();
        System.out.println(intFromDouble);

        System.out.println(0.1 + 0.2);
        Double s1 = 0.1;
        Double s2 = 0.2;
        System.out.println(s1 + s2);


    }
}
