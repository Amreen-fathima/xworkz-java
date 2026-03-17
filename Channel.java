class Channel {

    int channelId;
    String channelName;
    String language;

    Channel(int channelId, String channelName, String language) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.language = language;
    }

    void displayDetails() {
        System.out.println(channelId);
        System.out.println(channelName);
        System.out.println(language);
    }
}