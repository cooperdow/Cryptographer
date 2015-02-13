import java.util.Scanner;
public class Decryptor {
static String sentence;
static String changeVowels=Cryptor.changeVowels;
static String reversedText;
static Scanner userInput=new Scanner (System.in);
	public static void decryptor() {
		reverseSentenceBack();
		replaceSentenceBack();
		}
			public static String reverseSentenceBack()
				{
				StringBuffer textToReverse= new StringBuffer(changeVowels);
				textToReverse.reverse();	
				reversedText= textToReverse.toString();
				return reversedText;
				}
			public static String replaceSentenceBack()
				{
				reversedText=reversedText.toString();
				changeVowels=reversedText.replace("*","a").replace("@","e").replace("&","i").replace("$","o").replace("#","u").replace("0","m").replace("!","ch").replace("xklsnd","");
				System.out.println("DECRYPTED SENTENCE:" + changeVowels);
				return changeVowels;
				}
		}