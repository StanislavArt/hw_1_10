public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фрэнсис", "Фицджеральд");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Великий Гэтсби", author1, 1925);
        Book book2 = new Book("Братья Карамазовы", author2, 1879);

        book2.setYearPublication(1880);
    }
}