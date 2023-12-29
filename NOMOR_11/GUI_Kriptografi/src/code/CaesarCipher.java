package code;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(encrypt("mahmuddin", 20));
        System.out.println(decrypt("gubgoxxch", 20));
    }
    
    private static String encrypt(String kata,int shift){
        String plainText = kata.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < plainText.length(); i++) {
            int p = plainText.charAt(i)-97;
            int e = (p+shift) % 26;
            char huruf = (char) (e+97);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    private static String decrypt(String kata,int shift){
        String Text = kata.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < Text.length(); i++) {
            int p = Text.charAt(i)-97;
            int e = (p-shift) % 26;
            if(e<0){
                e+=26;
            }
            char huruf = (char) (e+97);
            sb.append(huruf);
        }
        return sb.toString();
    }
}
