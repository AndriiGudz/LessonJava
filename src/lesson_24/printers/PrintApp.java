package lesson_24.printers;

public class PrintApp {
    public static void main(String[] args) {

        Book book = new Book("Java", "Eckel");
        book.print();

        Printable printableBook = new Book("Test", "Someone");
        printableBook.print();
        // printableBook.bookSayHello() - такой метод по типу ссылки Printable не доступен

        Printable presentationWB = new Presentation("Title", 24, "Thema");
        presentationWB.print();

        System.out.println("\n=============================\n");
        ColorPrintable presentationColor = new Presentation("Color", 12, "World");
        presentationColor.print();
        presentationColor.colorPrint();

        System.out.println("\n=============================\n");
        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = presentationColor;

        for (Printable printable : printables) {
            printable.print();
            printable.sayHello("World");
        }

        System.out.println("\n=============================\n");
        // что бы вызвать статический интерфейс
        Printable.staticMethod();

        System.out.println("\n=============================\n");
        Printer printer = new Printer();
        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);

    }
}
