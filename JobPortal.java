class JobPortal {
 
  public static String[] searchJobsByCompany(String companyName)  {
  
   System.out.println(" Searching jobs in :" + companyName);
   
    if (companyName == "Infosys") {
        String[] jobs = { "Java Developer","Python Developer","DevOps Engineer","Data Analyst","Cloud Engineer","Full Stack Developer","QA Engineer",
	                      "HR Executive","Business Analyst","UI/UX Designer","System Engineer","Technical Led","Project Manager","Security Analyst",
					      "AI Engineer","ML Engineer","Support Engineer","Network Engineer","Database Admin","Product Manager" 
		                };
	System.out.println("Jobs found in Infosys");
	return jobs;
    }
   
    else if(companyName == "TCS") {
	   String[] jobs = {"Backend Developer","Frontend Developer","SAP Consultant","Testing Engineer","Automation Engineer","Data Engineer","Cyber Security Analyst",
	                    "IT Support","Scrum Master","Software Architect","Mobile Developer","React Developer","Angular Developer","Operations Manager","Cloud Architect",
						"BI Developer","Research Engineer","Blockchain Developer","System Developer","System Analyst","Program Manager"
	                   };
    System.out.println("Jobs found in TCS");
	return jobs;
    }
   
    else if (companyName == "Wipro") {
	   String[] jobs = {"Software Developer","Cloud Engineer","Technical Consultant","Database Developer","Security Engineer","Business Analyst","AI Specialist",
	                   "ML Specialist","Testing Analyst","Network Engineer","UI Developer","UX Designer","IT Manager","Automation Tester","Full Stack Engineer",
					   "Support Executive","DevOps Analyst","System Architect","Data Scientist","Program Analyst"
	                   };
	System.out.println("Jobs found in Wipro");
	return jobs;
	}
	
	else if (companyName == "HCL") {
	   String[] jobs = {"Application Developer","System Engineer","DevOps Specialist","QA Tester","Cloud Architect","Business Consultant","IT Analyst",
	                    "Security Consultant","Backend Engineer","Frontend Engineer","Mobile App Developer","Data Engineer","Support Engineer","Technical Manager",
						"Software Architect","HR Manager","Product Engineer","Automation Engineer","Infrastructure Engineer","Scrum Master"
	                   };
	System.out.println("Jobs found in HCL");
	return jobs;
	}
	
	else if (companyName == "Accenture") {
	   String[] jobs = {"Software Developer","Cloud Specialist","AI Engineer","ML Engineer","Cyber Security Analyst","Full Stack Developer","Data Analyst",
	                    "DevOps Engineer","System Administrator","Business Analyst","UI Developer","UX Developer","SAP Consultant","Testing Engineer",
						"Automation Tester","Product Manager","Operation Analyst","Technical Lead","Support Executive","Program Manager"
	                   };
	System.out.println("Jobs found in Accenture");
	return jobs;
	}
	
	else if (companyName == "IBM") {
	   String[] jobs = { "Software Engineer","Cloud Developer","AI Engineer","Data Scientist","Cyber Security Analyst","DevOps Engineer","System Administrator",
	                     "Business Analyst","Technical Consultant","Backend Developer","Frontend Developer","Full Stack Developer","Automation Engineer",
						 "Network Engineer","Database Administrator","IT Support","Product Engineer","Research Analyst","Solution Architect","Program Manager"
	                   };
	System.out.println("Jobs found in IBM");
	return jobs;
	}
	
	else if (companyName == "Capgemini") {
	   String[] jobs = { "Application Developer","Testing Engineer","Cloud Engineer","DevOps Specialist","Data Engineer","Security Analyst","Business Consultant",
	                     "System Analyst","Java Developer","Python Developer","React Developer","Angular Developer","Automation Tester","Technical Lead",
						 "Support Engineer","Scrum Master","Infrastructure Engineer","Product Manager","AI Specialist","ML Engineer"
	                   };
	System.out.println("Jobs found in Capgemini");
	return jobs;
	}
	
	else if (companyName == "Cognizant") {
	   String[] jobs = { "Software Developer","Cloud Architect","Cyber Security Engineer","Data Analyst","DevOps Engineer","Backend Engineer","Frontend Engineer",
	                     "Full Stack Engineer","System Engineer","Automation Engineer","IT Support Specialist","Business Analyst","Database Developer",
						 "Network Engineer","UI Developer","UX Designer","Project Manager","Technical Consultant","QA Analyst","Program Analyst"
	                   };
	System.out.println("Jobs found in Cognizant");
	return jobs;
	}
	
	else if (companyName == "Tech Mahindra") {
	   String[] jobs = { "Software Engineer","Cloud Specialist","DevOps Analyst","AI Developer","ML Engineer","Data Engineer","Cyber Security Analyst",
	                     "System Administrator","Application Support Engineer","Technical Lead","Automation Tester","UI Developer","UX Designer",
						 "Backend Developer","Frontend Developer","Business Consultant","IT Analyst","Product Engineer","Research Engineer","Program Manager"
	                   };
	System.out.println("Jobs found in Tech Mahindra");
	return jobs;
	}
	
	else if (companyName == "Oracle") {
	   String[] jobs = { "Database Administrator","Cloud Engineer","Java Developer","Backend Developer","Frontend Developer","Full Stack Developer",
	                     "DevOps Engineer","Security Analyst","AI Engineer","Data Scientist","System Analyst","Technical Consultant","Infrastructure Engineer",
						 "Application Developer","QA Engineer","Automation Tester","Business Analyst","Product Manager","Solution Architect","Program Manager"
	                   };
	System.out.println("Jobs found in Oracle");
	return jobs;
	}
	
	else if (companyName == "Microsoft") {
	   String[] jobs = { "Software Engineer","Cloud Architect","AI Researcher","ML Engineer","Cyber Security Specialist","Data Engineer","DevOps Engineer",
	                     "Program Manager","Technical Support Engineer","System Developer","Backend Engineer","Frontend Engineer","Full Stack Developer",
						 "Game Developer","Azure Engineer","IT Consultant","Automation Engineer","UI Developer","UX Designer","Research Analyst"
	                   };
	System.out.println("Jobs found in Microsoft");
	return jobs;
	}
	
	else if (companyName == "Google") {
	   String[] jobs = { "Software Developer","AI Engineer","ML Engineer","Cloud Engineer","Data Scientist","Cyber Security Engineer","DevOps Engineer",
	                     "Site Reliability Engineer","Product Manager","UX Designer","UI Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
						 "Research Scientist","Android Developer","Web Developer","Technical Lead","Program Manager","System Architect"
	                   };
	System.out.println("Jobs found in Google");
	return jobs;
	}
	
	else if (companyName == "Amazon") {
	   String[] jobs = { "Software Development Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Engineer","Security Engineer",
	                     "Business Analyst","Operations Manager","Technical Program Manager","Backend Developer","Frontend Developer","Full Stack Developer",
						 "Support Engineer","System Analyst","Automation Engineer","UX Designer","UI Developer","Research Engineer","Product Manager"
	                   };
	System.out.println("Jobs found in Amazon");
	return jobs;
	}
	
	else if (companyName == "Flipkart") {
	   String[] jobs = { "Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Data Scientist","AI Engineer","DevOps Specialist",
	                     "Cloud Engineer","Security Analyst","Business Analyst","Product Manager","UI Developer","UX Designer","System Administrator","Automation Tester",
						 "Technical Lead","IT Support Engineer","Network Engineer","Research Analyst","Program Manager"
	                   };
	System.out.println("Jobs found in Flipkart");
	return jobs;
	}
	
	else if (companyName == "Zoho") {
	   String[] jobs = { "Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Developer","AI Engineer","ML Specialist","DevOps Engineer",
                         "Technical Support Engineer","Database Administrator","System Engineer","Automation Tester","UI Designer","UX Designer","Product Engineer",
						 "Business Analyst","Research Developer","Cyber Security Analyst","Program Manager","Technical Lead"
	                   };
	System.out.println("Jobs found in Zoho");
	return jobs;
	}
	
	else if (companyName == "Dell") {
	   String[] jobs = { "Hardware Engineer","Software Engineer","Cloud Engineer","Network Engineer","System Administrator","Cyber Security Analyst","DevOps Engineer",
	                     "Data Analyst","Technical Support Engineer","Infrastructure Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
						 "Automation Engineer","QA Tester","Business Analyst","Product Manager","IT Consultant","Database Administrator","Program Manager"
	                   };
	System.out.println("Jobs found in Dell");
	return jobs;
	}
	
	else if (companyName == "HP") {
	   String[] jobs = { "Hardware Developer","Software Developer","Cloud Specialist","AI Engineer","ML Engineer","Data Engineer","Security Engineer","DevOps Specialist",
                         "System Engineer","Technical Consultant","Backend Engineer","Frontend Engineer","Full Stack Engineer","Automation Tester","IT Support Specialist",
						 "Business Analyst","Product Engineer","Research Analyst","Infrastructure Manager","Program Manager"
	                   };
	System.out.println("Jobs found in HP");
	return jobs;
	}
	
	else if (companyName == "Adobe") {
	   String[] jobs = { "Software Engineer","Frontend Developer","Backend Developer","Full Stack Developer","UI Developer","UX Designer","Cloud Engineer","AI Specialist",
                         "ML Engineer","Data Scientist","Security Analyst","DevOps Engineer","Automation Engineer","QA Analyst","Technical Architect","Business Analyst",
                         "Product Manager","Research Engineer","Support Engineer","Program Manager"
	                   };
	System.out.println("Jobs found in Adobe");
	return jobs;
	}
	
	else if (companyName == "Intel") {
	   String[] jobs = { "Embedded Engineer","Hardware Engineer","Software Developer","AI Engineer","ML Engineer","Cloud Developer","Data Engineer","Cyber Security Engineer",
                         "DevOps Engineer","System Architect","Backend Developer","Frontend Developer","Automation Engineer","QA Engineer","Network Engineer","Business Analyst",
                         "Technical Lead","Research Scientist","Product Engineer","Program Manager"
	                   };
	System.out.println("Jobs found in Intel");
	return jobs;
	}
	
	else if (companyName == "Samsung") {
	   String[] jobs = { "Software Developer","Android Developer","Hardware Engineer","AI Engineer","ML Engineer","Cloud Engineer","Data Analyst","Cyber Security Specialist",
                         "DevOps Engineer","System Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Automation Tester","UI Designer","UX Designer",
                         "Technical Manager","Product Engineer","Research Analyst","Program Manager"
	                   };
	System.out.println("Jobs found in Samsung");
	return jobs;
	}
	
	else if (companyName == "Paytm") {
	   String[] jobs = { "Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","Cloud Engineer","Data Scientist",
	                     "AI Engineer","ML Engineer","DevOps Engineer","Security Analyst","Business Analyst","Product Manager","Automation Tester","QA Engineer",
						 "System Administrator","IT Support Engineer","Research Developer","Technical Lead","Program Manager"
	                   };
	System.out.println("Jobs found in Paytm");
	return jobs;
	}
	
	else if (companyName == "PhonePe") {
	   String[] jobs = { "Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Android Developer","Cloud Specialist","Data Engineer",
	                     "AI Specialist","ML Engineer","Cyber Security Analyst","DevOps Engineer","Product Manager","UI Developer","UX Designer","Automation Engineer",
						 "QA Analyst","Business Consultant","Technical Architect","Research Engineer","Program Manager"
	                   };
	System.out.println("Jobs found in PhonePe");
	return jobs;
	}
	
	else if (companyName == "Swiggy") {
	   String[] jobs = { "Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Mobile Developer","Cloud Engineer","Data Scientist","AI Engineer",
                         "ML Specialist","DevOps Engineer","Security Engineer","Business Analyst","Operations Manager","Product Manager","Automation Tester","QA Engineer",
                         "UI Designer","UX Designer","Technical Lead","Program Manager"
	                   };
	System.out.println("Jobs found in Swiggy");
	return jobs;
	}
	
	else if (companyName == "Zomato") {
	   String[] jobs = { "Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Mobile App Developer","Cloud Developer","Data Engineer","AI Engineer",
                         "ML Engineer","DevOps Specialist","Cyber Security Analyst","Business Analyst","Product Manager","Automation Engineer","QA Tester","UI Developer",
                         "UX Designer","System Architect","Research Analyst","Program Manager"
	                   };
	System.out.println("Jobs found in Zomato");
	return jobs;
	}
	
	else if (companyName == "Reliance") {
	   String[] jobs = { "Software Engineer","IT Analyst","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","Cyber Security Specialist","DevOps Engineer",
                         "System Administrator","Network Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Automation Tester","Business Analyst",
						 "Technical Consultant","Infrastructure Manager","Product Manager","Research Engineer","Program Manager"
	                   };
	System.out.println("Jobs found in Reliance");
	return jobs;
	}
	
	else if (companyName == "L&T") {
	   String[] jobs = { "Civil Engineer","Mechanical Engineer","Electrical Engineer","Project Engineer","Software Engineer","IT Analyst","Cloud Engineer","Data Engineer",
                         "AI Engineer","ML Engineer","Cyber Security Analyst","DevOps Engineer","System Administrator","Network Engineer","Automation Engineer","QA Tester",
                         "Business Analyst","Technical Consultant","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in L&T");
	return jobs;
	}
	
	else if (companyName == "Tata Motors") {
	   String[] jobs = { "Automobile Engineer","Mechanical Engineer","Design Engineer","Production Engineer","Software Developer","Embedded Engineer","Data Analyst",
	                     "AI Engineer","ML Engineer","Cyber Security Engineer","DevOps Engineer","System Engineer","Automation Tester","QA Engineer","Backend Developer",
						 "Frontend Developer","Full Stack Developer","Business Analyst","Technical Lead","Program Manager"
	                   };
	System.out.println("Jobs found in Tata Motors");
	return jobs;
	}
	
	else if (companyName == "Mahindra") {
	   String[] jobs = { "Mechanical Engineer","Automobile Engineer","Electrical Engineer","Production Manager","Software Engineer","Cloud Engineer","Data Engineer",
	                     "AI Specialist","ML Engineer","Cyber Security Analyst","DevOps Engineer","System Administrator","Backend Developer","Frontend Developer",
						 "Full Stack Developer","Automation Engineer","QA Analyst","Business Consultant","Technical Architect","Program Manager"
	                   };
	System.out.println("Jobs found in Mahindra");
	return jobs;
	}
	
	else if (companyName == "Bosch") {
	   String[] jobs = { "Embedded Engineer","Mechanical Engineer","Electrical Engineer","Automation Engineer","Software Developer","Cloud Specialist","Data Scientist",
	                     "AI Engineer","ML Engineer","Cyber Security Engineer","DevOps Specialist","System Architect","Backend Engineer","Frontend Engineer","QA Tester",
						 "Technical Consultant","Business Analyst","Product Engineer","Research Developer","Program Manager"
	                   };
	System.out.println("Jobs found in Bosch");
	return jobs;
	}
	
	else if (companyName == "Siemens") {
	   String[] jobs = { "Electrical Engineer","Mechanical Engineer","Automation Engineer","Project Engineer","Software Engineer","Cloud Engineer","AI Engineer","ML Engineer",
                         "Data Engineer","Cyber Security Specialist","DevOps Engineer","System Engineer","Backend Developer","Frontend Developer","QA Analyst","Business Analyst",
                         "Infrastructure Engineer","Technical Lead","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in Siemens");
	return jobs;
	}
	
	else if (companyName == "EY") {
	   String[] jobs = { "Audit Analyst","Tax Consultant","Business Analyst","IT Consultant","Cyber Security Analyst","Data Analyst","Cloud Engineer","AI Engineer",
                         "ML Engineer","DevOps Engineer","System Administrator","Backend Developer","Frontend Developer","Full Stack Developer","Automation Tester",
						 "QA Engineer","Technical Consultant","Research Analyst","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in EY");
	return jobs;
	}
	
	else if (companyName == "Deloitte") {
	   String[] jobs = { "Audit Consultant","Tax Analyst","Business Consultant","IT Analyst","Cyber Security Specialist","Cloud Engineer","Data Engineer","AI Specialist",
                         "ML Engineer","DevOps Engineer","System Architect","Backend Developer","Frontend Developer","Full Stack Engineer","Automation Engineer","QA Analyst",
                         "Technical Lead","Research Consultant","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in Deloitte");
	return jobs;
	}
	
	else if (companyName == "KPMG") {
	   String[] jobs = { "Audit Executive","Tax Consultant","Business Analyst","IT Consultant","Cyber Security Analyst","Cloud Specialist","Data Scientist","AI Engineer",
                         "ML Specialist","DevOps Engineer","System Engineer","Backend Developer","Frontend Developer","Automation Tester","QA Engineer","Technical Consultant",
                         "Infrastructure Engineer","Research Analyst","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in KPMG");
	return jobs;
	}
	
	else if (companyName == "Mindtree") {
	   String[] jobs = { "Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Developer","AI Engineer","ML Engineer","Data Engineer",
                         "Cyber Security Analyst","DevOps Specialist","System Administrator","Automation Tester","QA Engineer","Business Analyst","Technical Consultant",
						 "UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in Mindtree");
	return jobs;
	}
	
	else if (companyName == "Infosys BPM") {
	   String[] jobs = { "Process Executive","Business Analyst","IT Support Specialist","Data Analyst","Cloud Engineer","AI Specialist","ML Engineer","Cyber Security Analyst",
                         "DevOps Engineer","System Administrator","Backend Developer","Frontend Developer","Full Stack Developer","Automation Engineer","QA Tester",
						 "Technical Consultant","Infrastructure Engineer","Research Analyst","Product Manager","Program Manager"
	                   };
	System.out.println("Jobs found in Infosys BPM");
	return jobs;
	}	

    else if (companyName == "Cisco") {
    String[] jobs = {"Network Engineer","Software Engineer","Cloud Engineer","Cyber Security Analyst","DevOps Engineer","System Administrator","Data Engineer","AI Engineer",
	                 "Technical Support Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Automation Tester","QA Engineer","Business Analyst",
                     "Infrastructure Engineer","Technical Consultant","Research Engineer","Product Manager","Program Manager"
                    };
    System.out.println("Jobs found in Cisco");
    return jobs;
}

    else if (companyName == "Salesforce") {
    String[] jobs = {"Salesforce Developer","Cloud Engineer","Backend Developer","Frontend Developer","Full Stack Developer","DevOps Engineer","Data Analyst","AI Specialist",
	                 "ML Engineer","Cyber Security Analyst","System Administrator","Automation Engineer","QA Tester","Business Analyst","Technical Consultant","UI Developer",
					 "UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Salesforce");
   return jobs;
}

    else if (companyName == "SAP") {
    String[] jobs = {"SAP Consultant","ABAP Developer","Cloud Engineer","Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","DevOps Specialist",
	                 "Data Engineer","AI Engineer","ML Engineer","Cyber Security Analyst","System Architect","Automation Tester","QA Engineer","Business Analyst","Technical Lead",
					 "Infrastructure Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in SAP");
   return jobs;
}

    else if (companyName == "HPE") {
    String[] jobs = {"Cloud Engineer","Infrastructure Engineer","Software Developer","System Administrator","Network Engineer","Cyber Security Specialist","DevOps Engineer","Data Analyst",
	                 "AI Engineer","ML Engineer","Backend Developer","Frontend Developer","Automation Engineer","QA Analyst","Technical Consultant","Business Analyst","Product Engineer",
					 "Research Engineer","IT Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in HPE");
   return jobs;
}
   
   else if (companyName == "VMware") {
   String[] jobs = {"Cloud Engineer","Virtualization Engineer","Software Developer","Backend Engineer","Frontend Engineer","Full Stack Developer","DevOps Specialist","Cyber Security Analyst",
                    "System Administrator","Automation Tester","QA Engineer","Data Engineer","AI Specialist","Business Analyst","Technical Consultant","Infrastructure Architect",
					"Research Engineer","Product Manager","Technical Lead","Program Manager"
   };
   System.out.println("Jobs found in VMware");
   return jobs;
}

   else if (companyName == "ServiceNow") {
   String[] jobs = {"ServiceNow Developer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","AI Engineer","ML Engineer",
                    "Cyber Security Analyst","System Administrator","Automation Tester","QA Engineer","Technical Consultant","Business Analyst","UI Developer","UX Designer",
					"Infrastructure Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in ServiceNow");
   return jobs;
}

   else if (companyName == "PayPal") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer","DevOps Engineer",
                    "Cyber Security Specialist","Business Analyst","Product Manager","Automation Engineer","QA Tester","UI Developer","UX Designer","Technical Lead","Research Engineer",
					"IT Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in PayPal");
   return jobs;
}

   else if (companyName == "Uber") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Mobile Developer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer",
                    "DevOps Specialist","Cyber Security Analyst","Business Analyst","Product Manager","Automation Tester","QA Engineer","UI Developer","UX Designer","Research Engineer",
					"Technical Lead","Program Manager"
   };
   System.out.println("Jobs found in Uber");
   return jobs;
}

   else if (companyName == "Ola") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer",
                    "DevOps Engineer","Cyber Security Analyst","Business Analyst","Product Manager","Automation Tester","QA Engineer","UI Designer","UX Designer","Research Engineer",
					"Technical Lead","Program Manager"
   };
   System.out.println("Jobs found in Ola");
   return jobs;
}

   else if (companyName == "Byjus") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Mobile Developer","Cloud Engineer","Data Analyst","AI Engineer","ML Engineer",
                    "DevOps Specialist","Cyber Security Analyst","Business Analyst","Product Manager","Automation Tester","QA Engineer","UI Developer","UX Designer","Technical Consultant",
					"Research Engineer","Program Manager"
   };
   System.out.println("Jobs found in Byjus");
   return jobs;
}

   else if (companyName == "Nvidia") {
   String[] jobs = {"GPU Engineer","Embedded Engineer","Software Developer","AI Researcher","ML Engineer","Cloud Engineer","Data Engineer","Cyber Security Analyst","DevOps Engineer",
                    "System Architect","Backend Developer","Frontend Developer","Automation Engineer","QA Engineer","Hardware Engineer","Business Analyst","Technical Lead","Research Scientist",
					"Product Manager","Program Manager"
   };           
   System.out.println("Jobs found in Nvidia");
   return jobs;
}

   else if (companyName == "AMD") {
   String[] jobs = {"Hardware Engineer","Embedded Developer","Software Engineer","AI Engineer","ML Specialist","Cloud Developer","Data Analyst","Cyber Security Engineer","DevOps Specialist",
                    "System Engineer","Backend Developer","Frontend Developer","Automation Tester","QA Analyst","Network Engineer","Technical Consultant","Business Analyst","Research Engineer",
					"Product Engineer","Program Manager"
   };
   System.out.println("Jobs found in AMD");
   return jobs;
}

   else if (companyName == "Qualcomm") {
   String[] jobs = {"Embedded Engineer","Chip Design Engineer","Software Developer","AI Engineer","ML Engineer","Cloud Engineer","Data Engineer","Cyber Security Analyst","DevOps Engineer",
                    "System Architect","Backend Developer","Frontend Developer","Automation Engineer","QA Tester","Network Engineer","Technical Lead","Business Analyst","Research Scientist",
					"Product Engineer","Program Manager"
   };
   System.out.println("Jobs found in Qualcomm");
   return jobs;
}

   else if (companyName == "Micron") {
   String[] jobs = {"Memory Design Engineer","Hardware Engineer","Software Developer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","Cyber Security Engineer","DevOps Engineer",
                    "System Administrator","Backend Developer","Frontend Developer","Automation Tester","QA Engineer","Network Engineer","Technical Consultant","Business Analyst",
					"Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Micron");
   return jobs;
}

   else if (companyName == "Broadcom") {
   String[] jobs = {"Embedded Engineer","Hardware Developer","Software Engineer","AI Engineer","ML Engineer","Cloud Specialist","Data Engineer","Cyber Security Analyst","DevOps Specialist","System Architect",
      "Backend Developer","Frontend Developer","Automation Engineer","QA Analyst","Network Engineer","Technical Lead","Business Consultant","Research Engineer","Product Engineer","Program Manager"
   };
   System.out.println("Jobs found in Broadcom");
   return jobs;
}

   else if (companyName == "IBM India") {
   String[] jobs = {"Software Developer","Cloud Engineer","AI Engineer","ML Engineer","Data Scientist","Cyber Security Analyst","DevOps Engineer","System Administrator","Backend Developer","Frontend Developer",
      "Full Stack Developer","Automation Engineer","QA Tester","Technical Consultant","Business Analyst","Network Engineer","Database Administrator","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in IBM India");
   return jobs;
}

   else if (companyName == "TCS Digital") {
   String[] jobs = {"Full Stack Developer","Cloud Architect","AI Specialist","ML Engineer","Data Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Automation Tester",
      "QA Engineer","Technical Consultant","Business Analyst","System Architect","Mobile Developer","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in TCS Digital");
   return jobs;
}

   else if (companyName == "Infosys Consulting") {
   String[] jobs = {"Business Consultant","IT Consultant","Cloud Engineer","AI Engineer","ML Engineer","Data Analyst","Cyber Security Specialist","DevOps Engineer","System Administrator","Backend Developer",
      "Frontend Developer","Full Stack Developer","Automation Engineer","QA Analyst","Technical Lead","Infrastructure Engineer","Product Manager","Research Analyst","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Infosys Consulting");
   return jobs;
}

   else if (companyName == "HCL Technologies") {
   String[] jobs = {"Software Engineer","Cloud Engineer","DevOps Specialist","Data Engineer","AI Engineer","ML Engineer","Cyber Security Analyst","System Administrator","Backend Developer","Frontend Developer",
      "Full Stack Developer","Automation Tester","QA Engineer","Technical Consultant","Business Analyst","Network Engineer","Infrastructure Manager","Research Engineer","Product Engineer","Program Manager"
   };
   System.out.println("Jobs found in HCL Technologies");
   return jobs;
}

   else if (companyName == "LTI") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","Cyber Security Analyst","DevOps Engineer",
      "System Administrator","Automation Tester","QA Engineer","Business Analyst","Technical Consultant","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in LTI");
   return jobs;
}

   else if (companyName == "Mphasis") {
   String[] jobs = {"Software Engineer","Cloud Engineer","DevOps Engineer","Data Analyst","AI Engineer","ML Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Administrator","Infrastructure Engineer","Network Engineer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Mphasis");
   return jobs;
}

   else if (companyName == "Persistent Systems") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Specialist","Data Engineer","AI Specialist","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "System Architect","Automation Tester","QA Analyst","Business Consultant","Technical Lead","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Persistent Systems");
   return jobs;
}

   else if (companyName == "Birlasoft") {
   String[] jobs = {"Application Developer","Software Engineer","Cloud Engineer","DevOps Engineer","Data Engineer","AI Engineer","ML Engineer","Cyber Security Specialist","Backend Developer","Frontend Developer",
      "Full Stack Developer","Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Administrator","Infrastructure Engineer","Research Analyst","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Birlasoft");
   return jobs;
}

   else if (companyName == "Hexaware") {
   String[] jobs = {"Software Developer","Cloud Engineer","Data Analyst","AI Engineer","ML Specialist","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Tester","QA Analyst","Technical Consultant","Business Analyst","System Engineer","Infrastructure Engineer","Support Engineer","Research Developer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Hexaware");
   return jobs;
}

   else if (companyName == "Zensar") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "System Administrator","Automation Engineer","QA Tester","Business Analyst","Technical Consultant","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Zensar");
   return jobs;
}

   else if (companyName == "Cognizant Digital") {
   String[] jobs = {"Digital Engineer","Full Stack Developer","Cloud Engineer","AI Engineer","ML Engineer","Data Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Cognizant Digital");
   return jobs;
}

   else if (companyName == "Wipro Digital") {
   String[] jobs = {"Digital Consultant","Software Engineer","Cloud Specialist","AI Engineer","ML Engineer","Data Analyst","DevOps Engineer","Cyber Security Specialist","Backend Developer","Frontend Developer",
      "Full Stack Developer","Automation Tester","QA Analyst","Technical Lead","Business Consultant","UI Developer","UX Designer","Infrastructure Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Wipro Digital");
   return jobs;
}

   else if (companyName == "LTIMindtree") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "System Administrator","Automation Engineer","QA Tester","Business Analyst","Technical Consultant","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in LTIMindtree");
   return jobs;
}

   else if (companyName == "Accenture Strategy") {
   String[] jobs = {"Strategy Consultant","Business Analyst","Cloud Consultant","AI Specialist","ML Engineer","Data Analyst","Cyber Security Consultant","DevOps Engineer","System Architect","Backend Developer",
      "Frontend Developer","Automation Tester","QA Engineer","Technical Lead","Infrastructure Engineer","Research Analyst","Product Manager","Program Manager","IT Consultant","Operations Manager"
   };
   System.out.println("Jobs found in Accenture Strategy");
   return jobs;
}

   else if (companyName == "PwC") {
   String[] jobs = {"Audit Analyst","Tax Consultant","Business Consultant","IT Analyst","Cyber Security Specialist","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer",
      "System Administrator","Backend Developer","Frontend Developer","Full Stack Developer","Automation Tester","QA Engineer","Technical Consultant","Research Analyst","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in PwC");
   return jobs;
}

   else if (companyName == "Accolite") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Analyst","Technical Lead","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Accolite");
   return jobs;
}

   else if (companyName == "Virtusa") {
   String[] jobs = {"Software Engineer","Cloud Engineer","Data Analyst","AI Specialist","ML Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Engineer","QA Tester","Technical Consultant","Business Analyst","System Administrator","Infrastructure Engineer","Research Analyst","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Virtusa");
   return jobs;
}

   else if (companyName == "UST") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Specialist","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "System Architect","Automation Tester","QA Engineer","Business Consultant","Technical Lead","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in UST");
   return jobs;
}

   else if (companyName == "NTT Data") {
   String[] jobs = {"Software Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Tester","QA Analyst","Business Analyst","Technical Consultant","System Administrator","Infrastructure Engineer","Research Engineer","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in NTT Data");
   return jobs;
}

   else if (companyName == "DXC Technology") {
   String[] jobs = {"Software Developer","Cloud Engineer","Data Analyst","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Specialist","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Engineer","QA Tester","Business Analyst","Technical Lead","System Architect","Infrastructure Engineer","Research Analyst","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in DXC Technology");
   return jobs;
}

   else if (companyName == "EPAM") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Consultant","Technical Lead","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in EPAM");
   return jobs;
}

   else if (companyName == "ThoughtWorks") {
   String[] jobs = {"Software Developer","Full Stack Engineer","Cloud Consultant","DevOps Engineer","Data Engineer","AI Engineer","ML Specialist","Cyber Security Analyst","Backend Developer","Frontend Developer",
      "Automation Tester","QA Analyst","Business Consultant","Technical Lead","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in ThoughtWorks");
   return jobs;
}

   else if (companyName == "GlobalLogic") {
   String[] jobs = {"Software Engineer","Cloud Specialist","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Administrator","Infrastructure Engineer","Research Engineer","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in GlobalLogic");
   return jobs;
}

   else if (companyName == "Nagarro") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Consultant","Technical Lead","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Nagarro");
   return jobs;
}

   else if (companyName == "Tavant") {
   String[] jobs = {"Software Engineer","Cloud Engineer","Data Analyst","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Specialist","Backend Developer","Frontend Developer","Full Stack Developer",
      "Automation Engineer","QA Tester","Business Analyst","Technical Consultant","System Administrator","Infrastructure Engineer","Research Engineer","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Tavant");
   return jobs;
}

   else if (companyName == "Freshworks") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Analyst","Technical Lead","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Freshworks");
   return jobs;
}

   else if (companyName == "Razorpay") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Specialist",
      "Automation Tester","QA Analyst","Business Analyst","Technical Lead","Product Manager","UI Developer","UX Designer","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Razorpay");
   return jobs;
}

   else if (companyName == "CRED") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Engineer","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in CRED");
   return jobs;
}

   else if (companyName == "Meesho") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Specialist",
      "Automation Tester","QA Analyst","Business Analyst","Technical Lead","Product Manager","UI Developer","UX Designer","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Meesho");
   return jobs;
}

   else if (companyName == "InMobi") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","System Architect","UI Developer","UX Designer","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in InMobi");
   return jobs;
}

   else if (companyName == "Red Hat") {
   String[] jobs = {"Linux Engineer","Cloud Engineer","DevOps Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Automation Engineer","QA Tester","Cyber Security Analyst",
      "Data Engineer","AI Engineer","ML Engineer","Technical Consultant","System Administrator","Infrastructure Architect","Business Analyst","Research Engineer","Product Manager","Program Manager"
   };
   System.out.println("Jobs found in Red Hat");
   return jobs;
}

   else if (companyName == "Atlassian") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Specialist","Data Engineer","AI Engineer","ML Engineer","Security Engineer",
      "Automation Tester","QA Engineer","Business Analyst","Product Manager","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Atlassian");
   return jobs;
}

   else if (companyName == "Snowflake") {
   String[] jobs = {"Cloud Engineer","Data Engineer","Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","DevOps Engineer","Security Analyst","AI Engineer","ML Engineer",
      "Automation Tester","QA Analyst","Technical Consultant","System Architect","Business Analyst","Infrastructure Engineer","Research Engineer","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Snowflake");
   return jobs;
}

   else if (companyName == "Stripe") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Specialist",
      "Automation Engineer","QA Tester","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Stripe");
   return jobs;
}

   else if (companyName == "Airbnb") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Mobile Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist",
      "Security Analyst","Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Program Manager"
   };
   System.out.println("Jobs found in Airbnb");
   return jobs;
}

   else if (companyName == "Twitter") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Engineer","Cyber Security Analyst",
      "Automation Tester","QA Analyst","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Twitter");
   return jobs;
}

   else if (companyName == "Meta") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","AR/VR Developer","AI Engineer","ML Engineer","Cloud Engineer","Data Scientist","DevOps Engineer",
      "Cyber Security Specialist","Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","UI Developer","Research Scientist","Technical Lead","Program Manager"
   };
   System.out.println("Jobs found in Meta");
   return jobs;
}
   
   else if (companyName == "LinkedIn") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer",
      "UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in LinkedIn");
   return jobs;
}

   else if (companyName == "Dropbox") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Security Analyst",
      "Automation Tester","QA Analyst","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Dropbox");
   return jobs;
}

   else if (companyName == "Slack") {
   String[] jobs = {"Software Developer","Backend Engineer","Frontend Engineer","Full Stack Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Specialist","Cyber Security Analyst",
      "Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Slack");
   return jobs;
}

   else if (companyName == "Cisco Meraki") {
   String[] jobs = {"Network Engineer","Cloud Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","DevOps Engineer","Security Analyst","Data Engineer","AI Engineer",
      "Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","Technical Lead","Infrastructure Engineer","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Cisco Meraki");
   return jobs;
}

   else if (companyName == "Intuit") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Scientist","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Analyst",
      "Automation Tester","QA Analyst","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Intuit");
   return jobs;
}

   else if (companyName == "Palo Alto Networks") {
   String[] jobs = {"Cyber Security Engineer","Cloud Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","DevOps Engineer","Security Analyst","Data Engineer","AI Engineer",
      "Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","Technical Lead","Infrastructure Engineer","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Palo Alto Networks");
   return jobs;
}

   else if (companyName == "Splunk") {
   String[] jobs = {"Data Engineer","Cloud Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","DevOps Engineer","Security Analyst","AI Engineer","ML Engineer",
      "Automation Tester","QA Analyst","Product Manager","Business Analyst","UX Designer","Technical Lead","Infrastructure Engineer","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Splunk");
   return jobs;
}

   else if (companyName == "Autodesk") {
   String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Security Analyst",
      "Automation Tester","QA Engineer","Product Manager","Business Analyst","UX Designer","UI Developer","Technical Lead","Research Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Autodesk");
   return jobs;
}

   else if (companyName == "Siemens Healthineers") {
   String[] jobs = {"Biomedical Engineer","Software Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","DevOps Engineer","Cyber Security Analyst","System Administrator","Automation Engineer",
      "QA Tester","Business Analyst","Technical Consultant","Backend Developer","Frontend Developer","Infrastructure Engineer","Research Scientist","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Siemens Healthineers");
   return jobs;
}

   else if (companyName == "GE") {
   String[] jobs = {"Mechanical Engineer","Electrical Engineer","Software Developer","Embedded Engineer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","Cyber Security Specialist","DevOps Engineer",
      "Automation Tester","QA Engineer","Business Analyst","Technical Lead","System Architect","Research Engineer","Product Manager","Infrastructure Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in GE");
   return jobs;
}

   else if (companyName == "Honeywell") {
   String[] jobs = {"Embedded Engineer","Mechanical Engineer","Electrical Engineer","Software Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","Cyber Security Analyst","DevOps Engineer",
      "Automation Tester","QA Analyst","Business Consultant","Technical Lead","System Architect","Research Engineer","Product Manager","Infrastructure Engineer","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Honeywell");
   return jobs;
}

   else if (companyName == "Philips") {
   String[] jobs = {"Biomedical Engineer","Software Engineer","Cloud Engineer","Data Engineer","AI Specialist","ML Engineer","DevOps Engineer","Cyber Security Analyst","Backend Developer","Frontend Developer",
      "Automation Tester","QA Engineer","Business Analyst","Technical Consultant","Product Manager","Research Engineer","Infrastructure Engineer","Support Engineer","System Architect","Program Manager"
   };
   System.out.println("Jobs found in Philips");
   return jobs;
}

   else if (companyName == "Ericsson") {
   String[] jobs = {"Telecom Engineer","Network Engineer","Software Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer","Cyber Security Specialist","DevOps Engineer","Automation Tester",
      "QA Engineer","Business Analyst","Technical Consultant","Backend Developer","Frontend Developer","Infrastructure Engineer","Research Engineer","Product Manager","Support Engineer","Program Manager"
   };
   System.out.println("Jobs found in Ericsson");
   return jobs;
}

   else if(companyName.equals("Dunzo")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","iOS Developer","QA Engineer","Automation Tester","Cloud Engineer",
	    "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","Operations Manager","Technical Support Engineer","AI Engineer","ML Engineer","Security Engineer","HR Executive"
    };
	System.out.println("Jobs found in Dunzo");
    return jobs;
}

    else if(companyName.equals("Urban Company")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
	    "Data Analyst","Data Engineer","Product Manager","Business Analyst","Operations Executive","Technical Support Engineer","AI Engineer","ML Engineer","Security Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Urban Company");
    return jobs;
}

    else if(companyName.equals("Groww")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","iOS Developer","QA Engineer","Automation Tester","Cloud Engineer",
	    "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer","Compliance Analyst","HR Executive"
    };
	System.out.println("Jobs found in Groww");
    return jobs;
}

    else if(companyName.equals("UpGrad")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Product Manager","Business Analyst","Content Developer","Technical Support Engineer","AI Engineer","ML Engineer","Security Engineer",
		"Marketing Executive","Student Counselor","HR Executive"
    };
	System.out.println("Jobs found in UpGrad");
    return jobs;
}

    else if(companyName.equals("Unacademy")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","Security Engineer","Content Strategist",
        "Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Unacademy");
    return jobs;
}

    else if(companyName.equals("RazorThink")) {
    String[] jobs = {"AI Engineer","Machine Learning Engineer","Data Scientist","Data Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer",
        "Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Product Manager","Security Engineer","Technical Support Engineer","Platform Engineer",
		"Research Engineer","AI Consultant","Project Manager"
    };
	System.out.println("Jobs found in RazorThink");
    return jobs;
}

    else if(companyName.equals("Chargebee")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Engineer","Security Engineer","Product Manager","Business Analyst","Customer Support Engineer","Technical Writer","AI Engineer","ML Engineer",
		"Platform Engineer","Site Reliability Engineer","HR Executive"
    };
	System.out.println("Jobs found in Chargebee");
    return jobs;
}

    else if(companyName.equals("Freshworks")) {
    String[] jobs = {"Software Engineer","Frontend Developer","Backend Developer","Full Stack Developer","Product Engineer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Technical Support Engineer","Customer Success Executive","Business Analyst","UX Designer",
		"Mobile App Developer","AI Engineer","ML Engineer","Product Manager"
    };
	System.out.println("Jobs found in Freshworks");
    return jobs;
}

    else if(companyName.equals("GitHub")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","DevOps Engineer","Cloud Engineer","Security Engineer","QA Engineer","Automation Tester",
        "Data Analyst","Data Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer","Platform Engineer","Site Reliability Engineer",
		"Open Source Engineer","Project Lead"
    };
	System.out.println("Jobs found in GitHub");
    return jobs;
}

    else if(companyName.equals("Practo")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","Operations Executive",
        "Customer Support Executive","HR Executive"
    };
	System.out.println("Jobs found in Practo");
    return jobs;
}

    else if(companyName.equals("PolicyBazaar")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","Insurance Advisor","Marketing Executive",
        "Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in PolicyBazaar");
    return jobs;
}

    else if(companyName.equals("NoBroker")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","Operations Manager",
        "Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in NoBroker");
    return jobs;
}

    else if(companyName.equals("Lenskart")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Operations Manager","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in Lenskart");
    return jobs;
}

    else if(companyName.equals("Delhivery")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Engineer","Operations Manager","Supply Chain Analyst","Business Analyst","AI Engineer","ML Engineer","Security Engineer","Technical Support Engineer",
        "Logistics Coordinator","Project Manager","HR Executive"
    };
	System.out.println("Jobs found in Delhivery");
    return jobs;
}

    else if(companyName.equals("Udaan")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Operations Executive","Technical Support Engineer",
        "Sales Executive","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Udaan");
    return jobs;
}

    else if(companyName.equals("Ather Energy")) {
    String[] jobs = {"Embedded Engineer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","AI Engineer","ML Engineer","Hardware Engineer","Battery Engineer","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Project Manager","HR Executive"
    };
	System.out.println("Jobs found in Ather Energy");
    return jobs;
}

    else if(companyName.equals("Zerodha")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "Compliance Analyst","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Zerodha");
    return jobs;
}

    else if(companyName.equals("Nykaa")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Operations Manager","Marketing Executive",
        "Technical Support Engineer","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in Nykaa");
    return jobs;
}

    else if(companyName.equals("Byju's")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Content Developer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer","Marketing Executive",
        "Sales Executive","Student Counselor","HR Executive"
    };
	System.out.println("Jobs found in Byju's");
    return jobs;
}

    else if(companyName.equals("BigBasket")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Supply Chain Analyst","Operations Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in BigBasket");
    return jobs;
}

    else if(companyName.equals("Boat")) {
    String[] jobs = {"Embedded Engineer","Hardware Engineer","Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester",
        "Cloud Engineer","DevOps Engineer","Data Analyst","Product Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in Boat");
    return jobs;
}

    else if(companyName.equals("CarDekho")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Operations Executive","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in CarDekho");
    return jobs;
}

    else if(companyName.equals("Myntra")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","iOS Developer","QA Engineer","Automation Tester",
        "Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Myntra");
    return jobs;
}

    else if(companyName.equals("Snapdeal")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer","Operations Manager","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in Snapdeal");
    return jobs;
}

    else if(companyName.equals("MakeMyTrip")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","iOS Developer","QA Engineer","Automation Tester",
        "Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist","Product Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in MakeMyTrip");
    return jobs;
}

    else if(companyName.equals("ClearTax")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Security Engineer","Technical Support Engineer","Compliance Analyst",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in ClearTax");
    return jobs;
}

    else if(companyName.equals("Slice")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Slice");
    return jobs;
}

    else if(companyName.equals("Navi")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Compliance Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Navi");
    return jobs;
}

    else if(companyName.equals("PharmEasy")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Operations Manager",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in PharmEasy");
    return jobs;
}

    else if(companyName.equals("HealthifyMe")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Nutrition Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in HealthifyMe");
    return jobs;
}

    else if(companyName.equals("CultFit")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Fitness Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Manager","HR Executive"
    };
	System.out.println("Jobs found in CultFit");
    return jobs;
}

    else if(companyName.equals("ShareChat")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Content Moderator","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in ShareChat");
    return jobs;
}

    else if(companyName.equals("MPL")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Game Developer","Product Manager","Business Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in MPL");
    return jobs;
}

    else if(companyName.equals("PayU")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Compliance Analyst","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in PayU");
    return jobs;
}

    else if(companyName.equals("Pine Labs")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Operations Executive","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Pine Labs");
    return jobs;
}

    else if(companyName.equals("Zeta")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Compliance Analyst","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Zeta");
    return jobs;
}

    else if(companyName.equals("Open Financial")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer","Compliance Analyst",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Open Financial");
    return jobs;
}

    else if(companyName.equals("KreditBee")) {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer","Compliance Analyst",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in KreditBee");
    return jobs;
}

    else if(companyName.equals("Khatabook")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Khatabook");
    return jobs;
}

    else if(companyName.equals("Rapido")) {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Rapido");
    return jobs;
}

    else if(companyName.equals("BlueStone")) {
    String[] jobs = {
        "Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Security Engineer","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in BlueStone");
    return jobs;
}

    else if(companyName=="Mamaearth") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Operations Manager","Technical Support Engineer",
        "Marketing Executive","Sales Executive","Security Engineer","HR Executive"
    };
	System.out.println("Jobs found in Mamaearth");
    return jobs;
}

    else if(companyName=="Zepto") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Zepto");
    return jobs;
}

    else if(companyName=="Blinkit") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Operations Manager","Technical Support Engineer",
        "Marketing Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in Blinkit");
    return jobs;
}

    else if(companyName=="FirstCry") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Operations Executive","Technical Support Engineer",
        "Marketing Executive","Sales Executive","Security Engineer","HR Executive"
    };
	System.out.println("Jobs found in FirstCry");
    return jobs;
}

    else if(companyName=="Uniphore") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","AI Engineer","ML Engineer","Speech Engineer","Product Manager","Business Analyst","Technical Support Engineer","Security Engineer",
        "Marketing Executive","Operations Executive","HR Executive"
    };
	System.out.println("Jobs found in Uniphore");
    return jobs;
}

    else if(companyName=="Cogoport") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","AI Engineer","ML Engineer","Product Manager","Business Analyst","Logistics Analyst","Technical Support Engineer",
        "Marketing Executive","Operations Executive","Security Engineer","HR Executive"
    };
	System.out.println("Jobs found in Cogoport");
    return jobs;
}

    else if(companyName=="LeadSquared") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
        "Data Analyst","AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","Technical Support Engineer","CRM Consultant",
        "Marketing Executive","Operations Executive","Sales Executive","HR Executive"
    };
	System.out.println("Jobs found in LeadSquared");
    return jobs;
}

    else if(companyName=="Open Money") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","QA Engineer","Automation Tester","Cloud Engineer",
        "DevOps Engineer","Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Compliance Analyst",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Open Money");
    return jobs;
}

    else if(companyName=="Cleartrip") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Android Developer","iOS Developer","QA Engineer","Automation Tester",
        "Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist","AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst",
        "Technical Support Engineer","Marketing Executive","HR Executive"
    };
	System.out.println("Jobs found in Cleartrip");
    return jobs;
}

    else if(companyName=="BrowserStack India") {
    String[] jobs = {"Software Developer","Automation Engineer","QA Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer","Site Reliability Engineer",
        "Platform Engineer","Project Manager","HR Executive"
    };
	System.out.println("Jobs found in BrowserStack India");
    return jobs;
	
}

    else if(companyName=="BrowserStack India") {
    String[] jobs = {"Software Developer","Automation Engineer","QA Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
        "Data Analyst","Data Scientist","Security Engineer","AI Engineer","ML Engineer","Product Manager","Business Analyst","Technical Support Engineer","Site Reliability Engineer",
        "Platform Engineer","Project Manager","HR Executive"
    };
    System.out.println("Jobs found in BrowserStack India");
    return jobs;
}

