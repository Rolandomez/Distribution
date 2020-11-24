package typings.winrt.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Activation")
@js.native
object Activation extends js.Object {
  
  @js.native
  object ActivationKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Activation.ActivationKind with Double] = js.native
    
    /* 13 */ val appointmentsProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.appointmentsProvider with Double = js.native
    
    /* 7 */ val cachedFileUpdater: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cachedFileUpdater with Double = js.native
    
    /* 11 */ val cameraSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.cameraSettings with Double = js.native
    
    /* 25 */ val componentUI: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.componentUI with Double = js.native
    
    /* 14 */ val contact: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contact with Double = js.native
    
    /* 8 */ val contactPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.contactPicker with Double = js.native
    
    /* 9 */ val device: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.device with Double = js.native
    
    /* 29 */ val dialReceiver: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.dialReceiver with Double = js.native
    
    /* 3 */ val file: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.file with Double = js.native
    
    /* 5 */ val fileOpenPicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileOpenPicker with Double = js.native
    
    /* 6 */ val fileSavePicker: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileSavePicker with Double = js.native
    
    /* 0 */ val launch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.launch with Double = js.native
    
    /* 17 */ val lockScreen: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreen with Double = js.native
    
    /* 15 */ val lockScreenCall: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreenCall with Double = js.native
    
    /* 20 */ val pickFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFileContinuation with Double = js.native
    
    /* 22 */ val pickFolderContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFolderContinuation with Double = js.native
    
    /* 21 */ val pickSaveFileContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickSaveFileContinuation with Double = js.native
    
    /* 18 */ val pickerReturned: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickerReturned with Double = js.native
    
    /* 28 */ val print3DWorkflow: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.print3DWorkflow with Double = js.native
    
    /* 10 */ val printTaskSettings: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.printTaskSettings with Double = js.native
    
    /* 4 */ val protocol: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocol with Double = js.native
    
    /* 26 */ val protocolForResults: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocolForResults with Double = js.native
    
    /* 12 */ val restrictedLaunch: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.restrictedLaunch with Double = js.native
    
    /* 1 */ val search: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.search with Double = js.native
    
    /* 2 */ val shareTarget: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.shareTarget with Double = js.native
    
    /* 27 */ val toastNotification: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.toastNotification with Double = js.native
    
    /* 16 */ val voiceCommand: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.voiceCommand with Double = js.native
    
    /* 19 */ val walletAction: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.walletAction with Double = js.native
    
    /* 24 */ val webAccountProvider: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAccountProvider with Double = js.native
    
    /* 23 */ val webAuthenticationBrokerContinuation: typings.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAuthenticationBrokerContinuation with Double = js.native
  }
  
  @js.native
  object ApplicationExecutionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState with Double
      ] = js.native
    
    /* 4 */ val closedByUser: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser with Double = js.native
    
    /* 0 */ val notRunning: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning with Double = js.native
    
    /* 1 */ val running: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running with Double = js.native
    
    /* 2 */ val suspended: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended with Double = js.native
    
    /* 3 */ val terminated: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated with Double = js.native
  }
  
  @js.native
  class CachedFileUpdaterActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs
  
  @js.native
  class CameraSettingsActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs
  
  @js.native
  class ContactPickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs
  
  @js.native
  class DeviceActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs
  
  @js.native
  class FileActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileActivatedEventArgs
  
  @js.native
  class FileOpenPickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs
  
  @js.native
  class FileSavePickerActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs
  
  @js.native
  class LaunchActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs
  
  @js.native
  class PrintTaskSettingsActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs
  
  @js.native
  class ProtocolActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs
  
  @js.native
  class SearchActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.SearchActivatedEventArgs
  
  @js.native
  class ShareTargetActivatedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs
  
  @js.native
  class SplashScreen ()
    extends typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
}
