class ElevatorExecutor {

    public static void main(String[] args) {

        boolean isCreated = Elevator.createElevator("Otis",8,2,10,true,"Passenger",1.5);

        if (isCreated) {
            Elevator.getElevatorDetails();
        } else {
            System.out.println("Elevator not created due to invalid data");
        }
    }
}