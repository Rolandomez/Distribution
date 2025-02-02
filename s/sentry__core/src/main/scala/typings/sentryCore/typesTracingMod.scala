package typings.sentryCore

import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingSpanMod.SpanStatusType
import typings.sentryTypes.typesSpanMod.SpanContext
import typings.sentryTypes.typesTransactionMod.CustomSamplingContext
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingMod {
  
  @JSImport("@sentry/core/types/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/tracing", "IdleTransaction")
  @js.native
  open class IdleTransaction protected ()
    extends typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction {
    def this(transactionContext: TransactionContext, _idleHub: Hub) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Double,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Double,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Double,
      _onScope: Boolean
    ) = this()
    def this(
      transactionContext: TransactionContext,
      _idleHub: Hub,
      /**
      * The time to wait in ms until the idle transaction will be finished. This timer is started each time
      * there are no active spans on this transaction.
      */
    _idleTimeout: Unit,
      /**
      * The final value in ms that a transaction cannot exceed
      */
    _finalTimeout: Unit,
      _heartbeatInterval: Unit,
      _onScope: Boolean
    ) = this()
  }
  
  @JSImport("@sentry/core/types/tracing", "Span")
  @js.native
  /**
    * You should never call the constructor manually, always use `Sentry.startTransaction()`
    * or call `startChild()` on an existing span.
    * @internal
    * @hideconstructor
    * @hidden
    */
  open class Span ()
    extends typings.sentryCore.typesTracingSpanMod.Span {
    def this(spanContext: SpanContext) = this()
  }
  
  @JSImport("@sentry/core/types/tracing", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sentryCore.typesTracingSpanstatusMod.SpanStatus & String] = js.native
    
    /* "aborted" */ val Aborted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Aborted & String = js.native
    
    /* "already_exists" */ val AlreadyExists: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.AlreadyExists & String = js.native
    
    /* "cancelled" */ val Cancelled: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Cancelled & String = js.native
    
    /* "data_loss" */ val DataLoss: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DataLoss & String = js.native
    
    /* "deadline_exceeded" */ val DeadlineExceeded: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.DeadlineExceeded & String = js.native
    
    /* "failed_precondition" */ val FailedPrecondition: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.FailedPrecondition & String = js.native
    
    /* "internal_error" */ val InternalError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InternalError & String = js.native
    
    /* "invalid_argument" */ val InvalidArgument: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.InvalidArgument & String = js.native
    
    /* "not_found" */ val NotFound: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.NotFound & String = js.native
    
    /* "ok" */ val Ok: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Ok & String = js.native
    
    /* "out_of_range" */ val OutOfRange: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.OutOfRange & String = js.native
    
    /* "permission_denied" */ val PermissionDenied: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.PermissionDenied & String = js.native
    
    /* "resource_exhausted" */ val ResourceExhausted: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.ResourceExhausted & String = js.native
    
    /* "unauthenticated" */ val Unauthenticated: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unauthenticated & String = js.native
    
    /* "unavailable" */ val Unavailable: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unavailable & String = js.native
    
    /* "unimplemented" */ val Unimplemented: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.Unimplemented & String = js.native
    
    /* "unknown_error" */ val UnknownError: typings.sentryCore.typesTracingSpanstatusMod.SpanStatus.UnknownError & String = js.native
  }
  
  object TRACING_DEFAULTS {
    
    @JSImport("@sentry/core/types/tracing", "TRACING_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sentry/core/types/tracing", "TRACING_DEFAULTS.finalTimeout")
    @js.native
    def finalTimeout: Double = js.native
    inline def finalTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finalTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core/types/tracing", "TRACING_DEFAULTS.heartbeatInterval")
    @js.native
    def heartbeatInterval: Double = js.native
    inline def heartbeatInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@sentry/core/types/tracing", "TRACING_DEFAULTS.idleTimeout")
    @js.native
    def idleTimeout: Double = js.native
    inline def idleTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/core/types/tracing", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.sentryCore.typesTracingTransactionMod.Transaction {
    /**
      * This constructor should never be called manually. Those instrumenting tracing should use
      * `Sentry.startTransaction()`, and internal methods should use `hub.startTransaction()`.
      * @internal
      * @hideconstructor
      * @hidden
      */
    def this(transactionContext: TransactionContext) = this()
    def this(transactionContext: TransactionContext, hub: Hub) = this()
  }
  
  inline def addTracingExtensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTracingExtensions")().asInstanceOf[Unit]
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
  
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")().asInstanceOf[js.UndefOr[T]]
  inline def getActiveTransaction[T /* <: typings.sentryTypes.typesTransactionMod.Transaction */](maybeHub: Hub): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")(maybeHub.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def spanStatusfromHttpCode(httpStatus: Double): SpanStatusType = ^.asInstanceOf[js.Dynamic].applyDynamic("spanStatusfromHttpCode")(httpStatus.asInstanceOf[js.Any]).asInstanceOf[SpanStatusType]
  
  inline def startIdleTransaction(hub: Hub, transactionContext: TransactionContext, idleTimeout: Double, finalTimeout: Double): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Boolean,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: Unit,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  inline def startIdleTransaction(
    hub: Hub,
    transactionContext: TransactionContext,
    idleTimeout: Double,
    finalTimeout: Double,
    onScope: Unit,
    customSamplingContext: CustomSamplingContext,
    heartbeatInterval: Double
  ): typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("startIdleTransaction")(hub.asInstanceOf[js.Any], transactionContext.asInstanceOf[js.Any], idleTimeout.asInstanceOf[js.Any], finalTimeout.asInstanceOf[js.Any], onScope.asInstanceOf[js.Any], customSamplingContext.asInstanceOf[js.Any], heartbeatInterval.asInstanceOf[js.Any])).asInstanceOf[typings.sentryCore.typesTracingIdletransactionMod.IdleTransaction]
  
  inline def trace[T](
    context: TransactionContext,
    callback: js.Function1[/* span */ js.UndefOr[typings.sentryCore.typesTracingSpanMod.Span], T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def trace[T](
    context: TransactionContext,
    callback: js.Function1[/* span */ js.UndefOr[typings.sentryCore.typesTracingSpanMod.Span], T],
    onError: js.Function1[/* error */ Any, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
}
