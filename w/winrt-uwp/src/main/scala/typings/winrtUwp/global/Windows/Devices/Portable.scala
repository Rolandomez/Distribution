package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Windows Portable Devices (WPD) enables computers to communicate with attached media and storage devices. This namespace provides methods for identifying Windows Portable Device (WPD) services and storage. */
object Portable {
  
  /** Provides methods for identifying a device service for a portable device that supports WPD (Windows Portable Devices) for device enumeration. */
  @JSGlobal("Windows.Devices.Portable.ServiceDevice")
  @js.native
  abstract class ServiceDevice ()
    extends typings.winrtUwp.Windows.Devices.Portable.ServiceDevice
  object ServiceDevice {
    
    /**
      * Returns an Advanced Query Syntax (AQS) string that is used to enumerate device services of the specified ServiceDeviceType . This string is passed to the FindAllAsync or CreateWatcher method.
      * @param serviceType The type of service to identify.
      * @return The AQS string.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Portable.ServiceDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    
    /**
      * An Advanced Query Syntax (AQS) string for identifying a device service by its GUIDs. This string is passed to the FindAllAsync or CreateWatcher method.
      * @param serviceId The service identifier.
      * @return The AQS string.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Portable.ServiceDevice.getDeviceSelectorFromServiceId")
    @js.native
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  
  /** Indicates the type of a portable device service. */
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType with Double] = js.native
    
    /* 0 */ val calendarService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.calendarService with Double = js.native
    
    /* 1 */ val contactsService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.contactsService with Double = js.native
    
    /* 2 */ val deviceStatusService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService with Double = js.native
    
    /* 3 */ val notesService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.notesService with Double = js.native
    
    /* 4 */ val ringtonesService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.ringtonesService with Double = js.native
    
    /* 5 */ val smsService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.smsService with Double = js.native
    
    /* 6 */ val tasksService: typings.winrtUwp.Windows.Devices.Portable.ServiceDeviceType.tasksService with Double = js.native
  }
  
  /** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
  @JSGlobal("Windows.Devices.Portable.StorageDevice")
  @js.native
  abstract class StorageDevice ()
    extends typings.winrtUwp.Windows.Devices.Portable.StorageDevice
  object StorageDevice {
    
    /**
      * Gets a StorageFolder object from a DeviceInformation Id for a removable storage device.
      * @param DeviceId The DeviceInformation ID that identifies the removable storage device. This id can be retrieved from Windows.Devices.Enumeration or the DeviceInformationId property of the AutoPlay device event arguments. For more information, see Quickstart: Register an app for an AutoPlay device. In order for FromId to succeed, the app must declare both the removableStorage capability as shown in the App capability declarations and file type associations for the files it wishes to access on the device as shown in How to handle file activation. For more information, see the Removable Storage sample.
      * @return The storage folder object that represents the removable storage device and provides access to content on the device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Portable.StorageDevice.fromId")
    @js.native
    def fromId(DeviceId: String): StorageFolder = js.native
    
    /**
      * An Advanced Query Syntax (AQS) string for identifying removable storage devices. This string is passed to the FindAllAsync or CreateWatcher method.
      * @return An AQS string for identifying storage devices.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Portable.StorageDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
}
