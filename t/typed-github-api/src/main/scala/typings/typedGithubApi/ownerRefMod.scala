package typings.typedGithubApi

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.User
import typings.typedGithubApi.organizationMod.Organization
import typings.typedGithubApi.typedGithubApiStrings.`private`
import typings.typedGithubApi.typedGithubApiStrings.all
import typings.typedGithubApi.typedGithubApiStrings.created
import typings.typedGithubApi.typedGithubApiStrings.forks
import typings.typedGithubApi.typedGithubApiStrings.full_name
import typings.typedGithubApi.typedGithubApiStrings.member
import typings.typedGithubApi.typedGithubApiStrings.owner
import typings.typedGithubApi.typedGithubApiStrings.public
import typings.typedGithubApi.typedGithubApiStrings.pushed
import typings.typedGithubApi.typedGithubApiStrings.sources
import typings.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ownerRefMod {
  
  @js.native
  trait OwnerRef extends StObject {
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
    
    /**
      * Loads repositories owned by this organisation.
      * @param type      The type of repository to return (default all)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadOrganizationRepositoriesAsync(
      `type`: js.UndefOr[all | public | `private` | forks | sources | member],
      sort: js.UndefOr[created | updated | pushed | full_name],
      ascending: js.UndefOr[Boolean]
    ): js.Promise[js.Array[Repository]] = js.native
    
    /**
      * Loads repositories accessible to this user.
      * @param type      The type of search (default owner)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: member, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: owner, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(`type`: all): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(`type`: all, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(`type`: Unit, sort: created): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(`type`: Unit, sort: created, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(`type`: Unit, sort: full_name): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(`type`: Unit, sort: full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(`type`: member): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(`type`: member, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(`type`: owner): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(`type`: owner, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(`type`: Unit, sort: pushed): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(`type`: Unit, sort: pushed, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(`type`: Unit, sort: updated): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(`type`: Unit, sort: updated, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    def loadUserAsync(): js.Promise[User | Null] = js.native
    
    var login: String = js.native
  }
}