else if(companyName=="Zoox") {
    String[] jobs = {"Autonomous Vehicle Engineer","Software Developer","AI Engineer","ML Engineer","Robotics Engineer","Data Scientist","Backend Developer","Frontend Developer",
        "Full Stack Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Product Manager","Business Analyst","Safety Engineer","Electrical Engineer",
        "Mechanical Engineer","System Architect","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Zoox");
    return jobs;
}

else if(companyName=="Coinbase") {
    String[] jobs = {"Blockchain Developer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","AI Engineer","ML Engineer","Technical Support Engineer",
        "Compliance Analyst","Finance Analyst","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Coinbase");
    return jobs;
}

else if(companyName=="Robinhood") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "Security Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "Finance Analyst","Compliance Analyst","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Robinhood");
    return jobs;
}

else if(companyName=="Palantir") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Solutions Engineer","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Palantir");
    return jobs;
}

else if(companyName=="Spotify") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Research Scientist","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Spotify");
    return jobs;
}

else if(companyName=="Slack") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Solutions Engineer"
    };
    System.out.println("Jobs found in Slack");
    return jobs;
}

else if(companyName=="Dropbox") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Site Reliability Engineer"
    };
    System.out.println("Jobs found in Dropbox");
    return jobs;
}

else if(companyName=="Shopify") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Security Engineer","Product Manager","Business Analyst","AI Engineer","ML Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","E-commerce Consultant"
    };
    System.out.println("Jobs found in Shopify");
    return jobs;
}

