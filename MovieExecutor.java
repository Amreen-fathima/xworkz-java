public class MovieExecutor {

    public static void main(String[] args) {

        boolean result = Movie.createMovie("KGF Chapter 2","Yash","Srinidhi Shetty","Prashanth Neel","Kannada",168,8.9);

        if (result) {
            System.out.println("\nMovie Details:");
            Movie.getMovieDetails();
        } else {
            System.out.println("Movie creation failed due to invalid data.");
        }
    }
}