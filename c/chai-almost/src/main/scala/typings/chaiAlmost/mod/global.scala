package typings.chaiAlmost.mod

import typings.chai.Chai.Equal
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.Almost
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.DeepAlmost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Chai extends js.Object {
    
    @js.native
    trait Assertion extends js.Object {
      
      def almost(value: js.Any): Assertion = js.native
      def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
      @JSName("almost")
      var almost_Original: Almost = js.native
    }
    
    @js.native
    object ChaiAlmost extends js.Object {
      
      @js.native
      trait Almost extends DeepAlmost {
        
        def eql(value: js.Any): typings.chai.Chai.Assertion = js.native
        def eql(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
        @JSName("eql")
        var eql_Original: Equal = js.native
        
        def eqls(value: js.Any): typings.chai.Chai.Assertion = js.native
        def eqls(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
        @JSName("eqls")
        var eqls_Original: Equal = js.native
      }
      
      @js.native
      trait DeepAlmost extends js.Object {
        
        def apply(value: js.Any): Assertion = js.native
        def apply(value: js.Any, toleranceOverride: Double): Assertion = js.native
        
        def eq(value: js.Any): typings.chai.Chai.Assertion = js.native
        def eq(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
        @JSName("eq")
        var eq_Original: Equal = js.native
        
        def equal(value: js.Any): typings.chai.Chai.Assertion = js.native
        def equal(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
        @JSName("equal")
        var equal_Original: Equal = js.native
        
        def equals(value: js.Any): typings.chai.Chai.Assertion = js.native
        def equals(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
        @JSName("equals")
        var equals_Original: Equal = js.native
      }
    }
    
    @js.native
    trait Deep extends js.Object {
      
      def almost(value: js.Any): Assertion = js.native
      def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
      @JSName("almost")
      var almost_Original: DeepAlmost = js.native
    }
  }
}
