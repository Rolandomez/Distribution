package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyLengthString = java.lang.String

type AttributeNamesList = js.Array[typings.awsSdk.comprehendMod.AttributeNamesListItem]

type AttributeNamesListItem = java.lang.String

type BatchItemErrorList = js.Array[typings.awsSdk.comprehendMod.BatchItemError]

type ClientRequestTokenString = java.lang.String

type ComprehendArn = java.lang.String

type ComprehendArnName = java.lang.String

type ComprehendEndpointArn = java.lang.String

type ComprehendEndpointName = java.lang.String

type ComprehendModelArn = java.lang.String

type CustomerInputString = java.lang.String

type CustomerInputStringList = js.Array[typings.awsSdk.comprehendMod.CustomerInputString]

type DocumentClassificationJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.DocumentClassificationJobProperties]

type DocumentClassifierArn = java.lang.String

type DocumentClassifierAugmentedManifestsList = js.Array[typings.awsSdk.comprehendMod.AugmentedManifestsListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPREHEND_CSV
  - typings.awsSdk.awsSdkStrings.AUGMENTED_MANIFEST
  - java.lang.String
*/
type DocumentClassifierDataFormat = typings.awsSdk.comprehendMod._DocumentClassifierDataFormat | java.lang.String

type DocumentClassifierEndpointArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_CLASS
  - typings.awsSdk.awsSdkStrings.MULTI_LABEL
  - java.lang.String
*/
type DocumentClassifierMode = typings.awsSdk.comprehendMod._DocumentClassifierMode | java.lang.String

type DocumentClassifierPropertiesList = js.Array[typings.awsSdk.comprehendMod.DocumentClassifierProperties]

type DominantLanguageDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties]

type Double = scala.Double

type EndpointPropertiesList = js.Array[typings.awsSdk.comprehendMod.EndpointProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_SERVICE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type EndpointStatus = typings.awsSdk.comprehendMod._EndpointStatus | java.lang.String

type EntitiesDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.EntitiesDetectionJobProperties]

type EntityRecognizerArn = java.lang.String

