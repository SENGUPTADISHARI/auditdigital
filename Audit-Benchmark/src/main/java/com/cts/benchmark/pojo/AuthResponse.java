package com.cts.benchmark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * This is a POJO class used to store the Authentication response

 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponse {
	public AutoResponse(){
		
	}
	public AutoResponse(String string, boolean b){
		
	}
	private String uid;
	private boolean isValid;
	public void setUid(String string){
		
	}
	public Object getUid(){
		return null;
	}
	public void setValid(boolean b){
	}
	public Object isValid(){
		return null;
	}
	
	

}