else if(companyName=="TikTok") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","Content Analyst","UI/UX Designer"
    };
    System.out.println("Jobs found in TikTok");
    return jobs;
}

else if(companyName=="Epic Games") {
    String[] jobs = {"Game Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "Game Designer","System Architect","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Epic Games");
    return jobs;
}

else if(companyName=="Unity Technologies") {
    String[] jobs = {"Game Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "Game Designer","System Architect","Project Manager","UI/UX Designer"
    };
    System.out.println("Jobs found in Unity Technologies");
    return jobs;
}

else if(companyName=="Zoom") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Solutions Engineer"
    };
    System.out.println("Jobs found in Zoom");
    return jobs;
}

else if(companyName=="Pinterest") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Content Strategist"
    };
    System.out.println("Jobs found in Pinterest");
    return jobs;
}

else if(companyName=="Twitter") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Social Media Analyst"
    };
    System.out.println("Jobs found in Twitter");
    return jobs;
}

    else if(companyName=="Stripe India") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Payment Specialist"
    };
    System.out.println("Jobs found in Stripe India");
    return jobs;
}

else if(companyName=="Airbnb India") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Mobile Developer","Cloud Engineer","Data Engineer","AI Engineer","ML Engineer",
        "DevOps Specialist","Security Analyst","Automation Tester","QA Engineer","Product Manager","Business Analyst","UI/UX Designer","Technical Lead","Research Engineer",
        "Project Manager","Community Manager"
    };
    System.out.println("Jobs found in Airbnb India");
    return jobs;
}

