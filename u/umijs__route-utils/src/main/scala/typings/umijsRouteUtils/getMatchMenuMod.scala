package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.typesMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", JSImport.Namespace)
@js.native
object getMatchMenuMod extends js.Object {
  def default(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  def genKeysToArray(menuKey: String): js.Array[String] = js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  def getMenuMatches(flatMenuKeys: js.UndefOr[scala.Nothing], path: String, flatMenus: StringDictionary[MenuDataItem]): js.UndefOr[String] = js.native
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String, flatMenus: StringDictionary[MenuDataItem]): js.UndefOr[String] = js.native
}

