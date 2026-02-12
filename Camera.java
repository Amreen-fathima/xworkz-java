class Camera {

    static boolean isRecording;

    static boolean onOrOff() {

        if (!isRecording) {
            isRecording = true;
            System.out.println("Camera is turned On...");
        } else {
            isRecording = false;
            System.out.println("Camera is turned Off...");
        }

        return isRecording;
    }
}

