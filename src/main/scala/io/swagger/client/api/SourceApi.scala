package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_13
import io.swagger.client.model.Source
import io.swagger.client.model.Inline_response_200_14
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object SourceApi {

  /**
   * Get all Sources
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_13 (successful operation)
   * 
   * @param clientId client_id
   * @param name name
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def sourcesGet(clientId: Option[String] = None, name: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_13] =
    ApiRequest[Inline_response_200_13](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/sources", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("name", name)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_13](200)
      
  /**
   * Store Source
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_14 (successful operation)
   * 
   * @param body Source that should be stored
   */
  def sourcesPost(body: Option[Source] = None): ApiRequest[Inline_response_200_14] =
    ApiRequest[Inline_response_200_14](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/sources", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_14](200)
      
  /**
   * Get Source
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_14 (successful operation)
   * 
   * @param id id of Source
   */
  def sourcesIdGet(id: Int): ApiRequest[Inline_response_200_14] =
    ApiRequest[Inline_response_200_14](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/sources/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_14](200)
      
  /**
   * Update Source
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Source
   * @param body Source that should be updated
   */
  def sourcesIdPut(id: Int, body: Option[Source] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/sources/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Source
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Source
   */
  def sourcesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/sources/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

