package typings.utilityTypes

import typings.std.ArrayLike
import typings.std.Extract
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import typings.utilityTypes.anon.BrandU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMappedTypesMod {
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type AugmentedRequired[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Required[Pick[T, K]])
  
  type Brand[T, U] = T & BrandU[U]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends (args : ...any): any ? T : T extends std.Array<any> ? utility-types.utility-types/dist/mapped-types._DeepNonNullableArray<T[number]> : T extends object ? utility-types.utility-types/dist/mapped-types._DeepNonNullableObject<T> : T
    }}}
    */
  type DeepNonNullable[T] = T
  
  type DeepNonNullableArray[T] = js.Array[DeepNonNullable[NonNullable[T]]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepNonNullable<std.NonNullable<T[P]>>}
    }}}
    */
  @js.native
  trait DeepNonNullableObject[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function ? T : T extends std.Array<infer U> ? utility-types.utility-types/dist/mapped-types._DeepPartialArray<U> : T extends object ? utility-types.utility-types/dist/mapped-types._DeepPartialObject<T> : T | undefined
    }}}
    */
  type DeepPartial[T] = T
  
  type DeepPartialArray[T] = js.Array[DeepPartial[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? utility-types.utility-types/dist/mapped-types.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartialObject[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends (args : ...any): any | utility-types.utility-types/dist/aliases-and-guards.Primitive ? T : T extends utility-types.utility-types/dist/mapped-types._DeepReadonlyArray<infer U> ? utility-types.utility-types/dist/mapped-types._DeepReadonlyArray<U> : T extends utility-types.utility-types/dist/mapped-types._DeepReadonlyObject<infer V> ? utility-types.utility-types/dist/mapped-types._DeepReadonlyObject<V> : T
    }}}
    */
  type DeepReadonly[T] = T
  
  type DeepReadonlyArray[T] = js.Array[DeepReadonly[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: utility-types.utility-types/dist/mapped-types.DeepReadonly<T[P]>}
    }}}
    */
  @js.native
  trait DeepReadonlyObject[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends (args : ...any): any ? T : T extends std.Array<any> ? utility-types.utility-types/dist/mapped-types._DeepRequiredArray<T[number]> : T extends object ? utility-types.utility-types/dist/mapped-types._DeepRequiredObject<T> : T
    }}}
    */
  type DeepRequired[T] = T
  
  type DeepRequiredArray[T] = js.Array[DeepRequired[NonUndefined[T]]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepRequired<utility-types.utility-types/dist/mapped-types.NonUndefined<T[P]>>}
    }}}
    */
  @js.native
  trait DeepRequiredObject[T] extends StObject
  
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, SetDifference[/* keyof T */ String, /* keyof U */ String]]
  
  type Exact[A /* <: js.Object */] = A & typings.utilityTypes.anon.Brand[A]
  
  type FunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? K : never}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    <T>(): T extends X ? 1 : 2 extends <T>(): T extends Y ? 1 : 2 ? A : B
    }}}
    */
  type IfEquals[X, Y, A, B] = A
  
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {-readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Mutable[T] = T
  
  type MutableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, P, never>}[keyof T] */ js.Any
  
  type NonFunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? never : K}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends undefined ? never : A
    }}}
    */
  type NonUndefined[A] = A
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, SetDifference[/* keyof T */ String, K]]
  
  type OmitByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? never : Key}[keyof T] */ js.Any
  ]
  
  type OmitByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? never : Key : Key}[keyof T] */ js.Any
  ]
  
  type Optional[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Partial[Pick[T, K]])
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? K : never}[keyof T] */ js.Any
  
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type PickByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? Key : never}[keyof T] */ js.Any
  ]
  
  type PickByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? Key : never : never}[keyof T] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Promise<infer U> ? U : never
    }}}
    */
  @js.native
  trait PromiseType[T /* <: js.Promise[Any] */] extends StObject
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? never : K}[keyof T] */ js.Any
  
  type SetComplement[A, A1 /* <: A */] = SetDifference[A, A1]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends B ? never : A
    }}}
    */
  type SetDifference[A, B] = A
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends B ? A : never
    }}}
    */
  type SetIntersection[A, B] = A
  
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof T1 */ String]]
  
  type SymmetricDifference[A, B] = SetDifference[A | B, A & B]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  type Unionize[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.ReadonlyArray<any> ? T[number] : T extends std.ArrayLike<any> ? T[number] : T extends object ? T[keyof T] : never
    }}}
    */
  @js.native
  trait ValuesType[T /* <: js.Array[Any] | ArrayLike[Any] | (Record[Any, Any]) */] extends StObject
  
  type Writable[T] = Mutable[T]
  
  type WritableKeys[T /* <: js.Object */] = MutableKeys[T]
}
