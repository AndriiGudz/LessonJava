package lesson_24.printers;

public class Presentation implements ColorPrintable {

    private String title;
    private int countPages;
    private String theme;

    public Presentation(String title, int countPages, String theme) {
        this.title = title;
        this.countPages = countPages;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Презентация %s в цвете (тема: %s). Всего страниц %d\n", title, theme, countPages);
    }

    @Override
    public void print() {
        System.out.printf("Распечатывается презентация %s (тема: %s) в ч/б. Всего страниц %d\n", title, theme, countPages);
    }

    @Override
    public void print(int number) {
        System.out.println(number);
    }
}
