package typings.jestHasteMap

import typings.jestHasteMap.anon.Files
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Iterable
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-haste-map/build/HasteFS", JSImport.Namespace)
@js.native
object hasteFSMod extends js.Object {
  
  @js.native
  trait HasteFS extends js.Object {
    
    val _files: js.Any = js.native
    
    var _getFileData: js.Any = js.native
    
    val _rootDir: js.Any = js.native
    
    def exists(file: Path): Boolean = js.native
    
    def getAbsoluteFileIterator(): Iterable[Path] = js.native
    
    def getAllFiles(): js.Array[Path] = js.native
    
    def getDependencies(file: Path): js.Array[String] | Null = js.native
    
    def getFileIterator(): Iterable[Path] = js.native
    
    def getModuleName(file: Path): String | Null = js.native
    
    def getSha1(file: Path): String | Null = js.native
    
    def getSize(file: Path): Double | Null = js.native
    
    def matchFiles(pattern: String): js.Array[Path] = js.native
    def matchFiles(pattern: RegExp): js.Array[Path] = js.native
    
    def matchFilesWithGlob(globs: js.Array[Glob]): Set[Path] = js.native
    def matchFilesWithGlob(globs: js.Array[Glob], root: Path): Set[Path] = js.native
  }
  
  @js.native
  class default protected () extends HasteFS {
    def this(hasRootDirFiles: Files) = this()
  }
}
