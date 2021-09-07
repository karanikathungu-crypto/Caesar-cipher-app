import java.util.Scanner;


public class Encrypt {

    private String userText;
    private int key;
    private char c;

    public Encrypt(int key, String userText){
        this.userText = userText;
        this.key = key;
    }
    public String getUserText(){
        return userText;
    }
    public int getKey(){
        return key;
    }


    public static String encryption(String userText, int key){
        StringBuffer encrypt = new StringBuffer();

        char [] chars = userText.toCharArray();
        for(char c: chars){
            c+=key;

           System.out.println(c);
           encrypt.append(c);

        }
        return encrypt.toString();

    }
}
