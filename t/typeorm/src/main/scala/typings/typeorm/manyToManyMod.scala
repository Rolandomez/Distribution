package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.objectTypeMod.ObjectType
import typings.typeorm.relationOptionsMod.RelationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manyToManyMod {
  
  @JSImport("typeorm/browser/decorator/relations/ManyToMany", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ManyToMany[T](typeFunctionOrTarget: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: String, inverseSide: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: String, inverseSide: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: String, inverseSide: js.Function1[/* object */ T, js.Any]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: String,
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: String, inverseSide: Unit, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: String, options: RelationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](typeFunctionOrTarget: js.Function1[js.UndefOr[js.Any], ObjectType[T]]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: String,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: js.Function1[/* object */ T, js.Any],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    inverseSide: Unit,
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], inverseSide.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ManyToMany[T](
    typeFunctionOrTarget: js.Function1[/* type */ js.UndefOr[js.Any], ObjectType[T]],
    options: RelationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ManyToMany")(typeFunctionOrTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