else if(companyName=="Intuit") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Finance Specialist"
    };
    System.out.println("Jobs found in Intuit");
    return jobs;
}

else if(companyName=="Palantir India") {
    String[] jobs = {"Software Developer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","Solutions Engineer","UI/UX Designer"
    };
    System.out.println("Jobs found in Palantir India");
    return jobs;
}

else if(companyName=="Nuro") {
    String[] jobs = {"Autonomous Vehicle Engineer","Software Developer","Robotics Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
        "DevOps Engineer","Data Analyst","AI Engineer","ML Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "Electrical Engineer","Mechanical Engineer","System Architect","Project Manager"
    };
    System.out.println("Jobs found in Nuro");
    return jobs;
}

else if(companyName=="Snowflake India") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Platform Engineer"
    };
    System.out.println("Jobs found in Snowflake India");
    return jobs;
}

else if(companyName=="Reddit") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Community Manager"
    };
    System.out.println("Jobs found in Reddit");
    return jobs;
}

else if(companyName=="Nextdoor") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Community Manager"
    };
    System.out.println("Jobs found in Nextdoor");
    return jobs;
}

else if(companyName=="Khan Academy") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","Content Developer",
        "System Architect","Project Manager","UI/UX Designer","Education Specialist"
    };
    System.out.println("Jobs found in Khan Academy");
    return jobs;
}

