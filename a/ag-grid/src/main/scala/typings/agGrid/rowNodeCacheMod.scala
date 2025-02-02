package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.loggerMod.Logger
import typings.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typings.agGrid.rowNodeBlockMod.RowNodeBlock
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.utilsMod.NumberSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowNodeCacheMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
  @js.native
  abstract class RowNodeCache[T /* <: RowNodeBlock */, P /* <: RowNodeCacheParams */] protected () extends BeanStub {
    /* protected */ def this(cacheParams: P) = this()
    
    /* private */ var active: js.Any = js.native
    
    /* private */ var blockCount: js.Any = js.native
    
    var blocks: StringDictionary[T] = js.native
    
    /* protected */ var cacheParams: P = js.native
    
    /* protected */ def checkBlockToLoad(): Unit = js.native
    
    /* protected */ def checkVirtualRowCount(block: T, lastRow: js.Any): Unit = js.native
    
    /* protected */ def destroyBlock(block: T): Unit = js.native
    
    /* private */ def forEachBlockId(ids: js.Any, callback: js.Any): js.Any = js.native
    
    def forEachBlockInOrder(callback: js.Function2[/* block */ T, /* id */ Double, Unit]): Unit = js.native
    
    /* protected */ def forEachBlockInReverseOrder(callback: js.Function2[/* block */ T, /* id */ Double, Unit]): Unit = js.native
    
    def forEachNodeDeep(callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit], sequence: NumberSequence): Unit = js.native
    
    /* protected */ def getBlock(blockId: String): T = js.native
    /* protected */ def getBlock(blockId: Double): T = js.native
    
    /* protected */ def getBlockIdsSorted(): js.Array[Double] = js.native
    
    def getRow(rowIndex: Double): RowNode = js.native
    
    def getRowNodesInRange(firstInRange: RowNode, lastInRange: RowNode): js.Array[RowNode] = js.native
    
    def getVirtualRowCount(): Double = js.native
    
    def hack_setVirtualRowCount(virtualRowCount: Double): Unit = js.native
    
    /* protected */ def init(): Unit = js.native
    
    def isActive(): Boolean = js.native
    
    def isMaxRowFound(): Boolean = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /* private */ var maxRowFound: js.Any = js.native
    
    /* protected */ def onCacheUpdated(): Unit = js.native
    
    /* protected */ def onPageLoaded(event: js.Any): Unit = js.native
    
    /* protected */ def postCreateBlock(newBlock: T): Unit = js.native
    
    /* private */ def purgeBlocksIfNeeded(blockToExclude: js.Any): js.Any = js.native
    
    def purgeCache(): Unit = js.native
    
    /* protected */ def removeBlockFromCache(blockToRemove: T): Unit = js.native
    
    /* protected */ def setBlock(id: Double, block: T): Unit = js.native
    
    def setVirtualRowCount(rowCount: Double): Unit = js.native
    def setVirtualRowCount(rowCount: Double, maxRowFound: Boolean): Unit = js.native
    
    /* private */ var virtualRowCount: js.Any = js.native
  }
  /* static members */
  object RowNodeCache {
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache.EVENT_CACHE_UPDATED")
    @js.native
    def EVENT_CACHE_UPDATED: String = js.native
    inline def EVENT_CACHE_UPDATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CACHE_UPDATED")(x.asInstanceOf[js.Any])
  }
  
  type CacheUpdatedEvent = AgEvent
  
  trait RowNodeCacheParams extends StObject {
    
    var blockSize: Double
    
    var dynamicRowHeight: Boolean
    
    var filterModel: js.Any
    
    var initialRowCount: Double
    
    var lastAccessedSequence: NumberSequence
    
    var maxBlocksInCache: Double
    
    var maxConcurrentRequests: Double
    
    var overflowSize: Double
    
    var rowHeight: Double
    
    var rowNodeBlockLoader: RowNodeBlockLoader
    
    var sortModel: js.Any
  }
  object RowNodeCacheParams {
    
    inline def apply(
      blockSize: Double,
      dynamicRowHeight: Boolean,
      filterModel: js.Any,
      initialRowCount: Double,
      lastAccessedSequence: NumberSequence,
      maxBlocksInCache: Double,
      maxConcurrentRequests: Double,
      overflowSize: Double,
      rowHeight: Double,
      rowNodeBlockLoader: RowNodeBlockLoader,
      sortModel: js.Any
    ): RowNodeCacheParams = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNodeCacheParams]
    }
    
    extension [Self <: RowNodeCacheParams](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setDynamicRowHeight(value: Boolean): Self = StObject.set(x, "dynamicRowHeight", value.asInstanceOf[js.Any])
      
      inline def setFilterModel(value: js.Any): Self = StObject.set(x, "filterModel", value.asInstanceOf[js.Any])
      
      inline def setInitialRowCount(value: Double): Self = StObject.set(x, "initialRowCount", value.asInstanceOf[js.Any])
      
      inline def setLastAccessedSequence(value: NumberSequence): Self = StObject.set(x, "lastAccessedSequence", value.asInstanceOf[js.Any])
      
      inline def setMaxBlocksInCache(value: Double): Self = StObject.set(x, "maxBlocksInCache", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
      
      inline def setOverflowSize(value: Double): Self = StObject.set(x, "overflowSize", value.asInstanceOf[js.Any])
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowNodeBlockLoader(value: RowNodeBlockLoader): Self = StObject.set(x, "rowNodeBlockLoader", value.asInstanceOf[js.Any])
      
      inline def setSortModel(value: js.Any): Self = StObject.set(x, "sortModel", value.asInstanceOf[js.Any])
    }
  }
}
