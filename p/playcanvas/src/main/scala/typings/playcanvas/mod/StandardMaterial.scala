package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link StandardMaterial#onUpdateShader}.
  *
  * @callback UpdateShaderCallback
  * @param {import('./standard-material-options.js').StandardMaterialOptions} options - An object with shader generator settings (based on current
  * material and scene properties), that you can change and then return. Properties of the object passed
  * into this function are documented in {@link StandardMaterial}. Also contains a member named litOptions
  * which holds some of the options only used by the lit shader backend {@link LitOptions}.
  * @returns {import('./standard-material-options.js').StandardMaterialOptions} Returned settings will be used by the shader.
  */
/**
  * A Standard material is the main, general purpose material that is most often used for rendering.
  * It can approximate a wide variety of surface types and can simulate dynamic reflected light.
  * Most maps can use 3 types of input values in any combination: constant (color or number), mesh
  * vertex colors and a texture. All enabled inputs are multiplied together.
  *
  * @property {Color} ambient The ambient color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {Color} diffuse The diffuse color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1. Defines basic surface color (aka albedo).
  * @property {boolean} diffuseTint Multiply main (primary) diffuse map and/or diffuse vertex color
  * by the constant diffuse value.
  * @property {import('../../platform/graphics/texture.js').Texture|null} diffuseMap The main
  * (primary) diffuse map of the material (default is null).
  * @property {number} diffuseMapUv Main (primary) diffuse map UV channel.
  * @property {Vec2} diffuseMapTiling Controls the 2D tiling of the main (primary) diffuse map.
  * @property {Vec2} diffuseMapOffset Controls the 2D offset of the main (primary) diffuse map. Each
  * component is between 0 and 1.
  * @property {number} diffuseMapRotation Controls the 2D rotation (in degrees) of the main
  * (primary) diffuse map.
  * @property {string} diffuseMapChannel Color channels of the main (primary) diffuse map to use.
  * Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} diffuseVertexColor Use mesh vertex colors for diffuse. If diffuseMap or are
  * diffuseTint are set, they'll be multiplied by vertex colors.
  * @property {string} diffuseVertexColorChannel Vertex color channels to use for diffuse. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {import('../../platform/graphics/texture.js').Texture|null} diffuseDetailMap The
  * detail (secondary) diffuse map of the material (default is null). Will only be used if main
  * (primary) diffuse map is non-null.
  * @property {number} diffuseDetailMapUv Detail (secondary) diffuse map UV channel.
  * @property {Vec2} diffuseDetailMapTiling Controls the 2D tiling of the detail (secondary) diffuse
  * map.
  * @property {Vec2} diffuseDetailMapOffset Controls the 2D offset of the detail (secondary) diffuse
  * map. Each component is between 0 and 1.
  * @property {number} diffuseDetailMapRotation Controls the 2D rotation (in degrees) of the main
  * (secondary) diffuse map.
  * @property {string} diffuseDetailMapChannel Color channels of the detail (secondary) diffuse map
  * to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {string} diffuseDetailMode Determines how the main (primary) and detail (secondary)
  * diffuse maps are blended together. Can be:
  *
  * - {@link DETAILMODE_MUL}: Multiply together the primary and secondary colors.
  * - {@link DETAILMODE_ADD}: Add together the primary and secondary colors.
  * - {@link DETAILMODE_SCREEN}: Softer version of {@link DETAILMODE_ADD}.
  * - {@link DETAILMODE_OVERLAY}: Multiplies or screens the colors, depending on the primary color.
  * - {@link DETAILMODE_MIN}: Select whichever of the primary and secondary colors is darker,
  * component-wise.
  * - {@link DETAILMODE_MAX}: Select whichever of the primary and secondary colors is lighter,
  * component-wise.
  *
  * Defaults to {@link DETAILMODE_MUL}.
  * @property {Color} specular The specular color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1. Defines surface reflection/specular color.
  * Affects specular intensity and tint.
  * @property {boolean} specularTint Multiply specular map and/or specular vertex color by the
  * constant specular value.
  * @property {import('../../platform/graphics/texture.js').Texture|null} specularMap The specular
  * map of the material (default is null).
  * @property {number} specularMapUv Specular map UV channel.
  * @property {Vec2} specularMapTiling Controls the 2D tiling of the specular map.
  * @property {Vec2} specularMapOffset Controls the 2D offset of the specular map. Each component is
  * between 0 and 1.
  * @property {number} specularMapRotation Controls the 2D rotation (in degrees) of the specular map.
  * @property {string} specularMapChannel Color channels of the specular map to use. Can be "r", "g",
  * "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} specularVertexColor Use mesh vertex colors for specular. If specularMap or
  * are specularTint are set, they'll be multiplied by vertex colors.
  * @property {string} specularVertexColorChannel Vertex color channels to use for specular. Can be
  * @property {boolean} specularityFactorTint Multiply specularity factor map and/or specular vertex color by the
  * constant specular value.
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {number} specularityFactor The factor of specular intensity, used to weight the fresnel and specularity. Default is 1.0.
  * @property {import('../../platform/graphics/texture.js').Texture|null} specularityFactorMap The
  * factor of specularity as a texture (default is null).
  * @property {number} specularityFactorMapUv Specularity factor map UV channel.
  * @property {Vec2} specularityFactorMapTiling Controls the 2D tiling of the specularity factor map.
  * @property {Vec2} specularityFactorMapOffset Controls the 2D offset of the specularity factor map. Each component is
  * between 0 and 1.
  * @property {number} specularityFactorMapRotation Controls the 2D rotation (in degrees) of the specularity factor map.
  * @property {string} specularityFactorMapChannel The channel used by the specularity factor texture to sample from (default is 'a').
  * @property {boolean} specularityFactorVertexColor Use mesh vertex colors for specularity factor. If specularityFactorMap or
  * are specularityFactorTint are set, they'll be multiplied by vertex colors.
  * @property {string} specularityFactorVertexColorChannel Vertex color channels to use for specularity factor. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} enableGGXSpecular Enables GGX specular. Also enables
  * {@link StandardMaterial#anisotropy}  parameter to set material anisotropy.
  * @property {number} anisotropy Defines amount of anisotropy. Requires
  * {@link StandardMaterial#enableGGXSpecular} is set to true.
  *
  * - When anisotropy == 0, specular is isotropic.
  * - When anisotropy < 0, anisotropy direction aligns with the tangent, and specular anisotropy
  * increases as the anisotropy value decreases to minimum of -1.
  * - When anisotropy > 0, anisotropy direction aligns with the bi-normal, and specular anisotropy
  * increases as anisotropy value increases to maximum of 1.
  *
  * @property {number} clearCoat Defines intensity of clearcoat layer from 0 to 1. Clearcoat layer
  * is disabled when clearCoat == 0. Default value is 0 (disabled).
  * @property {import('../../platform/graphics/texture.js').Texture|null} clearCoatMap Monochrome
  * clearcoat intensity map (default is null). If specified, will be multiplied by normalized
  * 'clearCoat' value and/or vertex colors.
  * @property {number} clearCoatMapUv Clearcoat intensity map UV channel.
  * @property {Vec2} clearCoatMapTiling Controls the 2D tiling of the clearcoat intensity map.
  * @property {Vec2} clearCoatMapOffset Controls the 2D offset of the clearcoat intensity map. Each
  * component is between 0 and 1.
  * @property {number} clearCoatMapRotation Controls the 2D rotation (in degrees) of the clearcoat
  * intensity map.
  * @property {string} clearCoatMapChannel Color channel of the clearcoat intensity map to use. Can
  * be "r", "g", "b" or "a".
  * @property {boolean} clearCoatVertexColor Use mesh vertex colors for clearcoat intensity. If
  * clearCoatMap is set, it'll be multiplied by vertex colors.
  * @property {string} clearCoatVertexColorChannel Vertex color channel to use for clearcoat
  * intensity. Can be "r", "g", "b" or "a".
  * @property {number} clearCoatGloss Defines the clearcoat glossiness of the clearcoat layer
  * from 0 (rough) to 1 (mirror).
  * @property {boolean} clearCoatGlossInvert Invert the clearcoat gloss component (default is false).
  * Enabling this flag results in material treating the clear coat gloss members as roughness.
  * @property {import('../../platform/graphics/texture.js').Texture|null} clearCoatGlossMap Monochrome
  * clearcoat glossiness map (default is null). If specified, will be multiplied by normalized
  * 'clearCoatGloss' value and/or vertex colors.
  * @property {number} clearCoatGlossMapUv Clearcoat gloss map UV channel.
  * @property {Vec2} clearCoatGlossMapTiling Controls the 2D tiling of the clearcoat gloss map.
  * @property {Vec2} clearCoatGlossMapOffset Controls the 2D offset of the clearcoat gloss map.
  * Each component is between 0 and 1.
  * @property {number} clearCoatGlossMapRotation Controls the 2D rotation (in degrees) of the clear
  * coat gloss map.
  * @property {string} clearCoatGlossMapChannel Color channel of the clearcoat gloss map to use.
  * Can be "r", "g", "b" or "a".
  * @property {boolean} clearCoatGlossVertexColor Use mesh vertex colors for clearcoat glossiness.
  * If clearCoatGlossMap is set, it'll be multiplied by vertex colors.
  * @property {string} clearCoatGlossVertexColorChannel Vertex color channel to use for clearcoat
  * glossiness. Can be "r", "g", "b" or "a".
  * @property {import('../../platform/graphics/texture.js').Texture|null} clearCoatNormalMap The
  * clearcoat normal map of the material (default is null). The texture must contains normalized,
  * tangent space normals.
  * @property {number} clearCoatNormalMapUv Clearcoat normal map UV channel.
  * @property {Vec2} clearCoatNormalMapTiling Controls the 2D tiling of the main clearcoat normal
  * map.
  * @property {Vec2} clearCoatNormalMapOffset Controls the 2D offset of the main clearcoat normal
  * map. Each component is between 0 and 1.
  * @property {number} clearCoatNormalMapRotation Controls the 2D rotation (in degrees) of the main
  * clearcoat map.
  * @property {number} clearCoatBumpiness The bumpiness of the clearcoat layer. This value scales
  * the assigned main clearcoat normal map. It should be normally between 0 (no bump mapping) and 1
  * (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {boolean} useIridescence Enable thin-film iridescence.
  * @property {import('../../platform/graphics/texture.js').Texture|null} iridescenceMap The
  * per-pixel iridescence intensity. Only used when useIridescence is enabled.
  * @property {number} iridescenceMapUv Iridescence map UV channel.
  * @property {Vec2} iridescenceMapTiling Controls the 2D tiling of the iridescence map.
  * @property {Vec2} iridescenceMapOffset Controls the 2D offset of the iridescence map. Each component is
  * between 0 and 1.
  * @property {number} iridescenceMapRotation Controls the 2D rotation (in degrees) of the iridescence
  * map.
  * @property {string} iridescenceMapChannel Color channels of the iridescence map to use. Can be "r",
  * "g", "b" or "a".
  * @property {import('../../platform/graphics/texture.js').Texture|null} iridescenceThicknessMap The
  * per-pixel iridescence thickness. Defines a gradient weight between iridescenceThicknessMin and
  * iridescenceThicknessMax. Only used when useIridescence is enabled.
  * @property {number} iridescenceThicknessMapUv Iridescence thickness map UV channel.
  * @property {Vec2} iridescenceThicknessMapTiling Controls the 2D tiling of the iridescence
  * thickness map.
  * @property {Vec2} iridescenceThicknessMapOffset Controls the 2D offset of the iridescence
  * thickness map. Each component is between 0 and 1.
  * @property {number} iridescenceThicknessMapRotation Controls the 2D rotation (in degrees)
  * of the iridescence map.
  * @property {string} iridescenceThicknessMapChannel Color channels of the iridescence thickness
  * map to use. Can be "r", "g", "b" or "a".
  * @property {number} iridescenceThicknessMin The minimum thickness for the iridescence layer.
  * Only used when an iridescence thickness map is used. The unit is in nm.
  * @property {number} iridescenceThicknessMax The maximum thickness for the iridescence layer.
  * Used as the 'base' thickness when no iridescence thickness map is defined. The unit is in nm.
  * @property {number} iridescenceRefractionIndex The index of refraction of the iridescent
  * thin-film. Affects the color phase shift as described here:
  * https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Khronos/KHR_materials_iridescence
  * @property {boolean} useMetalness Use metalness properties instead of specular. When enabled,
  * diffuse colors also affect specular instead of the dedicated specular map. This can be used as
  * alternative to specular color to save space. With metalness == 0, the pixel is assumed to be
  * dielectric, and diffuse color is used as normal. With metalness == 1, the pixel is fully
  * metallic, and diffuse color is used as specular color instead.
  * @property {boolean} useMetalnessSpecularColor When metalness is enabled, use the
  * specular map to apply color tint to specular reflections.
  * at direct angles.
  * @property {number} metalness Defines how much the surface is metallic. From 0 (dielectric) to 1
  * (metal).
  * @property {import('../../platform/graphics/texture.js').Texture|null} metalnessMap Monochrome
  * metalness map (default is null).
  * @property {number} metalnessMapUv Metalness map UV channel.
  * @property {Vec2} metalnessMapTiling Controls the 2D tiling of the metalness map.
  * @property {Vec2} metalnessMapOffset Controls the 2D offset of the metalness map. Each component
  * is between 0 and 1.
  * @property {number} metalnessMapRotation Controls the 2D rotation (in degrees) of the metalness
  * map.
  * @property {string} metalnessMapChannel Color channel of the metalness map to use. Can be "r",
  * "g", "b" or "a".
  * @property {boolean} metalnessVertexColor Use mesh vertex colors for metalness. If metalnessMap
  * is set, it'll be multiplied by vertex colors.
  * @property {string} metalnessVertexColorChannel Vertex color channel to use for metalness. Can be
  * "r", "g", "b" or "a".
  * @property {number} gloss Defines the glossiness of the material from 0 (rough) to 1 (shiny).
  * @property {import('../../platform/graphics/texture.js').Texture|null} glossMap Gloss map
  * (default is null). If specified, will be multiplied by normalized gloss value and/or vertex
  * colors.
  * @property {boolean} glossInvert Invert the gloss component (default is false). Enabling this
  * flag results in material treating the gloss members as roughness.
  * @property {number} glossMapUv Gloss map UV channel.
  * @property {string} glossMapChannel Color channel of the gloss map to use. Can be "r", "g", "b"
  * or "a".
  * @property {Vec2} glossMapTiling Controls the 2D tiling of the gloss map.
  * @property {Vec2} glossMapOffset Controls the 2D offset of the gloss map. Each component is
  * between 0 and 1.
  * @property {number} glossMapRotation Controls the 2D rotation (in degrees) of the gloss map.
  * @property {boolean} glossVertexColor Use mesh vertex colors for glossiness. If glossMap is set,
  * it'll be multiplied by vertex colors.
  * @property {string} glossVertexColorChannel Vertex color channel to use for glossiness. Can be
  * "r", "g", "b" or "a".
  * @property {number} refraction Defines the visibility of refraction. Material can refract the
  * same cube map as used for reflections.
  * @property {import('../../platform/graphics/texture.js').Texture|null} refractionMap The map of
  * the refraction visibility.
  * @property {number} refractionMapUv Refraction map UV channel.
  * @property {Vec2} refractionMapTiling Controls the 2D tiling of the refraction map.
  * @property {Vec2} refractionMapOffset Controls the 2D offset of the refraction map. Each component
  * is between 0 and 1.
  * @property {number} refractionMapRotation Controls the 2D rotation (in degrees) of the emissive
  * map.
  * @property {string} refractionMapChannel Color channels of the refraction map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} refractionVertexColor Use mesh vertex colors for refraction. If
  * refraction map is set, it will be be multiplied by vertex colors.
  * @property {boolean} refractionVertexColorChannel Vertex color channel to use for refraction.
  * Can be "r", "g", "b" or "a".
  * @property {number} refractionIndex Defines the index of refraction, i.e. The amount of
  * distortion. The value is calculated as (outerIor / surfaceIor), where inputs are measured
  * indices of refraction, the one around the object and the one of its own surface. In most
  * situations outer medium is air, so outerIor will be approximately 1. Then you only need to do
  * (1.0 / surfaceIor).
  * @property {boolean} useDynamicRefraction Enables higher quality refractions using the grab pass
  * instead of pre-computed cube maps for refractions.
  * @property {number} thickness The thickness of the medium, only used when useDynamicRefraction
  * is enabled. The unit is in base units, and scales with the size of the object.
  * @property {import('../../platform/graphics/texture.js').Texture|null} thicknessMap The
  * per-pixel thickness of the medium, only used when useDynamicRefraction is enabled.
  * @property {number} thicknessMapUv Thickness map UV channel.
  * @property {Vec2} thicknessMapTiling Controls the 2D tiling of the thickness map.
  * @property {Vec2} thicknessMapOffset Controls the 2D offset of the thickness map. Each component is
  * between 0 and 1.
  * @property {number} thicknessMapRotation Controls the 2D rotation (in degrees) of the thickness
  * map.
  * @property {string} thicknessMapChannel Color channels of the thickness map to use. Can be "r",
  * "g", "b" or "a".
  * @property {boolean} thicknessVertexColor Use mesh vertex colors for thickness. If
  * thickness map is set, it will be be multiplied by vertex colors.
  * @property {Color} attenuation The attenuation color for refractive materials, only used when
  * useDynamicRefraction is enabled.
  * @property {number} attenuationDistance The distance defining the absorption rate of light
  * within the medium. Only used when useDynamicRefraction is enabled.
  * @property {Color} emissive The emissive color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {boolean} emissiveTint Multiply emissive map and/or emissive vertex color by the
  * constant emissive value.
  * @property {import('../../platform/graphics/texture.js').Texture|null} emissiveMap The emissive
  * map of the material (default is null). Can be HDR.
  * @property {number} emissiveIntensity Emissive color multiplier.
  * @property {number} emissiveMapUv Emissive map UV channel.
  * @property {Vec2} emissiveMapTiling Controls the 2D tiling of the emissive map.
  * @property {Vec2} emissiveMapOffset Controls the 2D offset of the emissive map. Each component is
  * between 0 and 1.
  * @property {number} emissiveMapRotation Controls the 2D rotation (in degrees) of the emissive
  * map.
  * @property {string} emissiveMapChannel Color channels of the emissive map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} emissiveVertexColor Use mesh vertex colors for emission. If emissiveMap or
  * emissiveTint are set, they'll be multiplied by vertex colors.
  * @property {string} emissiveVertexColorChannel Vertex color channels to use for emission. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} useSheen Toggle sheen specular effect on/off.
  * @property {Color} sheen The specular color of the sheen (fabric) microfiber structure.
  * This color value is 3-component (RGB), where each component is between 0 and 1.
  * @property {boolean} sheenTint Multiply sheen map and/or sheen vertex color by the constant
  * sheen value.
  * @property {import('../../platform/graphics/texture.js').Texture|null} sheenMap The sheen
  * microstructure color map of the material (default is null).
  * @property {number} sheenMapUv Sheen map UV channel.
  * @property {Vec2} sheenMapTiling Controls the 2D tiling of the sheen map.
  * @property {Vec2} sheenMapOffset Controls the 2D offset of the sheen map. Each component is
  * between 0 and 1.
  * @property {number} sheenMapRotation Controls the 2D rotation (in degrees) of the sheen
  * map.
  * @property {string} sheenMapChannel Color channels of the sheen map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} sheenVertexColor Use mesh vertex colors for sheen. If sheen map or
  * sheen tint are set, they'll be multiplied by vertex colors.
  * @property {number} sheenGloss The glossiness of the sheen (fabric) microfiber structure.
  * This color value is a single value between 0 and 1.
  * @property {boolean} sheenGlossInvert Invert the sheen gloss component (default is false).
  * Enabling this flag results in material treating the sheen gloss members as roughness.
  * @property {boolean} sheenGlossTint Multiply sheen glossiness map and/or sheen glossiness vertex
  * value by the scalar sheen glossiness value.
  * @property {import('../../platform/graphics/texture.js').Texture|null} sheenGlossMap The sheen
  * glossiness microstructure color map of the material (default is null).
  * @property {number} sheenGlossMapUv Sheen map UV channel.
  * @property {Vec2} sheenGlossMapTiling Controls the 2D tiling of the sheen glossiness map.
  * @property {Vec2} sheenGlossMapOffset Controls the 2D offset of the sheen glossiness map.
  * Each component is between 0 and 1.
  * @property {number} sheenGlossMapRotation Controls the 2D rotation (in degrees) of the sheen
  * glossiness map.
  * @property {string} sheenGlossMapChannel Color channels of the sheen glossiness map to use.
  * Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} sheenGlossVertexColor Use mesh vertex colors for sheen glossiness.
  * If sheen glossiness map or sheen glossiness tint are set, they'll be multiplied by vertex colors.
  * @property {string} sheenGlossVertexColorChannel Vertex color channels to use for sheen glossiness.
  * Can be "r", "g", "b" or "a".
  * @property {number} opacity The opacity of the material. This value can be between 0 and 1, where
  * 0 is fully transparent and 1 is fully opaque. If you want the material to be semi-transparent
  * you also need to set the {@link Material#blendType} to {@link BLEND_NORMAL},
  * {@link BLEND_ADDITIVE} or any other mode. Also note that for most semi-transparent objects you
  * want {@link Material#depthWrite} to be false, otherwise they can fully occlude objects behind
  * them.
  * @property {import('../../platform/graphics/texture.js').Texture|null} opacityMap The opacity map
  * of the material (default is null).
  * @property {number} opacityMapUv Opacity map UV channel.
  * @property {string} opacityMapChannel Color channel of the opacity map to use. Can be "r", "g",
  * "b" or "a".
  * @property {Vec2} opacityMapTiling Controls the 2D tiling of the opacity map.
  * @property {Vec2} opacityMapOffset Controls the 2D offset of the opacity map. Each component is
  * between 0 and 1.
  * @property {number} opacityMapRotation Controls the 2D rotation (in degrees) of the opacity map.
  * @property {boolean} opacityVertexColor Use mesh vertex colors for opacity. If opacityMap is set,
  * it'll be multiplied by vertex colors.
  * @property {string} opacityVertexColorChannel Vertex color channels to use for opacity. Can be
  * "r", "g", "b" or "a".
  * @property {boolean} opacityFadesSpecular used to specify whether specular and reflections are
  * faded out using {@link StandardMaterial#opacity}. Default is true. When set to false use
  * {@link Material#alphaFade} to fade out materials.
  * @property {number} alphaFade used to fade out materials when
  * {@link StandardMaterial#opacityFadesSpecular} is set to false.
  * @property {import('../../platform/graphics/texture.js').Texture|null} normalMap The main
  * (primary) normal map of the material (default is null). The texture must contains normalized,
  * tangent space normals.
  * @property {number} normalMapUv Main (primary) normal map UV channel.
  * @property {Vec2} normalMapTiling Controls the 2D tiling of the main (primary) normal map.
  * @property {Vec2} normalMapOffset Controls the 2D offset of the main (primary) normal map. Each
  * component is between 0 and 1.
  * @property {number} normalMapRotation Controls the 2D rotation (in degrees) of the main (primary)
  * normal map.
  * @property {number} bumpiness The bumpiness of the material. This value scales the assigned main
  * (primary) normal map. It should be normally between 0 (no bump mapping) and 1 (full bump
  * mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {import('../../platform/graphics/texture.js').Texture|null} normalDetailMap The detail
  * (secondary) normal map of the material (default is null). Will only be used if main (primary)
  * normal map is non-null.
  * @property {number} normalDetailMapUv Detail (secondary) normal map UV channel.
  * @property {Vec2} normalDetailMapTiling Controls the 2D tiling of the detail (secondary) normal
  * map.
  * @property {Vec2} normalDetailMapOffset Controls the 2D offset of the detail (secondary) normal
  * map. Each component is between 0 and 1.
  * @property {number} normalDetailMapRotation Controls the 2D rotation (in degrees) of the detail
  * (secondary) normal map.
  * @property {number} normalDetailMapBumpiness The bumpiness of the material. This value scales the
  * assigned detail (secondary) normal map. It should be normally between 0 (no bump mapping) and 1
  * (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {import('../../platform/graphics/texture.js').Texture|null} heightMap The height map
  * of the material (default is null). Used for a view-dependent parallax effect. The texture must
  * represent the height of the surface where darker pixels are lower and lighter pixels are higher.
  * It is recommended to use it together with a normal map.
  * @property {number} heightMapUv Height map UV channel.
  * @property {string} heightMapChannel Color channel of the height map to use. Can be "r", "g", "b"
  * or "a".
  * @property {Vec2} heightMapTiling Controls the 2D tiling of the height map.
  * @property {Vec2} heightMapOffset Controls the 2D offset of the height map. Each component is
  * between 0 and 1.
  * @property {number} heightMapRotation Controls the 2D rotation (in degrees) of the height map.
  * @property {number} heightMapFactor Height map multiplier. Affects the strength of the parallax
  * effect.
  * @property {import('../../platform/graphics/texture.js').Texture|null} envAtlas The prefiltered
  * environment lighting atlas (default is null). This setting overrides cubeMap and sphereMap and
  * will replace the scene lighting environment.
  * @property {import('../../platform/graphics/texture.js').Texture|null} cubeMap The cubic
  * environment map of the material (default is null). This setting overrides sphereMap and will
  * replace the scene lighting environment.
  * @property {import('../../platform/graphics/texture.js').Texture|null} sphereMap The spherical
  * environment map of the material (default is null). This will replace the scene lighting
  * environment.
  * @property {number} cubeMapProjection The type of projection applied to the cubeMap property:
  * - {@link CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.
  * - {@link CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.
  * Defaults to {@link CUBEPROJ_NONE}.
  * @property {import('../../core/shape/bounding-box.js').BoundingBox} cubeMapProjectionBox The
  * world space axis-aligned bounding box defining the box-projection used for the cubeMap property.
  * Only used when cubeMapProjection is set to {@link CUBEPROJ_BOX}.
  * @property {number} reflectivity Environment map intensity.
  * @property {import('../../platform/graphics/texture.js').Texture|null} lightMap A custom lightmap
  * of the material (default is null). Lightmaps are textures that contain pre-rendered lighting.
  * Can be HDR.
  * @property {number} lightMapUv Lightmap UV channel
  * @property {string} lightMapChannel Color channels of the lightmap to use. Can be "r", "g", "b",
  * "a", "rgb" or any swizzled combination.
  * @property {Vec2} lightMapTiling Controls the 2D tiling of the lightmap.
  * @property {Vec2} lightMapOffset Controls the 2D offset of the lightmap. Each component is
  * between 0 and 1.
  * @property {number} lightMapRotation Controls the 2D rotation (in degrees) of the lightmap.
  * @property {boolean} lightVertexColor Use baked vertex lighting. If lightMap is set, it'll be
  * multiplied by vertex colors.
  * @property {string} lightVertexColorChannel Vertex color channels to use for baked lighting. Can
  * be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} ambientTint Enables scene ambient multiplication by material ambient color.
  * @property {import('../../platform/graphics/texture.js').Texture|null} aoMap The main (primary) baked ambient
  * occlusion (AO) map (default is null). Modulates ambient color.
  * @property {number} aoMapUv Main (primary) AO map UV channel
  * @property {string} aoMapChannel Color channel of the main (primary) AO map to use. Can be "r", "g", "b" or "a".
  * @property {Vec2} aoMapTiling Controls the 2D tiling of the main (primary) AO map.
  * @property {Vec2} aoMapOffset Controls the 2D offset of the main (primary) AO map. Each component is between 0
  * and 1.
  * @property {number} aoMapRotation Controls the 2D rotation (in degrees) of the main (primary) AO map.
  * @property {boolean} aoVertexColor Use mesh vertex colors for AO. If aoMap is set, it'll be
  * multiplied by vertex colors.
  * @property {string} aoVertexColorChannel Vertex color channels to use for AO. Can be "r", "g",
  * "b" or "a".
  * @property {import('../../platform/graphics/texture.js').Texture|null} aoDetailMap The
  * detail (secondary) baked ambient occlusion (AO) map of the material (default is null). Will only be used if main
  * (primary) ao map is non-null.
  * @property {number} aoDetailMapUv Detail (secondary) AO map UV channel.
  * @property {Vec2} aoDetailMapTiling Controls the 2D tiling of the detail (secondary) AO
  * map.
  * @property {Vec2} aoDetailMapOffset Controls the 2D offset of the detail (secondary) AO
  * map. Each component is between 0 and 1.
  * @property {number} aoDetailMapRotation Controls the 2D rotation (in degrees) of the detail
  * (secondary) AO map.
  * @property {string} aoDetailMapChannel Color channels of the detail (secondary) AO map
  * to use. Can be "r", "g", "b" or "a" (default is "g").
  * @property {string} aoDetailMode Determines how the main (primary) and detail (secondary)
  * AO maps are blended together. Can be:
  *
  * - {@link DETAILMODE_MUL}: Multiply together the primary and secondary colors.
  * - {@link DETAILMODE_ADD}: Add together the primary and secondary colors.
  * - {@link DETAILMODE_SCREEN}: Softer version of {@link DETAILMODE_ADD}.
  * - {@link DETAILMODE_OVERLAY}: Multiplies or screens the colors, depending on the primary color.
  * - {@link DETAILMODE_MIN}: Select whichever of the primary and secondary colors is darker,
  * component-wise.
  * - {@link DETAILMODE_MAX}: Select whichever of the primary and secondary colors is lighter,
  * component-wise.
  *
  * Defaults to {@link DETAILMODE_MUL}.
  * @property {number} occludeSpecular Uses ambient occlusion to darken specular/reflection. It's a
  * hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
  *
  * - {@link SPECOCC_NONE}: No specular occlusion
  * - {@link SPECOCC_AO}: Use AO directly to occlude specular.
  * - {@link SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude
  * specular.
  *
  * @property {number} occludeSpecularIntensity Controls visibility of specular occlusion.
  * @property {boolean} occludeDirect Tells if AO should darken directional lighting. Defaults to
  * false.
  * @property {boolean} conserveEnergy Defines how diffuse and specular components are combined when
  * Fresnel is on. It is recommended that you leave this option enabled, although you may want to
  * disable it in case when all reflection comes only from a few light sources, and you don't use an
  * environment map, therefore having mostly black reflection.
  * @property {number} shadingModel Defines the shading model.
  * - {@link SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a
  * backwards compatibility with older projects.
  * - {@link SPECULAR_BLINN}: Energy-conserving Blinn-Phong.
  * @property {number} fresnelModel Defines the formula used for Fresnel effect.
  * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components
  * are combined. When Fresnel is off, legacy non energy-conserving combining is used. When it is
  * on, combining behavior is defined by conserveEnergy parameter.
  *
  * - {@link FRESNEL_NONE}: No Fresnel.
  * - {@link FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by
  * specular color.
  *
  * @property {boolean} useFog Apply fogging (as configured in scene settings)
  * @property {boolean} useLighting Apply lighting
  * @property {boolean} useSkybox Apply scene skybox as prefiltered environment map
  * @property {boolean} useGammaTonemap Apply gamma correction and tonemapping (as configured in
  * scene settings).
  * @property {boolean} pixelSnap Align vertices to pixel coordinates when rendering. Useful for
  * pixel perfect 2D graphics.
  * @property {boolean} twoSidedLighting Calculate proper normals (and therefore lighting) on
  * backfaces.
  * @property {UpdateShaderCallback} onUpdateShader A custom function that will be called after all
  * shader generator properties are collected and before shader code is generated. This function
  * will receive an object with shader generator settings (based on current material and scene
  * properties), that you can change and then return. Returned value will be used instead. This is
  * mostly useful when rendering the same set of objects, but with different shader variations based
  * on the same material. For example, you may wish to render a depth or normal pass using textures
  * assigned to the material, a reflection pass with simpler shaders and so on. These properties are
  * split into two sections, generic standard material options and lit options. Properties of the
  * standard material options are {@link StandardMaterialOptions} and the options for the lit options
  * are {@link LitOptions}.
  * @augments Material
  */
