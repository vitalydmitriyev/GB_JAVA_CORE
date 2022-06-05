package lesson01;

import java.util.Random;

public class Course {
    private int[] arrayCourse;

    private void genArrayCourse(int maxArrayValue, int[] arrayCourse){
        Random rand = new Random();
        for ( int i = 0; i < arrayCourse.length; i++){
            this.arrayCourse[i] = rand.nextInt(maxArrayValue) + 1;
        }
    }

    public Course(int maxArrayValue, int lenghtArray) {
        this.arrayCourse = new int[lenghtArray];
        genArrayCourse(maxArrayValue, this.arrayCourse);
    }

    public void infoCourse(){
        System.out.println("Полоса препятствий: ");
        for ( int i = 0; i < this.arrayCourse.length; i++){
            System.out.print(this.arrayCourse[i] + " ");
        }
        System.out.println();
    }

    public void doIt(Team team){
        for (TeamMember teamMember : team.getMembersTeam()){
            boolean status = true;
            for( int i = 0; i < arrayCourse.length - 1; i++) {
                if (teamMember.getMaxCourse() < arrayCourse[i]){
                    status = false;
                    break;
                }
            }
            if (status){
                teamMember.setStatus(true);
            }
        }
    }
}
