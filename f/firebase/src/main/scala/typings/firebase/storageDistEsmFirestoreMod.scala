package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.CacheSizeBytes
import typings.firebaseFirestore.anon.CompleteError
import typings.firebaseFirestore.anon.CompleteErrorNext
import typings.firebaseFirestore.anon.ErrorNext
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.`4`
import typings.firebaseFirestore.mod.AggregateSpec
import typings.firebaseFirestore.mod.DocumentData
import typings.firebaseFirestore.mod.FirestoreSettings
import typings.firebaseFirestore.mod.IndexConfiguration
import typings.firebaseFirestore.mod.MemoryCacheSettings
import typings.firebaseFirestore.mod.MemoryEagerGarbageCollector_
import typings.firebaseFirestore.mod.MemoryLocalCache_
import typings.firebaseFirestore.mod.MemoryLruGarbageCollector_
import typings.firebaseFirestore.mod.OrderByDirection
import typings.firebaseFirestore.mod.PartialWithFieldValue
import typings.firebaseFirestore.mod.PersistenceSettings
import typings.firebaseFirestore.mod.PersistentCacheSettings
import typings.firebaseFirestore.mod.PersistentLocalCache_
import typings.firebaseFirestore.mod.PersistentMultipleTabManager_
import typings.firebaseFirestore.mod.PersistentSingleTabManagerSettings
import typings.firebaseFirestore.mod.PersistentSingleTabManager_
import typings.firebaseFirestore.mod.QueryFilterConstraint
import typings.firebaseFirestore.mod.QueryNonFilterConstraint
import typings.firebaseFirestore.mod.SetOptions
import typings.firebaseFirestore.mod.SnapshotListenOptions
import typings.firebaseFirestore.mod.TransactionOptions
import typings.firebaseFirestore.mod.Unsubscribe
import typings.firebaseFirestore.mod.UpdateData
import typings.firebaseFirestore.mod.WhereFilterOp
import typings.firebaseFirestore.mod.WithFieldValue
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageDistEsmFirestoreMod {
  
  @JSImport("firebase/storage/dist/esm/firestore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/storage/dist/esm/firestore", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.mod.AggregateField[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "AggregateQuerySnapshot")
  @js.native
  /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] ()
    extends typings.firebaseFirestore.mod.AggregateQuerySnapshot[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "Bytes")
  @js.native
  /* private */ open class Bytes ()
    extends typings.firebaseFirestore.mod.Bytes
  /* static members */
  object Bytes {
    
    @JSImport("firebase/storage/dist/esm/firestore", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typings.firebaseFirestore.mod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.mod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Bytes]
  }
  
  @JSImport("firebase/storage/dist/esm/firestore", "CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: /* -1 */ Double = js.native
  
  @JSImport("firebase/storage/dist/esm/firestore", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends typings.firebaseFirestore.mod.CollectionReference[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends typings.firebaseFirestore.mod.DocumentReference[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends typings.firebaseFirestore.mod.DocumentSnapshot[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.mod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/storage/dist/esm/firestore", "FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends typings.firebaseFirestore.mod.FieldValue
  
  @JSImport("firebase/storage/dist/esm/firestore", "Firestore")
  @js.native
  /* private */ open class Firestore ()
    extends typings.firebaseFirestore.mod.Firestore
  
  @JSImport("firebase/storage/dist/esm/firestore", "FirestoreError")
  @js.native
  /* private */ open class FirestoreError ()
    extends typings.firebaseFirestore.mod.FirestoreError
  
  @JSImport("firebase/storage/dist/esm/firestore", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.mod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("firebase/storage/dist/esm/firestore", "LoadBundleTask")
  @js.native
  open class LoadBundleTask ()
    extends typings.firebaseFirestore.mod.LoadBundleTask
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryCompositeFilterConstraint")
  @js.native
  open class QueryCompositeFilterConstraint ()
    extends typings.firebaseFirestore.mod.QueryCompositeFilterConstraint
  
  /* note: abstract class */ @JSImport("firebase/storage/dist/esm/firestore", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.mod.QueryConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryDocumentSnapshot")
  @js.native
  /* protected */ open class QueryDocumentSnapshot[T] ()
    extends typings.firebaseFirestore.mod.QueryDocumentSnapshot[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryEndAtConstraint")
  @js.native
  open class QueryEndAtConstraint ()
    extends typings.firebaseFirestore.mod.QueryEndAtConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryFieldFilterConstraint")
  @js.native
  open class QueryFieldFilterConstraint ()
    extends typings.firebaseFirestore.mod.QueryFieldFilterConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryLimitConstraint")
  @js.native
  open class QueryLimitConstraint ()
    extends typings.firebaseFirestore.mod.QueryLimitConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryOrderByConstraint")
  @js.native
  open class QueryOrderByConstraint ()
    extends typings.firebaseFirestore.mod.QueryOrderByConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends typings.firebaseFirestore.mod.QuerySnapshot[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "QueryStartAtConstraint")
  @js.native
  open class QueryStartAtConstraint ()
    extends typings.firebaseFirestore.mod.QueryStartAtConstraint
  
  @JSImport("firebase/storage/dist/esm/firestore", "Query")
  @js.native
  /* protected */ open class Query_[T] ()
    extends typings.firebaseFirestore.mod.Query_[T]
  
  @JSImport("firebase/storage/dist/esm/firestore", "SnapshotMetadata")
  @js.native
  /* private */ open class SnapshotMetadata ()
    extends typings.firebaseFirestore.mod.SnapshotMetadata
  
  @JSImport("firebase/storage/dist/esm/firestore", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.mod.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds - The number of seconds of UTC time since Unix epoch
      *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      *     9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds - The non-negative fractions of a second at nanosecond
      *     resolution. Negative second values with fractions must still have
      *     non-negative nanoseconds values that count forward in time. Must be
      *     from 0 to 999,999,999 inclusive.
      */
    def this(
      /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    seconds: Double,
      /**
      * The fractions of a second at nanosecond resolution.*
      */
    nanoseconds: Double
    ) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("firebase/storage/dist/esm/firestore", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
  }
  
  @JSImport("firebase/storage/dist/esm/firestore", "Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends typings.firebaseFirestore.mod.Transaction
  
  @JSImport("firebase/storage/dist/esm/firestore", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch_ ()
    extends typings.firebaseFirestore.mod.WriteBatch_
  
  inline def addDoc[T](reference: typings.firebaseFirestore.mod.CollectionReference[T], data: WithFieldValue[T]): js.Promise[typings.firebaseFirestore.mod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.DocumentReference[T]]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typings.firebaseFirestore.mod.AggregateQuerySnapshot[T],
    right: typings.firebaseFirestore.mod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def and(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.mod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryCompositeFilterConstraint]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.FieldValue]
  
  inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def collection(firestore: typings.firebaseFirestore.mod.Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.mod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.mod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: typings.firebaseFirestore.mod.Firestore, collectionId: String): typings.firebaseFirestore.mod.Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.Query_[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: typings.firebaseFirestore.mod.Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.mod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(reference: typings.firebaseFirestore.mod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.mod.FieldValue]
  
  inline def disableNetwork(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def doc(firestore: typings.firebaseFirestore.mod.Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.mod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.mod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.mod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.mod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.mod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.DocumentReference[T]]
  inline def doc[T](reference: typings.firebaseFirestore.mod.CollectionReference[T], path: Unit, pathSegments: String*): typings.firebaseFirestore.mod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.mod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.mod.FieldPath]
  
  inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.mod.Firestore, persistenceSettings: PersistenceSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableNetwork(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.mod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryEndAtConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.mod.DocumentSnapshot[Any]): typings.firebaseFirestore.mod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryEndAtConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.mod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryEndAtConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.mod.DocumentSnapshot[Any]): typings.firebaseFirestore.mod.QueryEndAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryEndAtConstraint]
  
  inline def getCountFromServer(query: typings.firebaseFirestore.mod.Query_[Any]): js.Promise[typings.firebaseFirestore.mod.AggregateQuerySnapshot[`4`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.AggregateQuerySnapshot[`4`]]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocFromCache[T](reference: typings.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocFromServer[T](reference: typings.firebaseFirestore.mod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: typings.firebaseFirestore.mod.Query_[T]): js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getDocsFromCache[T](query: typings.firebaseFirestore.mod.Query_[T]): js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getDocsFromServer[T](query: typings.firebaseFirestore.mod.Query_[T]): js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typings.firebaseFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.mod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.mod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.mod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.Firestore]
  
  inline def limit(limit: Double): typings.firebaseFirestore.mod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryLimitConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.mod.QueryLimitConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryLimitConstraint]
  
  inline def loadBundle(firestore: typings.firebaseFirestore.mod.Firestore, bundleData: String): typings.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.LoadBundleTask]
  inline def loadBundle(firestore: typings.firebaseFirestore.mod.Firestore, bundleData: js.typedarray.ArrayBuffer): typings.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.mod.Firestore,
    bundleData: ReadableStream[js.typedarray.Uint8Array]
  ): typings.firebaseFirestore.mod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.LoadBundleTask]
  
  inline def memoryEagerGarbageCollector(): MemoryEagerGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryEagerGarbageCollector")().asInstanceOf[MemoryEagerGarbageCollector_]
  
  inline def memoryLocalCache(): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")().asInstanceOf[MemoryLocalCache_]
  inline def memoryLocalCache(settings: MemoryCacheSettings): MemoryLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLocalCache_]
  
  inline def memoryLruGarbageCollector(): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")().asInstanceOf[MemoryLruGarbageCollector_]
  inline def memoryLruGarbageCollector(settings: CacheSizeBytes): MemoryLruGarbageCollector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLruGarbageCollector")(settings.asInstanceOf[js.Any]).asInstanceOf[MemoryLruGarbageCollector_]
  
  inline def namedQuery(firestore: typings.firebaseFirestore.mod.Firestore, name: String): js.Promise[typings.firebaseFirestore.mod.Query_[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseFirestore.mod.Query_[DocumentData] | Null]]
  
  inline def onSnapshot[T](query: typings.firebaseFirestore.mod.Query_[T], observer: ErrorNext[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    observer: ErrorNext[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](reference: typings.firebaseFirestore.mod.DocumentReference[T], observer: CompleteError[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    observer: CompleteError[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.mod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.mod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.mod.Firestore, observer: CompleteErrorNext): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.mod.Firestore, onSync: js.Function0[Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def or(queryConstraints: QueryFilterConstraint*): typings.firebaseFirestore.mod.QueryCompositeFilterConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(queryConstraints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryCompositeFilterConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.mod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.mod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.mod.FieldPath): typings.firebaseFirestore.mod.QueryOrderByConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryOrderByConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.mod.FieldPath, directionStr: OrderByDirection): typings.firebaseFirestore.mod.QueryOrderByConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.QueryOrderByConstraint]
  
  inline def persistentLocalCache(): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")().asInstanceOf[PersistentLocalCache_]
  inline def persistentLocalCache(settings: PersistentCacheSettings): PersistentLocalCache_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentLocalCache")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentLocalCache_]
  
  inline def persistentMultipleTabManager(): PersistentMultipleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentMultipleTabManager")().asInstanceOf[PersistentMultipleTabManager_]
  
  inline def persistentSingleTabManager(): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")().asInstanceOf[PersistentSingleTabManager_]
  inline def persistentSingleTabManager(settings: PersistentSingleTabManagerSettings): PersistentSingleTabManager_ = ^.asInstanceOf[js.Dynamic].applyDynamic("persistentSingleTabManager")(settings.asInstanceOf[js.Any]).asInstanceOf[PersistentSingleTabManager_]
  
  inline def query[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    compositeFilter: typings.firebaseFirestore.mod.QueryCompositeFilterConstraint,
    queryConstraints: QueryNonFilterConstraint*
  ): typings.firebaseFirestore.mod.Query_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(query.asInstanceOf[js.Any], compositeFilter.asInstanceOf[js.Any])).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.Query_[T]]
  inline def query[T](
    query: typings.firebaseFirestore.mod.Query_[T],
    queryConstraints: typings.firebaseFirestore.mod.QueryConstraint*
  ): typings.firebaseFirestore.mod.Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.firebaseFirestore.mod.Query_[T]]
  
  inline def queryEqual[T](left: typings.firebaseFirestore.mod.Query_[T], right: typings.firebaseFirestore.mod.Query_[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.mod.CollectionReference[T],
    right: typings.firebaseFirestore.mod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.mod.CollectionReference[T],
    right: typings.firebaseFirestore.mod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.mod.DocumentReference[T],
    right: typings.firebaseFirestore.mod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.mod.DocumentReference[T],
    right: typings.firebaseFirestore.mod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.mod.Firestore,
    updateFunction: js.Function1[/* transaction */ typings.firebaseFirestore.mod.Transaction, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.mod.Firestore,
    updateFunction: js.Function1[/* transaction */ typings.firebaseFirestore.mod.Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.mod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.mod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.mod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](reference: typings.firebaseFirestore.mod.DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.mod.Firestore, configuration: IndexConfiguration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.mod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.mod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.mod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.mod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.mod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.mod.QuerySnapshot[T],
    right: typings.firebaseFirestore.mod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.mod.QuerySnapshot[T],
    right: typings.firebaseFirestore.mod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.mod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryStartAtConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.mod.DocumentSnapshot[Any]): typings.firebaseFirestore.mod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryStartAtConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.mod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.mod.QueryStartAtConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.mod.DocumentSnapshot[Any]): typings.firebaseFirestore.mod.QueryStartAtConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.QueryStartAtConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.mod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.mod.DocumentReference[Any],
    field: typings.firebaseFirestore.mod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: typings.firebaseFirestore.mod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitForPendingWrites(firestore: typings.firebaseFirestore.mod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.mod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.QueryFieldFilterConstraint]
  inline def where(fieldPath: typings.firebaseFirestore.mod.FieldPath, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.mod.QueryFieldFilterConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.mod.QueryFieldFilterConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.mod.Firestore): typings.firebaseFirestore.mod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.WriteBatch_]
}
