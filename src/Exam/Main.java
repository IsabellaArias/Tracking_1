package Exam;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Knowledge_Review exam=new Knowledge_Review();

        System.out.println("SHARED IS AN ANDROID APPLICATION THAT SERVES TO ACCESS YOUR ACCOUNT, INCLUDING PHOTOS, MUSIC, ETC?");
        exam.question_1=scanner.nextBoolean();

        System.out.println("IS OPERA MINI BROWSER AN APP THAT GIVES YOU A FAST BROWSING EXPERIENCE?");
        exam.question_2=scanner.nextBoolean();

        System.out.println("IS NETFLIX AN APPLICATION TO DOWNLOAD MUSIC?");
        exam.question_3=scanner.nextBoolean();

        System.out.println("CAN FREE SOFTWARE BE RUN, COPIED, OR DISTRIBUTED?");
        exam.question_4=scanner.nextBoolean();

        System.out.println("IS TRAF-O-DATA FORMED BY BILL GATES, AND PAUL ALLEN?");
        exam.question_5=scanner.nextBoolean();

        exam.exam();
    }
}
