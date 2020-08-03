package _07_tea_party;

public class TeaParty {
	String title;
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        
	    	this.name = name;
	    	this.isWoman = isWoman;
	    	this.isKnighted = isKnighted;
	    	if (isWoman == true){
	    		
	    		if (isKnighted == true) {
	    			title = "Lady";
	    		}
	    		
	    		else {
	    			title = "Ms.";
	    		}
	    		
	    	}
	    	
	    	else {
	    		
	    		if(isKnighted == true) {
	    			title = "Sir";
	    		}
	    		else {
	    			title = "Mr.";
	    		}
	    		
	    	}
	    	
	    	
	    	
			return "Hello " + title + " " + name;			
	    } 
	    
}
