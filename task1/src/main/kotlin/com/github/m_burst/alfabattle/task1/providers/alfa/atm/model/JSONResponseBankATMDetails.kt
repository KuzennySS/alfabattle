/**
* Сервис проверки статуса банкоматов
* Сервис, возвращающий информацию о банкоматах Альфа-Банка
*
* The version of the OpenAPI document: 1.0.0
* Contact: apisupport@alfabank.ru
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.github.m_burst.alfabattle.task1.providers.alfa.atm.model

import com.github.m_burst.alfabattle.task1.providers.alfa.atm.model.BankATMDetails
import com.github.m_burst.alfabattle.task1.providers.alfa.atm.model.Error

import com.fasterxml.jackson.annotation.JsonProperty
/**
 * 
 * @param data 
 * @param error 
 * @param success Успешность выполнения запроса
 * @param total Общее количество элементов в списке, если в атрибуте data передается список
 */

data class JSONResponseBankATMDetails (
    @JsonProperty("data")
    val data: BankATMDetails? = null,
    @JsonProperty("error")
    val error: Error? = null,
    /* Успешность выполнения запроса */
    @JsonProperty("success")
    val success: kotlin.Boolean? = null,
    /* Общее количество элементов в списке, если в атрибуте data передается список */
    @JsonProperty("total")
    val total: kotlin.Int? = null
)

