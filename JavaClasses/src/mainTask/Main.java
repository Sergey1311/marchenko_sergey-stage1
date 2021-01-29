package mainTask;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Book("\"Евгений Онегин\"", "А.С.Пушкин", "Public Domain",
                2008, 88, 14, "мягкий"));
        shop.add(new Book("\"Шинель\"", "Н.В.Гоголь", "Библиотечный фонд",
                2007, 36, 10, "мягкий"));
        shop.add(new Book("\"Горе от ума\"", "А.С.Грибоедов", "Библиотечный фонд",
                2014, 56, 11, "мягкий"));
        shop.add(new Book("\"Капитанская дочка\"", "А.С.Пушкин", "Public Domain",
                2012, 102, 16, "твёрдый"));
        shop.add(new Book("\"Преступление и наказание\"", "Ф.М.Достоевский", "Public Domain",
                2010, 596, 34, "твёрдый"));
        shop.add(new Book("\"Ревизор\"", "Н.В.Гоголь", "Азбука-Аттикус",
                2011, 78, 12, "твёрдый"));
        shop.add(new Book("\"Братья Карамазовы\"", "Ф.М.Достоевский", "Библиотечный фонд",
                2015, 1008, 47, "твёрдый"));
        shop.add(new Book("\"Мертвые души\"", "Н.В.Гоголь", "Азбука-Аттикус",
                2012, 412, 38, "твёрдый"));

        Shop.show(shop.getBooks());

        Shop.show(shop.getBooksByAuthor("Н.В.Гоголь"));

        Shop.show(shop.getBooksByPublishingHouse("Библиотечный фонд"));

        Shop.show(shop.getBooksByYearOfPublication(2010));
    }
}




