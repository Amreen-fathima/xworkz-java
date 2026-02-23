class JobPortalRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        String[] companies = {
            "Infosys",
            "TCS"
            // Add 175 company names
        };

        for (String company : companies) {

            String[] jobs = JobPortal.searchJobsByCompany(company);
            JobPortal.displayJobNames(jobs);
        }

        System.out.println("Main ended");
    }
}


class JobPortalRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        String[] companies = {
            "Infosys",
            "TCS",
            "Wipro"
            // 👉 Add total 175 company names here
        };

        for (String company : companies) {

            String[] jobs = JobPortal.searchJobsByCompany(company);
            JobPortal.displayJobNames(jobs);
        }

        System.out.println("Main ended");
    }
}

class JobPortalRunner {

    public static void main(String[] args) {

        String[] companies = {"Infosys", "TCS"}; // Add 175 companies

        for (String company : companies) {
            String[] jobs = JobPortal.searchJobsByCompany(company);
            JobPortal.displayJobs(jobs);
        }
    }
}