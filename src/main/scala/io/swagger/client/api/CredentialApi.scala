package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_9
import io.swagger.client.model.Credential
import io.swagger.client.model.Inline_response_200_10
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CredentialApi {

  /**
   * Get all Credentials
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_9 (successful operation)
   * 
   * @param connectorId connector_id
   * @param attrKey attr_key
   * @param attrValue attr_value
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def credentialsGet(connectorId: Option[Boolean] = None, attrKey: Option[String] = None, attrValue: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_9] =
    ApiRequest[Inline_response_200_9](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/credentials", "application/json")
      .withQueryParam("connector_id", connectorId)
      .withQueryParam("attr_key", attrKey)
      .withQueryParam("attr_value", attrValue)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_9](200)
      
  /**
   * Store Credential
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_10 (successful operation)
   * 
   * @param body Credential that should be stored
   */
  def credentialsPost(body: Option[Credential] = None): ApiRequest[Inline_response_200_10] =
    ApiRequest[Inline_response_200_10](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/credentials", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_10](200)
      
  /**
   * Get Credential
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_10 (successful operation)
   * 
   * @param id connector id
   * @param attrKey attrKey
   */
  def credentialsIdGet(id: Int, attrKey: String): ApiRequest[Inline_response_200_10] =
    ApiRequest[Inline_response_200_10](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/credentials/{id}", "application/json")
      .withQueryParam("attrKey", attrKey)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_10](200)
      
  /**
   * Update Credential
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id connector id
   * @param attrKey attrKey
   * @param body Credential that should be updated
   */
  def credentialsIdPut(id: Int, attrKey: String, body: Option[Credential] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/credentials/{id}", "application/json")
      .withBody(body)
      .withQueryParam("attrKey", attrKey)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Credential
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id connector id
   * @param attrKey attrKey
   */
  def credentialsIdDelete(id: Int, attrKey: String): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/credentials/{id}", "application/json")
      .withQueryParam("attrKey", attrKey)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

