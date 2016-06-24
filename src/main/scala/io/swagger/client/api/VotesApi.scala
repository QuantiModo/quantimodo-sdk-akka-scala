/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.CommonResponse
import io.swagger.client.model.VoteDelete
import io.swagger.client.model.PostVote
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VotesApi {

  /**
   * Delete previously posted vote
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param body The cause and effect variable names for the predictor vote to be deleted.
   * @param accessToken User&#39;s OAuth2 access token
   */
  def v1VotesDeletePost(body: VoteDelete, accessToken: Option[String] = None): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/votes/delete", "application/json")
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
        /**
   * This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.
   * 
   * Expected answers:
   *   code 200 : CommonResponse (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param body Contains the cause variable, effect variable, and vote value.
   * @param accessToken User&#39;s OAuth2 access token
   */
  def v1VotesPost(body: PostVote, accessToken: Option[String] = None): ApiRequest[CommonResponse] =
    ApiRequest[CommonResponse](ApiMethods.POST, "https://app.quantimo.do/api", "/v1/votes", "application/json")
      .withBody(body)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[CommonResponse](200)
      .withErrorResponse[Unit](401)
      

}
