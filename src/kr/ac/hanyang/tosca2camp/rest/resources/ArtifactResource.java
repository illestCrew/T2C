package kr.ac.hanyang.tosca2camp.rest.resources;

import java.util.List;

import kr.ac.hanyang.tosca2camp.Tosca2CampLauncher;
import kr.ac.hanyang.tosca2camp.definitiontypes.ArtifactDef;
import kr.ac.hanyang.tosca2camp.rest.model.ArtifactTypeModel;

public class ArtifactResource {

	public static ArtifactTypeModel getArtifactType(String typeName){
		ArtifactDef artDef = Tosca2CampLauncher.getPlatform().loadArtifact(typeName);
		return ArtifactTypeModel.of().typeName(artDef.getType())
				   					 .description(artDef.getDescription())
				   					 .derived_from(artDef.getDerivedFrom())
				   					 .file_ext(getFileExt(artDef.getFileExtentions()))
				   					 .mime_type(artDef.getMimeType());
	}
	
	public static String[] getFileExt(List<String> fileExtensions){
		String[] toReturn = new String[fileExtensions.size()];
		int index = 0;
		for(String extension: fileExtensions){
			toReturn[index++] = extension;
		}
		return toReturn;
	}
	
}
