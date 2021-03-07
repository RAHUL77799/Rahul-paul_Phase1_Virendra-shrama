
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {
    Assignment1  files;

    private static final String PROMPT  =
                 "\n=========== MENU :============\n"+
                    "1.List files in directory\n"+
                    "2.Add, Delete or Search\n"+
                    "3. Exit Program";

    public Assignment3 (String pathname) {
        files = new Assignment1 (pathname);
    }

    // PRIMARY MENU
    void showMenu() {
        System.out.println(PROMPT);

        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option){
                case 1 : {
                    files.displayFilesList();
                    showMenu();
                }
                case 2 : {
                    new Assignment4 ().showAssignment4 ();
                }
                case 3 : {

                    System.exit(0);
                }
                default : {
                    showMenu();
                }
            }
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2 or 3\n");
            showMenu();
        }
    }
}