package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.Accesstoken
import typings.maximMazurokGapiClientPeople.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends js.Object {
  
  /**
    * Modify the members of a contact group owned by the authenticated user. The only system contact groups that can have members added are `contactGroups/myContacts` and
    * `contactGroups/starred`. Other system contact groups are deprecated and can only have contacts removed.
    */
  def modify(request: Accesstoken): Request[ModifyContactGroupMembersResponse] = js.native
  def modify(request: Alt, body: ModifyContactGroupMembersRequest): Request[ModifyContactGroupMembersResponse] = js.native
}
