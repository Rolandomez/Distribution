package typings.oracleOraclejet.ojlistviewMod

import typings.oracleOraclejet.anon.AccessibleNavigateSkipItems
import typings.oracleOraclejet.anon.DragDrop
import typings.oracleOraclejet.anon.FetchSize
import typings.oracleOraclejet.anon.Focusable
import typings.oracleOraclejet.anon.Key
import typings.oracleOraclejet.anon.KeyK
import typings.oracleOraclejet.anon.OffsetX
import typings.oracleOraclejet.anon.Parent
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojlistviewMod.ojListView.ContextByNode
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.currentItem
import typings.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dnd
import typings.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typings.oracleOraclejet.oracleOraclejetStrings.drillMode
import typings.oracleOraclejet.oracleOraclejetStrings.drillModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.groupHeaderPosition
import typings.oracleOraclejet.oracleOraclejetStrings.groupHeaderPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.item
import typings.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojCopy
import typings.oracleOraclejet.oracleOraclejetStrings.ojCut
import typings.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typings.oracleOraclejet.oracleOraclejetStrings.ojPaste
import typings.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicy
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyChanged
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptions
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptionsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typings.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typings.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRequired
import typings.oracleOraclejet.oracleOraclejetStrings.selectionRequiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.static
import typings.oracleOraclejet.oracleOraclejetStrings.sticky
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojListView_[K, D] extends baseComponent[ojListViewSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[collapsible | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[collapsible | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[static | sticky], _]
  ): Unit = js.native
  def addEventListener(
    `type`: groupHeaderPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[static | sticky], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], _]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentItemChanged(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DataProvider[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DataProvider[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DragDrop], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[DragDrop], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[KeySet[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Key[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstSelectedItemChanged(
    `type`: firstSelectedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Key[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Focusable[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Focusable[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse[K], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse[K], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem[K], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem[K], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand[K], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand[K], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCollapse[K], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCollapse[K], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: ojCopy,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCopy, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCopy(
    `type`: ojCopy,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCopy, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: ojCut,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCut, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCut(
    `type`: ojCut,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCut, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojExpand[K], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojExpand[K], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: ojPaste,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojPaste, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojPaste(
    `type`: ojPaste,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojPaste, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojReorder, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojReorder, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FetchSize], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FetchSize], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OffsetX[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[OffsetX[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[K]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  
  var as: String = js.native
  
  var currentItem: K = js.native
  
  var data: DataProvider[K, D] = js.native
  
  var dnd: DragDrop = js.native
  
  var drillMode: collapsible | none = js.native
  
  var expanded: KeySet[K] = js.native
  
  val firstSelectedItem: Key[K, D] = js.native
  
  def getContextByNode(node: Element): ContextByNode[K] | Null = js.native
  
  def getDataForVisibleItem(context: Parent[K]): D = js.native
  
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): DragDrop = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): collapsible | none = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedItem(property: typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedItem): Key[K, D] = js.native
  @JSName("getProperty")
  def getProperty_groupHeaderPosition(property: groupHeaderPosition): static | sticky = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Focusable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): FetchSize = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): OffsetX[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  
  var groupHeaderPosition: static | sticky = js.native
  
  var item: Focusable[K, D] = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[DataProvider[K, D]], _]) | Null = js.native
  
  var onDndChanged: (js.Function1[/* event */ JetElementCustomEvent[DragDrop], _]) | Null = js.native
  
  var onDrillModeChanged: (js.Function1[/* event */ JetElementCustomEvent[collapsible | none], _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[KeySet[K]], _]) | Null = js.native
  
  var onFirstSelectedItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Key[K, D]], _]) | Null = js.native
  
  var onGroupHeaderPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[static | sticky], _]) | Null = js.native
  
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Focusable[K, D]], _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateEnd, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojAnimateStart, _]) | Null = js.native
  
  var onOjBeforeCollapse: (js.Function1[
    /* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCollapse[K], 
    _
  ]) | Null = js.native
  
  var onOjBeforeCurrentItem: (js.Function1[
    /* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeCurrentItem[K], 
    _
  ]) | Null = js.native
  
  var onOjBeforeExpand: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojBeforeExpand[K], _]) | Null = js.native
  
  var onOjCollapse: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCollapse[K], _]) | Null = js.native
  
  var onOjCopy: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCopy, _]) | Null = js.native
  
  var onOjCut: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojCut, _]) | Null = js.native
  
  var onOjExpand: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojExpand[K], _]) | Null = js.native
  
  var onOjPaste: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojPaste, _]) | Null = js.native
  
  var onOjReorder: (js.Function1[/* event */ typings.oracleOraclejet.ojlistviewMod.ojListView.ojReorder, _]) | Null = js.native
  
  var onScrollPolicyChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | loadMoreOnScroll], _]) | Null = js.native
  
  var onScrollPolicyOptionsChanged: (js.Function1[/* event */ JetElementCustomEvent[FetchSize], _]) | Null = js.native
  
  var onScrollPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[OffsetX[K]], _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[K]], _]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | single | multiple], _]) | Null = js.native
  
  var onSelectionRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  
  var scrollPolicyOptions: FetchSize = js.native
  
  var scrollPosition: OffsetX[K] = js.native
  
  def scrollToItem(item: KeyK[K]): Unit = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: none | single | multiple = js.native
  
  var selectionRequired: Boolean = js.native
  
  def setProperties(properties: ojListViewSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: static): Unit = js.native
  def setProperty(property: groupHeaderPosition, value: sticky): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: DragDrop): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedItem(property: typings.oracleOraclejet.oracleOraclejetStrings.firstSelectedItem, value: Key[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Focusable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: FetchSize): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: OffsetX[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AccessibleNavigateSkipItems): Unit = js.native
  
  @JSName("translations")
  var translations_ojListView_ : AccessibleNavigateSkipItems = js.native
}
