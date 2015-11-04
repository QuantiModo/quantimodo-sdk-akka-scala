package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_17
import io.swagger.client.model.Inline_response_200_18
import io.swagger.client.model.Unit
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UnitApi {

  /**
   * Get all Units
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_17 (successful operation)
   * 
   * @param clientId client_id
   * @param name name
   * @param abbreviatedName abbreviated_name
   * @param categoryId category_id
   * @param minimumValue minimum_value
   * @param maximumValue maximum_value
   * @param updated updated
   * @param multiply multiply
   * @param add add
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def unitsGet(clientId: Option[String] = None, name: Option[String] = None, abbreviatedName: Option[String] = None, categoryId: Option[Boolean] = None, minimumValue: Option[Double] = None, maximumValue: Option[Double] = None, updated: Option[Int] = None, multiply: Option[Double] = None, add: Option[Double] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_17] =
    ApiRequest[Inline_response_200_17](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/units", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("name", name)
      .withQueryParam("abbreviated_name", abbreviatedName)
      .withQueryParam("category_id", categoryId)
      .withQueryParam("minimum_value", minimumValue)
      .withQueryParam("maximum_value", maximumValue)
      .withQueryParam("updated", updated)
      .withQueryParam("multiply", multiply)
      .withQueryParam("add", add)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_17](200)
      
  /**
   * Store Unit
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_18 (successful operation)
   * 
   * @param body Unit that should be stored
   */
  def unitsPost(body: Option[Unit] = None): ApiRequest[Inline_response_200_18] =
    ApiRequest[Inline_response_200_18](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/units", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_18](200)
      
  /**
   * Get Unit
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_18 (successful operation)
   * 
   * @param id id of Unit
   */
  def unitsIdGet(id: Int): ApiRequest[Inline_response_200_18] =
    ApiRequest[Inline_response_200_18](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/units/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_18](200)
      
  /**
   * Update Unit
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Unit
   * @param body Unit that should be updated
   */
  def unitsIdPut(id: Int, body: Option[Unit] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/units/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Unit
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Unit
   */
  def unitsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/units/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