else if(companyName=="Coursera") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","Content Developer",
        "System Architect","Project Manager","UI/UX Designer","Learning Specialist"
    };
    System.out.println("Jobs found in Coursera");
    return jobs;
}

else if(companyName=="Udemy") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","Content Developer",
        "System Architect","Project Manager","UI/UX Designer","Education Specialist"
    };
    System.out.println("Jobs found in Udemy");
    return jobs;
}

else if(companyName=="Epic") {
    String[] jobs = {"Game Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","Game Designer",
        "System Architect","Project Manager","UI/UX Designer","Simulation Engineer"
    };
    System.out.println("Jobs found in Epic");
    return jobs;
}

else if(companyName=="Asana") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","System Architect",
        "Project Manager","UI/UX Designer","Solutions Engineer","Platform Engineer"
    };
    System.out.println("Jobs found in Asana");
    return jobs;
}

else if(companyName=="Figma") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","System Architect",
        "Project Manager","UI/UX Designer","Design Engineer","Platform Engineer"
    };
    System.out.println("Jobs found in Figma");
    return jobs;
}

else if(companyName=="Canva") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","System Architect",
        "Project Manager","UI/UX Designer","Design Engineer","Creative Specialist"
    };
    System.out.println("Jobs found in Canva");
    return jobs;
}

