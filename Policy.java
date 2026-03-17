class Policy {

    int policyId;
    String policyName;
    String department;

    Policy(int policyId, String policyName, String department) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.department = department;
    }

    void displayDetails() {
        System.out.println(policyId);
        System.out.println(policyName);
        System.out.println(department);
    }
}