class Playstore {

    // 8 Properties
    static String appName;
    static String developer;
    static double rating;
    static int downloads;
    static double sizeMB;
    static String category;
    static boolean isFree;
    static String version;

    public static boolean createApp(String aName, String dev,
                                    double rate, int down,
                                    double size, String cat,
                                    boolean free, String ver) {

        boolean isAppNameValid = false;
        boolean isDeveloperValid = false;
        boolean isRatingValid = false;
        boolean isDownloadsValid = false;
        boolean isSizeValid = false;
        boolean isCategoryValid = false;
        boolean isVersionValid = false;

        if (aName != null && !aName.isEmpty()) {
            Playstore.appName = aName;
            isAppNameValid = true;
        } else {
            System.out.println("App Name is Invalid");
        }

        if (dev != null && !dev.isEmpty()) {
            Playstore.developer = dev;
            isDeveloperValid = true;
        } else {
            System.out.println("Developer is Invalid");
        }

        if (rate > 0 && rate <= 5) {
            Playstore.rating = rate;
            isRatingValid = true;
        } else {
            System.out.println("Rating is Invalid");
        }

        if (down > 0) {
            Playstore.downloads = down;
            isDownloadsValid = true;
        } else {
            System.out.println("Downloads is Invalid");
        }

        if (size > 0) {
            Playstore.sizeMB = size;
            isSizeValid = true;
        } else {
            System.out.println("App Size is Invalid");
        }

        if (cat != null && !cat.isEmpty()) {
            Playstore.category = cat;
            isCategoryValid = true;
        } else {
            System.out.println("Category is Invalid");
        }

        Playstore.isFree = free;

        if (ver != null && !ver.isEmpty()) {
            Playstore.version = ver;
            isVersionValid = true;
        } else {
            System.out.println("Version is Invalid");
        }

        if (isAppNameValid && isDeveloperValid && isRatingValid &&
            isDownloadsValid && isSizeValid &&
            isCategoryValid && isVersionValid) {

            System.out.println("App Created Successfully");
            return true;
        }

        return false;
    }

    public static void getAppDetails() {
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Rating: " + rating);
        System.out.println("Downloads: " + downloads);
        System.out.println("Size: " + sizeMB + " MB");
        System.out.println("Category: " + category);
        System.out.println("Free: " + isFree);
        System.out.println("Version: " + version);
    }
}