package code;

public class VigenereCipher {
    public static void main(String[] args) {
        System.out.println(encrypt("hello", "xy"));
        System.out.println(Decrypt("ECIJL", "xy"));
    }
    
    private static String encrypt(String kata,String shift){
        String plainText = kata.toLowerCase();
        String key = shift.toLowerCase();
        StringBuffer sb = new StringBuffer();
        int panjang = plainText.length();
        for (int i = 0; i < panjang; i++) {
            int j = i%key.length();
            int k = (int) key.charAt(j) - 97;
            int p = plainText.charAt(i)-97;
            int e = (p+k)%26;
            char huruf = (char) (e + 65);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    private static String Decrypt(String kata,String shift){
        String plainText = kata.toLowerCase();
        String key = shift.toLowerCase();
        StringBuffer sb = new StringBuffer();
        int panjang = plainText.length();
        for (int i = 0; i < panjang; i++) {
            int j = i%key.length();
            int k = (int) key.charAt(j) - 97;
            int p = plainText.charAt(i)-97;
            int e = (p-k)%26;
            if(e<0){
                e+=26;
            }
            char huruf = (char) (e + 65);
            sb.append(huruf);
        }
        return sb.toString();
    }
}
