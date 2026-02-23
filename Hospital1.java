class Hospital1 {

    static String[] findDoctorsBySpecialization(String specialization) {

        if (specialization=="Cardiac Sciences") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Dental Science") {
            String[] doctors = {
                "Dr. Asha", "Dr. Kiran", "Dr. Meena",
                "Dr. Varun", "Dr. Tejas", "Dr. Harsha",
                "Dr. Bhavana", "Dr. Vivek", "Dr. Divya",
                "Dr. Akash", "Dr. Neha", "Dr. Rahul",
                "Dr. Nisha", "Dr. Prakash", "Dr. Pavan"
            };
            return doctors;
        }

        else if (specialization=="Dermatology") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ravi", "Dr. Suma",
                "Dr. Karthik", "Dr. Mehul", "Dr. Priya",
                "Dr. Sanjay", "Dr. Nandini", "Dr. Arjun",
                "Dr. Leena", "Dr. Vishal", "Dr. Rekha",
                "Dr. Divya", "Dr. Manoj", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization=="Diabetology/Endocrinology") {
            String[] doctors = {
                "Dr. Pradeep", "Dr. Swati", "Dr. Nikhil",
                "Dr. Ananya", "Dr. Rajesh", "Dr. Priya",
                "Dr. Kiran", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak"
            };
            return doctors;
        }

        else if (specialization=="ENT") {
            String[] doctors = {
                "Dr. Ritu", "Dr. Ajay", "Dr. Nisha",
                "Dr. Vikram", "Dr. Priya", "Dr. Kiran",
                "Dr. Anil", "Dr. Meera", "Dr. Rahul",
                "Dr. Swathi", "Dr. Raj", "Dr. Deepak",
                "Dr. Leena", "Dr. Arjun", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization.equals("Emergency and Trauma")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Foetal Medicine") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ramesh", "Dr. Priya",
                "Dr. Karthik", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Gastroenterology and Hepatobiliary Sciences") {
            String[] doctors = {
                "Dr. Ritu", "Dr. Ajay", "Dr. Nisha",
                "Dr. Vikram", "Dr. Priya", "Dr. Kiran",
                "Dr. Anil", "Dr. Meera", "Dr. Rahul",
                "Dr. Swathi", "Dr. Raj", "Dr. Deepak",
                "Dr. Leena", "Dr. Arjun", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization=="General Surgery") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Haematology") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Infectious Diseases") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Infertility medicine") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Internal Medicine") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Mental Health and Behavioural Sciences") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Nephrology") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Neurointerventional Radiology") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Neurology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Neurosurgery") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Obstetrics and Gynaecology") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Oncology") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Ophthalmology") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Organ Transplant") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Orthopaedics") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Paediatrics") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Physiotherapy and Rehabilitation")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Plastic and Reconstructive Surgery") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Pulmonology") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Radiology") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Rheumatology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Support Specialties") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Thoracic Surgery") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Transfusion Medicine") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Urology") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
				"Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Endocrine Surgery") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Vascular Surgery") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Liver Transplant and Hepatobiliary Sciences") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Palliative Medicine") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Medical Genetics") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization=="Pain and Palliative Medicine") {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization=="Geriatric Medicine") {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Critical Care") {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization=="Nuclear Medicine") {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        return null; 
    }

    static void displayDoctors(String[] doctors) {
        if (doctors != null) {
            for (String doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    public static void main(String[] args) {
        String[] specializations = {
            "Cardiac Sciences","Dental Science","Dermatology","Diabetology/Endocrinology","ENT",
            "Emergency and Trauma","Foetal Medicine","Gastroenterology and Hepatobiliary Sciences",
            "General Surgery","Haematology","Infectious Diseases","Infertility medicine","Internal Medicine",
            "Mental Health and Behavioural Sciences","Nephrology","Neurointerventional Radiology","Neurology",
            "Neurosurgery","Obstetrics and Gynaecology","Oncology","Ophthalmology","Organ Transplant",
            "Orthopaedics","Paediatrics","Physiotherapy and Rehabilitation","Plastic and Reconstructive Surgery",
            "Pulmonology","Radiology","Rheumatology","Support Specialties","Thoracic Surgery","Transfusion Medicine",
            "Urology","Endocrine Surgery","Vascular Surgery","Liver Transplant and Hepatobiliary Sciences",
            "Palliative Medicine","Medical Genetics","Pain and Palliative Medicine","Geriatric Medicine",
            "Critical Care","Nuclear Medicine"
        };

        for (String spec : specializations) {
            System.out.println("\nDoctors for specialization: " + spec);
            String[] doctors = findDoctorsBySpecialization(spec);
            displayDoctors(doctors);
        }
    }
}