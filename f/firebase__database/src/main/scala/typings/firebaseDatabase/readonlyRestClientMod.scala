package typings.firebaseDatabase

import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.serverActionsMod.ServerActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyRestClientMod {
  
  @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient")
  @js.native
  class ReadonlyRestClient protected () extends ServerActions {
    /**
      * @param {!RepoInfo} repoInfo_ Data about the namespace we are connecting to
      * @param {function(string, *, boolean, ?number)} onDataUpdate_ A callback for new data from the server
      * @param {AuthTokenProvider} authTokenProvider_
      * @implements {ServerActions}
      */
    def this(
      repoInfo_ : RepoInfo,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    
    /* private */ var authTokenProvider_ : js.Any = js.native
    
    /**
      * We don't actually need to track listens, except to prevent us calling an onComplete for a listen
      * that's been removed. :-/
      *
      * @private {!Object.<string, !Object>}
      */
    /* private */ var listens_ : js.Any = js.native
    
    /** @private {function(...[*])} */
    /* private */ var log_ : js.Any = js.native
    
    /* private */ var onDataUpdate_ : js.Any = js.native
    
    /* private */ var repoInfo_ : js.Any = js.native
    
    /**
      * Performs a REST request to the given path, with the provided query string parameters,
      * and any auth credentials we have.
      *
      * @param {!string} pathString
      * @param {!Object.<string, *>} queryStringParameters
      * @param {?function(?number, *=)} callback
      * @private
      */
    /* private */ var restRequest_ : js.Any = js.native
  }
  /* static members */
  object ReadonlyRestClient {
    
    @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {!Query} query
      * @param {?number=} tag
      * @return {string}
      * @private
      */
    inline def getListenId_(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListenId_")(query.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getListenId_(query: Query, tag: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getListenId_")(query.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
