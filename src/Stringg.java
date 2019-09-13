import java.util.HashMap;


public class Stringg {
	public static void main(String[] args) {
	
         String s1="chand23233232dra";
         int i=0;
        HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
                 if(hashmap.containsKey(s1)){
                	  hashmap.put(s1.charAt(i), hashmap.get(s1)+1);
                 }
                 i++;
                 System.out.println(hashmap);
	
}
}