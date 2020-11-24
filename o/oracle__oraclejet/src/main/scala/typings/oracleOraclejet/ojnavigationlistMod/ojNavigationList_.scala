package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.DefaultRootLabel
import typings.oracleOraclejet.anon.Selectable
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.NodeContext
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.collapsible
import typings.oracleOraclejet.oracleOraclejetStrings.currentItem
import typings.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.display
import typings.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.drillMode
import typings.oracleOraclejet.oracleOraclejetStrings.drillModeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.edge
import typings.oracleOraclejet.oracleOraclejetStrings.edgeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.expanded
import typings.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.hierarchyMenuThreshold
import typings.oracleOraclejet.oracleOraclejetStrings.hierarchyMenuThresholdChanged
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.item
import typings.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typings.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typings.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typings.oracleOraclejet.oracleOraclejetStrings.overflow
import typings.oracleOraclejet.oracleOraclejetStrings.overflowChanged
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.rootLabel
import typings.oracleOraclejet.oracleOraclejetStrings.rootLabelChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.sliding
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojNavigationList_[K, D] extends baseComponent[ojNavigationListSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | collapsible | sliding], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | collapsible | sliding], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[top | start], _]
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[top | start], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _]
  ): Unit = js.native
  def addEventListener(
    `type`: overflowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[popup | hidden], _],
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
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[(DataProvider[K, D]) | Null], 
      _
    ],
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
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hierarchyMenuThresholdChanged(
    `type`: hierarchyMenuThresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Selectable[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Selectable[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateEnd, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateEnd, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCollapse, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCollapse, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCurrentItem, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCurrentItem, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeExpand, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeExpand, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeSelect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeSelect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojCollapse, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojCollapse, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojExpand, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojExpand, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: rootLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rootLabelChanged(
    `type`: rootLabelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[K], _],
    useCapture: Boolean
  ): Unit = js.native
  
  var as: String = js.native
  
  var currentItem: K = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var display: all | icons = js.native
  
  var drillMode: none | collapsible | sliding = js.native
  
  var edge: top | start = js.native
  
  var expanded: KeySet[K] = js.native
  
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): K = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_drillMode(property: drillMode): none | collapsible | sliding = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | start = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K] = js.native
  @JSName("getProperty")
  def getProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): Selectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_rootLabel(property: rootLabel): String | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): K = js.native
  
  var hierarchyMenuThreshold: Double = js.native
  
  var item: Selectable[K, D] = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  var onCurrentItemChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  
  var onDrillModeChanged: (js.Function1[/* event */ JetElementCustomEvent[none | collapsible | sliding], _]) | Null = js.native
  
  var onEdgeChanged: (js.Function1[/* event */ JetElementCustomEvent[top | start], _]) | Null = js.native
  
  var onExpandedChanged: (js.Function1[/* event */ JetElementCustomEvent[KeySet[K]], _]) | Null = js.native
  
  var onHierarchyMenuThresholdChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[Selectable[K, D]], _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateEnd, 
    _
  ]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojAnimateStart, 
    _
  ]) | Null = js.native
  
  var onOjBeforeCollapse: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCollapse, 
    _
  ]) | Null = js.native
  
  var onOjBeforeCurrentItem: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeCurrentItem, 
    _
  ]) | Null = js.native
  
  var onOjBeforeExpand: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeExpand, 
    _
  ]) | Null = js.native
  
  var onOjBeforeSelect: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojBeforeSelect, 
    _
  ]) | Null = js.native
  
  var onOjCollapse: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojCollapse, 
    _
  ]) | Null = js.native
  
  var onOjExpand: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ojExpand, 
    _
  ]) | Null = js.native
  
  var onOverflowChanged: (js.Function1[/* event */ JetElementCustomEvent[popup | hidden], _]) | Null = js.native
  
  var onRootLabelChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[/* event */ JetElementCustomEvent[K], _]) | Null = js.native
  
  var overflow: popup | hidden = js.native
  
  var rootLabel: String | Null = js.native
  
  var selection: K = js.native
  
  def setProperties(properties: ojNavigationListSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: drillMode, value: collapsible): Unit = js.native
  def setProperty(property: drillMode, value: none): Unit = js.native
  def setProperty(property: drillMode, value: sliding): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hierarchyMenuThreshold(property: hierarchyMenuThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: Selectable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_rootLabel(property: rootLabel, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: K): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: DefaultRootLabel): Unit = js.native
  
  @JSName("translations")
  var translations_ojNavigationList_ : DefaultRootLabel = js.native
}
