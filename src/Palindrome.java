
public class Palindrome {

	public boolean palindromChecker(String string, String string2, String string3, String string4) {
		if ((pc(string) == true) && pc(string2) == true && (pc(string3) == true) && pc(string4) == true) {
			return true;
		} else {
			return false;
		}
	}
	private boolean pc(String string) {
		int i = 0, j = string.length() - 1; 
		while (i < j) { 
			  if (string.charAt(i) != string.charAt(j)) 
                return false; 
			  i++; 
			  j--; 
        } 
        return true; 
	}
}
