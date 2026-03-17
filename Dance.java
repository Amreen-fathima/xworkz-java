class Dance {

    int danceId;
    String eventName;
    Form form;

    Dance(int danceId, String eventName, Form form) {
        this.danceId = danceId;
        this.eventName = eventName;
        this.form = form;
    }

    void displayDetails() {
        System.out.println(danceId);
        System.out.println(eventName);
        form.displayDetails();
    }
}