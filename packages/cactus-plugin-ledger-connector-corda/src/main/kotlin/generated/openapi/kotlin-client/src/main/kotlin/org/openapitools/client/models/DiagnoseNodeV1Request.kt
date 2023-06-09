/**
 * Hyperledger Cactus Plugin - Connector Corda
 *
 * Can perform basic tasks on a Corda ledger
 *
 * The version of the OpenAPI document: 0.3.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param nodeIds Optional property specifying which Corda Node should be the one being diagnosed in case the Connector has multiple connections established for different nodes (which is not yet a supported feature, but we want to keep this possibility open for the future).
 */

data class DiagnoseNodeV1Request (

    /* Optional property specifying which Corda Node should be the one being diagnosed in case the Connector has multiple connections established for different nodes (which is not yet a supported feature, but we want to keep this possibility open for the future). */
    @Json(name = "nodeIds")
    val nodeIds: kotlin.collections.List<kotlin.String>? = null

)

