package org.corgiking.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CKLogger {
	
	private Class<?> clazz;
	
	private final String DEFAULTDATEPATTERN = "yy-MM-dd HH:mm:ss:SSS";
	
	private String datePattern = "yyyy-MM-dd HH:mm:ss:SSS";
	
	private SimpleDateFormat sdf;
	
	public CKLogger(Class<?> clazz){
		this.clazz = clazz;
	}
	
	public static CKLogger getLogger(Class<?> clazz){
		return new CKLogger(clazz);
	}
	
	public void info(String msg){
		System.out.print("Message: "+msg);
		System.out.print("----"+clazz.getSimpleName());
		System.out.print("  "+getDateStr());
		System.out.println();
	}
	
	public void setDatePattern(String pattern){
		this.datePattern = pattern;
		sdf = new SimpleDateFormat(datePattern);
	}
	
	private String getDateStr(){
		if (sdf == null) {
			sdf = new SimpleDateFormat(DEFAULTDATEPATTERN);
		}
		return sdf.format(new Date());
	}

	public void info(String msg, List<String> list) {
		info(msg);
		for(String str:list){
			info(str);
		}
	}
	
	public void info(String... msgs){
		StringBuilder sb = new StringBuilder();
		for(String msg:msgs){
			sb.append(msg);
		}
		info(sb.toString());
	}
	
}
