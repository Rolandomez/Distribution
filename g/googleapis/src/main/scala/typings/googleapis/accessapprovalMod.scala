package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.accessapprovalV1Mod.accessapprovalV1.Accessapproval
import typings.googleapis.accessapprovalV1Mod.accessapprovalV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessapprovalMod {
  
  @JSImport("googleapis/build/src/apis/accessapproval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/accessapproval", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/accessapproval", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Accessapproval {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/accessapproval", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Accessapproval
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Accessapproval
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/accessapproval", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  inline def accessapproval(options: Options): Accessapproval = ^.asInstanceOf[js.Dynamic].applyDynamic("accessapproval")(options.asInstanceOf[js.Any]).asInstanceOf[Accessapproval]
  inline def accessapproval(options: typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Options): typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval = ^.asInstanceOf[js.Dynamic].applyDynamic("accessapproval")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval]
  
  object accessapprovalV1 {
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Accessapproval")
    @js.native
    open class Accessapproval protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.Accessapproval {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Folders")
    @js.native
    open class ResourceFolders protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceFolders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Folders$Approvalrequests")
    @js.native
    open class ResourceFoldersApprovalrequests protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceFoldersApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Organizations")
    @js.native
    open class ResourceOrganizations protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceOrganizations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Organizations$Approvalrequests")
    @js.native
    open class ResourceOrganizationsApprovalrequests protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceOrganizationsApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1.Resource$Projects$Approvalrequests")
    @js.native
    open class ResourceProjectsApprovalrequests protected ()
      extends typings.googleapis.accessapprovalV1Mod.accessapprovalV1.ResourceProjectsApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object accessapprovalV1beta1 {
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Accessapproval")
    @js.native
    open class Accessapproval protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Folders")
    @js.native
    open class ResourceFolders protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceFolders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Folders$Approvalrequests")
    @js.native
    open class ResourceFoldersApprovalrequests protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceFoldersApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Organizations")
    @js.native
    open class ResourceOrganizations protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceOrganizations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Organizations$Approvalrequests")
    @js.native
    open class ResourceOrganizationsApprovalrequests protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceOrganizationsApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/accessapproval", "accessapproval_v1beta1.Resource$Projects$Approvalrequests")
    @js.native
    open class ResourceProjectsApprovalrequests protected ()
      extends typings.googleapis.v1beta1Mod.accessapprovalV1beta1.ResourceProjectsApprovalrequests {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def accessapproval_v1(version: v1): Accessapproval = ^.asInstanceOf[js.Dynamic].applyDynamic("accessapproval")(version.asInstanceOf[js.Any]).asInstanceOf[Accessapproval]
  
  inline def accessapproval_v1beta1(version: v1beta1): typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval = ^.asInstanceOf[js.Dynamic].applyDynamic("accessapproval")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta1Mod.accessapprovalV1beta1.Accessapproval]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/accessapproval", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.AwsClient")
    @js.native
    open class AwsClient protected ()
      extends typings.googleAuthLibrary.mod.AwsClient {
      /**
        * Instantiates an AwsClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid AWS credential.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: AwsClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    open class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/accessapproval", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.IdentityPoolClient")
    @js.native
    open class IdentityPoolClient protected ()
      extends typings.googleAuthLibrary.mod.IdentityPoolClient {
      /**
        * Instantiate an IdentityPoolClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid file-sourced or
        * url-sourced credential or a workforce pool user project is provided
        * with a non workforce audience.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: IdentityPoolClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.JWT")
    @js.native
    open class JWT protected ()
      extends typings.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/accessapproval", "auth.OAuth2")
    @js.native
    /**
      * Handles OAuth2 flow for Google APIs.
      *
      * @param clientId The authentication client ID.
      * @param clientSecret The authentication client secret.
      * @param redirectUri The URI to redirect to after completing the auth
      * request.
      * @param opts optional options for overriding the given parameters.
      * @constructor
      */
    open class OAuth2 () extends OAuth2Client
    
    type _To = typings.googleapisCommon.mod.AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleapisCommon.mod.AuthPlus = ^
  }
}
