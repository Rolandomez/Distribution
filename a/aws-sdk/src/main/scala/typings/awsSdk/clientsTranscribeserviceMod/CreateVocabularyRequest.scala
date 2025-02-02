package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVocabularyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files (in this case, your custom vocabulary). If the role that you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs.
    */
  var DataAccessRoleArn: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn] = js.undefined
  
  /**
    * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary must contain terms in only one language. A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For example, if you create a custom vocabulary using US English (en-US), you can only apply this custom vocabulary to files that contain English audio. For a list of supported languages and their associated language codes, refer to the Supported languages table.
    */
  var LanguageCode: typings.awsSdk.clientsTranscribeserviceMod.LanguageCode
  
  /**
    * Use this parameter if you want to create your custom vocabulary by including all desired terms, as comma-separated values, within your request. The other option for creating your custom vocabulary is to save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the VocabularyFileUri parameter. Note that if you include Phrases in your request, you cannot use VocabularyFileUri; you must choose one or the other. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language.
    */
  var Phrases: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Phrases] = js.undefined
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you create this new custom vocabulary. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same Amazon Web Services Region as the resource you're calling. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt  Note that if you include VocabularyFileUri in your request, you cannot use the Phrases flag; you must choose one or the other.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * A unique name, chosen by you, for your new custom vocabulary. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new custom vocabulary with the same name as an existing custom vocabulary, you get a ConflictException error.
    */
  var VocabularyName: typings.awsSdk.clientsTranscribeserviceMod.VocabularyName
}
object CreateVocabularyRequest {
  
  inline def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): CreateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVocabularyRequest] (val x: Self) extends AnyVal {
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setPhrases(value: Phrases): Self = StObject.set(x, "Phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "Phrases", js.undefined)
    
    inline def setPhrasesVarargs(value: Phrase*): Self = StObject.set(x, "Phrases", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFileUriUndefined: Self = StObject.set(x, "VocabularyFileUri", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
