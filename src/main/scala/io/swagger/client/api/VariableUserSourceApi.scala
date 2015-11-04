package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_25
import io.swagger.client.model.VariableUserSource
import io.swagger.client.model.Inline_response_200_26
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VariableUserSourceApi {

  /**
   * Get all VariableUserSources
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_25 (successful operation)
   * 
   * @param variableId variable_id
   * @param userId user_id
   * @param timestamp timestamp
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def variableUserSourcesGet(variableId: Option[Int] = None, userId: Option[Int] = None, timestamp: Option[Int] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_25] =
    ApiRequest[Inline_response_200_25](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variableUserSources", "application/json")
      .withQueryParam("variable_id", variableId)
      .withQueryParam("user_id", userId)
      .withQueryParam("timestamp", timestamp)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_25](200)
      
  /**
   * Store VariableUserSource
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_26 (successful operation)
   * 
   * @param body VariableUserSource that should be stored
   */
  def variableUserSourcesPost(body: Option[VariableUserSource] = None): ApiRequest[Inline_response_200_26] =
    ApiRequest[Inline_response_200_26](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/variableUserSources", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_26](200)
      
  /**
   * Get VariableUserSource
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_26 (successful operation)
   * 
   * @param id id of VariableUserSource
   * @param sourceId source id of VariableUserSource
   */
  def variableUserSourcesIdGet(id: Int, sourceId: Int): ApiRequest[Inline_response_200_26] =
    ApiRequest[Inline_response_200_26](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variableUserSources/{id}", "application/json")
      .withQueryParam("source_id", sourceId)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_26](200)
      
  /**
   * Update VariableUserSource
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id variable_id of VariableUserSource
   * @param sourceId source id of VariableUserSource
   * @param body VariableUserSource that should be updated
   */
  def variableUserSourcesIdPut(id: Int, sourceId: Int, body: Option[VariableUserSource] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/variableUserSources/{id}", "application/json")
      .withBody(body)
      .withQueryParam("source_id", sourceId)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete VariableUserSource
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id variable_id of VariableUserSource
   * @param sourceId source id of VariableUserSource
   */
  def variableUserSourcesIdDelete(id: Int, sourceId: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/variableUserSources/{id}", "application/json")
      .withQueryParam("source_id", sourceId)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

