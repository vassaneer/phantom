package phantomnetbean.Client;

import java.util.Scanner;

public class getInput{
    private Scanner input = new Scanner(System.in);
    private int a ;
    private String s;
    public getInput(){
    }
    public int getA(){
        a = input.nextInt();
        return a;
    }
    public String getS(){
        s = input.nextLine();
        return s;
    }
}
