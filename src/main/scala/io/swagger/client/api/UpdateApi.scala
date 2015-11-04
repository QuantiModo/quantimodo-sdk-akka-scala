package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_19
import io.swagger.client.model.Update
import io.swagger.client.model.Inline_response_200_20
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UpdateApi {

  /**
   * Get all Updates
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_19 (successful operation)
   * 
   * @param userId user_id
   * @param connectorId connector_id
   * @param numberOfMeasurements number_of_measurements
   * @param success success
   * @param message message
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def updatesGet(userId: Option[Int] = None, connectorId: Option[Int] = None, numberOfMeasurements: Option[Int] = None, success: Option[Boolean] = None, message: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_19] =
    ApiRequest[Inline_response_200_19](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/updates", "application/json")
      .withQueryParam("user_id", userId)
      .withQueryParam("connector_id", connectorId)
      .withQueryParam("number_of_measurements", numberOfMeasurements)
      .withQueryParam("success", success)
      .withQueryParam("message", message)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_19](200)
      
  /**
   * Store Update
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_20 (successful operation)
   * 
   * @param body Update that should be stored
   */
  def updatesPost(body: Option[Update] = None): ApiRequest[Inline_response_200_20] =
    ApiRequest[Inline_response_200_20](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/updates", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_20](200)
      
  /**
   * Get Update
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_20 (successful operation)
   * 
   * @param id id of Update
   */
  def updatesIdGet(id: Int): ApiRequest[Inline_response_200_20] =
    ApiRequest[Inline_response_200_20](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/updates/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_20](200)
      
  /**
   * Update Update
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Update
   * @param body Update that should be updated
   */
  def updatesIdPut(id: Int, body: Option[Update] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/updates/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Update
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Update
   */
  def updatesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/updates/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

