class Rythms {

    int rhythmId;
    String rhythmName;
    MusicInstrument musicInstrument;

    Rythms(int rhythmId, String rhythmName, MusicInstrument musicInstrument) {
        this.rhythmId = rhythmId;
        this.rhythmName = rhythmName;
        this.musicInstrument = musicInstrument;
    }

    void displayDetails() {
        System.out.println(rhythmId);
        System.out.println(rhythmName);
        musicInstrument.displayDetails();
    }
}