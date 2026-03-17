class Project {

    int projectId;
    String projectName;
    double budget;

    Project(int projectId, String projectName, double budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.budget = budget;
    }

    void displayDetails() {
        System.out.println(projectId);
        System.out.println(projectName);
        System.out.println(budget);
    }
}