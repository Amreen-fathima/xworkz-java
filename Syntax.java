class Syntax {

    int syntaxId;
    String rule;
    String example;

    Syntax(int syntaxId, String rule, String example) {
        this.syntaxId = syntaxId;
        this.rule = rule;
        this.example = example;
    }

    void displayDetails() {
        System.out.println(syntaxId);
        System.out.println(rule);
        System.out.println(example);
    }
}