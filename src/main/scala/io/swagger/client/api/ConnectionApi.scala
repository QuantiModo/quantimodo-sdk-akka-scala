package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_3
import io.swagger.client.model.Inline_response_200_4
import io.swagger.client.model.Connection
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ConnectionApi {

  /**
   * Get all Connections
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_3 (successful operation)
   * 
   * @param userId user_id
   * @param connectorId connector_id
   * @param connectStatus connect_status
   * @param connectError connect_error
   * @param updateRequestedAt update_requested_at
   * @param updateStatus update_status
   * @param updateError update_error
   * @param lastSuccessfulUpdatedAt last_successful_updated_at
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def connectionsGet(userId: Option[Int] = None, connectorId: Option[Int] = None, connectStatus: Option[String] = None, connectError: Option[String] = None, updateRequestedAt: Option[String] = None, updateStatus: Option[String] = None, updateError: Option[String] = None, lastSuccessfulUpdatedAt: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_3] =
    ApiRequest[Inline_response_200_3](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/connections", "application/json")
      .withQueryParam("user_id", userId)
      .withQueryParam("connector_id", connectorId)
      .withQueryParam("connect_status", connectStatus)
      .withQueryParam("connect_error", connectError)
      .withQueryParam("update_requested_at", updateRequestedAt)
      .withQueryParam("update_status", updateStatus)
      .withQueryParam("update_error", updateError)
      .withQueryParam("last_successful_updated_at", lastSuccessfulUpdatedAt)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_3](200)
      
  /**
   * Store Connection
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_4 (successful operation)
   * 
   * @param body Connection that should be stored
   */
  def connectionsPost(body: Option[Connection] = None): ApiRequest[Inline_response_200_4] =
    ApiRequest[Inline_response_200_4](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/connections", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_4](200)
      
  /**
   * Get Connection
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_4 (successful operation)
   * 
   * @param id id of Connection
   */
  def connectionsIdGet(id: Int): ApiRequest[Inline_response_200_4] =
    ApiRequest[Inline_response_200_4](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/connections/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_4](200)
      
  /**
   * Update Connection
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Connection
   * @param body Connection that should be updated
   */
  def connectionsIdPut(id: Int, body: Option[Connection] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/connections/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Connection
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Connection
   */
  def connectionsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/connections/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

