class Movie {

    static String movieName;
    static String hero;
    static String heroine;
    static String director;
    static String language;
    static int durationMinutes;
    static double rating;

    public static boolean createMovie(String mName, String hName,String heName, String dName,String lang, int duration,double rate) {

        boolean isMovieNameValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isDirectorValid = false;
        boolean isLanguageValid = false;
        boolean isDurationValid = false;
        boolean isRatingValid = false;

        if (mName != null && !mName.isEmpty()) {
            Movie.movieName = mName;
            isMovieNameValid = true;
        } else {
            System.out.println("Movie Name is Invalid");
        }

        if (hName != null && !hName.isEmpty()) {
            Movie.hero = hName;
            isHeroValid = true;
        } else {
            System.out.println("Hero Name is Invalid");
        }

        if (heName != null && !heName.isEmpty()) {
            Movie.heroine = heName;
            isHeroineValid = true;
        } else {
            System.out.println("Heroine Name is Invalid");
        }

        if (dName != null && !dName.isEmpty()) {
            Movie.director = dName;
            isDirectorValid = true;
        } else {
            System.out.println("Director Name is Invalid");
        }

        if (lang != null && !lang.isEmpty()) {
            Movie.language = lang;
            isLanguageValid = true;
        } else {
            System.out.println("Language is Invalid");
        }

        if (duration > 0) {
            Movie.durationMinutes = duration;
            isDurationValid = true;
        } else {
            System.out.println("Duration is Invalid");
        }

        if (rate > 0 && rate <= 10) {
            Movie.rating = rate;
            isRatingValid = true;
        } else {
            System.out.println("Rating is Invalid");
        }

        if (isMovieNameValid && isHeroValid && isHeroineValid &&
            isDirectorValid && isLanguageValid &&
            isDurationValid && isRatingValid) {

            System.out.println("Movie Created Successfully");
            return true;
        }

        return false;
    }

    public static void getMovieDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Director: " + director);
        System.out.println("Language: " + language);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Rating: " + rating);
    }
}