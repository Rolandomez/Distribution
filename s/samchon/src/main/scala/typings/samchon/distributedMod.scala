package typings.samchon

import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.idistributedserverMod.IDistributedServer
import typings.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/distributed", JSImport.Namespace)
@js.native
object distributedMod extends js.Object {
  
  @js.native
  class DSInvokeHistory protected ()
    extends typings.samchon.dsinvokehistoryMod.DSInvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: typings.samchon.distributedSystemMod.DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(
      system: typings.samchon.distributedSystemMod.DistributedSystem,
      process: typings.samchon.distributedProcessMod.DistributedProcess,
      invoke: Invoke,
      weight: Double
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedClientArrayMod.DistributedClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedClientArrayMediatorMod.DistributedClientArrayMediator[System]
  
  @js.native
  abstract class DistributedProcess protected ()
    extends typings.samchon.distributedProcessMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  abstract class DistributedServer protected ()
    extends typings.samchon.distributedServerMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typings.samchon.distributedServerArrayMod.DistributedServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typings.samchon.distributedServerArrayMediatorMod.DistributedServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedServerClientArrayMod.DistributedServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedServerClientArrayMediatorMod.DistributedServerClientArrayMediator[System]
  
  @js.native
  abstract class DistributedSystem protected ()
    extends typings.samchon.distributedSystemMod.DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedSystemArrayMod.DistributedSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator[System]
}
