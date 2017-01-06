package kr.ac.hanyang.tosca2camp.templates;

public enum DataType {COMPLEX("COMPLEX"),FUNCTION("FUNCTION"),VALUE("VALUE");
	private String value;
	private DataType(String value){this.value = value;}
	public String getValue(){return value;}
};
