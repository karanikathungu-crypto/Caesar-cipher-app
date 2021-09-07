 public class Decrypt {
     private String userText;
     private int key;
     private char c;

     public Decrypt(String userText, int key) {
         this.userText = userText;
         this.key = key;
     }

     public int getKey() {
         return key;
     }

     public String getUserText() {
         return userText;
     }

     public static String decryption(String userText, int key) {
         StringBuffer output= new StringBuffer();
         char[] chars = userText.toCharArray();
         for (char c : chars) {
             c -= key;
             System.out.println(c);
             output.append(c);



         }
         return output.toString();
     }
 }



