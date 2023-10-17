public class test {
    public static void main(String[] args) {
    	
    	String str1 = "Hello";
    	String str2 = "World";
    	
    	StringBuilder sb1 = new StringBuilder(str1);
    	StringBuilder sb2 = new StringBuilder(str2);
    	StringBuilder temp = new StringBuilder(sb1);
    	
    	
    	
    	sb1.setLength(0);
    	sb1.append(sb2);
    	
    	sb2.setLength(0);
    	sb2.append(temp);
    	
    	System.out.println(sb1);
    	System.out.println(sb2);
    }
}
