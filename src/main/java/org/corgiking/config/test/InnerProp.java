package org.corgiking.config.test;

import java.util.List;
import java.util.Map;

public class InnerProp {
	private String str;
	private List<String> strList;
	private Map<String, String> strMap;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public Map<String, String> getStrMap() {
		return strMap;
	}

	public void setStrMap(Map<String, String> strMap) {
		this.strMap = strMap;
	}

	@Override
	public String toString() {
		return "InnerProp [str=" + str + ", strList=" + strList + ", strMap=" + strMap + "]";
	}

}
