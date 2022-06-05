package lesson01;

public class Team {
    private String nameTeam;
    private TeamMember[] membersTeam;

    public void info(){
        for (TeamMember teamMember : membersTeam){
            System.out.println(teamMember.getName() + " максимальное препятсвие: " + teamMember.getMaxCourse());
        }
    }

    public void showResult(){
        for (TeamMember teamMember : membersTeam) {
            if (teamMember.isStatus()) {
                System.out.println(teamMember.getName() + " команды " + nameTeam + " прошёл полосу препятствий.");
            } else {
                System.out.println(teamMember.getName() + " команды " + nameTeam + " не прошёл полосу препятствий.");
            }
        }
    }

    public Team(String nameTeam, TeamMember[] membersTeam) {
        this.nameTeam = nameTeam;
        this.membersTeam = membersTeam;
    }

    public TeamMember[] getMembersTeam() {
        return membersTeam;
    }
}
