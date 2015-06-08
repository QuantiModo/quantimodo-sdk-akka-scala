package io.swagger.client.api

import io.swagger.client.model.Variable
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.VariableUserSettings
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VariablesApi {

  /**
   * Store or Update a Correlation
   * 
   * Expected answers:
   *   code 400 :  (The received JSON was invalid or malformed)
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Unknown target user ID)
   * 
   * @param cause 
   * @param effect 
   * @param correlationcoefficient 
   * @param vote 
   */
  def correlationsPost(cause: String, effect: String, correlationcoefficient: String, vote: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/correlations", "application/json")
      .withQueryParam("cause", cause)
      .withQueryParam("effect", effect)
      .withQueryParam("correlationcoefficient", correlationcoefficient)
      .withQueryParam("vote", vote)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      
  /**
   * This endpoint retrieves an array of all public variables. Public variables are things like foods, medications, symptoms, conditions, and anything not unique to a particular user. For instance, a telephone number or name would not be a public variable.
   * 
   * Expected answers:
   *   code 401 : Seq[Variable] (Not Authenticated)
   */
  def publicVariablesGet(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/public/variables", "application/json")
      .withErrorResponse[Seq[Variable]](401)
      
  /**
   * Get top 5 PUBLIC variables with the most correlations containing the entered search characters. For example, search for &#39;mood&#39; as an effect. Since &#39;Overall Mood&#39; has a lot of correlations with other variables, it should be in the autocomplete list.
   * 
   * Expected answers:
   *   code 401 : Seq[Variable] (Not Authenticated)
   * 
   * @param search Search query can be some fraction of a variable name.
   * @param effectOrCause Allows us to specify which column in the `correlations` table will be searched. Choices are effect or cause.
   */
  def publicVariablesSearchSearchGet(search: String, effectOrCause: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/public/variables/search/{search}", "application/json")
      .withQueryParam("effectOrCause", effectOrCause)
      .withPathParam("search", search)
      .withErrorResponse[Seq[Variable]](401)
      
  /**
   * The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.
   * 
   * Expected answers:
   *   code 401 : Seq[VariableCategory] (Not Authenticated)
   */
  def variableCategoriesGet(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/variableCategories", "application/json")
      .withErrorResponse[Seq[VariableCategory]](401)
      
  /**
   * Users can change things like the display name for a variable. They can also change the parameters used in analysis of that variable such as the expected duration of action for a variable to have an effect, the estimated delay before the onset of action. In order to filter out erroneous data, they are able to set the maximum and minimum reasonable daily values for a variable.
   * 
   * Expected answers:
   *   code 400 :  (The received JSON was invalid or malformed)
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Unknown target user ID)
   * 
   * @param sharingData Variable user settings data
   */
  def variableUserSettingsPost(sharingData: Seq[VariableUserSettings]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/variableUserSettings", "application/json")
      .withBody(sharingData)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      
  /**
   * Get variables by the category name
   * 
   * Expected answers:
   *   code 401 : Seq[Variable] (Not Authenticated)
   * 
   * Available security schemes:
   *   basicAuth (basic)
   * 
   * @param userId User id
   * @param categoryName Category name
   */
  def variablesGet(userId: Option[Int] = None, categoryName: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/variables", "application/json")
      .withCredentials(basicAuth)
      .withQueryParam("userId", userId)
      .withQueryParam("categoryName", categoryName)
      .withErrorResponse[Seq[Variable]](401)
      
  /**
   * Allows the client to create a new variable in the `variables` table.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Original name for the variable.
   */
  def variablesPost(variableName: Seq[Variable]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/variables", "application/json")
      .withBody(variableName)
      .withErrorResponse[Unit](401)
      
  /**
   * Get variables containing the search characters for which the currently logged in user has measurements. Used to provide auto-complete function in variable search boxes.
   * 
   * Expected answers:
   *   code 401 : Seq[Variable] (Not Authenticated)
   * 
   * @param search Search query which may be an entire variable name or a fragment of one.
   * @param categoryName Filter variables by category name. The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.
   * @param source Specify a data source name to only return variables from a specific data source.
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10.
   */
  def variablesSearchSearchGet(search: String, categoryName: Option[String] = None, source: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/variables/search/{search}", "application/json")
      .withQueryParam("categoryName", categoryName)
      .withQueryParam("source", source)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withPathParam("search", search)
      .withErrorResponse[Seq[Variable]](401)
      
  /**
   * Get all of the settings and information about a variable by its name. If the logged in user has modified the settings for the variable, these will be provided instead of the default settings for that variable.
   * 
   * Expected answers:
   *   code 401 : Seq[Variable] (Not Authenticated)
   * 
   * @param variableName Variable name
   */
  def variablesVariableNameGet(variableName: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/variables/{variableName}", "application/json")
      .withPathParam("variableName", variableName)
      .withErrorResponse[Seq[Variable]](401)
      


}

