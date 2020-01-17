package MyFirstPackage;

public class LGA {

    public static void main(String[] args) {

        College lga = new College();

        lga.building = 2;
        lga.student = 1200;
        lga.semester = 3;



        System.out.println("LGA have " + lga.building + " building");
        System.out.println("LGA have " + lga.student + " students");
        System.out.println("LGA have " + lga.semester + " semester");

        lga.science("LGA");
        lga.international("LGA");
        lga.spring("LGA");

    }
}
