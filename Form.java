class Form {

    int formId;
    String formName;
    String origin;

    Form(int formId, String formName, String origin) {
        this.formId = formId;
        this.formName = formName;
        this.origin = origin;
    }

    void displayDetails() {
        System.out.println(formId);
        System.out.println(formName);
        System.out.println(origin);
    }
}