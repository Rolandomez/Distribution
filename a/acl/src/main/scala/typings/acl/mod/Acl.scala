package typings.acl.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acl extends js.Object {
  
  def addRoleParents(role: String, parents: Values): typings.bluebird.mod.^[Unit] = js.native
  def addRoleParents(role: String, parents: Values, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def addUserRoles(userId: Value, roles: strings): typings.bluebird.mod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def allow(aclSets: js.Array[AclSet]): typings.bluebird.mod.^[Unit] = js.native
  def allow(aclSets: AclSet): typings.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def allowedPermissions(userId: Value, resources: strings): typings.bluebird.mod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): typings.bluebird.mod.^[Unit] = js.native
  
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typings.bluebird.mod.^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[_] = js.native
  
  def hasRole(userId: Value, role: String): typings.bluebird.mod.^[Boolean] = js.native
  def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ Error, /* isInRole */ Boolean, _]): typings.bluebird.mod.^[Boolean] = js.native
  
  def isAllowed(userId: Value, resources: strings, permissions: strings): typings.bluebird.mod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[Boolean] = js.native
  
  def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: js.UndefOr[Value], actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: GetUserId): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: Value): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: Double, userId: js.UndefOr[Value], actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def middleware(numPathComponents: Double, userId: Value): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def permittedResources(roles: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def removeAllow(role: String, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def removePermissions(role: String, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def removeResource(resource: String): typings.bluebird.mod.^[Unit] = js.native
  def removeResource(resource: String, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def removeRole(role: String): typings.bluebird.mod.^[Unit] = js.native
  def removeRole(role: String, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def removeUserRoles(userId: Value, roles: strings): typings.bluebird.mod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
  
  def roleUsers(role: Value): typings.bluebird.mod.^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ Error, /* users */ Values, _]): typings.bluebird.mod.^[_] = js.native
  
  def userRoles(userId: Value): typings.bluebird.mod.^[js.Array[String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ Error, /* roles */ js.Array[String], _]): typings.bluebird.mod.^[js.Array[String]] = js.native
  
  def whatResources(roles: strings): typings.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): typings.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings): typings.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typings.bluebird.mod.^[_] = js.native
}
