package lesson01;

public class TeamMember {
    private String name;
    private int maxCourse;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getMaxCourse() {
        return maxCourse;
    }

    public TeamMember(String name, int maxCourse) {
        this.name = name;
        this.maxCourse = maxCourse;
        this.status = false;
    }
}