@JSImport("playcanvas", "StandardMaterial")
@js.native
open class StandardMaterial () extends Material {
  
  var _activeLightingParams: Set[Any] = js.native
  
  var _activeParams: Set[Any] = js.native
  
  def _allocUniform(name: Any, allocFunc: Any): Any = js.native
  
  /**
    * @type {Object<string, string>}
    * @private
    */
  /* private */ var _chunks: Any = js.native
  
  var _dirtyShader: Boolean = js.native
  
  def _processParameters(paramsName: Any): Unit = js.native
  
  def _setParameter(name: Any, value: Any): Unit = js.native
  
  def _setParameters(parameters: Any): Unit = js.native
  
  def _updateMap(p: Any): Unit = js.native
  
  def alphaFade: Boolean = js.native
  def alphaFade_=(arg: Boolean): Unit = js.native
  
  def ambient: Color = js.native
  
  def ambientTint: Boolean = js.native
  def ambientTint_=(arg: Boolean): Unit = js.native
  
  def ambient_=(arg: Color): Unit = js.native
  
  def anisotropy: Double = js.native
  def anisotropy_=(arg: Double): Unit = js.native
  
  def aoDetailMap: Texture | Null = js.native
  
  def aoDetailMapChannel: String = js.native
  def aoDetailMapChannel_=(arg: String): Unit = js.native
  
