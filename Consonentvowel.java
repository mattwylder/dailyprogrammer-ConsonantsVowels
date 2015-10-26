import java.util.Random;
import java.lang.StringBuilder;
import java.lang.ArrayIndexOutOfBoundsException;
class ConsonentVowel {

    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "aeiou";

    public static void main(String[] args){
	
	try{
	    System.out.println(createWord(args[0]));
	}catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("Please enter an argument");
	    return;
	}
    }

    public static String createWord(String pat){
	Random rand = new Random();
	StringBuilder sb = new StringBuilder();

	for(int i = 0; i < pat.length(); i++){
	    if(pat.charAt(i) == 'c')
		sb.append(CONSONANTS.charAt(rand.nextInt(21))); 
	    else if(pat.charAt(i) == 'v')
		sb.append(VOWELS.charAt(rand.nextInt(5)));
	}

	return sb.toString();
    }
}
