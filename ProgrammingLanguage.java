class ProgrammingLanguage {

    int languageId;
    String languageName;
    Syntax syntax;

    ProgrammingLanguage(int languageId, String languageName, Syntax syntax) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.syntax = syntax;
    }

    void displayDetails() {
        System.out.println(languageId);
        System.out.println(languageName);
        syntax.displayDetails();
    }
}