class NewsPaper {

    int paperId;
    String paperName;
    Article article;

    NewsPaper(int paperId, String paperName, Article article) {
        this.paperId = paperId;
        this.paperName = paperName;
        this.article = article;
    }

    void displayDetails() {
        System.out.println(paperId);
        System.out.println(paperName);
        article.displayDetails();
    }
}