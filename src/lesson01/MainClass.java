package lesson01;

public class MainClass {
    public static void main(String[] args) {
        Course course = new Course(10, 10);
        course.infoCourse();
        TeamMember[] teamMembers = new TeamMember[4];
        teamMembers[0] = new TeamMember("Участник 1", 7);
        teamMembers[1] = new TeamMember("Участник 2", 9);
        teamMembers[2] = new TeamMember("Участник 3", 10);
        teamMembers[3] = new TeamMember("Участник 4", 5);
        Team team = new Team("А шо делать?", teamMembers);
        team.info();
        course.doIt(team);
        team.showResult();
    }
}
