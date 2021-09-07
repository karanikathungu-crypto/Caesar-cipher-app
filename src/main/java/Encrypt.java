 class Encrypt {

    private String userText;
    private int key;
    private String encryptedText;

    public Encrypt(String userText, int key){
        this.userText = userText;
        this.key = key;


    }

   /* public static void main(String[] args) {
        String text = "Hey, how's it hanging?";
        int key = 3;
        char [] chars = text.toCharArray();
        for(char c: chars ){
            c += key;
            System.out.print(c);

        }


    }*/
}
