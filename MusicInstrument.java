class MusicInstrument {

    int instrumentId;
    String instrumentName;
    String type;

    MusicInstrument(int instrumentId, String instrumentName, String type) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.type = type;
    }

    void displayDetails() {
        System.out.println(instrumentId);
        System.out.println(instrumentName);
        System.out.println(type);
    }
}