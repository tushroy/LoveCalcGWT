//Love percentage calculation algorithm class
package org.tushar.client;
public class Lovecal {
	
	public static float getPercentage(String lover1,String lover2){
		float len1 = lover1.length();
		float len2 = lover2.length();
		float percentage;
		if(len1>len2){
			percentage = (1-((len1-len2)/(len1+len2)))*100;
		}
		else{
			percentage = (1-((len2-len1)/(len1+len2)))*100;
		}
		return percentage;
	}
}
