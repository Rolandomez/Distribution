package typings.awsSdk

import typings.awsSdk.accessanalyzerMod.ClientConfiguration
import typings.awsSdk.anon.ConfigurationOptionsConfi
import typings.awsSdk.awsSdkBooleans.`true`
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.configBaseMod.ConfigurationOptions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("aws-sdk/lib/config", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  class Config ()
    extends typings.awsSdk.configBaseMod.ConfigBase {
    def this(options: ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk/lib/config", "ConfigBase")
  @js.native
  class ConfigBase ()
    extends typings.awsSdk.configBaseMod.ConfigBase {
    def this(options: ConfigurationOptions) = this()
  }
  
  trait APIVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[latest_ | String] = js.undefined
    
    /**
      * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
      */
    var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  }
  object APIVersions {
    
    inline def apply(): APIVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIVersions]
    }
    
    extension [Self <: APIVersions](x: Self) {
      
      inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders because Inheritance from two classes. Inlined acm, apigateway, applicationautoscaling, appstream, autoscaling, batch, budgets, clouddirectory, cloudformation, cloudfront, cloudhsm, cloudsearch, cloudsearchdomain, cloudtrail, cloudwatch, cloudwatchevents, cloudwatchlogs, codebuild, codecommit, codedeploy, codepipeline, cognitoidentity, cognitoidentityserviceprovider, cognitosync, configservice, cur, datapipeline, devicefarm, directconnect, directoryservice, discovery, dms, dynamodb, dynamodbstreams, ec2, ecr, ecs, efs, elasticache, elasticbeanstalk, elb, elbv2, emr, es, elastictranscoder, firehose, gamelift, glacier, health, iam, importexport, inspector, iot, iotdata, kinesis, kinesisanalytics, kms, lambda, lexruntime, lightsail, machinelearning, marketplacecommerceanalytics, marketplacemetering, mturk, mobileanalytics, opsworks, opsworkscm, organizations, pinpoint, polly, rds, redshift, rekognition, resourcegroupstaggingapi, route53, route53domains, s3, s3control, servicecatalog, ses, shield, simpledb, sms, snowball, sns, sqs, ssm, storagegateway, stepfunctions, sts, support, swf, xray, waf, wafregional, workdocs, workspaces, codestar, lexmodelbuildingservice, marketplaceentitlementservice, athena, greengrass, dax, migrationhub, cloudhsmv2, glue, mobile, pricing, costexplorer, mediaconvert, medialive, mediapackage, mediastore, mediastoredata, appsync, guardduty, mq, comprehend, iotjobsdataplane, kinesisvideoarchivedmedia, kinesisvideomedia, kinesisvideo, sagemakerruntime, sagemaker, translate, resourcegroups, alexaforbusiness, cloud9, serverlessapplicationrepository, servicediscovery, workmail, autoscalingplans, transcribeservice, connect, acmpca, fms, secretsmanager, iotanalytics, iot1clickdevicesservice, iot1clickprojects, pi, neptune, mediatailor, eks, macie, dlm, signer, chime, pinpointemail, ram, route53resolver, pinpointsmsvoice, quicksight, rdsdataservice, amplify, datasync, robomaker, transfer, globalaccelerator, comprehendmedical, kinesisanalyticsv2, mediaconnect, fsx, securityhub, appmesh, licensemanager, kafka, apigatewaymanagementapi, apigatewayv2, docdb, backup, worklink, textract, managedblockchain, mediapackagevod, groundstation, iotthingsgraph, iotevents, ioteventsdata, personalize, personalizeevents, personalizeruntime, applicationinsights, servicequotas, ec2instanceconnect, eventbridge, lakeformation, forecastservice, forecastqueryservice, qldb, qldbsession, workmailmessageflow, codestarnotifications, savingsplans, sso, ssooidc, marketplacecatalog, dataexchange, sesv2, migrationhubconfig, connectparticipant, appconfig, iotsecuretunneling, wafv2, elasticinference, imagebuilder, schemas, accessanalyzer, codegurureviewer, codeguruprofiler, computeoptimizer, frauddetector, kendra, networkmanager, outposts, augmentedairuntime, ebs, kinesisvideosignalingchannels, detective, codestarconnections, synthetics, iotsitewise, macie2, codeartifact, honeycode, ivs, braket, identitystore, appflow, redshiftdata, ssoadmin, timestreamquery, timestreamwrite, s3outposts, databrew, servicecatalogappregistry, networkfirewall */ @js.native
  trait GlobalConfigInstance
    extends Config
       with APIVersions {
    
    var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
    
    var acm: js.UndefOr[typings.awsSdk.acmMod.ClientConfiguration] = js.native
    
    var acmpca: js.UndefOr[typings.awsSdk.acmpcaMod.ClientConfiguration] = js.native
    
    var alexaforbusiness: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.native
    
    var amplify: js.UndefOr[typings.awsSdk.amplifyMod.ClientConfiguration] = js.native
    
    var apigateway: js.UndefOr[typings.awsSdk.apigatewayMod.ClientConfiguration] = js.native
    
    var apigatewaymanagementapi: js.UndefOr[typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration] = js.native
    
    var apigatewayv2: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ClientConfiguration] = js.native
    
    var appconfig: js.UndefOr[typings.awsSdk.appconfigMod.ClientConfiguration] = js.native
    
    var appflow: js.UndefOr[typings.awsSdk.appflowMod.ClientConfiguration] = js.native
    
    var applicationautoscaling: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.native
    
    var applicationinsights: js.UndefOr[typings.awsSdk.applicationinsightsMod.ClientConfiguration] = js.native
    
    var appmesh: js.UndefOr[typings.awsSdk.appmeshMod.ClientConfiguration] = js.native
    
    var appstream: js.UndefOr[typings.awsSdk.appstreamMod.ClientConfiguration] = js.native
    
    var appsync: js.UndefOr[typings.awsSdk.appsyncMod.ClientConfiguration] = js.native
    
    var athena: js.UndefOr[typings.awsSdk.athenaMod.ClientConfiguration] = js.native
    
    var augmentedairuntime: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.native
    
    var autoscaling: js.UndefOr[typings.awsSdk.autoscalingMod.ClientConfiguration] = js.native
    
    var autoscalingplans: js.UndefOr[typings.awsSdk.autoscalingplansMod.ClientConfiguration] = js.native
    
    var backup: js.UndefOr[typings.awsSdk.backupMod.ClientConfiguration] = js.native
    
    var batch: js.UndefOr[typings.awsSdk.batchMod.ClientConfiguration] = js.native
    
    var braket: js.UndefOr[typings.awsSdk.braketMod.ClientConfiguration] = js.native
    
    var budgets: js.UndefOr[typings.awsSdk.budgetsMod.ClientConfiguration] = js.native
    
    var chime: js.UndefOr[typings.awsSdk.chimeMod.ClientConfiguration] = js.native
    
    var cloud9: js.UndefOr[typings.awsSdk.cloud9Mod.ClientConfiguration] = js.native
    
    var clouddirectory: js.UndefOr[typings.awsSdk.clouddirectoryMod.ClientConfiguration] = js.native
    
    var cloudformation: js.UndefOr[typings.awsSdk.cloudformationMod.ClientConfiguration] = js.native
    
    var cloudfront: js.UndefOr[typings.awsSdk.cloudfrontMod.ClientConfiguration] = js.native
    
    var cloudhsm: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientConfiguration] = js.native
    
    var cloudhsmv2: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClientConfiguration] = js.native
    
    var cloudsearch: js.UndefOr[typings.awsSdk.cloudsearchMod.ClientConfiguration] = js.native
    
    var cloudsearchdomain: js.UndefOr[typings.awsSdk.cloudsearchdomainMod.ClientConfiguration] = js.native
    
    var cloudtrail: js.UndefOr[typings.awsSdk.cloudtrailMod.ClientConfiguration] = js.native
    
    var cloudwatch: js.UndefOr[typings.awsSdk.cloudwatchMod.ClientConfiguration] = js.native
    
    var cloudwatchevents: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ClientConfiguration] = js.native
    
    var cloudwatchlogs: js.UndefOr[typings.awsSdk.cloudwatchlogsMod.ClientConfiguration] = js.native
    
    var codeartifact: js.UndefOr[typings.awsSdk.codeartifactMod.ClientConfiguration] = js.native
    
    var codebuild: js.UndefOr[typings.awsSdk.codebuildMod.ClientConfiguration] = js.native
    
    var codecommit: js.UndefOr[typings.awsSdk.codecommitMod.ClientConfiguration] = js.native
    
    var codedeploy: js.UndefOr[typings.awsSdk.codedeployMod.ClientConfiguration] = js.native
    
    var codeguruprofiler: js.UndefOr[typings.awsSdk.codeguruprofilerMod.ClientConfiguration] = js.native
    
    var codegurureviewer: js.UndefOr[typings.awsSdk.codegurureviewerMod.ClientConfiguration] = js.native
    
    var codepipeline: js.UndefOr[typings.awsSdk.codepipelineMod.ClientConfiguration] = js.native
    
    var codestar: js.UndefOr[typings.awsSdk.codestarMod.ClientConfiguration] = js.native
    
    var codestarconnections: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ClientConfiguration] = js.native
    
    var codestarnotifications: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientConfiguration] = js.native
    
    var cognitoidentity: js.UndefOr[typings.awsSdk.cognitoidentityMod.ClientConfiguration] = js.native
    
    var cognitoidentityserviceprovider: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration] = js.native
    
    var cognitosync: js.UndefOr[typings.awsSdk.cognitosyncMod.ClientConfiguration] = js.native
    
    var comprehend: js.UndefOr[typings.awsSdk.comprehendMod.ClientConfiguration] = js.native
    
    var comprehendmedical: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ClientConfiguration] = js.native
    
    var computeoptimizer: js.UndefOr[typings.awsSdk.computeoptimizerMod.ClientConfiguration] = js.native
    
    var configservice: js.UndefOr[typings.awsSdk.configserviceMod.ClientConfiguration] = js.native
    
    var connect: js.UndefOr[typings.awsSdk.connectMod.ClientConfiguration] = js.native
    
    var connectparticipant: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientConfiguration] = js.native
    
    var costexplorer: js.UndefOr[typings.awsSdk.costexplorerMod.ClientConfiguration] = js.native
    
    var cur: js.UndefOr[typings.awsSdk.curMod.ClientConfiguration] = js.native
    
    var databrew: js.UndefOr[typings.awsSdk.databrewMod.ClientConfiguration] = js.native
    
    var dataexchange: js.UndefOr[typings.awsSdk.dataexchangeMod.ClientConfiguration] = js.native
    
    var datapipeline: js.UndefOr[typings.awsSdk.datapipelineMod.ClientConfiguration] = js.native
    
    var datasync: js.UndefOr[typings.awsSdk.datasyncMod.ClientConfiguration] = js.native
    
    var dax: js.UndefOr[typings.awsSdk.daxMod.ClientConfiguration] = js.native
    
    var detective: js.UndefOr[typings.awsSdk.detectiveMod.ClientConfiguration] = js.native
    
    var devicefarm: js.UndefOr[typings.awsSdk.devicefarmMod.ClientConfiguration] = js.native
    
    var directconnect: js.UndefOr[typings.awsSdk.directconnectMod.ClientConfiguration] = js.native
    
    var directoryservice: js.UndefOr[typings.awsSdk.directoryserviceMod.ClientConfiguration] = js.native
    
    var discovery: js.UndefOr[typings.awsSdk.discoveryMod.ClientConfiguration] = js.native
    
    var dlm: js.UndefOr[typings.awsSdk.dlmMod.ClientConfiguration] = js.native
    
    var dms: js.UndefOr[typings.awsSdk.dmsMod.ClientConfiguration] = js.native
    
    var docdb: js.UndefOr[typings.awsSdk.docdbMod.ClientConfiguration] = js.native
    
    var dynamodb: js.UndefOr[typings.awsSdk.dynamodbMod.ClientConfiguration] = js.native
    
    var dynamodbstreams: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.ClientConfiguration] = js.native
    
    var ebs: js.UndefOr[typings.awsSdk.ebsMod.ClientConfiguration] = js.native
    
    var ec2: js.UndefOr[typings.awsSdk.ec2Mod.ClientConfiguration] = js.native
    
    var ec2instanceconnect: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.ClientConfiguration] = js.native
    
    var ecr: js.UndefOr[typings.awsSdk.ecrMod.ClientConfiguration] = js.native
    
    var ecs: js.UndefOr[typings.awsSdk.ecsMod.ClientConfiguration] = js.native
    
    var efs: js.UndefOr[typings.awsSdk.efsMod.ClientConfiguration] = js.native
    
    var eks: js.UndefOr[typings.awsSdk.eksMod.ClientConfiguration] = js.native
    
    var elasticache: js.UndefOr[typings.awsSdk.elasticacheMod.ClientConfiguration] = js.native
    
    var elasticbeanstalk: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ClientConfiguration] = js.native
    
    var elasticinference: js.UndefOr[typings.awsSdk.elasticinferenceMod.ClientConfiguration] = js.native
    
    var elastictranscoder: js.UndefOr[typings.awsSdk.elastictranscoderMod.ClientConfiguration] = js.native
    
    var elb: js.UndefOr[typings.awsSdk.elbMod.ClientConfiguration] = js.native
    
    var elbv2: js.UndefOr[typings.awsSdk.elbv2Mod.ClientConfiguration] = js.native
    
    var emr: js.UndefOr[typings.awsSdk.emrMod.ClientConfiguration] = js.native
    
    var es: js.UndefOr[typings.awsSdk.esMod.ClientConfiguration] = js.native
    
    var eventbridge: js.UndefOr[typings.awsSdk.eventbridgeMod.ClientConfiguration] = js.native
    
    var firehose: js.UndefOr[typings.awsSdk.firehoseMod.ClientConfiguration] = js.native
    
    var fms: js.UndefOr[typings.awsSdk.fmsMod.ClientConfiguration] = js.native
    
    var forecastqueryservice: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.native
    
    var forecastservice: js.UndefOr[typings.awsSdk.forecastserviceMod.ClientConfiguration] = js.native
    
    var frauddetector: js.UndefOr[typings.awsSdk.frauddetectorMod.ClientConfiguration] = js.native
    
    var fsx: js.UndefOr[typings.awsSdk.fsxMod.ClientConfiguration] = js.native
    
    var gamelift: js.UndefOr[typings.awsSdk.gameliftMod.ClientConfiguration] = js.native
    
    var glacier: js.UndefOr[typings.awsSdk.glacierMod.ClientConfiguration] = js.native
    
    var globalaccelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.ClientConfiguration] = js.native
    
    var glue: js.UndefOr[typings.awsSdk.glueMod.ClientConfiguration] = js.native
    
    var greengrass: js.UndefOr[typings.awsSdk.greengrassMod.ClientConfiguration] = js.native
    
    var groundstation: js.UndefOr[typings.awsSdk.groundstationMod.ClientConfiguration] = js.native
    
    var guardduty: js.UndefOr[typings.awsSdk.guarddutyMod.ClientConfiguration] = js.native
    
    var health: js.UndefOr[typings.awsSdk.healthMod.ClientConfiguration] = js.native
    
    var honeycode: js.UndefOr[typings.awsSdk.honeycodeMod.ClientConfiguration] = js.native
    
    var iam: js.UndefOr[typings.awsSdk.iamMod.ClientConfiguration] = js.native
    
    var identitystore: js.UndefOr[typings.awsSdk.identitystoreMod.ClientConfiguration] = js.native
    
    var imagebuilder: js.UndefOr[typings.awsSdk.imagebuilderMod.ClientConfiguration] = js.native
    
    var importexport: js.UndefOr[typings.awsSdk.importexportMod.ClientConfiguration] = js.native
    
    var inspector: js.UndefOr[typings.awsSdk.inspectorMod.ClientConfiguration] = js.native
    
    var iot: js.UndefOr[typings.awsSdk.iotMod.ClientConfiguration] = js.native
    
    var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.native
    
    var iot1clickprojects: js.UndefOr[typings.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.native
    
    var iotanalytics: js.UndefOr[typings.awsSdk.iotanalyticsMod.ClientConfiguration] = js.native
    
    var iotdata: js.UndefOr[typings.awsSdk.iotdataMod.ClientConfiguration] = js.native
    
    var iotevents: js.UndefOr[typings.awsSdk.ioteventsMod.ClientConfiguration] = js.native
    
    var ioteventsdata: js.UndefOr[typings.awsSdk.ioteventsdataMod.ClientConfiguration] = js.native
    
    var iotjobsdataplane: js.UndefOr[typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.native
    
    var iotsecuretunneling: js.UndefOr[typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.native
    
    var iotsitewise: js.UndefOr[typings.awsSdk.iotsitewiseMod.ClientConfiguration] = js.native
    
    var iotthingsgraph: js.UndefOr[typings.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.native
    
    var ivs: js.UndefOr[typings.awsSdk.ivsMod.ClientConfiguration] = js.native
    
    var kafka: js.UndefOr[typings.awsSdk.kafkaMod.ClientConfiguration] = js.native
    
    var kendra: js.UndefOr[typings.awsSdk.kendraMod.ClientConfiguration] = js.native
    
    var kinesis: js.UndefOr[typings.awsSdk.kinesisMod.ClientConfiguration] = js.native
    
    var kinesisanalytics: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ClientConfiguration] = js.native
    
    var kinesisanalyticsv2: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration] = js.native
    
    var kinesisvideo: js.UndefOr[typings.awsSdk.kinesisvideoMod.ClientConfiguration] = js.native
    
    var kinesisvideoarchivedmedia: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
    
    var kinesisvideomedia: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ClientConfiguration] = js.native
    
    var kinesisvideosignalingchannels: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration] = js.native
    
    var kms: js.UndefOr[typings.awsSdk.kmsMod.ClientConfiguration] = js.native
    
    var lakeformation: js.UndefOr[typings.awsSdk.lakeformationMod.ClientConfiguration] = js.native
    
    var lambda: js.UndefOr[typings.awsSdk.lambdaMod.ClientConfiguration] = js.native
    
    var lexmodelbuildingservice: js.UndefOr[typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration] = js.native
    
    var lexruntime: js.UndefOr[typings.awsSdk.lexruntimeMod.ClientConfiguration] = js.native
    
    var licensemanager: js.UndefOr[typings.awsSdk.licensemanagerMod.ClientConfiguration] = js.native
    
    var lightsail: js.UndefOr[typings.awsSdk.lightsailMod.ClientConfiguration] = js.native
    
    var machinelearning: js.UndefOr[typings.awsSdk.machinelearningMod.ClientConfiguration] = js.native
    
    var macie: js.UndefOr[typings.awsSdk.macieMod.ClientConfiguration] = js.native
    
    var macie2: js.UndefOr[typings.awsSdk.macie2Mod.ClientConfiguration] = js.native
    
    var managedblockchain: js.UndefOr[typings.awsSdk.managedblockchainMod.ClientConfiguration] = js.native
    
    var marketplacecatalog: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ClientConfiguration] = js.native
    
    var marketplacecommerceanalytics: js.UndefOr[typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration] = js.native
    
    var marketplaceentitlementservice: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration] = js.native
    
    var marketplacemetering: js.UndefOr[typings.awsSdk.marketplacemeteringMod.ClientConfiguration] = js.native
    
    var mediaconnect: js.UndefOr[typings.awsSdk.mediaconnectMod.ClientConfiguration] = js.native
    
    var mediaconvert: js.UndefOr[typings.awsSdk.mediaconvertMod.ClientConfiguration] = js.native
    
    var medialive: js.UndefOr[typings.awsSdk.medialiveMod.ClientConfiguration] = js.native
    
    var mediapackage: js.UndefOr[typings.awsSdk.mediapackageMod.ClientConfiguration] = js.native
    
    var mediapackagevod: js.UndefOr[typings.awsSdk.mediapackagevodMod.ClientConfiguration] = js.native
    
    var mediastore: js.UndefOr[typings.awsSdk.mediastoreMod.ClientConfiguration] = js.native
    
    var mediastoredata: js.UndefOr[typings.awsSdk.mediastoredataMod.ClientConfiguration] = js.native
    
    var mediatailor: js.UndefOr[typings.awsSdk.mediatailorMod.ClientConfiguration] = js.native
    
    var migrationhub: js.UndefOr[typings.awsSdk.migrationhubMod.ClientConfiguration] = js.native
    
    var migrationhubconfig: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.native
    
    var mobile: js.UndefOr[typings.awsSdk.mobileMod.ClientConfiguration] = js.native
    
    var mobileanalytics: js.UndefOr[typings.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.native
    
    var mq: js.UndefOr[typings.awsSdk.mqMod.ClientConfiguration] = js.native
    
    var mturk: js.UndefOr[typings.awsSdk.mturkMod.ClientConfiguration] = js.native
    
    var neptune: js.UndefOr[typings.awsSdk.neptuneMod.ClientConfiguration] = js.native
    
    var networkfirewall: js.UndefOr[typings.awsSdk.networkfirewallMod.ClientConfiguration] = js.native
    
    var networkmanager: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientConfiguration] = js.native
    
    var opsworks: js.UndefOr[typings.awsSdk.opsworksMod.ClientConfiguration] = js.native
    
    var opsworkscm: js.UndefOr[typings.awsSdk.opsworkscmMod.ClientConfiguration] = js.native
    
    var organizations: js.UndefOr[typings.awsSdk.organizationsMod.ClientConfiguration] = js.native
    
    var outposts: js.UndefOr[typings.awsSdk.outpostsMod.ClientConfiguration] = js.native
    
    var personalize: js.UndefOr[typings.awsSdk.personalizeMod.ClientConfiguration] = js.native
    
    var personalizeevents: js.UndefOr[typings.awsSdk.personalizeeventsMod.ClientConfiguration] = js.native
    
    var personalizeruntime: js.UndefOr[typings.awsSdk.personalizeruntimeMod.ClientConfiguration] = js.native
    
    var pi: js.UndefOr[typings.awsSdk.piMod.ClientConfiguration] = js.native
    
    var pinpoint: js.UndefOr[typings.awsSdk.pinpointMod.ClientConfiguration] = js.native
    
    var pinpointemail: js.UndefOr[typings.awsSdk.pinpointemailMod.ClientConfiguration] = js.native
    
    var pinpointsmsvoice: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration] = js.native
    
    var polly: js.UndefOr[typings.awsSdk.pollyMod.ClientConfiguration] = js.native
    
    var pricing: js.UndefOr[typings.awsSdk.pricingMod.ClientConfiguration] = js.native
    
    var qldb: js.UndefOr[typings.awsSdk.qldbMod.ClientConfiguration] = js.native
    
    var qldbsession: js.UndefOr[typings.awsSdk.qldbsessionMod.ClientConfiguration] = js.native
    
    var quicksight: js.UndefOr[typings.awsSdk.quicksightMod.ClientConfiguration] = js.native
    
    var ram: js.UndefOr[typings.awsSdk.ramMod.ClientConfiguration] = js.native
    
    var rds: js.UndefOr[typings.awsSdk.rdsMod.ClientConfiguration] = js.native
    
    var rdsdataservice: js.UndefOr[typings.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.native
    
    var redshift: js.UndefOr[typings.awsSdk.redshiftMod.ClientConfiguration] = js.native
    
    var redshiftdata: js.UndefOr[typings.awsSdk.redshiftdataMod.ClientConfiguration] = js.native
    
    var rekognition: js.UndefOr[typings.awsSdk.rekognitionMod.ClientConfiguration] = js.native
    
    var resourcegroups: js.UndefOr[typings.awsSdk.resourcegroupsMod.ClientConfiguration] = js.native
    
    var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.native
    
    var robomaker: js.UndefOr[typings.awsSdk.robomakerMod.ClientConfiguration] = js.native
    
    var route53: js.UndefOr[typings.awsSdk.route53Mod.ClientConfiguration] = js.native
    
    var route53domains: js.UndefOr[typings.awsSdk.route53domainsMod.ClientConfiguration] = js.native
    
    var route53resolver: js.UndefOr[typings.awsSdk.route53resolverMod.ClientConfiguration] = js.native
    
    var s3: js.UndefOr[typings.awsSdk.s3Mod.ClientConfiguration] = js.native
    
    var s3control: js.UndefOr[typings.awsSdk.s3controlMod.ClientConfiguration] = js.native
    
    var s3outposts: js.UndefOr[typings.awsSdk.s3outpostsMod.ClientConfiguration] = js.native
    
    var sagemaker: js.UndefOr[typings.awsSdk.sagemakerMod.ClientConfiguration] = js.native
    
    var sagemakerruntime: js.UndefOr[typings.awsSdk.sagemakerruntimeMod.ClientConfiguration] = js.native
    
    var savingsplans: js.UndefOr[typings.awsSdk.savingsplansMod.ClientConfiguration] = js.native
    
    var schemas: js.UndefOr[typings.awsSdk.schemasMod.ClientConfiguration] = js.native
    
    var secretsmanager: js.UndefOr[typings.awsSdk.secretsmanagerMod.ClientConfiguration] = js.native
    
    var securityhub: js.UndefOr[typings.awsSdk.securityhubMod.ClientConfiguration] = js.native
    
    var serverlessapplicationrepository: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration] = js.native
    
    var servicecatalog: js.UndefOr[typings.awsSdk.servicecatalogMod.ClientConfiguration] = js.native
    
    var servicecatalogappregistry: js.UndefOr[typings.awsSdk.servicecatalogappregistryMod.ClientConfiguration] = js.native
    
    var servicediscovery: js.UndefOr[typings.awsSdk.servicediscoveryMod.ClientConfiguration] = js.native
    
    var servicequotas: js.UndefOr[typings.awsSdk.servicequotasMod.ClientConfiguration] = js.native
    
    var ses: js.UndefOr[typings.awsSdk.sesMod.ClientConfiguration] = js.native
    
    var sesv2: js.UndefOr[typings.awsSdk.sesv2Mod.ClientConfiguration] = js.native
    
    var shield: js.UndefOr[typings.awsSdk.shieldMod.ClientConfiguration] = js.native
    
    var signer: js.UndefOr[typings.awsSdk.signerMod.ClientConfiguration] = js.native
    
    var simpledb: js.UndefOr[typings.awsSdk.simpledbMod.ClientConfiguration] = js.native
    
    var sms: js.UndefOr[typings.awsSdk.smsMod.ClientConfiguration] = js.native
    
    var snowball: js.UndefOr[typings.awsSdk.snowballMod.ClientConfiguration] = js.native
    
    var sns: js.UndefOr[typings.awsSdk.snsMod.ClientConfiguration] = js.native
    
    var sqs: js.UndefOr[typings.awsSdk.sqsMod.ClientConfiguration] = js.native
    
    var ssm: js.UndefOr[typings.awsSdk.ssmMod.ClientConfiguration] = js.native
    
    var sso: js.UndefOr[typings.awsSdk.ssoMod.ClientConfiguration] = js.native
    
    var ssoadmin: js.UndefOr[typings.awsSdk.ssoadminMod.ClientConfiguration] = js.native
    
    var ssooidc: js.UndefOr[typings.awsSdk.ssooidcMod.ClientConfiguration] = js.native
    
    var stepfunctions: js.UndefOr[typings.awsSdk.stepfunctionsMod.ClientConfiguration] = js.native
    
    var storagegateway: js.UndefOr[typings.awsSdk.storagegatewayMod.ClientConfiguration] = js.native
    
    var sts: js.UndefOr[typings.awsSdk.stsMod.ClientConfiguration] = js.native
    
    var support: js.UndefOr[typings.awsSdk.supportMod.ClientConfiguration] = js.native
    
    var swf: js.UndefOr[typings.awsSdk.swfMod.ClientConfiguration] = js.native
    
    var synthetics: js.UndefOr[typings.awsSdk.syntheticsMod.ClientConfiguration] = js.native
    
    var textract: js.UndefOr[typings.awsSdk.textractMod.ClientConfiguration] = js.native
    
    var timestreamquery: js.UndefOr[typings.awsSdk.timestreamqueryMod.ClientConfiguration] = js.native
    
    var timestreamwrite: js.UndefOr[typings.awsSdk.timestreamwriteMod.ClientConfiguration] = js.native
    
    var transcribeservice: js.UndefOr[typings.awsSdk.transcribeserviceMod.ClientConfiguration] = js.native
    
    var transfer: js.UndefOr[typings.awsSdk.transferMod.ClientConfiguration] = js.native
    
    var translate: js.UndefOr[typings.awsSdk.translateMod.ClientConfiguration] = js.native
    
    var waf: js.UndefOr[typings.awsSdk.wafMod.ClientConfiguration] = js.native
    
    var wafregional: js.UndefOr[typings.awsSdk.wafregionalMod.ClientConfiguration] = js.native
    
    var wafv2: js.UndefOr[typings.awsSdk.wafv2Mod.ClientConfiguration] = js.native
    
    var workdocs: js.UndefOr[typings.awsSdk.workdocsMod.ClientConfiguration] = js.native
    
    var worklink: js.UndefOr[typings.awsSdk.worklinkMod.ClientConfiguration] = js.native
    
    var workmail: js.UndefOr[typings.awsSdk.workmailMod.ClientConfiguration] = js.native
    
    var workmailmessageflow: js.UndefOr[typings.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.native
    
    var workspaces: js.UndefOr[typings.awsSdk.workspacesMod.ClientConfiguration] = js.native
    
    var xray: js.UndefOr[typings.awsSdk.xrayMod.ClientConfiguration] = js.native
  }
}
