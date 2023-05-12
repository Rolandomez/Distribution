package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.Mocha.Runnable
import typings.cypress.Mocha.Test
import typings.cypress.cypressBooleans.`false`
import typings.cypress.cypressStrings.commandColonend
import typings.cypress.cypressStrings.commandColonenqueued
import typings.cypress.cypressStrings.commandColonretry
import typings.cypress.cypressStrings.commandColonstart
import typings.cypress.cypressStrings.fail
import typings.cypress.cypressStrings.logColonadded
import typings.cypress.cypressStrings.logColonchanged
import typings.cypress.cypressStrings.scrolled
import typings.cypress.cypressStrings.skippedColoncommandColonend
import typings.cypress.cypressStrings.testColonafterColonrun
import typings.cypress.cypressStrings.testColonbeforeColonrun
import typings.cypress.cypressStrings.testColonbeforeColonrunColonasync
import typings.cypress.cypressStrings.uncaughtColonexception
import typings.cypress.cypressStrings.urlColonchanged
import typings.cypress.cypressStrings.viewportColonchanged
import typings.cypress.cypressStrings.windowColonalert
import typings.cypress.cypressStrings.windowColonbeforeColonload
import typings.cypress.cypressStrings.windowColonbeforeColonunload
import typings.cypress.cypressStrings.windowColonconfirm
import typings.cypress.cypressStrings.windowColonload
import typings.cypress.cypressStrings.windowColonunload
import typings.cypress.typesSinonMod.SinonSpy
import typings.cypress.typesSinonMod.SinonStub
import typings.std.BeforeUnloadEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// for just a few events like "window:alert" it makes sense to allow passing cy.stub() or
// a user callback function. Others probably only need a callback function.
/**
  * These events come from the application currently under test (your application).
  * These are the most useful events for you to listen to.
  * @see https://on.cypress.io/catalog-of-events#App-Events
  */
@js.native
trait Actions extends StObject {
  
  /**
    * Fires when cy finishes running and executing your command.
    * Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later.
    * Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonenqueued, fn: js.Function1[/* command */ EnqueuedCommandAttributes, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever a command begins its retrying routines.
    * This is called on the trailing edge after Cypress has internally
    * waited for the retry interval. Useful to understand **why** a command is retrying,
    * and generally includes the actual error causing the retry to happen.
    * When commands fail the final error is the one that actually bubbles up to fail the test.
    * This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonretry, fn: js.Function1[/* command */ CommandQueue, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when cy begins actually running and executing your command.
    * Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: commandColonstart, fn: js.Function1[/* command */ CommandQueue, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test
    * from actually failing by binding to this event and invoking an async `done` callback.
    * However this is **strongly discouraged**. Tests should never legitimately fail.
    *  This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: fail, fn: js.Function2[/* error */ CypressError, /* mocha */ Runnable, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log.
    * Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: logColonadded, fn: js.Function2[/* attributes */ ObjectLike, /* log */ Any, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever a command's attributes changes.
    * This event is debounced to prevent it from firing too quickly and too often.
    * Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: logColonchanged, fn: js.Function2[/* attributes */ ObjectLike, /* log */ Any, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application.
    * This event is fired when Cypress is {% url 'waiting for and calculating
    * actionability' interacting-with-elements %}. It will scroll to 'uncover'
    * elements currently being covered. This event is extremely useful to debug why
    * Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when a command is skipped, namely the `should` command.
    * Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: skippedColoncommandColonend, fn: js.Function1[/* command */ CommandQueue, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: testColonafterColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ Test, Unit]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * If a `Promise` is returned, it will be awaited before proceeding.
    */
  def apply(
    action: testColonbeforeColonrunColonasync,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ Test, Unit | js.Promise[Any]]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: testColonbeforeColonrun,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ Test, Unit]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when an uncaught exception or unhandled rejection occurs in your application. If it's an unhandled rejection, the rejected promise will be the 3rd argument.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/{e2e|component}.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  def apply(
    action: uncaughtColonexception,
    fn: js.Function3[
      /* error */ js.Error, 
      /* runnable */ Runnable, 
      /* promise */ js.UndefOr[js.Promise[Any]], 
      `false` | Unit
    ]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: urlColonchanged, fn: js.Function1[/* url */ String, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when
    * Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: viewportColonchanged, fn: js.Function1[/* viewport */ Viewport, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonalert, fn: js.Function1[/* text */ String, Unit]): typings.cypress.Cypress.Cypress = js.native
  def apply(
    action: windowColonalert,
    fn: SinonSpyAgent[(SinonSpy[js.Array[Any], Any]) | (SinonStub[js.Array[Any], Any])]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed.
    * This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback.
    * Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonbeforeColonload, fn: js.Function1[/* win */ AUTWindow, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when your application is about to navigate away.
    * The real event object is provided to you.
    * Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonbeforeColonunload, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  def apply(action: windowColonconfirm, fn: js.Function1[/* text */ String, `false` | Unit]): typings.cypress.Cypress.Cypress = js.native
  def apply(
    action: windowColonconfirm,
    fn: SinonSpyAgent[(SinonSpy[js.Array[Any], Any]) | (SinonStub[js.Array[Any], Any])]
  ): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires after all your resources have finished loading after a page transition.
    * This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonload, fn: js.Function1[/* win */ AUTWindow, Unit]): typings.cypress.Cypress.Cypress = js.native
  /**
    * Fires when your application is has unloaded and is navigating away.
    * The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(action: windowColonunload, fn: js.Function1[/* event */ Event, Unit]): typings.cypress.Cypress.Cypress = js.native
}
