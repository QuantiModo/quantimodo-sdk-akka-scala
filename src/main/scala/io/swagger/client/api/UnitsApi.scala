package io.swagger.client.api

import io.swagger.client.model.UnitCategory
import io.swagger.client.model.Unit
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UnitsApi {

  /**
   * Get a list of the categories of measurement units such as &#39;Distance&#39;, &#39;Duration&#39;, &#39;Energy&#39;, &#39;Frequency&#39;, &#39;Miscellany&#39;, &#39;Pressure&#39;, &#39;Proportion&#39;, &#39;Rating&#39;, &#39;Temperature&#39;, &#39;Volume&#39;, and &#39;Weight&#39;.
   * 
   * Expected answers:
   *   code 200 : UnitCategory (Successful operation)
   *   code 401 :  (Not Authenticated)
   */
  def unitCategoriesGet(): ApiRequest[UnitCategory] =
    ApiRequest[UnitCategory](ApiMethods.GET, "https://localhost/api", "/unitCategories", "application/json")
      .withSuccessResponse[UnitCategory](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Get all available units
   * 
   * Expected answers:
   *   code 200 : Seq[Unit] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param unitName Unit name
   * @param abbreviatedUnitName Restrict the results to a specific unit by providing the unit abbreviation.
   * @param categoryName Restrict the results to a specific unit category by providing the unit category name.
   */
  def unitsGet(unitName: Option[String] = None, abbreviatedUnitName: Option[String] = None, categoryName: Option[String] = None): ApiRequest[Seq[Unit]] =
    ApiRequest[Seq[Unit]](ApiMethods.GET, "https://localhost/api", "/units", "application/json")
      .withQueryParam("unitName", unitName)
      .withQueryParam("abbreviatedUnitName", abbreviatedUnitName)
      .withQueryParam("categoryName", categoryName)
      .withSuccessResponse[Seq[Unit]](200)
      .withErrorResponse[Unit](401)
      


}

