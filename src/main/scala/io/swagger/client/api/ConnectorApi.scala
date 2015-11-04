package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_5
import io.swagger.client.model.Connector
import io.swagger.client.model.Inline_response_200_6
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ConnectorApi {

  /**
   * Get all Connectors
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_5 (successful operation)
   * 
   * @param name name
   * @param displayName display_name
   * @param image image
   * @param getItUrl get_it_url
   * @param shortDescription short_description
   * @param longDescription long_description
   * @param enabled enabled
   * @param oauth oauth
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def connectorsGet(name: Option[String] = None, displayName: Option[String] = None, image: Option[String] = None, getItUrl: Option[String] = None, shortDescription: Option[String] = None, longDescription: Option[String] = None, enabled: Option[Boolean] = None, oauth: Option[Boolean] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_5] =
    ApiRequest[Inline_response_200_5](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/connectors", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("display_name", displayName)
      .withQueryParam("image", image)
      .withQueryParam("get_it_url", getItUrl)
      .withQueryParam("short_description", shortDescription)
      .withQueryParam("long_description", longDescription)
      .withQueryParam("enabled", enabled)
      .withQueryParam("oauth", oauth)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_5](200)
      
  /**
   * Store Connector
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_6 (successful operation)
   * 
   * @param body Connector that should be stored
   */
  def connectorsPost(body: Option[Connector] = None): ApiRequest[Inline_response_200_6] =
    ApiRequest[Inline_response_200_6](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/connectors", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_6](200)
      
  /**
   * Get Connector
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_6 (successful operation)
   * 
   * @param id id of Connector
   */
  def connectorsIdGet(id: Int): ApiRequest[Inline_response_200_6] =
    ApiRequest[Inline_response_200_6](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/connectors/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_6](200)
      
  /**
   * Update Connector
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Connector
   * @param body Connector that should be updated
   */
  def connectorsIdPut(id: Int, body: Option[Connector] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/connectors/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Connector
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Connector
   */
  def connectorsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/connectors/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

