package kr.ac.hanyang.tosca2camp.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;
import kr.ac.hanyang.tosca2camp.rest.model.CapabilityDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.model.NodeDefinitionModel;
import kr.ac.hanyang.tosca2camp.rest.resources.ArtifactResource;
import kr.ac.hanyang.tosca2camp.rest.resources.CapabilityResource;
import kr.ac.hanyang.tosca2camp.rest.resources.NodeTypeResource;

@Path("/artifacttype-definition")
@Produces("Application/json")
@Consumes("application/x-www-form-urlencoded")
public class ArtifactApi {
    
    
    @GET
    @Path("artifact")    
    public ArtifactTypeModel getArtifactType(@QueryParam(value = "type") String type){
    	return ArtifactResource.getArtifactType(type); 
    }
    
    
//    @GET
//    @Path("service/topology")    
//    public TopologyTemplateModel getTopologyTemplate(@QueryParam(value = "id") String id){
//    	return ToscaResource.getTopologyTemplate(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/nodes")    
//    public List<NodeTemplateModel> getNodeTemplate(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
    
//    @GET
//    @Path("{service}/topology/definitions/artifacts")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/datatypes")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/capabilities")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/interfaces")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/relationships")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/nodes")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/groups")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
//    
//    @GET
//    @Path("{service}/topology/definitions/policies")    
//    public List<NodeTemplateModel> getNodeDefintions(@QueryParam(value = "id") String id){
//    	return ToscaResource.getNodeTemplates(id); 
//    }
    
//    @POST
//    @Path("parse")
//    @Produces(MediaType.TEXT_PLAIN)
//    public void parseServiceTemplate(@QueryParam(value = "file") String file){
//    	Tosca2CampLauncher.getPlatform().createServiceTemplate(file); 
//    }
    
    
}