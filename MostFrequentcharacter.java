package OOps;

public class MostFrequentcharacter {

	    static char mostFrequent(String str) {

	        str = str.toLowerCase();

	        int maxCount = 0;
	        char maxChar = ' ';

	        for (int i = 0; i < str.length(); i++) {

	            char current = str.charAt(i);
	            int count = 0;

	            for (int j = 0; j < str.length(); j++) {

	                if (str.charAt(j) == current) {
	                    count++;
	                }
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                maxChar = current;
	            }
	        }

	        return maxChar;
	    }

	    public static void main(String[] args) {

	        System.out.println(mostFrequent("banana"));
	    }
	}