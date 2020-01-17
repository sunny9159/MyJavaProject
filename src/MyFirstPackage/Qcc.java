package MyFirstPackage;

import java.util.concurrent.Callable;

public class Qcc {

    public static void main(String[] args) {

        College qcc = new College();



        System.out.println("QCC have " + qcc.building + " building");
        System.out.println("QCC have " + qcc.student + " students");
        System.out.println("QCC have " + qcc.semester + " semester");

        qcc.science("QCC");
        qcc.international("QCC");
        qcc.spring("QCC");


    }
}
