class Company {

    int companyId;
    String companyName;
    Project project;

    Company(int companyId, String companyName, Project project) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.project = project;
    }

    void displayDetails() {
        System.out.println(companyId);
        System.out.println(companyName);
        project.displayDetails();
    }
}