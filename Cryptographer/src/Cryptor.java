import java.util.Scanner;
public class Cryptor {
static String sentence;
static String changeVowels;
static String reversedText;
static Scanner userInput=new Scanner (System.in);
	public static void cryptor(){
		inputSentence();
		reverseSentence();
		replaceSentence();
		}
			public static void inputSentence()
				{
				System.out.println("Input your sentence to be encoded");
				sentence=userInput.nextLine();
				}
			public static String reverseSentence()
				{
				StringBuffer textToReverse= new StringBuffer(sentence);
				textToReverse.reverse();	
				reversedText= textToReverse.toString();
				return reversedText;
				}
			public static String replaceSentence()
				{
				reversedText=reversedText.toString();
				changeVowels=reversedText.replace("a","*").replace("e","@").replace("i","&").replace("o","$").replace("u","#").replace("m","0").replace("ch","!");
				System.out.println("ENCRYPTED SENTENCE: xklsnd" + changeVowels);
				return changeVowels;
				}		
		}
