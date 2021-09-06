public class Decrypt {
    public static void main(String[] args) {
        String text = "Kh|/#krz*v#lw#kdqjlqjB";
        int key = 3;
        char [] chars = text.toCharArray();
        for(char c: chars ){
            c -= key;
            System.out.print(c);

        }


    }
}
