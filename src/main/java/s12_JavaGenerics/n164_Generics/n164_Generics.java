package s12_JavaGenerics.n164_Generics;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

record VolleyballPlayer(String name, String position) implements Player {
}

public class n164_Generics {
    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        n164_BaseballTeam phillies1 = new n164_BaseballTeam("Philadelphia Phillies");
        n164_BaseballTeam astros1 = new n164_BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        n164_SportsTeam phillies2 = new n164_SportsTeam("Philadelphia Phillies");
        n164_SportsTeam astros2 = new n164_SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);


        n164_Team<BaseballPlayer, Affiliation> phillies = new n164_Team<>("Philadelphia Phillies", philly);
        n164_Team<BaseballPlayer, Affiliation> astros = new n164_Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        n164_SportsTeam afc1 = new n164_SportsTeam("Adelaide Crows");
        n164_Team<FootballPlayer, String> afc = new n164_Team<>("Adelaide Crows",
                "City of Adelaide, South Australia, in AU");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        n164_Team<VolleyballPlayer, Affiliation> adelaide = new n164_Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new n164_Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

//        n164_Team<Integer> melbourneVB = new n164_Team<>("Melbourne Vipers");
    }

    public static void scoreResult(n164_BaseballTeam team1, int t1_score,
                                   n164_BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(n164_SportsTeam team1, int t1_score,
                                   n164_SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(n164_Team team1, int t1_score,
                                   n164_Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
