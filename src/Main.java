public class Main {
    public static void main(String[] args) {
        //первая книга с измененным годом
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("Имя автора - " + pushkin.getNameAuthor());
        System.out.println("Фамилия автора - " + pushkin.getSurnameAuthor());

        Book onegin = new Book("Евгений Онегин", pushkin, 1950);
        System.out.println("Название книги " + onegin.getNameOfBook());
        System.out.println("Писатель " + onegin.getAuthor());
        System.out.println("Год выпуска " + onegin.getPublishingYear());
        onegin.setPublishingYear(2000);
        System.out.println("Год выпуска " + onegin.getPublishingYear());
        //вторая книга
        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println("Имя автора - " + lermontov.getNameAuthor());
        System.out.println("Фамилия автора - " + lermontov.getSurnameAuthor());
        Book parus = new Book("Парус", lermontov, 2001);
        System.out.println("Название книги " + parus.getNameOfBook());
        System.out.println("Писатель " + parus.getAuthor());
        System.out.println("Год выпуска " + parus.getPublishingYear());
    }
}
