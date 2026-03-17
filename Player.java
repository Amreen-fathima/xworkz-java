class Player {

    int playerId;
    String playerName;
    String role;

    Player(int playerId, String playerName, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.role = role;
    }

    void displayDetails() {
        System.out.println(playerId);
        System.out.println(playerName);
        System.out.println(role);
    }
}