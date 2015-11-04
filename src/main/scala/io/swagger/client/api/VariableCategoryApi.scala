package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_23
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.Inline_response_200_24
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VariableCategoryApi {

  /**
   * Get all VariableCategories
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_23 (successful operation)
   * 
   * @param name name
   * @param fillingValue filling_value
   * @param maximumAllowedValue maximum_allowed_value
   * @param minimumAllowedValue minimum_allowed_value
   * @param durationOfAction duration_of_action
   * @param onsetDelay onset_delay
   * @param combinationOperation combination_operation
   * @param updated updated
   * @param causeOnly cause_only
   * @param public public
   * @param outcome outcome
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param imageUrl image_url
   * @param defaultUnitId default_unit_id
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def variableCategoriesGet(name: Option[String] = None, fillingValue: Option[Double] = None, maximumAllowedValue: Option[Double] = None, minimumAllowedValue: Option[Double] = None, durationOfAction: Option[Int] = None, onsetDelay: Option[Int] = None, combinationOperation: Option[String] = None, updated: Option[Int] = None, causeOnly: Option[Boolean] = None, public: Option[Int] = None, outcome: Option[Boolean] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, imageUrl: Option[String] = None, defaultUnitId: Option[Int] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_23] =
    ApiRequest[Inline_response_200_23](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variableCategories", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("filling_value", fillingValue)
      .withQueryParam("maximum_allowed_value", maximumAllowedValue)
      .withQueryParam("minimum_allowed_value", minimumAllowedValue)
      .withQueryParam("duration_of_action", durationOfAction)
      .withQueryParam("onset_delay", onsetDelay)
      .withQueryParam("combination_operation", combinationOperation)
      .withQueryParam("updated", updated)
      .withQueryParam("cause_only", causeOnly)
      .withQueryParam("public", public)
      .withQueryParam("outcome", outcome)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("image_url", imageUrl)
      .withQueryParam("default_unit_id", defaultUnitId)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_23](200)
      
  /**
   * Store VariableCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_24 (successful operation)
   * 
   * @param body VariableCategory that should be stored
   */
  def variableCategoriesPost(body: Option[VariableCategory] = None): ApiRequest[Inline_response_200_24] =
    ApiRequest[Inline_response_200_24](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/variableCategories", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_24](200)
      
  /**
   * Get VariableCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_24 (successful operation)
   * 
   * @param id id of VariableCategory
   */
  def variableCategoriesIdGet(id: Int): ApiRequest[Inline_response_200_24] =
    ApiRequest[Inline_response_200_24](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variableCategories/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_24](200)
      
  /**
   * Update VariableCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of VariableCategory
   * @param body VariableCategory that should be updated
   */
  def variableCategoriesIdPut(id: Int, body: Option[VariableCategory] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/variableCategories/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete VariableCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of VariableCategory
   */
  def variableCategoriesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/variableCategories/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

