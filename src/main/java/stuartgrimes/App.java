package stuartgrimes;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private Scanner someinput;

    public static void main( String[] args )
    {
        //see commanline args beeing sent in
        seeCommandLineInput( args);
        //to instantiate an instance of App
        actionCommandLineInput(args);
    }

    //Constructor
    public App(){
        this.someinput = new Scanner(System.in);
        System.out.println("\n...soon we will do something here.");
        this.someinput.nextLine();
        //close program without error
        System.exit(0);

    }

    /**
     *
     */
    public static void actionCommandLineInput(String[] args){
        App myApp = new App();
    }
    /**
     * View the arguments presented at the command line
     * @param args
     */
    private static void seeCommandLineInput(String[] args){
        if (args.length == 0){
            System.out.println("No command line args sent in...");
        }else{
            //display the command line args entered.
            for (int i =0; i<args.length; i++){
                System.out.println(args[i]);
            }
        }
    }
}
