package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainDetails extends StObject {
  
  /**
    * IAM policy document specifying the access policies for the new Amazon ES domain.
    */
  var AccessPolicies: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Additional options for the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions] = js.undefined
  
  /**
    * Unique identifier for an Amazon ES domain.
    */
  var DomainId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Name of an Amazon ES domain. Domain names are unique across all domains owned by the same account within an AWS Region. Domain names must start with a lowercase letter and must be between 3 and 28 characters. Valid characters are a-z (lowercase only), 0-9, and – (hyphen). 
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Elasticsearch version.
    */
  var ElasticsearchVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the configuration for encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions] = js.undefined
  
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain. The endpoint is a service URL. 
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
    */
  var Endpoints: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * Details about the configuration for node-to-node encryption.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * Information that Amazon ES derives based on VPCOptions for the domain.
    */
  var VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions] = js.undefined
}
object AwsElasticsearchDomainDetails {
  
  inline def apply(): AwsElasticsearchDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDetails]
  }
  
  extension [Self <: AwsElasticsearchDomainDetails](x: Self) {
    
    inline def setAccessPolicies(value: NonEmptyString): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setDomainEndpointOptions(value: AwsElasticsearchDomainDomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainId(value: NonEmptyString): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setElasticsearchVersion(value: NonEmptyString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: AwsElasticsearchDomainEncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEndpoints(value: FieldMap): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: AwsElasticsearchDomainNodeToNodeEncryptionOptions): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setVPCOptions(value: AwsElasticsearchDomainVPCOptions): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
