package tst;

public class stringBufferTest {
	    public static void main(String[] args) {
	    	
	        StringBuffer sb = new StringBuffer();
	        
	        sb.append("bonjour");
	        
	        sb.append("monde");
	        
	        sb.insert(5, " ");
	        
	        sb.delete(5, 6);
	        
	        sb.reverse();
	        
	        System.out.println(sb.toString());
	    }
	}




