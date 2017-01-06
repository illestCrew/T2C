package kr.ac.hanyang.tosca2camp;

public class ToscaConstants {
	public static final String BASE_FILEPATH = "/Users/kena/git/T2C/T2C/src/kr/ac/hanyang/tosca2camp/";
	public static final String FILEPATH = "/Users/kena/git/T2C/T2C/src/kr/ac/hanyang/tosca2camp/definitions/";
	public static final String TYPEPREFIX = "tosca.datatypes.";
	
	public static final String[] NODEDEF_FILENAMES = {"tosca.nodes.Root","tosca.nodes.BlockStorage","tosca.nodes.Compute",
			"tosca.nodes.Container.Application","tosca.nodes.Container.Runtime","tosca.nodes.Database",
			"tosca.nodes.DBMS","tosca.nodes.LoadBalancer","tosca.nodes.ObjectStorage",
			"tosca.nodes.SoftwareComponent","tosca.nodes.WebApplication","tosca.nodes.WebServer"};
	
	public static final String[] CAPDEF_FILENAMES = {"tosca.capabilities.Root","tosca.capabilities.Scalable","tosca.capabilities.OperatingSystem",
			 "tosca.capabilities.Node","tosca.capabilities.Endpoint","tosca.capabilities.Endpoint.Database",
			 "tosca.capabilities.Endpoint.Admin","tosca.capabilities.Endpoint.Public","tosca.capabilities.Container","tosca.capabilities.Bindable",
			 "tosca.capabilities.Attachment"};
	
	public static final String[] ARTDEF_FILENAMES = {"tosca.artifacts.Root","tosca.artifacts.File","tosca.artifacts.Deployment",
			 "tosca.artifacts.Deployment.Image","tosca.artifacts.Deployment.Image.VM","tosca.artifacts.Implementation",
			 "tosca.artifacts.Implementation.Bash","tosca.artifacts.Implementation.Python"};
	
	public static final String[] INTDEF_FILENAMES = {"tosca.interfaces.Root","tosca.interfaces.node.lifecycle.Standard","tosca.interfaces.relationship.Configure"};
	
	public static final String[] RELDEF_FILENAMES = {"tosca.relationships.Root","tosca.relationships.ConnectsTo","tosca.relationships.DependsOn",
			 "tosca.relationships.HostedOn","tosca.relationships.RoutesTo","tosca.relationships.AttachesTo"};
	
	public static final String[] DTYPEDEF_FILENAMES = {"tosca.datatypes.Root","tosca.datatypes.integer","tosca.datatypes.string","tosca.datatypes.float","tosca.datatypes.boolean","tosca.datatypes.timestamp","tosca.datatypes.list","tosca.datatypes.map",
			"tosca.datatypes.Credential","tosca.datatypes.network.NetworkInfo","tosca.datatypes.network.PortInfo","tosca.datatypes.network.PortSpec",
			"tosca.datatypes.network.PortDef","tosca.datatypes.range","tosca.datatypes.scalar","tosca.datatypes.scalar-unit.frequency","tosca.datatypes.scalar-unit.size",
			"tosca.datatypes.scalar-unit.time","tosca.datatypes.timestamp","tosca.datatypes.version"};
	
	public static final String[] CONSTDEF_FILENAMES = {"tosca.constraints.equal","tosca.constraints.greater_or_equal","tosca.constraints.greater_than",
			"tosca.constraints.in_range","tosca.constraints.length","tosca.constraints.less_or_equal",
			"tosca.constraints.less_than","tosca.constraints.max_length","tosca.constraints.min_length",
			"tosca.constraints.valid_values"};
	
	public static final String[] FUNCT_FILENAMES = {"tosca.functions.concat","tosca.functions.get_artifact","tosca.functions.get_attribute",
			"tosca.functions.get_input","tosca.functions.get_nodes_of_type","tosca.functions.get_operation_output",
			"tosca.functions.get_property"};
	
	public static final String[] PTYPEDEF_FILENAMES = {"tosca.policies.Root","tosca.policies.Placement","tosca.policies.Scaling","tosca.policies.Update","tosca.policies.Performance"};
	
	public static final String[] GROUPDEF_FILENAMES = {"tosca.groups.Root"};
	
	
	//**********************************************************************************************************************************************
	
	
	
}
