class Movie {

    int movieId;
    String movieName;
    String genre;

    Movie(int movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    void displayDetails() {
        System.out.println(movieId);
        System.out.println(movieName);
        System.out.println(genre);
    }
}