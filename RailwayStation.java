class RailwayStation {

    public static void main(String[] args) {

        String stationName = "Central Railway Station";
        String city = "Bengaluru";
        int totalPlatforms = 10;
        String manager = "Mr. Suresh";

        String platforms[] = {"Platform 1", "Platform 2", "Platform 3", "Platform 4", "Platform 5", "Platform 6", "Platform 7", "Platform 8", "Platform 9", "Platform 10"};
        String trains[] = {"Shatabdi Express", "Rajdhani Express", "Duronto Express", "Garib Rath", "Express"};
        String staff[] = {"Ticket Collector", "Station Master", "Security Guard", "Cleaning Staff", "Porter"};

        System.out.println("Railway Station Info:");
        System.out.println("Station Name: " + stationName);
        System.out.println("City: " + city);
        System.out.println("Total Platforms: " + totalPlatforms);
        System.out.println("Station Manager: " + manager);

        System.out.println("\nList of Platforms:");
        for (String platform : platforms) {
            System.out.println(platform);
        }

        System.out.println("\nTrains Available:");
        for (String train : trains) {
            System.out.println(train);
        }

        System.out.println("\nStaff at the Station:");
        for (String member : staff) {
            System.out.println(member);
        }
    }
}
