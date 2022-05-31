package typings.jupyterlabDocumentsearch

import typings.jupyterlabDocumentsearch.interfacesMod.IFiltersType
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typings.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typings.jupyterlabNotebook.mod.NotebookPanel
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebooksearchproviderMod {
  
  @JSImport("@jupyterlab/documentsearch/lib/providers/notebooksearchprovider", "NotebookSearchProvider")
  @js.native
  class NotebookSearchProvider ()
    extends StObject
       with ISearchProvider[NotebookPanel] {
    
    /* private */ var _cellsWithMatches: js.Any = js.native
    
    /* private */ var _changed: js.Any = js.native
    
    /* private */ var _currentMatch: js.Any = js.native
    
    /* private */ var _currentMatchIsSelected: js.Any = js.native
    
    /* private */ var _currentProvider: js.Any = js.native
    
    /* private */ var _filters: js.Any = js.native
    
    /* private */ var _getMatchesFromCells: js.Any = js.native
    
    /* private */ var _onSearchProviderChanged: js.Any = js.native
    
    /**
      * Gradually refresh cells in the background so that the user will not
      * experience frozen interface, `n` cells at a time.
      */
    /* private */ var _refreshCellsEditorsInBackground: js.Any = js.native
    
    /**
      * Refresh the editor in the cell for the current match.
      */
    /* private */ var _refreshCurrentCellEditor: js.Any = js.native
    
    /* private */ var _searchProviders: js.Any = js.native
    
    /* private */ var _searchTarget: js.Any = js.native
    
    /* private */ var _stepNext: js.Any = js.native
    
    /* private */ var _unRenderedMarkdownCells: js.Any = js.native
    
    /* private */ var _updatedCurrentProvider: js.Any = js.native
    
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    /* CompleteClass */
    override val changed: ISignal[ISearchProvider[NotebookPanel], Unit] = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    def changed_MNotebookSearchProvider: ISignal[this.type, Unit] = js.native
    
    /**
      * The current index of the selected match.
      */
    /* CompleteClass */
    override val currentMatchIndex: Double | Null = js.native
    /**
      * The current index of the selected match.
      */
    @JSName("currentMatchIndex")
    def currentMatchIndex_MNotebookSearchProvider: Double | Null = js.native
    
    /**
      * Clears state of a search provider to prepare for startQuery to be called
      * in order to start a new query or refresh an existing one.
      *
      * @returns A promise that resolves when the search provider is ready to
      * begin a new search.
      */
    /* CompleteClass */
    override def endQuery(): js.Promise[Unit] = js.native
    
    /**
      * Resets UI state as it was before the search process began.  Cleans up and
      * disposes of all internal state.
      *
      * @returns A promise that resolves when all state has been cleaned up.
      */
    /* CompleteClass */
    override def endSearch(): js.Promise[Unit] = js.native
    
    /**
      * Get an initial query value if applicable so that it can be entered
      * into the search box as an initial query
      *
      * @param searchTarget The widget to be searched
      *
      * @returns Initial value used to populate the search box.
      */
    /* CompleteClass */
    override def getInitialQuery(searchTarget: NotebookPanel): js.Any = js.native
    
    @JSName("hasOutputs")
    val hasOutputs_NotebookSearchProvider: /* true */ Boolean = js.native
    
    /**
      * Move the current match indicator to the next match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    /* CompleteClass */
    override def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
    
    /**
      * Move the current match indicator to the previous match.
      *
      * @returns A promise that resolves once the action has completed.
      */
    /* CompleteClass */
    override def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
    
    /**
      * Set to true if the widget under search is read-only, false
      * if it is editable.  Will be used to determine whether to show
      * the replace option.
      */
    /* CompleteClass */
    override val isReadOnly: Boolean = js.native
    
    /**
      * The same list of matches provided by the startQuery promise resoluton
      */
    /* CompleteClass */
    override val matches: js.Array[ISearchMatch] = js.native
    /**
      * The same list of matches provided by the startQuery promise resolution
      */
    @JSName("matches")
    def matches_MNotebookSearchProvider: js.Array[ISearchMatch] = js.native
    
    /**
      * Replace all matches in the notebook with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    /* CompleteClass */
    override def replaceAllMatches(newText: String): js.Promise[Boolean] = js.native
    
    /**
      * Replace the currently selected match with the provided text
      *
      * @returns A promise that resolves with a boolean indicating whether a replace occurred.
      */
    /* CompleteClass */
    override def replaceCurrentMatch(newText: String): js.Promise[Boolean] = js.native
    
    /**
      * Initialize the search using the provided options. Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      * @param filters Filter parameters to pass to provider
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: RegExp, searchTarget: NotebookPanel): js.Promise[js.Array[ISearchMatch]] = js.native
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      * @param filters Filter parameters to pass to provider
      *
      * @returns A promise that resolves with a list of all matches
      */
    /* CompleteClass */
    override def startQuery(query: RegExp, searchTarget: NotebookPanel, filters: IFiltersType): js.Promise[js.Array[ISearchMatch]] = js.native
    def startQuery(query: RegExp, searchTarget: NotebookPanel, filters: INotebookFilters): js.Promise[js.Array[ISearchMatch]] = js.native
  }
  /* static members */
  object NotebookSearchProvider {
    
    @JSImport("@jupyterlab/documentsearch/lib/providers/notebooksearchprovider", "NotebookSearchProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    inline def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canSearchOn")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean]
  }
  
  trait INotebookFilters extends StObject {
    
    /**
      * Should cell output be searched?
      */
    var output: Boolean
  }
  object INotebookFilters {
    
    inline def apply(output: Boolean): INotebookFilters = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotebookFilters]
    }
    
    extension [Self <: INotebookFilters](x: Self) {
      
      inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