  def aoDetailMapOffset: Vec2 = js.native
  def aoDetailMapOffset_=(arg: Vec2): Unit = js.native
  
  def aoDetailMapRotation: Double = js.native
  def aoDetailMapRotation_=(arg: Double): Unit = js.native
  
  def aoDetailMapTiling: Vec2 = js.native
  def aoDetailMapTiling_=(arg: Vec2): Unit = js.native
  
  def aoDetailMapUv: Double = js.native
  def aoDetailMapUv_=(arg: Double): Unit = js.native
  
  def aoDetailMap_=(arg: Texture | Null): Unit = js.native
  
  def aoDetailMode: String = js.native
  def aoDetailMode_=(arg: String): Unit = js.native
  
  def aoMap: Texture | Null = js.native
  
  def aoMapChannel: String = js.native
  def aoMapChannel_=(arg: String): Unit = js.native
  
  def aoMapOffset: Vec2 = js.native
  def aoMapOffset_=(arg: Vec2): Unit = js.native
  
  def aoMapRotation: Double = js.native
  def aoMapRotation_=(arg: Double): Unit = js.native
  
  def aoMapTiling: Vec2 = js.native
  def aoMapTiling_=(arg: Vec2): Unit = js.native
  
  def aoMapUv: Double = js.native
  def aoMapUv_=(arg: Double): Unit = js.native
  
