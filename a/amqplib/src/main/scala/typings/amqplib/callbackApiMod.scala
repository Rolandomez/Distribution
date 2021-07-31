package typings.amqplib

import typings.amqplib.amqplibBooleans.`false`
import typings.amqplib.anon.Mechanism
import typings.amqplib.anon.Password
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.Options.Connect
import typings.amqplib.propertiesMod.Options.DeleteExchange
import typings.amqplib.propertiesMod.Options.Get
import typings.amqplib.propertiesMod.Options.Publish
import typings.amqplib.propertiesMod.Replies.AssertExchange
import typings.amqplib.propertiesMod.Replies.AssertQueue
import typings.amqplib.propertiesMod.Replies.Consume
import typings.amqplib.propertiesMod.Replies.DeleteQueue
import typings.amqplib.propertiesMod.Replies.Empty
import typings.amqplib.propertiesMod.Replies.PurgeQueue
import typings.amqplib.propertiesMod.ServerProperties
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackApiMod {
  
  @JSImport("amqplib/callback_api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def connect(url: String, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def connect(
    url: String,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def connect(url: Connect, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def connect(
    url: Connect,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object credentials {
    
    @JSImport("amqplib/callback_api", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def external(): Mechanism = ^.asInstanceOf[js.Dynamic].applyDynamic("external")().asInstanceOf[Mechanism]
    
    @scala.inline
    def plain(username: String, password: String): Password = (^.asInstanceOf[js.Dynamic].applyDynamic("plain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Password]
  }
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: String): Unit = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertExchange, Unit]
    ): Unit = js.native
    def assertExchange(exchange: String, `type`: String, options: typings.amqplib.propertiesMod.Options.AssertExchange): Unit = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: typings.amqplib.propertiesMod.Options.AssertExchange,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertExchange, Unit]
    ): Unit = js.native
    
    def assertQueue(): Unit = js.native
    def assertQueue(queue: String): Unit = js.native
    def assertQueue(queue: String, options: Unit, callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]): Unit = js.native
    def assertQueue(queue: String, options: typings.amqplib.propertiesMod.Options.AssertQueue): Unit = js.native
    def assertQueue(
      queue: String,
      options: typings.amqplib.propertiesMod.Options.AssertQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    def assertQueue(queue: Unit, options: Unit, callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]): Unit = js.native
    def assertQueue(queue: Unit, options: typings.amqplib.propertiesMod.Options.AssertQueue): Unit = js.native
    def assertQueue(
      queue: Unit,
      options: typings.amqplib.propertiesMod.Options.AssertQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): Unit = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def bindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def bindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): Unit = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def bindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def bindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def cancel(consumerTag: String): Unit = js.native
    def cancel(consumerTag: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def checkExchange(exchange: String): Unit = js.native
    def checkExchange(exchange: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def checkQueue(queue: String): Unit = js.native
    def checkQueue(queue: String, callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]): Unit = js.native
    
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ Message | Null, Unit]): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Consume, Unit]
    ): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: typings.amqplib.propertiesMod.Options.Consume
    ): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: typings.amqplib.propertiesMod.Options.Consume,
      callback: js.Function2[/* err */ js.Any, /* ok */ Consume, Unit]
    ): Unit = js.native
    
    def deleteExchange(exchange: String): Unit = js.native
    def deleteExchange(exchange: String, options: Unit, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): Unit = js.native
    def deleteExchange(
      exchange: String,
      options: DeleteExchange,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def deleteQueue(queue: String): Unit = js.native
    def deleteQueue(queue: String, options: Unit, callback: js.Function2[/* err */ js.Any, /* ok */ DeleteQueue, Unit]): Unit = js.native
    def deleteQueue(queue: String, options: typings.amqplib.propertiesMod.Options.DeleteQueue): Unit = js.native
    def deleteQueue(
      queue: String,
      options: typings.amqplib.propertiesMod.Options.DeleteQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ DeleteQueue, Unit]
    ): Unit = js.native
    
    def get(queue: String): Unit = js.native
    def get(queue: String, options: Get): Unit = js.native
    @JSName("get")
    def get_false(
      queue: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Message | `false`, Unit]
    ): Unit = js.native
    @JSName("get")
    def get_false(
      queue: String,
      options: Get,
      callback: js.Function2[/* err */ js.Any, /* ok */ Message | `false`, Unit]
    ): Unit = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Unit, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): Unit = js.native
    def prefetch(count: Double, global: Boolean): Unit = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): Unit = js.native
    def purgeQueue(queue: String, callback: js.Function2[/* err */ js.Any, /* ok */ PurgeQueue, Unit]): Unit = js.native
    
    def recover(): Unit = js.native
    def recover(callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): Unit = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def unbindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def unbindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): Unit = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def unbindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def unbindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait ConfirmChannel extends Channel {
    
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def waitForConfirms(): Unit = js.native
    def waitForConfirms(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def createChannel(callback: js.Function2[/* err */ js.Any, /* channel */ Channel, Unit]): Unit = js.native
    
    def createConfirmChannel(callback: js.Function2[/* err */ js.Any, /* confirmChannel */ ConfirmChannel, Unit]): Unit = js.native
    
    var serverProperties: ServerProperties = js.native
  }
}