type EntityRecognizerAugmentedManifestsList = js.Array[typings.awsSdk.comprehendMod.AugmentedManifestsListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPREHEND_CSV
  - typings.awsSdk.awsSdkStrings.AUGMENTED_MANIFEST
  - java.lang.String
*/
type EntityRecognizerDataFormat = typings.awsSdk.comprehendMod._EntityRecognizerDataFormat | java.lang.String

type EntityRecognizerEndpointArn = java.lang.String

type EntityRecognizerMetadataEntityTypesList = js.Array[typings.awsSdk.comprehendMod.EntityRecognizerMetadataEntityTypesListItem]

type EntityRecognizerPropertiesList = js.Array[typings.awsSdk.comprehendMod.EntityRecognizerProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSON
  - typings.awsSdk.awsSdkStrings.LOCATION
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - typings.awsSdk.awsSdkStrings.COMMERCIAL_ITEM
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.QUANTITY
  - typings.awsSdk.awsSdkStrings.TITLE
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type EntityType = typings.awsSdk.comprehendMod._EntityType | java.lang.String

type EntityTypeName = java.lang.String

type EntityTypesList = js.Array[typings.awsSdk.comprehendMod.EntityTypesListItem]

type Float = scala.Double

type IamRoleArn = java.lang.String

type InferenceUnitsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONE_DOC_PER_FILE
  - typings.awsSdk.awsSdkStrings.ONE_DOC_PER_LINE
  - java.lang.String
*/
type InputFormat = typings.awsSdk.comprehendMod._InputFormat | java.lang.String

type Integer = scala.Double

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type JobStatus = typings.awsSdk.comprehendMod._JobStatus | java.lang.String

type KeyPhrasesDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobProperties]

type KmsKeyId = java.lang.String

type LabelDelimiter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.it_
  - typings.awsSdk.awsSdkStrings.pt_
  - typings.awsSdk.awsSdkStrings.ar_
  - typings.awsSdk.awsSdkStrings.hi
  - typings.awsSdk.awsSdkStrings.ja_
  - typings.awsSdk.awsSdkStrings.ko
  - typings.awsSdk.awsSdkStrings.zh
  - typings.awsSdk.awsSdkStrings.`zh-TW`
  - java.lang.String
*/
type LanguageCode = typings.awsSdk.comprehendMod._LanguageCode | java.lang.String

type ListOfClasses = js.Array[typings.awsSdk.comprehendMod.DocumentClass]

type ListOfDetectDominantLanguageResult = js.Array[typings.awsSdk.comprehendMod.BatchDetectDominantLanguageItemResult]

type ListOfDetectEntitiesResult = js.Array[typings.awsSdk.comprehendMod.BatchDetectEntitiesItemResult]

type ListOfDetectKeyPhrasesResult = js.Array[typings.awsSdk.comprehendMod.BatchDetectKeyPhrasesItemResult]

type ListOfDetectSentimentResult = js.Array[typings.awsSdk.comprehendMod.BatchDetectSentimentItemResult]

type ListOfDetectSyntaxResult = js.Array[typings.awsSdk.comprehendMod.BatchDetectSyntaxItemResult]

type ListOfDominantLanguages = js.Array[typings.awsSdk.comprehendMod.DominantLanguage]

type ListOfEntities = js.Array[typings.awsSdk.comprehendMod.Entity]

type ListOfKeyPhrases = js.Array[typings.awsSdk.comprehendMod.KeyPhrase]

type ListOfLabels = js.Array[typings.awsSdk.comprehendMod.DocumentLabel]

type ListOfPiiEntities = js.Array[typings.awsSdk.comprehendMod.PiiEntity]

type ListOfPiiEntityTypes = js.Array[typings.awsSdk.comprehendMod.PiiEntityType]

type ListOfSyntaxTokens = js.Array[typings.awsSdk.comprehendMod.SyntaxToken]

type MaskCharacter = java.lang.String

type MaxResultsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.TRAINING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.IN_ERROR
  - typings.awsSdk.awsSdkStrings.TRAINED
  - java.lang.String
*/
type ModelStatus = typings.awsSdk.comprehendMod._ModelStatus | java.lang.String

type NumberOfTopicsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADJ
  - typings.awsSdk.awsSdkStrings.ADP
  - typings.awsSdk.awsSdkStrings.ADV
  - typings.awsSdk.awsSdkStrings.AUX
  - typings.awsSdk.awsSdkStrings.CONJ
  - typings.awsSdk.awsSdkStrings.CCONJ
  - typings.awsSdk.awsSdkStrings.DET
  - typings.awsSdk.awsSdkStrings.INTJ
  - typings.awsSdk.awsSdkStrings.NOUN
  - typings.awsSdk.awsSdkStrings.NUM
  - typings.awsSdk.awsSdkStrings.O
  - typings.awsSdk.awsSdkStrings.PART
  - typings.awsSdk.awsSdkStrings.PRON
  - typings.awsSdk.awsSdkStrings.PROPN
  - typings.awsSdk.awsSdkStrings.PUNCT
  - typings.awsSdk.awsSdkStrings.SCONJ
  - typings.awsSdk.awsSdkStrings.SYM
  - typings.awsSdk.awsSdkStrings.VERB
  - java.lang.String
*/
type PartOfSpeechTagType = typings.awsSdk.comprehendMod._PartOfSpeechTagType | java.lang.String

type PiiEntitiesDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.PiiEntitiesDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASK
  - typings.awsSdk.awsSdkStrings.REPLACE_WITH_PII_ENTITY_TYPE
  - java.lang.String
*/
type PiiEntitiesDetectionMaskMode = typings.awsSdk.comprehendMod._PiiEntitiesDetectionMaskMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLY_REDACTION
  - typings.awsSdk.awsSdkStrings.ONLY_OFFSETS
  - java.lang.String
*/
type PiiEntitiesDetectionMode = typings.awsSdk.comprehendMod._PiiEntitiesDetectionMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BANK_ACCOUNT_NUMBER
  - typings.awsSdk.awsSdkStrings.BANK_ROUTING
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_NUMBER
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_CVV
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_EXPIRY
  - typings.awsSdk.awsSdkStrings.PIN
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.ADDRESS
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.PHONE
  - typings.awsSdk.awsSdkStrings.SSN
  - typings.awsSdk.awsSdkStrings.DATE_TIME
  - typings.awsSdk.awsSdkStrings.PASSPORT_NUMBER
  - typings.awsSdk.awsSdkStrings.DRIVER_ID
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.AGE
  - typings.awsSdk.awsSdkStrings.USERNAME
  - typings.awsSdk.awsSdkStrings.PASSWORD
  - typings.awsSdk.awsSdkStrings.AWS_ACCESS_KEY
  - typings.awsSdk.awsSdkStrings.AWS_SECRET_KEY
  - typings.awsSdk.awsSdkStrings.IP_ADDRESS
  - typings.awsSdk.awsSdkStrings.MAC_ADDRESS
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type PiiEntityType = typings.awsSdk.comprehendMod._PiiEntityType | java.lang.String

type S3Uri = java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[typings.awsSdk.comprehendMod.SecurityGroupId]

type SentimentDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.SentimentDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POSITIVE
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - typings.awsSdk.awsSdkStrings.NEUTRAL
  - typings.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SentimentType = typings.awsSdk.comprehendMod._SentimentType | java.lang.String

type String = java.lang.String

type SubnetId = java.lang.String

type Subnets = js.Array[typings.awsSdk.comprehendMod.SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.it_
  - typings.awsSdk.awsSdkStrings.pt_
  - java.lang.String
*/
type SyntaxLanguageCode = typings.awsSdk.comprehendMod._SyntaxLanguageCode | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.comprehendMod.TagKey]

type TagList = js.Array[typings.awsSdk.comprehendMod.Tag]

type TagValue = java.lang.String

type Timestamp = typings.std.Date

type TopicsDetectionJobPropertiesList = js.Array[typings.awsSdk.comprehendMod.TopicsDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.comprehendMod._apiVersion | java.lang.String
