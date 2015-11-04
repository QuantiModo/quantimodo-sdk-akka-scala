package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_7
import io.swagger.client.model.Inline_response_200_8
import io.swagger.client.model.Correlation
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CorrelationApi {

  /**
   * Get all Correlations
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_7 (successful operation)
   * 
   * @param timestamp timestamp
   * @param userId user_id
   * @param correlation correlation
   * @param causeId cause_id
   * @param effectId effect_id
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param numberOfPairs number_of_pairs
   * @param valuePredictingHighOutcome value_predicting_high_outcome
   * @param valuePredictingLowOutcome value_predicting_low_outcome
   * @param optimalPearsonProduct optimal_pearson_product
   * @param vote vote
   * @param statisticalSignificance statistical_significance
   * @param causeUnit cause_unit
   * @param causeUnitId cause_unit_id
   * @param causeChanges cause_changes
   * @param effectChanges effect_changes
   * @param qmScore qm_score
   * @param error error
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param reversePearsonCorrelationCoefficient reverse_pearson_correlation_coefficient
   * @param predictivePearsonCorrelationCoefficient predictive_pearson_correlation_coefficient
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def correlationsGet(timestamp: Option[Int] = None, userId: Option[Int] = None, correlation: Option[Double] = None, causeId: Option[Int] = None, effectId: Option[Int] = None, onsetDelay: Option[Int] = None, durationOfAction: Option[Int] = None, numberOfPairs: Option[Int] = None, valuePredictingHighOutcome: Option[Double] = None, valuePredictingLowOutcome: Option[Double] = None, optimalPearsonProduct: Option[Double] = None, vote: Option[Double] = None, statisticalSignificance: Option[Double] = None, causeUnit: Option[String] = None, causeUnitId: Option[Int] = None, causeChanges: Option[Int] = None, effectChanges: Option[Int] = None, qmScore: Option[Double] = None, error: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, reversePearsonCorrelationCoefficient: Option[Double] = None, predictivePearsonCorrelationCoefficient: Option[Double] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_7] =
    ApiRequest[Inline_response_200_7](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/correlations", "application/json")
      .withQueryParam("timestamp", timestamp)
      .withQueryParam("user_id", userId)
      .withQueryParam("correlation", correlation)
      .withQueryParam("cause_id", causeId)
      .withQueryParam("effect_id", effectId)
      .withQueryParam("onset_delay", onsetDelay)
      .withQueryParam("duration_of_action", durationOfAction)
      .withQueryParam("number_of_pairs", numberOfPairs)
      .withQueryParam("value_predicting_high_outcome", valuePredictingHighOutcome)
      .withQueryParam("value_predicting_low_outcome", valuePredictingLowOutcome)
      .withQueryParam("optimal_pearson_product", optimalPearsonProduct)
      .withQueryParam("vote", vote)
      .withQueryParam("statistical_significance", statisticalSignificance)
      .withQueryParam("cause_unit", causeUnit)
      .withQueryParam("cause_unit_id", causeUnitId)
      .withQueryParam("cause_changes", causeChanges)
      .withQueryParam("effect_changes", effectChanges)
      .withQueryParam("qm_score", qmScore)
      .withQueryParam("error", error)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("reverse_pearson_correlation_coefficient", reversePearsonCorrelationCoefficient)
      .withQueryParam("predictive_pearson_correlation_coefficient", predictivePearsonCorrelationCoefficient)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_7](200)
      
  /**
   * Store Correlation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_8 (successful operation)
   * 
   * @param body Correlation that should be stored
   */
  def correlationsPost(body: Option[Correlation] = None): ApiRequest[Inline_response_200_8] =
    ApiRequest[Inline_response_200_8](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/correlations", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_8](200)
      
  /**
   * Get Correlation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_8 (successful operation)
   * 
   * @param id id of Correlation
   */
  def correlationsIdGet(id: Int): ApiRequest[Inline_response_200_8] =
    ApiRequest[Inline_response_200_8](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/correlations/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_8](200)
      
  /**
   * Update Correlation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Correlation
   * @param body Correlation that should be updated
   */
  def correlationsIdPut(id: Int, body: Option[Correlation] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/correlations/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Correlation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Correlation
   */
  def correlationsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/correlations/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

