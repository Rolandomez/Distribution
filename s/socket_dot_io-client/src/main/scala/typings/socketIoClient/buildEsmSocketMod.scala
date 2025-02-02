package typings.socketIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.socketIoClient.anon.Context
import typings.socketIoClient.anon.PartialSocketOptions
import typings.socketIoClient.buildEsmManagerMod.Manager
import typings.socketIoClient.buildEsmSocketMod.Socket.DisconnectReason
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import typings.socketIoComponentEmitter.mod.Emitter
import typings.socketIoComponentEmitter.mod.EventNames
import typings.socketIoComponentEmitter.mod.EventParams
import typings.socketIoComponentEmitter.mod.EventsMap
import typings.socketIoParser.mod.Packet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmSocketMod {
  
  @JSImport("socket.io-client/build/esm/socket", "Socket")
  @js.native
  open class Socket[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] protected () extends Emitter[ListenEvents, EmitEvents, SocketReservedEvents] {
    /**
      * `Socket` constructor.
      */
    def this(io: Manager[DefaultEventsMap, DefaultEventsMap], nsp: String) = this()
    def this(io: Manager[DefaultEventsMap, DefaultEventsMap], nsp: String, opts: PartialSocketOptions) = this()
    
    /**
      * Add the packet to the queue.
      * @param args
      * @private
      */
    /* private */ var _addToQueue: Any = js.native
    
    /* private */ var _anyListeners: Any = js.native
    
    /* private */ var _anyOutgoingListeners: Any = js.native
    
    /**
      * Send the first packet of the queue, and wait for an acknowledgement from the server.
      * @param force - whether to resend a packet that has not been acknowledged yet
      *
      * @private
      */
    /* private */ var _drainQueue: Any = js.native
    
    /**
      * The offset of the last received packet, which will be sent upon reconnection to allow for the recovery of the connection state.
      *
      * @private
      */
    /* private */ var _lastOffset: Any = js.native
    
    /* private */ val _opts: Any = js.native
    
    /**
      * The session ID used for connection state recovery, which must not be shared (unlike {@link id}).
      *
      * @private
      */
    /* private */ var _pid: Any = js.native
    
    /**
      * The queue of packets to be sent with retry in case of failure.
      *
      * Packets are sent one by one, each waiting for the server acknowledgement, in order to guarantee the delivery order.
      * @private
      */
    /* private */ var _queue: Any = js.native
    
    /**
      * A sequence to generate the ID of the {@link QueuedPacket}.
      * @private
      */
    /* private */ var _queueSeq: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _registerAckCallback: Any = js.native
    
    /**
      * Sends a CONNECT packet to initiate the Socket.IO session.
      *
      * @param data
      * @private
      */
    /* private */ var _sendConnectPacket: Any = js.native
    
    /**
      * Produces an ack callback to emit with an event.
      *
      * @private
      */
    /* private */ var ack: Any = js.native
    
    /* private */ var acks: Any = js.native
    
    /**
      * Whether the Socket will try to reconnect when its Manager connects or reconnects.
      *
      * @example
      * const socket = io();
      *
      * console.log(socket.active); // true
      *
      * socket.on("disconnect", (reason) => {
      *   if (reason === "io server disconnect") {
      *     // the disconnection was initiated by the server, you need to manually reconnect
      *     console.log(socket.active); // false
      *   }
      *   // else the socket will automatically try to reconnect
      *   console.log(socket.active); // true
      * });
      */
    def active: Boolean = js.native
    
    /**
      * Credentials that are sent when accessing a namespace.
      *
      * @example
      * const socket = io({
      *   auth: {
      *     token: "abcd"
      *   }
      * });
      *
      * // or with a function
      * const socket = io({
      *   auth: (cb) => {
      *     cb({ token: localStorage.token })
      *   }
      * });
      */
    var auth: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit]) = js.native
    
    /**
      * Alias for {@link disconnect()}.
      *
      * @return self
      */
    def close(): this.type = js.native
    
    /**
      * Sets the compress flag.
      *
      * @example
      * socket.compress(false).emit("hello");
      *
      * @param compress - if `true`, compresses the sending data
      * @return self
      */
    def compress(compress: Boolean): this.type = js.native
    
    /**
      * "Opens" the socket.
      *
      * @example
      * const socket = io({
      *   autoConnect: false
      * });
      *
      * socket.connect();
      */
    def connect(): this.type = js.native
    
    /**
      * Whether the socket is currently connected to the server.
      *
      * @example
      * const socket = io();
      *
      * socket.on("connect", () => {
      *   console.log(socket.connected); // true
      * });
      *
      * socket.on("disconnect", () => {
      *   console.log(socket.connected); // false
      * });
      */
    var connected: Boolean = js.native
    
    /**
      * Called upon forced client/server side disconnections,
      * this method ensures the manager stops tracking us and
      * that reconnections don't get triggered for this.
      *
      * @private
      */
    /* private */ var destroy: Any = js.native
    
    /**
      * Disconnects the socket manually. In that case, the socket will not try to reconnect.
      *
      * If this is the last active Socket instance of the {@link Manager}, the low-level connection will be closed.
      *
      * @example
      * const socket = io();
      *
      * socket.on("disconnect", (reason) => {
      *   // console.log(reason); prints "io client disconnect"
      * });
      *
      * socket.disconnect();
      *
      * @return self
      */
    def disconnect(): this.type = js.native
    
    /**
      * Whether the socket is currently disconnected
      *
      * @example
      * const socket = io();
      *
      * socket.on("connect", () => {
      *   console.log(socket.disconnected); // false
      * });
      *
      * socket.on("disconnect", () => {
      *   console.log(socket.disconnected); // true
      * });
      */
    def disconnected: Boolean = js.native
    
    /**
      * Emit buffered events (received and emitted).
      *
      * @private
      */
    /* private */ var emitBuffered: Any = js.native
    
    /* private */ var emitEvent: Any = js.native
    
    /**
      * Emits an event and waits for an acknowledgement
      *
      * @example
      * // without timeout
      * const response = await socket.emitWithAck("hello", "world");
      *
      * // with a specific timeout
      * try {
      *   const response = await socket.timeout(1000).emitWithAck("hello", "world");
      * } catch (err) {
      *   // the server did not acknowledge the event in the given delay
      * }
      *
      * @return a Promise that will be fulfilled when the server acknowledges the event
      */
    def emitWithAck[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AllButLast<EventParams<EmitEvents, Ev>> is not an array type */ args: AllButLast[EventParams[EmitEvents, Ev]]
    ): js.Promise[FirstArg[Last[EventParams[EmitEvents, Ev]]]] = js.native
    
    /* private */ var flags: Any = js.native
    
    /**
      * A unique identifier for the session.
      *
      * @example
      * const socket = io();
      *
      * console.log(socket.id); // undefined
      *
      * socket.on("connect", () => {
      *   console.log(socket.id); // "G5p5..."
      * });
      */
    var id: String = js.native
    
    /* private */ var ids: Any = js.native
    
    val io: Manager[ListenEvents, EmitEvents] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      */
    def listenersAny(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Returns an array of listeners that are listening for any event that is specified. This array can be manipulated,
      * e.g. to remove listeners.
      */
    def listenersAnyOutgoing(): js.Array[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    /**
      * Notify the listeners for each packet sent
      *
      * @param packet
      *
      * @private
      */
    /* private */ var notifyOutgoingListeners: Any = js.native
    
    /* private */ val nsp: Any = js.native
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      *
      * @example
      * const catchAllListener = (event, ...args) => {
      *   console.log(`got event ${event}`);
      * }
      *
      * socket.onAny(catchAllListener);
      *
      * // remove a specific listener
      * socket.offAny(catchAllListener);
      *
      * // or remove all listeners
      * socket.offAny();
      *
      * @param listener
      */
    def offAny(): this.type = js.native
    def offAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Removes the listener that will be fired when any event is emitted.
      *
      * @example
      * const catchAllListener = (event, ...args) => {
      *   console.log(`sent event ${event}`);
      * }
      *
      * socket.onAnyOutgoing(catchAllListener);
      *
      * // remove a specific listener
      * socket.offAnyOutgoing(catchAllListener);
      *
      * // or remove all listeners
      * socket.offAnyOutgoing();
      *
      * @param [listener] - the catch-all listener (optional)
      */
    def offAnyOutgoing(): this.type = js.native
    def offAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback.
      *
      * @example
      * socket.onAny((event, ...args) => {
      *   console.log(`got ${event}`);
      * });
      *
      * @param listener
      */
    def onAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback.
      *
      * Note: acknowledgements sent to the server are not included.
      *
      * @example
      * socket.onAnyOutgoing((event, ...args) => {
      *   console.log(`sent event ${event}`);
      * });
      *
      * @param listener
      */
    def onAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Called upon a server acknowlegement.
      *
      * @param packet
      * @private
      */
    /* private */ var onack: Any = js.native
    
    /**
      * Called upon engine `close`.
      *
      * @param reason
      * @param description
      * @private
      */
    /* private */ var onclose: Any = js.native
    
    /**
      * Called upon server connect.
      *
      * @private
      */
    /* private */ var onconnect: Any = js.native
    
    /**
      * Called upon server disconnect.
      *
      * @private
      */
    /* private */ var ondisconnect: Any = js.native
    
    /**
      * Called upon engine or manager `error`.
      *
      * @param err
      * @private
      */
    /* private */ var onerror: Any = js.native
    
    /**
      * Called upon a server event.
      *
      * @param packet
      * @private
      */
    /* private */ var onevent: Any = js.native
    
    /**
      * Called upon engine `open`.
      *
      * @private
      */
    /* private */ var onopen: Any = js.native
    
    /**
      * Called with socket packet.
      *
      * @param packet
      * @private
      */
    /* private */ var onpacket: Any = js.native
    
    /**
      * Alias for {@link connect()}.
      */
    def open(): this.type = js.native
    
    /**
      * Sends a packet.
      *
      * @param packet
      * @private
      */
    /* private */ var packet: Any = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * @example
      * socket.prependAny((event, ...args) => {
      *   console.log(`got event ${event}`);
      * });
      *
      * @param listener
      */
    def prependAny(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Adds a listener that will be fired when any event is emitted. The event name is passed as the first argument to the
      * callback. The listener is added to the beginning of the listeners array.
      *
      * Note: acknowledgements sent to the server are not included.
      *
      * @example
      * socket.prependAnyOutgoing((event, ...args) => {
      *   console.log(`sent event ${event}`);
      * });
      *
      * @param listener
      */
    def prependAnyOutgoing(listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Buffer for packets received before the CONNECT packet
      */
    var receiveBuffer: js.Array[js.Array[Any]] = js.native
    
    /**
      * Whether the connection state was recovered after a temporary disconnection. In that case, any missed packets will
      * be transmitted by the server.
      */
    var recovered: Boolean = js.native
    
    /**
      * Sends a `message` event.
      *
      * This method mimics the WebSocket.send() method.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/send
      *
      * @example
      * socket.send("hello");
      *
      * // this is equivalent to
      * socket.emit("message", "hello");
      *
      * @return self
      */
    def send(args: Any*): this.type = js.native
    
    /**
      * Buffer for packets that will be sent once the socket is connected
      */
    var sendBuffer: js.Array[Packet] = js.native
    
    /**
      * Subscribe to open, close and packet events
      *
      * @private
      */
    /* private */ var subEvents: Any = js.native
    
    /* private */ var subs: Any = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the callback will be called with an error when the
      * given number of milliseconds have elapsed without an acknowledgement from the server:
      *
      * @example
      * socket.timeout(5000).emit("my-event", (err) => {
      *   if (err) {
      *     // the server did not acknowledge the event in the given delay
      *   }
      * });
      *
      * @returns self
      */
    def timeout(timeout: Double): Socket[ListenEvents, DecorateAcknowledgements[EmitEvents]] = js.native
    
    /**
      * Sets a modifier for a subsequent event emission that the event message will be dropped when this socket is not
      * ready to send messages.
      *
      * @example
      * socket.volatile.emit("hello"); // the server may or may not receive it
      *
      * @returns self
      */
    def volatile: this.type = js.native
  }
  object Socket {
    
    /* Rewritten from type alias, can be one of: 
      - typings.socketIoClient.socketIoClientStrings.`io server disconnect`
      - typings.socketIoClient.socketIoClientStrings.`io client disconnect`
      - typings.socketIoClient.socketIoClientStrings.`ping timeout`
      - typings.socketIoClient.socketIoClientStrings.`transport close`
      - typings.socketIoClient.socketIoClientStrings.`transport error`
      - typings.socketIoClient.socketIoClientStrings.`parse error`
    */
    trait DisconnectReason extends StObject
    object DisconnectReason {
      
      inline def `io client disconnect`: typings.socketIoClient.socketIoClientStrings.`io client disconnect` = ("io client disconnect").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`io client disconnect`]
      
      inline def `io server disconnect`: typings.socketIoClient.socketIoClientStrings.`io server disconnect` = ("io server disconnect").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`io server disconnect`]
      
      inline def `parse error`: typings.socketIoClient.socketIoClientStrings.`parse error` = ("parse error").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`parse error`]
      
      inline def `ping timeout`: typings.socketIoClient.socketIoClientStrings.`ping timeout` = ("ping timeout").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`ping timeout`]
      
      inline def `transport close`: typings.socketIoClient.socketIoClientStrings.`transport close` = ("transport close").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`transport close`]
      
      inline def `transport error`: typings.socketIoClient.socketIoClientStrings.`transport error` = ("transport error").asInstanceOf[typings.socketIoClient.socketIoClientStrings.`transport error`]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [...infer H, infer L] ? H : std.Array<any>
    }}}
    */
  type AllButLast[T /* <: js.Array[Any] */] = js.Array[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof E ]: E[K] extends (args : infer Params): infer Result? (args : socket.io-client.socket.io-client/build/esm/socket.PrependTimeoutError<Params>): Result : E[K]}
    }}}
    */
  @js.native
  trait DecorateAcknowledgements[E] extends StObject
  
  type DisconnectDescription = js.Error | Context
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (arg : infer Param): infer Result ? Param : any
    }}}
    */
  @js.native
  trait FirstArg[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [...infer H, infer L] ? L : any
    }}}
    */
  @js.native
  trait Last[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends (args : infer Params): infer Result? (err : std.Error, args : Params): Result : T[K]}
    }}}
    */
  @js.native
  trait PrependTimeoutError[T /* <: js.Array[Any] */] extends StObject
  
  trait SocketOptions extends StObject {
    
    /**
      * The default timeout in milliseconds used when waiting for an acknowledgement.
      */
    var ackTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * the authentication payload sent when connecting to the Namespace
      */
    var auth: js.UndefOr[
        StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ] = js.undefined
    
    /**
      * The maximum number of retries. Above the limit, the packet will be discarded.
      *
      * Using `Infinity` means the delivery guarantee is "at-least-once" (instead of "at-most-once" by default), but a
      * smaller value like 10 should be sufficient in practice.
      */
    var retries: js.UndefOr[Double] = js.undefined
  }
  object SocketOptions {
    
    inline def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      inline def setAuth(
        value: StringDictionary[Any] | (js.Function1[/* cb */ js.Function1[/* data */ js.Object, Unit], Unit])
      ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthFunction1(value: /* cb */ js.Function1[/* data */ js.Object, Unit] => Unit): Self = StObject.set(x, "auth", js.Any.fromFunction1(value))
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  @js.native
  trait SocketReservedEvents extends StObject {
    
    def connect(): Unit = js.native
    
    def connect_error(err: js.Error): Unit = js.native
    
    def disconnect(reason: DisconnectReason): Unit = js.native
    def disconnect(reason: DisconnectReason, description: DisconnectDescription): Unit = js.native
  }
}