  def aoMap_=(arg: Texture | Null): Unit = js.native
  
  def aoVertexColor: Boolean = js.native
  
  def aoVertexColorChannel: String = js.native
  def aoVertexColorChannel_=(arg: String): Unit = js.native
  
  def aoVertexColor_=(arg: Boolean): Unit = js.native
  
  def bumpiness: Double = js.native
  def bumpiness_=(arg: Double): Unit = js.native
  
  def chunks: StringDictionary[String] = js.native
  /**
    * Object containing custom shader chunks that will replace default ones.
    *
    * @type {Object<string, string>}
    */
  def chunks_=(arg: StringDictionary[String]): Unit = js.native
  
  def clearCoat: Double = js.native
  
  def clearCoatBumpiness: Double = js.native
  def clearCoatBumpiness_=(arg: Double): Unit = js.native
  
  def clearCoatGloss: Double = js.native
  
  def clearCoatGlossMap: Texture | Null = js.native
  
  def clearCoatGlossMapChannel: String = js.native
  def clearCoatGlossMapChannel_=(arg: String): Unit = js.native
  
  def clearCoatGlossMapOffset: Vec2 = js.native
  def clearCoatGlossMapOffset_=(arg: Vec2): Unit = js.native
  
  def clearCoatGlossMapRotation: Double = js.native
  def clearCoatGlossMapRotation_=(arg: Double): Unit = js.native
  
