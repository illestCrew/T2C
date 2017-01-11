package kr.ac.hanyang.tosca2camp.definitiontypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Kena Alexander
 * @since 
 */
@Deprecated
public class VersionDef extends DataTypeDef implements Cloneable{

	
	private VersionDef(Builder builder){
		super(builder);
	}
	
	public static class Builder extends DataTypeDef.Builder{
		
		public Builder(){
			super();
		}
		
		public VersionDef build(Builder builder){
			return (VersionDef) new DataTypeDef.Builder().build();	
		}
	
	}
	
	public static void main(String[] args){
		DataTypeDef vd = new VersionDef.Builder().primitiveValue(new Integer(4)).build(); 
		System.out.println(vd.toString());
	}
	
}
