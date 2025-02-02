package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSecondaryArtifact extends StObject {
  
  /**
    * The artifact identifier. Must be the same specified inside AWS CodeBuild buildspec.
    */
  var artifactIdentifier: String
  
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the build output artifact location. If `type` is set to `CODEPIPELINE` or `NO_ARTIFACTS` then this value will be ignored. If `type` is set to `S3`, this is the name of the output bucket. If `path` is not also specified, then `location` can also specify the path of the output artifact in the output bucket.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values for this parameter are: `BUILD_ID` or `NONE`.
    */
  var namespaceType: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, a name specified in the build spec file overrides the artifact name.
    */
  var overrideArtifactName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of build output artifact to create. If `type` is set to `S3`, valid values for this parameter are: `NONE` or `ZIP`
    */
  var packaging: js.UndefOr[String] = js.undefined
  
  /**
    * If `type` is set to `S3`, this is the path to the output artifact
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The build output artifact's type. Valid values for this parameter are: `CODEPIPELINE`, `NO_ARTIFACTS` or `S3`.
    */
  var `type`: String
}
object ProjectSecondaryArtifact {
  
  inline def apply(artifactIdentifier: String, `type`: String): ProjectSecondaryArtifact = {
    val __obj = js.Dynamic.literal(artifactIdentifier = artifactIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondaryArtifact]
  }
  
  extension [Self <: ProjectSecondaryArtifact](x: Self) {
    
    inline def setArtifactIdentifier(value: String): Self = StObject.set(x, "artifactIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabled(value: Boolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespaceType(value: String): Self = StObject.set(x, "namespaceType", value.asInstanceOf[js.Any])
    
    inline def setNamespaceTypeUndefined: Self = StObject.set(x, "namespaceType", js.undefined)
    
    inline def setOverrideArtifactName(value: Boolean): Self = StObject.set(x, "overrideArtifactName", value.asInstanceOf[js.Any])
    
    inline def setOverrideArtifactNameUndefined: Self = StObject.set(x, "overrideArtifactName", js.undefined)
    
    inline def setPackaging(value: String): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