  def clearCoatGlossMapTiling: Vec2 = js.native
  def clearCoatGlossMapTiling_=(arg: Vec2): Unit = js.native
  
  def clearCoatGlossMapUv: Double = js.native
  def clearCoatGlossMapUv_=(arg: Double): Unit = js.native
  
  def clearCoatGlossMap_=(arg: Texture | Null): Unit = js.native
  
  def clearCoatGlossVertexColor: Boolean = js.native
  
  def clearCoatGlossVertexColorChannel: String = js.native
  def clearCoatGlossVertexColorChannel_=(arg: String): Unit = js.native
  
  def clearCoatGlossVertexColor_=(arg: Boolean): Unit = js.native
  
  def clearCoatGloss_=(arg: Double): Unit = js.native
  
  def clearCoatMap: Texture | Null = js.native
  
  def clearCoatMapChannel: String = js.native
  def clearCoatMapChannel_=(arg: String): Unit = js.native
  
  def clearCoatMapOffset: Vec2 = js.native
  def clearCoatMapOffset_=(arg: Vec2): Unit = js.native
  
  def clearCoatMapRotation: Double = js.native
  def clearCoatMapRotation_=(arg: Double): Unit = js.native
  
  def clearCoatMapTiling: Vec2 = js.native
  def clearCoatMapTiling_=(arg: Vec2): Unit = js.native
  
