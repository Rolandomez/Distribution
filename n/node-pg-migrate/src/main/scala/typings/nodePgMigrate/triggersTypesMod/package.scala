package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object triggersTypesMod {
  
  type CreateTrigger = typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn with typings.nodePgMigrate.anon.ReverseCreateTriggerFn
  
  type CreateTriggerFn = typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn1 | typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn2
  
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typings.nodePgMigrate.triggersTypesMod.TriggerOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateTriggerFn2 = js.Function4[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typings.nodePgMigrate.triggersTypesMod.TriggerOptions with typings.nodePgMigrate.functionsTypesMod.FunctionOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ typings.nodePgMigrate.generalTypesMod.Value, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropTrigger = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTrigger = typings.nodePgMigrate.triggersTypesMod.RenameTriggerFn with typings.nodePgMigrate.anon.ReverseRenameTriggerFn
  
  type RenameTriggerFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* oldTriggerName */ java.lang.String, 
    /* newTriggerName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
