
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Main {
  public static void main(String[] argv) throws Exception {
    SecretKey key = KeyGenerator.getInstance("DES").generateKey();
    DesEncrypter encrypter = new DesEncrypter(key);
    String encrypted = encrypter.encrypt("Don't tell anybody!");
    System.out.println("Encrypt: " + encrypted);
	String decrypted = encrypter.decrypt(encrypted);
    System.out.println("Decrypt: " + decrypted);
  }
}

