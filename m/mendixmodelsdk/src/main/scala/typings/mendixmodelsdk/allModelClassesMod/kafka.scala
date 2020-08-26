package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka")
@js.native
object kafka extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class ConsumedKafkaService protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaAttribute protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaEntity protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaMappedValue protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.12.0: deleted
    */
  @js.native
  class KafkaNavigationProperty protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object ConsumedKafkaService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = js.native
  }
  
  /* static members */
  @js.native
  object KafkaAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * The new KafkaAttribute will be automatically stored in the 'attributes' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
  }
  
  /* static members */
  @js.native
  object KafkaEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity = js.native
    /**
      * Creates and returns a new KafkaEntity instance in the SDK and on the server.
      * The new KafkaEntity will be automatically stored in the 'entities' property
      * of the parent ConsumedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 to 8.11.0
      */
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService): typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity = js.native
  }
  
  /* static members */
  @js.native
  object KafkaMappedValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Attribute): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
  }
  
  /* static members */
  @js.native
  object KafkaNavigationProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * The new KafkaNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
  }
  
  /* static members */
  @js.native
  object KafkaRemoteEntitySource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Entity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
  }
  
}

