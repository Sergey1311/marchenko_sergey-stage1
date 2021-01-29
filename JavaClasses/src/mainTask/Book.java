package mainTask;

public class Book {

        private static int idGenerator = 0;
        private final int id = ++idGenerator;
        private String name;
        private String author;
        private String publishingHouse;
        private int yearOfPublication;
        private int numberOfPages;
        private int price;
        private String binding;


        Book(String name, String author, String publishingHouse, int yearOfPublication, int numberOfPages, int price, String binding) {
            this.name = name;
            this.author = author;
            this.publishingHouse = publishingHouse;
            this.yearOfPublication = yearOfPublication;
            this.numberOfPages = numberOfPages;
            this.price = price;
            this.binding = binding;
        }

        public String getAuthor() {
            return author;
        }

        public String getPublishingHouse() {
            return publishingHouse;
        }

        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public String toString() {
            return String.format("ID: %d\t %s,\t автор: %s,\t издательство: %s,\t год издания: %d,\t количество страниц: %d,\t цена: %d р.,\t тип переплёта: %s",
                    id, name, author, publishingHouse, yearOfPublication, numberOfPages, price, binding);
        }
}
