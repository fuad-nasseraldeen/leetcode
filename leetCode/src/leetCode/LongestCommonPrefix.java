package leetCode;

public class LongestCommonPrefix {

	 public String longestCommonPrefix(String[] strs) {
			
	    int size = strs.length;
	    int max = Integer.MAX_VALUE;
	    int cc=0;
	    String result = "";
	    if (strs.length == 0 ){return result;}
	    if (strs.length ==1) {return strs[0];}
	    for(; cc<size;cc++){
	        if(strs[cc].length() <=max){max = strs[cc].length();}
	    }
	    for (int i=0 ; i<max ; i++)
	    {
	        char c = strs[0].charAt(i); // f from flower
	        for (int j =1 ; j<size ; j++)
	        {
	             char jj = strs[j].charAt(i);
	            if(  jj != c){ // f from flow , flight
	                return result ;
	            }
	        }
	            result+= strs[0].charAt(i);
	        }
	    return result;
	}   
	    }

