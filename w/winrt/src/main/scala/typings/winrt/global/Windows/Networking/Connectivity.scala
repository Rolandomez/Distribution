package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity")
@js.native
object Connectivity extends js.Object {
  @js.native
  class ConnectionCost ()
    extends typings.winrt.Windows.Networking.Connectivity.ConnectionCost
  
  @js.native
  class ConnectionProfile ()
    extends typings.winrt.Windows.Networking.Connectivity.ConnectionProfile
  
  @js.native
  class DataPlanStatus ()
    extends typings.winrt.Windows.Networking.Connectivity.DataPlanStatus
  
  @js.native
  class DataPlanUsage ()
    extends typings.winrt.Windows.Networking.Connectivity.DataPlanUsage
  
  @js.native
  class DataUsage ()
    extends typings.winrt.Windows.Networking.Connectivity.DataUsage
  
  @js.native
  class IPInformation ()
    extends typings.winrt.Windows.Networking.Connectivity.IPInformation
  
  @js.native
  class LanIdentifier ()
    extends typings.winrt.Windows.Networking.Connectivity.LanIdentifier
  
  @js.native
  class LanIdentifierData ()
    extends typings.winrt.Windows.Networking.Connectivity.LanIdentifierData
  
  @js.native
  class NetworkAdapter ()
    extends typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
  
  @js.native
  class NetworkInformation ()
    extends typings.winrt.Windows.Networking.Connectivity.NetworkInformation
  
  @js.native
  class NetworkItem ()
    extends typings.winrt.Windows.Networking.Connectivity.NetworkItem
  
  @js.native
  class NetworkSecuritySettings ()
    extends typings.winrt.Windows.Networking.Connectivity.NetworkSecuritySettings
  
  @js.native
  class ProxyConfiguration ()
    extends typings.winrt.Windows.Networking.Connectivity.ProxyConfiguration
  
  @js.native
  object NetworkAuthenticationType extends js.Object {
    /* 9 */ val ihv: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.none with Double = js.native
    /* 2 */ val open80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 with Double = js.native
    /* 7 */ val rsna: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna with Double = js.native
    /* 8 */ val rsnaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk with Double = js.native
    /* 3 */ val sharedKey80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 with Double = js.native
    /* 1 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown with Double = js.native
    /* 4 */ val wpa: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa with Double = js.native
    /* 6 */ val wpaNone: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone with Double = js.native
    /* 5 */ val wpaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType with Double
      ] = js.native
  }
  
  @js.native
  object NetworkConnectivityLevel extends js.Object {
    /* 2 */ val constrainedInternetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
    /* 3 */ val internetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess with Double = js.native
    /* 1 */ val localAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel with Double
      ] = js.native
  }
  
  @js.native
  object NetworkCostType extends js.Object {
    /* 2 */ val fixed: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.fixed with Double = js.native
    /* 0 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unknown with Double = js.native
    /* 1 */ val unrestricted: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unrestricted with Double = js.native
    /* 3 */ val variable: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.variable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkCostType with Double] = js.native
  }
  
  @js.native
  object NetworkEncryptionType extends js.Object {
    /* 6 */ val ccmp: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp with Double = js.native
    /* 9 */ val ihv: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ihv with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.none with Double = js.native
    /* 8 */ val rsnUseGroup: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup with Double = js.native
    /* 5 */ val tkip: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.tkip with Double = js.native
    /* 1 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.unknown with Double = js.native
    /* 2 */ val wep: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep with Double = js.native
    /* 4 */ val wep104: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 with Double = js.native
    /* 3 */ val wep40: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 with Double = js.native
    /* 7 */ val wpaUseGroup: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object NetworkInformation extends js.Object {
    var onnetworkstatuschanged: js.Any = js.native
    def getConnectionProfiles(): IVectorView[typings.winrt.Windows.Networking.Connectivity.ConnectionProfile] = js.native
    def getHostNames(): IVectorView[typings.winrt.Windows.Networking.HostName] = js.native
    def getInternetConnectionProfile(): typings.winrt.Windows.Networking.Connectivity.ConnectionProfile = js.native
    def getLanIdentifiers(): IVectorView[typings.winrt.Windows.Networking.Connectivity.LanIdentifier] = js.native
    def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Networking.Connectivity.ProxyConfiguration] = js.native
    def getSortedEndpointPairs(
      destinationList: IIterable[typings.winrt.Windows.Networking.EndpointPair],
      sortOptions: typings.winrt.Windows.Networking.HostNameSortOptions
    ): IVectorView[typings.winrt.Windows.Networking.EndpointPair] = js.native
  }
  
  @js.native
  object NetworkTypes extends js.Object {
    /* 1 */ val internet: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.internet with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.none with Double = js.native
    /* 2 */ val privateNetwork: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.privateNetwork with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkTypes with Double] = js.native
  }
  
  @js.native
  object RoamingStates extends js.Object {
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.RoamingStates.none with Double = js.native
    /* 1 */ val notRoaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.notRoaming with Double = js.native
    /* 2 */ val roaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.roaming with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.RoamingStates with Double] = js.native
  }
  
}

