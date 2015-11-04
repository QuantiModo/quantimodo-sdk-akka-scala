package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_29
import io.swagger.client.model.Vote
import io.swagger.client.model.Inline_response_200_30
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VoteApi {

  /**
   * Get all Votes
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_29 (successful operation)
   * 
   * @param clientId client_id
   * @param userId user_id
   * @param causeId cause_id
   * @param effectId effect_id
   * @param value value
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def votesGet(clientId: Option[String] = None, userId: Option[Int] = None, causeId: Option[Int] = None, effectId: Option[Int] = None, value: Option[Int] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_29] =
    ApiRequest[Inline_response_200_29](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/votes", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("user_id", userId)
      .withQueryParam("cause_id", causeId)
      .withQueryParam("effect_id", effectId)
      .withQueryParam("value", value)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_29](200)
      
  /**
   * Store Vote
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_30 (successful operation)
   * 
   * @param body Vote that should be stored
   */
  def votesPost(body: Option[Vote] = None): ApiRequest[Inline_response_200_30] =
    ApiRequest[Inline_response_200_30](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/votes", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_30](200)
      
  /**
   * Get Vote
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_30 (successful operation)
   * 
   * @param id id of Vote
   */
  def votesIdGet(id: Int): ApiRequest[Inline_response_200_30] =
    ApiRequest[Inline_response_200_30](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/votes/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_30](200)
      
  /**
   * Update Vote
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Vote
   * @param body Vote that should be updated
   */
  def votesIdPut(id: Int, body: Option[Vote] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/votes/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Vote
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Vote
   */
  def votesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/votes/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