  def clearCoatMapUv: Double = js.native
  def clearCoatMapUv_=(arg: Double): Unit = js.native
  
  def clearCoatMap_=(arg: Texture | Null): Unit = js.native
  
  def clearCoatNormalMap: Texture | Null = js.native
  
  def clearCoatNormalMapOffset: Vec2 = js.native
  def clearCoatNormalMapOffset_=(arg: Vec2): Unit = js.native
  
  def clearCoatNormalMapRotation: Double = js.native
  def clearCoatNormalMapRotation_=(arg: Double): Unit = js.native
  
  def clearCoatNormalMapTiling: Vec2 = js.native
  def clearCoatNormalMapTiling_=(arg: Vec2): Unit = js.native
  
  def clearCoatNormalMapUv: Double = js.native
  def clearCoatNormalMapUv_=(arg: Double): Unit = js.native
  
  def clearCoatNormalMap_=(arg: Texture | Null): Unit = js.native
  
  def clearCoatVertexColor: Boolean = js.native
  
  def clearCoatVertexColorChannel: String = js.native
  def clearCoatVertexColorChannel_=(arg: String): Unit = js.native
  
  def clearCoatVertexColor_=(arg: Boolean): Unit = js.native
  
  def clearCoat_=(arg: Double): Unit = js.native
  
  def conserveEnergy: Boolean = js.native
  def conserveEnergy_=(arg: Boolean): Unit = js.native
  
  /**
    * Copy a `StandardMaterial`.
    *
    * @param {StandardMaterial} source - The material to copy from.
    * @returns {StandardMaterial} The destination material.
    */
  def copy(source: StandardMaterial): StandardMaterial = js.native
  
  def cubeMap: Texture | Null = js.native
  
  def cubeMapProjection: Double = js.native
  
  def cubeMapProjectionBox: BoundingBox = js.native
  def cubeMapProjectionBox_=(arg: BoundingBox): Unit = js.native
  
  def cubeMapProjection_=(arg: Double): Unit = js.native
  
  def cubeMap_=(arg: Texture | Null): Unit = js.native
  
  def diffuse: Color = js.native
  
  def diffuseDetailMap: Texture | Null = js.native
  
  def diffuseDetailMapChannel: String = js.native
  def diffuseDetailMapChannel_=(arg: String): Unit = js.native
  
  def diffuseDetailMapOffset: Vec2 = js.native
  def diffuseDetailMapOffset_=(arg: Vec2): Unit = js.native
  
  def diffuseDetailMapRotation: Double = js.native
  def diffuseDetailMapRotation_=(arg: Double): Unit = js.native
  
  def diffuseDetailMapTiling: Vec2 = js.native
  def diffuseDetailMapTiling_=(arg: Vec2): Unit = js.native
  
  def diffuseDetailMapUv: Double = js.native
  def diffuseDetailMapUv_=(arg: Double): Unit = js.native
  
  def diffuseDetailMap_=(arg: Texture | Null): Unit = js.native
  
  def diffuseDetailMode: String = js.native
  def diffuseDetailMode_=(arg: String): Unit = js.native
  
  def diffuseMap: Texture | Null = js.native
  
  def diffuseMapChannel: String = js.native
  def diffuseMapChannel_=(arg: String): Unit = js.native
  
  def diffuseMapOffset: Vec2 = js.native
  def diffuseMapOffset_=(arg: Vec2): Unit = js.native
  
  def diffuseMapRotation: Double = js.native
  def diffuseMapRotation_=(arg: Double): Unit = js.native
  
  def diffuseMapTiling: Vec2 = js.native
  def diffuseMapTiling_=(arg: Vec2): Unit = js.native
  
  def diffuseMapUv: Double = js.native
  def diffuseMapUv_=(arg: Double): Unit = js.native
  
  def diffuseMap_=(arg: Texture | Null): Unit = js.native
  
  def diffuseTint: Boolean = js.native
  def diffuseTint_=(arg: Boolean): Unit = js.native
  
  def diffuseVertexColor: Boolean = js.native
  
  def diffuseVertexColorChannel: String = js.native
  def diffuseVertexColorChannel_=(arg: String): Unit = js.native
  
  def diffuseVertexColor_=(arg: Boolean): Unit = js.native
  
  def diffuse_=(arg: Color): Unit = js.native
  
  def emissive: Color = js.native
  
  def emissiveIntensity: Double = js.native
  def emissiveIntensity_=(arg: Double): Unit = js.native
  
