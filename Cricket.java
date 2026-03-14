class Cricket {

String playerName;
int playerNumber;
String team;
String role;
int matches;
int runs;
int wickets;
double strikeRate;
double average;
int centuries;
int halfCenturies;
int catches;
int runOuts;
String country;
int age;
String battingStyle;
String bowlingStyle;
int jerseyNumber;
String stadium;
int ranking;

Cricket(){
}

Cricket(String playerName,int playerNumber,String team,String role,
int matches,int runs,int wickets,double strikeRate,double average,
int centuries,int halfCenturies,int catches,int runOuts,String country,
int age,String battingStyle,String bowlingStyle,int jerseyNumber,
String stadium,int ranking){

this.playerName = playerName;
this.playerNumber = playerNumber;
this.team = team;
this.role = role;
this.matches = matches;
this.runs = runs;
this.wickets = wickets;
this.strikeRate = strikeRate;
this.average = average;
this.centuries = centuries;
this.halfCenturies = halfCenturies;
this.catches = catches;
this.runOuts = runOuts;
this.country = country;
this.age = age;
this.battingStyle = battingStyle;
this.bowlingStyle = bowlingStyle;
this.jerseyNumber = jerseyNumber;
this.stadium = stadium;
this.ranking = ranking;

}

}