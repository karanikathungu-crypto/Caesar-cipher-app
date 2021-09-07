class Decrypt {
    private String userText;
    private int key;
    private String decryptedText;

    public Decrypt(String userText, int key){
        this.userText = userText;
        this.key = key;


    }
   /* public static void main(String[] args) {
        String text = "Kh|/#krz*v#lw#kdqjlqjB";
        int key = 3;
        char [] chars = text.toCharArray();
        for(char c: chars ){
            c -= key;
            System.out.print(c);

        }


    }*/
}
