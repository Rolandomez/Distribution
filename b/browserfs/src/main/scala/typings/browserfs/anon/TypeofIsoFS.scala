package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.isoFSMod.IsoFS
import typings.browserfs.isoFSMod.IsoFSOptions
import typings.browserfs.isoFSMod.default
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIsoFS
  extends StObject
     with Instantiable1[/* data */ Buffer, default]
     with Instantiable2[/* data */ Buffer, /* name */ String, default]
     with Instantiable3[
      /* data */ Buffer, 
      (/* name */ String) | (/* name */ Unit), 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
