package typings.next.nextServerMod

import typings.next.anon.AmpOptimizerConfig
import typings.next.anon.BasePath
import typings.next.anon.HasStaticFallback
import typings.next.anon.Match
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.buildMod.PrerenderManifest
import typings.next.loadCustomRoutesMod.CustomRoutes
import typings.next.pagesManifestPluginMod.PagesManifest
import typings.next.serverRouterMod.DynamicRoutes
import typings.next.serverRouterMod.Params
import typings.next.serverRouterMod.Route_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var _cachedPreviewManifest: js.Any = js.native
  var _validFilesystemPathSet: js.Any = js.native
  var buildId: String = js.native
  var compression: js.Any = js.native
  var customErrorNo404Warn: js.Any = js.native
  var customRoutes: CustomRoutes = js.native
  var dir: String = js.native
  var distDir: String = js.native
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.native
  var findPageComponents: js.Any = js.native
  var getFilesystemPaths: js.Any = js.native
  var getPagePath: js.Any = js.native
  /**
    * Resolves `API` request, in development builds on demand
    * @param req http request
    * @param res http response
    * @param pathname path of request
    */
  var handleApiRequest: js.Any = js.native
  var handleCompression: js.Any = js.native
  var handleRequest: js.Any = js.native
  var hasStaticDir: Boolean = js.native
  var incrementalCache: js.Any = js.native
  var logError: js.Any = js.native
  var nextConfig: NextConfig = js.native
  var onErrorMiddleware: js.Any = js.native
  var pagesDir: js.UndefOr[String] = js.native
  var pagesManifest: js.UndefOr[PagesManifest] = js.native
  var publicDir: String = js.native
  var quiet: Boolean = js.native
  var renderOpts: AmpOptimizerConfig = js.native
  var renderToHTMLWithComponents: js.Any = js.native
  var router: typings.next.serverRouterMod.default = js.native
  var serverBuildDir: String = js.native
  /* protected */ def _beforeCatchAllRender(_req: IncomingMessage, _res: ServerResponse, _params: Params, _parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
  /* protected */ def _isLikeServerless: Boolean = js.native
  /* protected */ def close(): js.Promise[Unit] = js.native
  /* protected */ def currentPhase(): String = js.native
  /* protected */ def ensureApiPage(_pathname: String): js.Promise[Unit] = js.native
  /* protected */ def generatePublicRoutes(): js.Array[Route_] = js.native
  /* protected */ def generateRoutes(): BasePath = js.native
  /* protected */ def getCustomRoutes(): CustomRoutes = js.native
  /* protected */ def getDynamicRoutes(): js.Array[Match] = js.native
  /* protected */ def getPrerenderManifest(): PrerenderManifest = js.native
  /* protected */ def getPreviewProps(): ApiPreviewProps = js.native
  def getRequestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
    js.Promise[Unit]
  ] = js.native
  /* protected */ def getStaticPaths(pathname: String): js.Promise[HasStaticFallback] = js.native
  /* protected */ def hasPage(pathname: String): js.Promise[Boolean] = js.native
  /* protected */ def isServeableUrl(untrustedFileUrl: String): Boolean = js.native
  def prepare(): js.Promise[Unit] = js.native
  /* protected */ def readBuildId(): String = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def render(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: js.UndefOr[scala.Nothing],
    parsedUrl: UrlWithParsedQuery
  ): js.Promise[Unit] = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def render(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    parsedUrl: UrlWithParsedQuery
  ): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  /* protected */ def run(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  /* protected */ def sendHTML(req: IncomingMessage, res: ServerResponse, html: String): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def setAssetPrefix(): Unit = js.native
  def setAssetPrefix(prefix: String): Unit = js.native
  /* protected */ def setImmutableAssetCacheControl(res: ServerResponse): Unit = js.native
}

