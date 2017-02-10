package kr.ac.hanyang.tosca2camp.templates;
/**
 *  A structure used to store the names of implemenation artifacts specified
 *  in Operation definitions.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import kr.ac.hanyang.tosca2camp.definitiontypes.CapabilityDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.ConstraintDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.GroupDef;
import kr.ac.hanyang.tosca2camp.definitiontypes.PolicyDef.Builder;
import kr.ac.hanyang.tosca2camp.definitiontypes.PropertyDef;

public class ImplementationArtifact implements Cloneable{
	private String primary;
	private List<String> dependencies;
	
	
	
	public ImplementationArtifact(String primary){
		this.primary = primary;
		this.dependencies = new ArrayList<String>();
	}
	
	public ImplementationArtifact clone(){
		ImplementationArtifact toReturn;
		try {
			toReturn = (ImplementationArtifact) super.clone();
			toReturn.primary = this.primary;
			List<String> deps = new ArrayList<String>();
			for(String item: dependencies)
				deps.add(item);
			toReturn.dependencies = deps;
			return toReturn;
		} catch (CloneNotSupportedException e) {
			return null;
		}		
	}
	
	public void addDependency(String dependency){
		dependencies.add(dependency);
	}
	
	public String getPrimaryArtifact(){
		return primary;
	}
	
	public List<String> getDependencies(){
		return dependencies;
	}
	
	private int tabNum;
	
	public void setTabNum(int tabs){ tabNum = tabs;}
	
	public String toString(){
		String padding = new String(new char[tabNum]).replace("\0", "\t");
		
		ToStringBuilder builder = new ToStringBuilder(this,ToStringStyle.SIMPLE_STYLE);
										if (primary != null) builder.appendToString("\n"+padding+"Implementation Artifact: "+primary);
										builder.append("\n"+padding+"dependencies: ");
										for(String depen: dependencies){
											//depen.setTabNum(tabNum+1);
											builder.appendToString(padding+depen.toString());
										}
		return builder.toString();
	}

}
