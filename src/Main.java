public class Main {
    public static void main(String[] args) {
        Author authorFitzgerald = new Author("Фрэнсис", "Фицджеральд");
        Author authorDostoevsky = new Author("Федор", "Достоевский");

        Book bookGreatGatsby = new Book("Великий Гэтсби", authorFitzgerald, 1925);
        Book bookBrothersKaramazov = new Book("Братья Карамазовы", authorDostoevsky, 1879);

        bookBrothersKaramazov.setYearPublication(1880);
    }
}