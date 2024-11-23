public class Main {
        public static void main(String[] args) {
            Author tolstoy = new Author("Алексей", "Толстой");

            Book aelita = new Book("Аэлита", 1923, tolstoy);

            Author turgenev = new Author("Иван", "Тургенв");

            Book fathersAndSon = new Book("Отцы и дети", 1862, turgenev);

            aelita.setPublisherYear(1923);
            fathersAndSon.setPublisherYear(1862);
            System.out.println(aelita);
            System.out.println(fathersAndSon);
            System.out.println(fathersAndSon.equals(fathersAndSon));
            System.out.println(fathersAndSon.hashCode());
        }

    }