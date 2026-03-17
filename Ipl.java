class Ipl {

    int teamId;
    String teamName;
    Player player;

    Ipl(int teamId, String teamName, Player player) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.player = player;
    }

    void displayDetails() {
        System.out.println(teamId);
        System.out.println(teamName);
        player.displayDetails();
    }
}