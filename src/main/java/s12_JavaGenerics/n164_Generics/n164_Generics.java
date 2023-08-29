package s12_JavaGenerics.n164_Generics;

record BaseballPlayer(String name, String position) {
}

public class n164_Generics {
    public static void main(String[] args) {

        n164_BaseballTeam phillies = new n164_BaseballTeam("Philadelphia Phillies");
        n164_BaseballTeam astros = new n164_BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
    }

    public static void scoreResult(n164_BaseballTeam team1, int t1_score,
                                   n164_BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