  def emissiveMap: Texture | Null = js.native
  
  def emissiveMapChannel: String = js.native
  def emissiveMapChannel_=(arg: String): Unit = js.native
  
  def emissiveMapOffset: Vec2 = js.native
  def emissiveMapOffset_=(arg: Vec2): Unit = js.native
  
  def emissiveMapRotation: Double = js.native
  def emissiveMapRotation_=(arg: Double): Unit = js.native
  
  def emissiveMapTiling: Vec2 = js.native
  def emissiveMapTiling_=(arg: Vec2): Unit = js.native
  
  def emissiveMapUv: Double = js.native
  def emissiveMapUv_=(arg: Double): Unit = js.native
  
  def emissiveMap_=(arg: Texture | Null): Unit = js.native
  
  def emissiveTint: Boolean = js.native
  def emissiveTint_=(arg: Boolean): Unit = js.native
  
  def emissiveVertexColor: Boolean = js.native
  
  def emissiveVertexColorChannel: String = js.native
  def emissiveVertexColorChannel_=(arg: String): Unit = js.native
  
  def emissiveVertexColor_=(arg: Boolean): Unit = js.native
  
  def emissive_=(arg: Color): Unit = js.native
  
  def enableGGXSpecular: Boolean = js.native
  def enableGGXSpecular_=(arg: Boolean): Unit = js.native
  
  def fresnelModel: Double = js.native
  def fresnelModel_=(arg: Double): Unit = js.native
  
  def getUniform(name: Any, device: Any, scene: Any): Any = js.native
  
  def gloss: Double = js.native
  
  def glossMap: Texture | Null = js.native
  
  def glossMapChannel: String = js.native
  def glossMapChannel_=(arg: String): Unit = js.native
  
  def glossMapOffset: Vec2 = js.native
  def glossMapOffset_=(arg: Vec2): Unit = js.native
  
  def glossMapRotation: Double = js.native
  def glossMapRotation_=(arg: Double): Unit = js.native
  
  def glossMapTiling: Vec2 = js.native
  def glossMapTiling_=(arg: Vec2): Unit = js.native
  
  def glossMapUv: Double = js.native
  def glossMapUv_=(arg: Double): Unit = js.native
  
  def glossMap_=(arg: Texture | Null): Unit = js.native
  
  def glossVertexColor: Boolean = js.native
  
  def glossVertexColorChannel: String = js.native
  def glossVertexColorChannel_=(arg: String): Unit = js.native
  
  def glossVertexColor_=(arg: Boolean): Unit = js.native
  
  def gloss_=(arg: Double): Unit = js.native
  
  def heightMap: Texture | Null = js.native
  
  def heightMapChannel: String = js.native
  def heightMapChannel_=(arg: String): Unit = js.native
  
  def heightMapFactor: Double = js.native
  def heightMapFactor_=(arg: Double): Unit = js.native
  
  def heightMapOffset: Vec2 = js.native
  def heightMapOffset_=(arg: Vec2): Unit = js.native
  
  def heightMapRotation: Double = js.native
  def heightMapRotation_=(arg: Double): Unit = js.native
  
  def heightMapTiling: Vec2 = js.native
  def heightMapTiling_=(arg: Vec2): Unit = js.native
  
  def heightMapUv: Double = js.native
  def heightMapUv_=(arg: Double): Unit = js.native
  
  def heightMap_=(arg: Texture | Null): Unit = js.native
  
  def lightMap: Texture | Null = js.native
  
  def lightMapChannel: String = js.native
  def lightMapChannel_=(arg: String): Unit = js.native
  
  def lightMapOffset: Vec2 = js.native
  def lightMapOffset_=(arg: Vec2): Unit = js.native
  
  def lightMapRotation: Double = js.native
  def lightMapRotation_=(arg: Double): Unit = js.native
  
  def lightMapTiling: Vec2 = js.native
  def lightMapTiling_=(arg: Vec2): Unit = js.native
  
  def lightMapUv: Double = js.native
  def lightMapUv_=(arg: Double): Unit = js.native
  
  def lightMap_=(arg: Texture | Null): Unit = js.native
  
  def lightVertexColor: Boolean = js.native
  
  def lightVertexColorChannel: String = js.native
  def lightVertexColorChannel_=(arg: String): Unit = js.native
  
  def lightVertexColor_=(arg: Boolean): Unit = js.native
  
  def metalness: Double = js.native
  
  def metalnessMap: Texture | Null = js.native
  
  def metalnessMapChannel: String = js.native
  def metalnessMapChannel_=(arg: String): Unit = js.native
  
  def metalnessMapOffset: Vec2 = js.native
  def metalnessMapOffset_=(arg: Vec2): Unit = js.native
  
  def metalnessMapRotation: Double = js.native
  def metalnessMapRotation_=(arg: Double): Unit = js.native
  
  def metalnessMapTiling: Vec2 = js.native
  def metalnessMapTiling_=(arg: Vec2): Unit = js.native
  
  def metalnessMapUv: Double = js.native
  def metalnessMapUv_=(arg: Double): Unit = js.native
  
  def metalnessMap_=(arg: Texture | Null): Unit = js.native
  
  def metalnessVertexColor: Boolean = js.native
  
  def metalnessVertexColorChannel: String = js.native
  def metalnessVertexColorChannel_=(arg: String): Unit = js.native
  
  def metalnessVertexColor_=(arg: Boolean): Unit = js.native
  
  def metalness_=(arg: Double): Unit = js.native
  
  def normalDetailMap: Texture | Null = js.native
  
  def normalDetailMapBumpiness: Double = js.native
  def normalDetailMapBumpiness_=(arg: Double): Unit = js.native
  
  def normalDetailMapOffset: Vec2 = js.native
  def normalDetailMapOffset_=(arg: Vec2): Unit = js.native
  
  def normalDetailMapRotation: Double = js.native
  def normalDetailMapRotation_=(arg: Double): Unit = js.native
  
  def normalDetailMapTiling: Vec2 = js.native
  def normalDetailMapTiling_=(arg: Vec2): Unit = js.native
  
  def normalDetailMapUv: Double = js.native
  def normalDetailMapUv_=(arg: Double): Unit = js.native
  
  def normalDetailMap_=(arg: Texture | Null): Unit = js.native
  
  def normalMap: Texture | Null = js.native
  
  def normalMapOffset: Vec2 = js.native
  def normalMapOffset_=(arg: Vec2): Unit = js.native
  
  def normalMapRotation: Double = js.native
  def normalMapRotation_=(arg: Double): Unit = js.native
  
  def normalMapTiling: Vec2 = js.native
  def normalMapTiling_=(arg: Vec2): Unit = js.native
  
  def normalMapUv: Double = js.native
  def normalMapUv_=(arg: Double): Unit = js.native
  
  def normalMap_=(arg: Texture | Null): Unit = js.native
  
  def occludeDirect: Double = js.native
  def occludeDirect_=(arg: Double): Unit = js.native
  
  def occludeSpecular: Double = js.native
  
  def occludeSpecularIntensity: Double = js.native
  def occludeSpecularIntensity_=(arg: Double): Unit = js.native
  
