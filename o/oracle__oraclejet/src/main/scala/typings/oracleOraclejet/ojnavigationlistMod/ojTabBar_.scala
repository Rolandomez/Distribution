package typings.oracleOraclejet.ojnavigationlistMod

import typings.oracleOraclejet.anon.AccessibleReorderAfterItem
import typings.oracleOraclejet.anon.RendererSelectable
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.NodeContext
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.as
import typings.oracleOraclejet.oracleOraclejetStrings.asChanged
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.currentItem
import typings.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.data
import typings.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.display
import typings.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.edge
import typings.oracleOraclejet.oracleOraclejetStrings.edgeChanged
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.item
import typings.oracleOraclejet.oracleOraclejetStrings.itemChanged
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentItem
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typings.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typings.oracleOraclejet.oracleOraclejetStrings.ojRemove
import typings.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typings.oracleOraclejet.oracleOraclejetStrings.overflow
import typings.oracleOraclejet.oracleOraclejetStrings.overflowChanged
import typings.oracleOraclejet.oracleOraclejetStrings.popup
import typings.oracleOraclejet.oracleOraclejetStrings.progressive
import typings.oracleOraclejet.oracleOraclejetStrings.reorderable
import typings.oracleOraclejet.oracleOraclejetStrings.reorderableChanged
import typings.oracleOraclejet.oracleOraclejetStrings.selection
import typings.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.truncation
import typings.oracleOraclejet.oracleOraclejetStrings.truncationChanged
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTabBar_[K, D] extends baseComponent[ojTabBarSettableProperties[K, D]] {
  
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: currentItemChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
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
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: edgeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[top | bottom | start | end], 
      _
    ],
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
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: reorderableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _]
  ): Unit = js.native
  def addEventListener(
    `type`: truncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | progressive], _],
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
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RendererSelectable[K, D]], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemChanged(
    `type`: itemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[RendererSelectable[K, D]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentItem(
    `type`: ojBeforeCurrentItem,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: ojBeforeRemove,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRemove(
    `type`: ojBeforeRemove,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: ojRemove,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojRemove(
    `type`: ojRemove,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojReorder(
    `type`: ojReorder,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder, 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  
  var as: String = js.native
  
  var currentItem: js.Any = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var display: all | icons = js.native
  
  var edge: top | bottom | start | end = js.native
  
  def getContextByNode(node: Element): NodeContext[K] | Null = js.native
  
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_currentItem(property: currentItem): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_edge(property: edge): top | bottom | start | end = js.native
  @JSName("getProperty")
  def getProperty_item(property: item): RendererSelectable[K, D] = js.native
  @JSName("getProperty")
  def getProperty_overflow(property: overflow): popup | hidden = js.native
  @JSName("getProperty")
  def getProperty_reorderable(property: reorderable): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_truncation(property: truncation): none | progressive = js.native
  
  var item: RendererSelectable[K, D] = js.native
  
  var onAsChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
  
  var onCurrentItemChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['currentItem'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  
  var onDataChanged: (js.Function1[/* event */ JetElementCustomEvent[(DataProvider[K, D]) | Null], _]) | Null = js.native
  
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  
  var onEdgeChanged: (js.Function1[/* event */ JetElementCustomEvent[top | bottom | start | end], _]) | Null = js.native
  
  var onItemChanged: (js.Function1[/* event */ JetElementCustomEvent[RendererSelectable[K, D]], _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateEnd, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojAnimateStart, _]) | Null = js.native
  
  var onOjBeforeCurrentItem: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeCurrentItem, 
    _
  ]) | Null = js.native
  
  var onOjBeforeDeselect: (js.Function1[
    /* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeDeselect, 
    _
  ]) | Null = js.native
  
  var onOjBeforeRemove: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeRemove, _]) | Null = js.native
  
  var onOjBeforeSelect: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojBeforeSelect, _]) | Null = js.native
  
  var onOjDeselect: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojDeselect, _]) | Null = js.native
  
  var onOjRemove: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojRemove, _]) | Null = js.native
  
  var onOjReorder: (js.Function1[/* event */ typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ojReorder, _]) | Null = js.native
  
  var onOverflowChanged: (js.Function1[/* event */ JetElementCustomEvent[popup | hidden], _]) | Null = js.native
  
  var onReorderableChanged: (js.Function1[/* event */ JetElementCustomEvent[enabled | disabled], _]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBar<K, D>['selection'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  
  var onTruncationChanged: (js.Function1[/* event */ JetElementCustomEvent[none | progressive], _]) | Null = js.native
  
  var overflow: popup | hidden = js.native
  
  var reorderable: enabled | disabled = js.native
  
  var selection: js.Any = js.native
  
  def setProperties(properties: ojTabBarSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: edge, value: bottom): Unit = js.native
  def setProperty(property: edge, value: end): Unit = js.native
  def setProperty(property: edge, value: start): Unit = js.native
  def setProperty(property: edge, value: top): Unit = js.native
  def setProperty(property: overflow, value: hidden): Unit = js.native
  def setProperty(property: overflow, value: popup): Unit = js.native
  def setProperty(property: reorderable, value: disabled): Unit = js.native
  def setProperty(property: reorderable, value: enabled): Unit = js.native
  def setProperty(property: truncation, value: none): Unit = js.native
  def setProperty(property: truncation, value: progressive): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentItem(property: currentItem, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_item(property: item, value: RendererSelectable[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AccessibleReorderAfterItem): Unit = js.native
  
  @JSName("translations")
  var translations_ojTabBar_ : AccessibleReorderAfterItem = js.native
  
  var truncation: none | progressive = js.native
}
