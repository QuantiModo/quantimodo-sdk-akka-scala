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
   *   code 401 : Seq[UnitCategory] (Not Authenticated)
   */
  def unitCategoriesGet(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/unitCategories", "application/json")
      .withErrorResponse[Seq[UnitCategory]](401)
      
  /**
   * Get all available units
   * 
   * Expected answers:
   *   code 401 : Seq[Unit] (Not Authenticated)
   * 
   * @param unitName Unit name
   * @param abbreviatedUnitName Restrict the results to a specific unit by providing the unit abbreviation.
   * @param categoryName Restrict the results to a specific unit category by providing the unit category name.
   */
  def unitsGet(unitName: Option[String] = None, abbreviatedUnitName: Option[String] = None, categoryName: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/units", "application/json")
      .withQueryParam("unitName", unitName)
      .withQueryParam("abbreviatedUnitName", abbreviatedUnitName)
      .withQueryParam("categoryName", categoryName)
      .withErrorResponse[Seq[Unit]](401)
      


}