  def occludeSpecular_=(arg: Double): Unit = js.native
  
  def onUpdateShader: UpdateShaderCallback = js.native
  def onUpdateShader_=(arg: UpdateShaderCallback): Unit = js.native
  
  def opacity: Double = js.native
  
  def opacityFadesSpecular: Boolean = js.native
  def opacityFadesSpecular_=(arg: Boolean): Unit = js.native
  
  def opacityMap: Texture | Null = js.native
  
  def opacityMapChannel: String = js.native
  def opacityMapChannel_=(arg: String): Unit = js.native
  
  def opacityMapOffset: Vec2 = js.native
  def opacityMapOffset_=(arg: Vec2): Unit = js.native
  
  def opacityMapRotation: Double = js.native
  def opacityMapRotation_=(arg: Double): Unit = js.native
  
  def opacityMapTiling: Vec2 = js.native
  def opacityMapTiling_=(arg: Vec2): Unit = js.native
  
  def opacityMapUv: Double = js.native
  def opacityMapUv_=(arg: Double): Unit = js.native
  
  def opacityMap_=(arg: Texture | Null): Unit = js.native
  
  def opacityVertexColor: Boolean = js.native
  
  def opacityVertexColorChannel: String = js.native
  def opacityVertexColorChannel_=(arg: String): Unit = js.native
  
  def opacityVertexColor_=(arg: Boolean): Unit = js.native
  
  def opacity_=(arg: Double): Unit = js.native
  
  def pixelSnap: Boolean = js.native
  def pixelSnap_=(arg: Boolean): Unit = js.native
  
  def reflectivity: Double = js.native
  def reflectivity_=(arg: Double): Unit = js.native
  
  def refraction: Double = js.native
  
  def refractionIndex: Double = js.native
  def refractionIndex_=(arg: Double): Unit = js.native
  
  def refraction_=(arg: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  var shaderOptBuilder: StandardMaterialOptionsBuilder = js.native
  
  def shader_=(arg: Any): Unit = js.native
  
  def shadingModel: Double = js.native
  def shadingModel_=(arg: Double): Unit = js.native
  
  def sheen: Color = js.native
  
  def sheenMap: Texture | Null = js.native
  
  def sheenMapChannel: String = js.native
  def sheenMapChannel_=(arg: String): Unit = js.native
  
  def sheenMapOffset: Vec2 = js.native
  def sheenMapOffset_=(arg: Vec2): Unit = js.native
  
  def sheenMapRotation: Double = js.native
  def sheenMapRotation_=(arg: Double): Unit = js.native
  
  def sheenMapTiling: Vec2 = js.native
  def sheenMapTiling_=(arg: Vec2): Unit = js.native
  
  def sheenMapUv: Double = js.native
  def sheenMapUv_=(arg: Double): Unit = js.native
  
  def sheenMap_=(arg: Texture | Null): Unit = js.native
  
  def sheenTint: Boolean = js.native
  def sheenTint_=(arg: Boolean): Unit = js.native
  
  def sheenVertexColor: Boolean = js.native
  
  def sheenVertexColorChannel: String = js.native
  def sheenVertexColorChannel_=(arg: String): Unit = js.native
  
  def sheenVertexColor_=(arg: Boolean): Unit = js.native
  
  def sheen_=(arg: Color): Unit = js.native
  
  def specular: Color = js.native
  
  def specularMap: Texture | Null = js.native
  
  def specularMapChannel: String = js.native
  def specularMapChannel_=(arg: String): Unit = js.native
  
  def specularMapOffset: Vec2 = js.native
  def specularMapOffset_=(arg: Vec2): Unit = js.native
  
  def specularMapRotation: Double = js.native
  def specularMapRotation_=(arg: Double): Unit = js.native
  
  def specularMapTiling: Vec2 = js.native
  def specularMapTiling_=(arg: Vec2): Unit = js.native
  
  def specularMapUv: Double = js.native
  def specularMapUv_=(arg: Double): Unit = js.native
  
  def specularMap_=(arg: Texture | Null): Unit = js.native
  
  def specularTint: Boolean = js.native
  def specularTint_=(arg: Boolean): Unit = js.native
  
  def specularVertexColor: Boolean = js.native
  
  def specularVertexColorChannel: String = js.native
  def specularVertexColorChannel_=(arg: String): Unit = js.native
  
  def specularVertexColor_=(arg: Boolean): Unit = js.native
  
  def specular_=(arg: Color): Unit = js.native
  
  def specularityFactor: Double = js.native
  
  def specularityFactorMap: Texture | Null = js.native
  
  def specularityFactorMapChannel: String = js.native
  def specularityFactorMapChannel_=(arg: String): Unit = js.native
  
  def specularityFactorMapOffset: Vec2 = js.native
  def specularityFactorMapOffset_=(arg: Vec2): Unit = js.native
  
  def specularityFactorMapRotation: Double = js.native
  def specularityFactorMapRotation_=(arg: Double): Unit = js.native
  
  def specularityFactorMapTiling: Vec2 = js.native
  def specularityFactorMapTiling_=(arg: Vec2): Unit = js.native
  
  def specularityFactorMapUv: Double = js.native
  def specularityFactorMapUv_=(arg: Double): Unit = js.native
  
  def specularityFactorMap_=(arg: Texture | Null): Unit = js.native
  
  def specularityFactor_=(arg: Double): Unit = js.native
  
  def sphereMap: Texture | Null = js.native
  def sphereMap_=(arg: Texture | Null): Unit = js.native
  
  def twoSidedLighting: Boolean = js.native
  def twoSidedLighting_=(arg: Boolean): Unit = js.native
  
  def updateEnvUniforms(device: Any, scene: Any): Unit = js.native
  
  def useFog: Boolean = js.native
  def useFog_=(arg: Boolean): Unit = js.native
  
  def useGammaTonemap: Boolean = js.native
  def useGammaTonemap_=(arg: Boolean): Unit = js.native
  
  def useLighting: Boolean = js.native
  def useLighting_=(arg: Boolean): Unit = js.native
  
  def useMetalness: Boolean = js.native
  
  def useMetalnessSpecularColor: Boolean = js.native
  def useMetalnessSpecularColor_=(arg: Boolean): Unit = js.native
  
  def useMetalness_=(arg: Boolean): Unit = js.native
  
  def useSheen: Boolean = js.native
  def useSheen_=(arg: Boolean): Unit = js.native
  
  def useSkybox: Boolean = js.native
  def useSkybox_=(arg: Boolean): Unit = js.native
}
object StandardMaterial {
  
  @JSImport("playcanvas", "StandardMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("playcanvas", "StandardMaterial.CUBEMAP_PARAMETERS")
  @js.native
  def CUBEMAP_PARAMETERS: js.Array[Any] = js.native
  inline def CUBEMAP_PARAMETERS_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CUBEMAP_PARAMETERS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "StandardMaterial.TEXTURE_PARAMETERS")
  @js.native
  def TEXTURE_PARAMETERS: js.Array[Any] = js.native
  inline def TEXTURE_PARAMETERS_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXTURE_PARAMETERS")(x.asInstanceOf[js.Any])
}
