package org.corgiking.config.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test.prop")
public class TestProperties {
	private String str;
	private String[] strArray;
	private List<String> strList;
	private Map<String, String> strMap;
	private List<Author> authors;
	private InnerProp innerProp;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
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

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public InnerProp getInnerProp() {
		return innerProp;
	}

	public void setInnerProp(InnerProp innerProp) {
		this.innerProp = innerProp;
	}

	@Override
	public String toString() {
		return "TestProperties [str=" + str + ", strArray=" + Arrays.toString(strArray) + ", strList=" + strList
				+ ", strMap=" + strMap + ", authors=" + authors + ", innerProp=" + innerProp + "]";
	}

}
