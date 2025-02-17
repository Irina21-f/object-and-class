public class Main {
    public static void main(String[] args) {
        //первая книга
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", pushkin, 1950);
        //вторая книга
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book parus = new Book("Парус", lermontov, 2001);
        System.out.println();
        //выводим авторов и книги
        System.out.println("pushkin.toString() = " + pushkin.toString());
        System.out.println("lermontov.toString() = " + lermontov.toString());
        System.out.println("onegin.toString() = " + onegin.toString());
        System.out.println("parus.toString() = " + parus.toString());
        System.out.println();
        //сравниваем авторов и книги
        System.out.println("pushkin.equals(lermontov) = " + pushkin.equals(lermontov));
        System.out.println("parus.equals(parus) = " + parus.equals(parus));
        System.out.println();
        //hashCods
        System.out.println("lermontov.hashCode() = " + lermontov.hashCode());
        System.out.println("parus.hashCode() = " + parus.hashCode());
    }
}
