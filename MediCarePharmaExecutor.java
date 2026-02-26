class MediCarePharmaExecutor {

    public static void main(String[] args) {

        boolean isCreated = MediCarePharma.createMedicine("MediCare Pharma Pvt Ltd","Paracetamol 500","Paracetamol IP 500mg",35.50,10,
                "12/2027",false,"Tablet","India");

        if (isCreated) {
            MediCarePharma.getMedicine();
        } else {
            System.out.println("Medicine not created due to invalid data");
        }
    }
}