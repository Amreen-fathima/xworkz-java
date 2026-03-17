class Frame {

    int frameId;
    String frameType;
    String color;

    Frame(int frameId, String frameType, String color) {
        this.frameId = frameId;
        this.frameType = frameType;
        this.color = color;
    }

    void displayDetails() {
        System.out.println(frameId);
        System.out.println(frameType);
        System.out.println(color);
    }
}