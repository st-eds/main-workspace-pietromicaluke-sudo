public class Program {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 148, "PG-13");

        movie1.getDetails();
        movie2.getDetails();
    }
}