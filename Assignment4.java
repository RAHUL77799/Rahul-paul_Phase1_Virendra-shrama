import java.util.Scanner;

public class Assignment4 {
    Assignment1  files;
    private static final String SECONDARY_PROMPT =
            "   \n==========Options:========== \n"+
                    "   a -> Add file\n"+
                    "   b -> Delete file\n"+
                    "   c -> Search file\n"+
                    "   d -> Return";

    public Assignment4() {
        this.files = new Assignment1 (Assignment2 .PATHNAME);
    }

    void showAssignment4() {
        System.out.println(SECONDARY_PROMPT);
        try{
            Scanner scanner = new Scanner(System.in);
            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
            char option = input[0];

            switch (option){
                case 'a' : {
                    System.out.println("   File Add");
                    files.addFile(files.takeFilenameInput());
                    showAssignment4();
                }
                case 'b' : {
                    System.out.println("   File Delete");
                    files.deleteFile(files.takeFilenameInput());
                    showAssignment4();
                }
                case 'c' : {
                    System.out.println("  File Search");
                    files.searchFile(files.takeFilenameInput());
                    showAssignment4();
                }
                case 'd' : {
                    System.out.println("    Return to Main menu");
                    new  Assignment3 (Assignment2.PATHNAME).showMenu();
                }
                default : {
                    System.out.println("   Choose any number a,b,c,d");
                    showAssignment4();
                }
            }
        }
        catch (Exception e){
            System.out.println("  Choose any number a,b,c,d");
            showAssignment4();
        }
    }

}
