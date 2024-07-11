package homework;
import java.util.Scanner;
public class LogInSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String username = "Mike";
        String password = "Abc1";
        while (true) {
            count++;
            System.out.println("Kullanıcı adı ve şifre giriniz");
            String userInputUsername = scanner.nextLine();
            String userInputPassword = scanner.nextLine();
            if (userInputPassword.equals(password) & userInputUsername.equalsIgnoreCase(username)) {
                System.out.println("Başarıyla giriş yapıldı");
                break;
            } else if (userInputPassword.isEmpty() & userInputUsername.isEmpty()) {
                System.out.println("Kullanıcı adı ve şifre boş olamaz");
            } else if (userInputPassword.isEmpty()) {
                System.out.println("Şifre boş olamaz");
            } else if (userInputUsername.isEmpty()) {
                System.out.println("Kullanıcı adı boş olamaz");
            }
            else{
                System.out.println("Kullanıcı veya şifre geçerli değil. Lütfen tekrar deneyin");
            }
            if(count>3){
                System.out.println("Hesabınız kilitlendi");
                break;
            }
        }
    }
}