else if(companyName=="Notion Labs") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","System Architect",
        "Project Manager","UI/UX Designer","Solutions Engineer","Platform Engineer"
    };
    System.out.println("Jobs found in Notion Labs");
    return jobs;
}

else if(companyName=="Miro") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "QA Engineer","Automation Engineer","Product Manager","Business Analyst","Technical Support Engineer","AI Engineer","ML Engineer","System Architect",
        "Project Manager","UI/UX Designer","Solutions Engineer","Platform Engineer"
    };
    System.out.println("Jobs found in Miro");
    return jobs;
}

else if(companyName=="Datadog") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Site Reliability Engineer"
    };
    System.out.println("Jobs found in Datadog");
    return jobs;
}

else if(companyName=="Splunk") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Platform Engineer"
    };
    System.out.println("Jobs found in Splunk");
    return jobs;
}

else if(companyName=="Okta") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Identity Management Specialist"
    };
    System.out.println("Jobs found in Okta");
    return jobs;
}

else if(companyName=="Twilio") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Communication Engineer"
    };
    System.out.println("Jobs found in Twilio");
    return jobs;
}

else if(companyName=="PagerDuty") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Incident Response Engineer"
    };
    System.out.println("Jobs found in PagerDuty");
    return jobs;
}

else if(companyName=="Snow Software") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Platform Engineer"
    };
    System.out.println("Jobs found in Snow Software");
    return jobs;
}

