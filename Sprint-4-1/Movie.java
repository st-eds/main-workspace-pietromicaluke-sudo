class Movie {
    String title;
    String director;
    int runtime;
    String rating;

    Movie () {
        title = "None";
        director = "None";
        runtime = 0;
        rating = "None";
    }

    Movie (String title, String director, int runtime, String rating) {
        this.title = title;
        this.director = director;
        this.runtime = runtime;
        this.rating = rating;
    }

    void getDetails () {
        System.out.println("--- Movie Details ---");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Runtime: " + runtime + " minutes");
        System.out.println("Rating " + rating);
    }
}