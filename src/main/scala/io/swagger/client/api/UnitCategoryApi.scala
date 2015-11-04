package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_15
import io.swagger.client.model.Inline_response_200_16
import io.swagger.client.model.UnitCategory
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UnitCategoryApi {

  /**
   * Get all UnitCategories
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_15 (successful operation)
   * 
   * @param name name
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def unitCategoriesGet(name: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_15] =
    ApiRequest[Inline_response_200_15](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/unitCategories", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_15](200)
      
  /**
   * Store UnitCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_16 (successful operation)
   * 
   * @param body UnitCategory that should be stored
   */
  def unitCategoriesPost(body: Option[UnitCategory] = None): ApiRequest[Inline_response_200_16] =
    ApiRequest[Inline_response_200_16](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/unitCategories", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_16](200)
      
  /**
   * Get UnitCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_16 (successful operation)
   * 
   * @param id id of UnitCategory
   */
  def unitCategoriesIdGet(id: Int): ApiRequest[Inline_response_200_16] =
    ApiRequest[Inline_response_200_16](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/unitCategories/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_16](200)
      
  /**
   * Update UnitCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of UnitCategory
   * @param body UnitCategory that should be updated
   */
  def unitCategoriesIdPut(id: Int, body: Option[UnitCategory] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/unitCategories/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete UnitCategory
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of UnitCategory
   */
  def unitCategoriesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/unitCategories/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

