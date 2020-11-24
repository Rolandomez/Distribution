package typings.browserfs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.anon.TypeofAsyncMirror
import typings.browserfs.anon.TypeofBFSUtils
import typings.browserfs.anon.TypeofDropbox
import typings.browserfs.anon.TypeofEmscripten
import typings.browserfs.anon.TypeofFolderAdapter
import typings.browserfs.anon.TypeofHTML5FS
import typings.browserfs.anon.TypeofInMemory
import typings.browserfs.anon.TypeofIndexedDB
import typings.browserfs.anon.TypeofIsoFS
import typings.browserfs.anon.TypeofLocalStorage
import typings.browserfs.anon.TypeofMountableFileSystem
import typings.browserfs.anon.TypeofOverlayFS
import typings.browserfs.anon.TypeofWorkerFS
import typings.browserfs.anon.TypeofXmlHttpRequest
import typings.browserfs.anon.TypeofZipFS
import typings.browserfs.anon.Typeofbuffer
import typings.browserfs.apiErrorMod.ErrorCode
import typings.browserfs.browserfsMod.FileSystemConfiguration
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.fSMod.FSModule
import typings.browserfs.fSMod.default
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemConstructor
import typings.node.Buffer
import typings.node.pathMod.PlatformPath
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def BFSRequire(module: String): js.Any = js.native
  @JSName("BFSRequire")
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSName("BFSRequire")
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSName("BFSRequire")
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSName("BFSRequire")
  def BFSRequire_path(module: path): PlatformPath = js.native
  @JSName("BFSRequire")
  def BFSRequire_process(module: process): Process = js.native
  
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  
  def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
  
  def initialize(rootfs: FileSystem): FileSystem = js.native
  
  def install(obj: js.Any): Unit = js.native
  
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
  
  var setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  
  @js.native
  class EmscriptenFS ()
    extends typings.browserfs.nodeMod.EmscriptenFS {
    def this(_FS: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: default
    ) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any, nodefs: default) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.UndefOr[scala.Nothing], nodefs: default) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
  }
  
  @js.native
  object Errors extends js.Object {
    
    @js.native
    class ApiError protected ()
      extends typings.browserfs.nodeMod.Errors.ApiError {
      /**
        * Represents a BrowserFS error. Passed back to applications after a failed
        * call to the BrowserFS API.
        *
        * Error codes mirror those returned by regular Unix file operations, which is
        * what Node returns.
        * @constructor ApiError
        * @param type The type of the error.
        * @param [message] A descriptive error message.
        */
      def this(`type`: ErrorCode) = this()
      def this(`type`: ErrorCode, message: String) = this()
      def this(`type`: ErrorCode, message: js.UndefOr[scala.Nothing], path: String) = this()
      def this(`type`: ErrorCode, message: String, path: String) = this()
    }
    /* static members */
    @js.native
    object ApiError extends js.Object {
      
      def EEXIST(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def EISDIR(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOENT(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOTDIR(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def ENOTEMPTY(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def EPERM(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def FileError(code: ErrorCode, p: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      /**
        * Creates an ApiError object from a buffer.
        */
      def fromBuffer(buffer: Buffer): typings.browserfs.apiErrorMod.ApiError = js.native
      def fromBuffer(buffer: Buffer, i: Double): typings.browserfs.apiErrorMod.ApiError = js.native
      
      def fromJSON(json: js.Any): typings.browserfs.apiErrorMod.ApiError = js.native
    }
    
    @js.native
    object ErrorCode extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.browserfs.apiErrorMod.ErrorCode with Double] = js.native
      
      /* 13 */ val EACCES: typings.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
      
      /* 9 */ val EBADF: typings.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
      
      /* 16 */ val EBUSY: typings.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
      
      /* 17 */ val EEXIST: typings.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
      
      /* 27 */ val EFBIG: typings.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
      
      /* 22 */ val EINVAL: typings.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
      
      /* 5 */ val EIO: typings.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
      
      /* 21 */ val EISDIR: typings.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
      
      /* 2 */ val ENOENT: typings.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
      
      /* 28 */ val ENOSPC: typings.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
      
      /* 20 */ val ENOTDIR: typings.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
      
      /* 39 */ val ENOTEMPTY: typings.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
      
      /* 95 */ val ENOTSUP: typings.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
      
      /* 1 */ val EPERM: typings.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
      
      /* 30 */ val EROFS: typings.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
    }
    
    @js.native
    object ErrorStrings
      extends /* code */ NumberDictionary[String]
         with /* code */ StringDictionary[String]
  }
  
  /**
    * @hidden
    */
  @js.native
  object FileSystem extends js.Object {
    
    var AsyncMirror: TypeofAsyncMirror = js.native
    
    var Dropbox: TypeofDropbox = js.native
    
    var Emscripten: TypeofEmscripten = js.native
    
    var FolderAdapter: TypeofFolderAdapter = js.native
    
    var HTML5FS: TypeofHTML5FS = js.native
    
    var InMemory: TypeofInMemory = js.native
    
    var IndexedDB: TypeofIndexedDB = js.native
    
    var IsoFS: TypeofIsoFS = js.native
    
    var LocalStorage: TypeofLocalStorage = js.native
    
    var MountableFileSystem: TypeofMountableFileSystem = js.native
    
    var OverlayFS: TypeofOverlayFS = js.native
    
    var WorkerFS: TypeofWorkerFS = js.native
    
    var XmlHttpRequest: TypeofXmlHttpRequest = js.native
    
    var ZipFS: TypeofZipFS = js.native
  }
}