else if(companyName=="UiPath") {
    String[] jobs = {"RPA Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Process Analyst"
    };
    System.out.println("Jobs found in UiPath");
    return jobs;
}

else if(companyName=="Automation Anywhere") {
    String[] jobs = {"RPA Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Process Analyst"
    };
    System.out.println("Jobs found in Automation Anywhere");
    return jobs;
}

else if(companyName=="Blue Prism") {
    String[] jobs = {"RPA Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Process Analyst"
    };
    System.out.println("Jobs found in Blue Prism");
    return jobs;
}

else if(companyName=="Appian") {
    String[] jobs = {"RPA Developer","Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Process Analyst"
    };
    System.out.println("Jobs found in Appian");
    return jobs;
}

else if(companyName=="Workday") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","HR Specialist"
    };
    System.out.println("Jobs found in Workday");
    return jobs;
}

else if(companyName=="ServiceTitan") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Operations Specialist"
    };
    System.out.println("Jobs found in ServiceTitan");
    return jobs;
}

else if(companyName=="Freshdesk") {
    String[] jobs = {"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer","Data Analyst","Data Scientist",
        "AI Engineer","ML Engineer","Security Engineer","Product Manager","Business Analyst","QA Engineer","Automation Engineer","Technical Support Engineer",
        "System Architect","Project Manager","UI/UX Designer","Customer Success Manager"
    };
    System.out.println("Jobs found in Freshdesk");
    return jobs;
}

    else {
            System.out.println("Company not found");
            return null;
        }
    }

    public static void displayJobNames(String[] jobs) {

        System.out.println("--------------------------------");

        if (jobs != null) {

            for (String job : jobs) {
                System.out.println(job);
            }

        } else {
            System.out.println("No jobs available");
        }

        System.out.println("--------------------------------");
    }
}