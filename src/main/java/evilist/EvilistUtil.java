package evilist;
import java.util.Random;
/**
 * @author nantai_yuto
 * @version 1.0.0
 * */
public class EvilistUtil {
	/**
	 * createTextPasswordメソッド
	 * ランダムな文字列を生成
	 * */
	public static String createTextPassword() {
		Random r = new Random();
		String choices = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@_¥$#&-~";
		String password = "";
		int lenPassword = 20;
		for (int index = 0; index < lenPassword; index ++) {
			password = password + choices.charAt(r.nextInt(choices.length()));
		}
		return password;
	}
	
	//動作確認用メソッド
	public static void main(String[] args) {
		System.out.println(createTextPassword());
		
	}

}
