class JobPortalRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        String[] companies = {
            "Infosys",
            "TCS"

        };

        for (String company : companies) {

            String[] jobs = JobPortal.searchJobsByCompany(company);
            JobPortal.displayJobNames(jobs);
        }

        System.out.println("Main ended");
    }
}
