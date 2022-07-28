package com.cts.benchmark;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * This POJO class is used to handle audit type and acceptable no of NO allowed in particular benchmark
 */

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	public AuditBenchmark(String string, int i){
		
	}

	private String auditType;
	private Integer accNoAnswers;
	public Object getAuditType(){
		return null;
	}
	public Integer getAccNoAnswers(){
		return null;
	}
	public void setAuditType(String string){
		
	}
	public void setAccNoAnswers(int i){
		
	}
}
