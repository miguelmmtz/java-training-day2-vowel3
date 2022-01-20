public class ThirdVowel {

	public static void main(String[] args) {
		String word = "happy new year 2022";
		findThirdVowel(word);
	}
	
	public static void findThirdVowel(String word) {
		for(int i = 1; i <= word.length(); i++) {
			if(i%3==0) {
				char c = word.charAt(i-1);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					System.out.println("Vowel: "+c+" Index: "+(i-1));	
				}
			}
		}
	}
}
