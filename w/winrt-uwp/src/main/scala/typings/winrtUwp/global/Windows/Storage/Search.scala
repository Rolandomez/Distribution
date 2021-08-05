package typings.winrtUwp.global.Windows.Storage

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtUwp.Windows.Storage.Search.CommonFileQuery
import typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery
import typings.winrtUwp.Windows.Storage.Search.DateStackOption
import typings.winrtUwp.Windows.Storage.Search.FolderDepth
import typings.winrtUwp.Windows.Storage.Search.IndexerOption
import typings.winrtUwp.Windows.Storage.Search.SortEntry
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for enumerating content in storage and performing Advanced Query Syntax (AQS) searches on the content. */
object Search {
  
  /** Specifies how to sort the files in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, sorted according to the specified option. */
  @JSGlobal("Windows.Storage.Search.CommonFileQuery")
  @js.native
  object CommonFileQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.CommonFileQuery & Double] = js.native
    
    /* 0 */ val defaultQuery: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.defaultQuery & Double = js.native
    
    /* 5 */ val orderByDate: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByDate & Double = js.native
    
    /* 3 */ val orderByMusicProperties: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties & Double = js.native
    
    /* 1 */ val orderByName: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByName & Double = js.native
    
    /* 4 */ val orderBySearchRank: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderBySearchRank & Double = js.native
    
    /* 2 */ val orderByTitle: typings.winrtUwp.Windows.Storage.Search.CommonFileQuery.orderByTitle & Double = js.native
  }
  
  /** Specifies how to group files into folders in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, grouped into folders according to the specified option. */
  @JSGlobal("Windows.Storage.Search.CommonFolderQuery")
  @js.native
  object CommonFolderQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery & Double] = js.native
    
    /* 0 */ val defaultQuery: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.defaultQuery & Double = js.native
    
    /* 4 */ val groupByAlbum: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAlbum & Double = js.native
    
    /* 5 */ val groupByAlbumArtist: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAlbumArtist & Double = js.native
    
    /* 3 */ val groupByArtist: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByArtist & Double = js.native
    
    /* 11 */ val groupByAuthor: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByAuthor & Double = js.native
    
    /* 6 */ val groupByComposer: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByComposer & Double = js.native
    
    /* 7 */ val groupByGenre: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByGenre & Double = js.native
    
    /* 2 */ val groupByMonth: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByMonth & Double = js.native
    
    /* 8 */ val groupByPublishedYear: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByPublishedYear & Double = js.native
    
    /* 9 */ val groupByRating: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByRating & Double = js.native
    
    /* 10 */ val groupByTag: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByTag & Double = js.native
    
    /* 12 */ val groupByType: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByType & Double = js.native
    
    /* 1 */ val groupByYear: typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery.groupByYear & Double = js.native
  }
  
  /** Enables Windows Store apps to place content properties in the system index. */
  @JSGlobal("Windows.Storage.Search.ContentIndexer")
  @js.native
  abstract class ContentIndexer ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.ContentIndexer
  object ContentIndexer {
    
    @JSGlobal("Windows.Storage.Search.ContentIndexer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets an existing per-app index or creates a new one, if necessary.
      * @return The index.
      */
    /* static member */
    inline def getIndexer(): typings.winrtUwp.Windows.Storage.Search.ContentIndexer = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexer")().asInstanceOf[typings.winrtUwp.Windows.Storage.Search.ContentIndexer]
    /**
      * Gets the per-app index with the specified name or creates a new one, if necessary.
      * @param indexName The index name.
      * @return The index.
      */
    /* static member */
    inline def getIndexer(indexName: String): typings.winrtUwp.Windows.Storage.Search.ContentIndexer = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexer")(indexName.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Search.ContentIndexer]
  }
  
  /** Represents a query for content properties in the ContentIndexer . */
  @JSGlobal("Windows.Storage.Search.ContentIndexerQuery")
  @js.native
  abstract class ContentIndexerQuery ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.ContentIndexerQuery
  
  /** Indicates the unit of time used to group files into folders if a CommonFolderQuery based on date is used to create a QueryOptions object. */
  @JSGlobal("Windows.Storage.Search.DateStackOption")
  @js.native
  object DateStackOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.DateStackOption & Double] = js.native
    
    /* 2 */ val month: typings.winrtUwp.Windows.Storage.Search.DateStackOption.month & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.Search.DateStackOption.none & Double = js.native
    
    /* 1 */ val year: typings.winrtUwp.Windows.Storage.Search.DateStackOption.year & Double = js.native
  }
  
  /** Indicates whether all files and subfolders of the folder being queried will be enumerated or if only the top-level files and subfolders will be enumerated. */
  @JSGlobal("Windows.Storage.Search.FolderDepth")
  @js.native
  object FolderDepth extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.FolderDepth & Double] = js.native
    
    /* 1 */ val deep: typings.winrtUwp.Windows.Storage.Search.FolderDepth.deep & Double = js.native
    
    /* 0 */ val shallow: typings.winrtUwp.Windows.Storage.Search.FolderDepth.shallow & Double = js.native
  }
  
  /** Represents app content and properties that can be added to the ContentIndexer . */
  @JSGlobal("Windows.Storage.Search.IndexableContent")
  @js.native
  /** Initializes a new instance of the IndexableContent class. */
  class IndexableContent ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.IndexableContent {
    
    /** Gets or sets the identifier for the content properties in the IndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the content properties. */
    /* CompleteClass */
    var properties: IMap[String, js.Any] = js.native
    
    /** Gets or sets a Stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
    /* CompleteClass */
    var stream: IRandomAccessStream = js.native
    
    /** Specifies the type of content in the Stream . */
    /* CompleteClass */
    var streamContentType: String = js.native
  }
  
  /** Indicates whether a StorageFolder is included in the system index. */
  @JSGlobal("Windows.Storage.Search.IndexedState")
  @js.native
  object IndexedState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.IndexedState & Double] = js.native
    
    /* 3 */ val fullyIndexed: typings.winrtUwp.Windows.Storage.Search.IndexedState.fullyIndexed & Double = js.native
    
    /* 1 */ val notIndexed: typings.winrtUwp.Windows.Storage.Search.IndexedState.notIndexed & Double = js.native
    
    /* 2 */ val partiallyIndexed: typings.winrtUwp.Windows.Storage.Search.IndexedState.partiallyIndexed & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Storage.Search.IndexedState.unknown & Double = js.native
  }
  
  /** Specifies whether the query should use the system index of the file system when enumerating content in the folder being queried. The indexer can retrieve results faster but is not available in all file locations. */
  @JSGlobal("Windows.Storage.Search.IndexerOption")
  @js.native
  object IndexerOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Search.IndexerOption & Double] = js.native
    
    /* 2 */ val doNotUseIndexer: typings.winrtUwp.Windows.Storage.Search.IndexerOption.doNotUseIndexer & Double = js.native
    
    /* 1 */ val onlyUseIndexer: typings.winrtUwp.Windows.Storage.Search.IndexerOption.onlyUseIndexer & Double = js.native
    
    /* 0 */ val useIndexerWhenAvailable: typings.winrtUwp.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable & Double = js.native
  }
  
  /** Specifies the parameters of a search query for enumerating the contents of storage folders. */
  @JSGlobal("Windows.Storage.Search.QueryOptions")
  @js.native
  /** Creates an instance of the QueryOptions class for enumerating storage items, and initializes it with the following default settings: QueryOptions.FolderDepth gets FolderDepth.Shallow and QueryOptions.IndexerOption gets IndexerOption.DoNotUseIndexer . */
  class QueryOptions ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.QueryOptions {
    /**
      * Creates an instance of the QueryOptions class for enumerating subfolders and initializes it with values based on the specified CommonFolderQuery .
      * @param query An enumeration value that specifies how to group the contents of the folder where the query is created into subfolders to enumerate. The subfolders that are retrieved using a CommonFolderQuery can be actual file system folders or virtual folders that represent groups of files (which are determined by the CommonFolderQuery value). For example, the CommonFolderQuery.GroupByArtist uses the Artist of the files in the folder (and its subfolders) to group files, creating one virtual folder (or file group) for each artist.
      */
    def this(query: CommonFolderQuery) = this()
    /**
      * Creates an instance of the QueryOptions class for enumerating files and initializes it with values provided by the specified CommonFileQuery and an optional file type filter that determines which files to include in query results.
      * @param query An enumeration value that specifies the search parameters to use to query files.
      * @param fileTypeFilter An array of file types to be included in the query results. To include all file types, supply null or an array containing a single entry of "*".
      */
    def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
    
    /** Gets or sets an application-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the UserSearchFilter to create the query's search filter. */
    /* CompleteClass */
    var applicationSearchFilter: String = js.native
    
    /** Gets the unit of time used to group files into folders if the QueryOptions object was created with a CommonFolderQuery based on date. For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is DateStackOption.Year . */
    /* CompleteClass */
    var dateStackOption: DateStackOption = js.native
    
    /** Gets a list of file name extensions used to filter the search results. If the list is empty, the results include all file types. */
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /** Indicates whether the search query should produce a shallow view of the folder contents or a deep recursive view of all files and subfolder. */
    /* CompleteClass */
    var folderDepth: FolderDepth = js.native
    
    /** Gets the name of the property used to group query results if the QueryOptions object was created using a CommonFolderQuery . For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is System.ItemDate . */
    /* CompleteClass */
    var groupPropertyName: String = js.native
    
    /** Gets or sets a value that specifies whether the system index or the file system is used to retrieve query results. The indexer can retrieve results faster but is not available in all file locations. */
    /* CompleteClass */
    var indexerOption: IndexerOption = js.native
    
    /** Gets or sets the Internet Engineering Task Force (IETF) language tag (BCP47 standard) that identifies the language associated with the query. This determines the language-specific algorithm used by the system to break the query into individual search tokens. */
    /* CompleteClass */
    var language: String = js.native
    
    /**
      * Initializes the current instance of the QueryOptions class with search parameters specified by a string that was created by the SaveToString method.
      * @param value A string retrieved by a previous call to SaveToString .
      */
    /* CompleteClass */
    override def loadFromString(value: String): Unit = js.native
    
    /**
      * Converts the values of a QueryOptions object to a string that can be used to initialize the values of a QueryOptions object by calling LoadFromString .
      * @return A string representing the serialized settings of a QueryOptions instance.
      */
    /* CompleteClass */
    override def saveToString(): String = js.native
    
    /**
      * Specifies properties that the system should load in advance for all items in the query result set while the query is being executed (instead of retrieving them on a case-by-case basis). If many properties are specified, the query might take longer to execute, but subsequent property retrieval on query results will be faster.
      * @param options A value that specifies the set of properties to retrieve in advance.
      * @param propertiesToRetrieve A custom list of properties to retrieve in advance as an array of property names. Use the system property names to specify properties, for example "System.Copyright" and "System.Image.ColorSpace".
      */
    /* CompleteClass */
    override def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
    
    /**
      * Specifies the type and size of thumbnails that the system should start loading immediately when items are accessed (instead of retrieving them on a case-by-case basis). This uses more resources but makes thumbnail retrieval on query results faster.
      * @param mode The enumeration value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
      * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to return a thumbnail image that can be scaled to the requested size without reducing the quality of the image.
      * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
      */
    /* CompleteClass */
    override def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
    
    /** Gets the list of SortEntry structures that specify how to sort content (like files and subfolders) in query results. Use this list to customize how query results are sorted. */
    /* CompleteClass */
    var sortOrder: IVector[SortEntry] = js.native
    
    /** Gets the filter for storage provider identifiers. */
    /* CompleteClass */
    var storageProviderIdFilter: IVector[String] = js.native
    
    /** Gets or sets a user-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the ApplicationSearchFilter to create the query's search filter. */
    /* CompleteClass */
    var userSearchFilter: String = js.native
  }
  
  /** Provides access to the sorting criteria of the query results as a collection of SortEntry objects. */
  @JSGlobal("Windows.Storage.Search.SortEntryVector")
  @js.native
  abstract class SortEntryVector ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.SortEntryVector
  
  /** Provides access to the results of a query of the files in the location that is represented by a storageFolder object. You can use storageFileQueryResult to enumerate the files in that storageFolder location. */
  @JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
  @js.native
  abstract class StorageFileQueryResult ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
  
  /** Provides access to the results of a query that lists the folder (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use a storageFolderQueryResult to enumerate folders or file groups in that folder. */
  @JSGlobal("Windows.Storage.Search.StorageFolderQueryResult")
  @js.native
  abstract class StorageFolderQueryResult ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.StorageFolderQueryResult
  
  /** Provides access to the results of a query that lists all items including files and folders (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use storageItemQueryResult to enumerate the files and folders in that storageFolder . */
  @JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
  @js.native
  abstract class StorageItemQueryResult ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.StorageItemQueryResult
  
  /** Details about a change to storage library content. */
  @JSGlobal("Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails")
  @js.native
  abstract class StorageLibraryContentChangedTriggerDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails {
    
    /**
      * Query for the creation/modified changes since a previous such query.
      * @param lastQueryTime The time the previous query was made.
      * @return The query result.
      */
    /* CompleteClass */
    override def createModifiedSinceQuery(lastQueryTime: Date): typings.winrtUwp.Windows.Storage.Search.StorageItemQueryResult = js.native
    
    /** Gets the StorageFolder that has been changed. */
    /* CompleteClass */
    var folder: typings.winrtUwp.Windows.Storage.StorageFolder = js.native
  }
  
  /** Specifies the language of a property, as a BCP-47 language code. */
  @JSGlobal("Windows.Storage.Search.ValueAndLanguage")
  @js.native
  /** Initializes a new instance of the ValueAndLanguage class. */
  class ValueAndLanguage ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Search.ValueAndLanguage {
    
    /** Gets or sets the language of the property value, specified as a BCP-47 language code. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the property value for the current ValueAndLanguage . */
    /* CompleteClass */
    var value: js.Any = js.native
  }
}
