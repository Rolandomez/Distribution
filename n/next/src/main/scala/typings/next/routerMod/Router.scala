package typings.next.routerMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Errorcodeanycancelledbool
import typings.next.mittMod.MittEmitter
import typings.next.utilsMod.NextPageContext
import typings.react.mod.ComponentType
import typings.std.PopStateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends BaseRouter {
  var _bps: js.UndefOr[BeforePopStateCallback] = js.native
  var _inFlightRoute: js.UndefOr[String] = js.native
  var clc: ComponentLoadCancel = js.native
  /**
    * Map of all components loaded in `Router`
    */
  var components: StringDictionary[RouteInfo] = js.native
  var events: MittEmitter = js.native
  var isFallback: Boolean = js.native
  var isSsr: Boolean = js.native
  var pageLoader: js.Any = js.native
  var sdc: StringDictionary[js.Object] = js.native
  var sub: Subscription = js.native
  def _getData[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  def _getServerData(dataHref: String): js.Promise[js.Object] = js.native
  def _getStaticData(dataHref: String): js.Promise[js.Object] = js.native
  def _wrapApp(App: ComponentType[js.Object]): js.Any = js.native
  def abortComponentLoad(as: String): Unit = js.native
  /**
    * Go back in history
    */
  def back(): Unit = js.native
  /**
    * Callback to execute before replacing router state
    * @param cb callback to be executed
    */
  def beforePopState(cb: BeforePopStateCallback): Unit = js.native
  def change(method: HistoryMethod, url: String, as: String, options: js.Any): js.Promise[Boolean] = js.native
  def changeState(method: HistoryMethod, url: String, as: String): Unit = js.native
  def changeState(method: HistoryMethod, url: String, as: String, options: js.Object): Unit = js.native
  def fetchComponent(route: String): js.Promise[ComponentRes] = js.native
  def getInitialProps(Component: ComponentType[js.Object], ctx: NextPageContext): js.Promise[_] = js.native
  def getRouteInfo(route: String, pathname: String, query: js.Any, as: String): js.Promise[RouteInfo] = js.native
  def getRouteInfo(route: String, pathname: String, query: js.Any, as: String, shallow: Boolean): js.Promise[RouteInfo] = js.native
  def handleRouteInfoError(err: Errorcodeanycancelledbool, pathname: String, query: js.Any, as: String): js.Promise[RouteInfo] = js.native
  def handleRouteInfoError(
    err: Errorcodeanycancelledbool,
    pathname: String,
    query: js.Any,
    as: String,
    loadErrorFail: Boolean
  ): js.Promise[RouteInfo] = js.native
  def notify(data: RouteInfo): js.Promise[Unit] = js.native
  def onPopState(e: PopStateEvent): Unit = js.native
  def onlyAHashChange(as: String): Boolean = js.native
  /**
    * Prefetch page code, you may wait for the data during page rendering.
    * This feature only works in production!
    * @param url the href of prefetched page
    * @param asPath the as path of the prefetched page
    */
  def prefetch(url: String): js.Promise[Unit] = js.native
  def prefetch(url: String, asPath: js.UndefOr[scala.Nothing], options: PrefetchOptions): js.Promise[Unit] = js.native
  def prefetch(url: String, asPath: String): js.Promise[Unit] = js.native
  def prefetch(url: String, asPath: String, options: PrefetchOptions): js.Promise[Unit] = js.native
  /**
    * Performs a `pushState` with arguments
    * @param url of the route
    * @param as masks `url` for the browser
    * @param options object you can define `shallow` and other options
    */
  def push(url: Url): js.Promise[Boolean] = js.native
  def push(url: Url, as: js.UndefOr[Url], options: js.Object): js.Promise[Boolean] = js.native
  def push(url: Url, as: Url): js.Promise[Boolean] = js.native
  def reload(): Unit = js.native
  /**
    * Performs a `replaceState` with arguments
    * @param url of the route
    * @param as masks `url` for the browser
    * @param options object you can define `shallow` and other options
    */
  def replace(url: Url): js.Promise[Boolean] = js.native
  def replace(url: Url, as: js.UndefOr[Url], options: js.Object): js.Promise[Boolean] = js.native
  def replace(url: Url, as: Url): js.Promise[Boolean] = js.native
  def scrollToHash(as: String): Unit = js.native
  def set(route: String, pathname: String, query: js.Any, as: String, data: RouteInfo): js.Promise[Unit] = js.native
  def update(route: String, mod: js.Any): Unit = js.native
  def urlIsNew(asPath: String): Boolean = js.native
}

