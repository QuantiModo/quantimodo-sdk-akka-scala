package io.swagger.client.api

import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.AggregatedCorrelation
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AggregatedCorrelationApi {

  /**
   * Get all AggregatedCorrelations
   * 
   * Expected answers:
   *   code 200 : Inline_response_200 (successful operation)
   * 
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
   * @param numberOfUsers number_of_users
   * @param numberOfCorrelations number_of_correlations
   * @param statisticalSignificance statistical_significance
   * @param causeUnit cause_unit
   * @param causeUnitId cause_unit_id
   * @param causeChanges cause_changes
   * @param effectChanges effect_changes
   * @param aggregateQmScore aggregate_qm_score
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param reversePearsonCorrelationCoefficient reverse_pearson_correlation_coefficient
   * @param predictivePearsonCorrelationCoefficient predictive_pearson_correlation_coefficient
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def aggregatedCorrelationsGet(correlation: Option[Double] = None, causeId: Option[Int] = None, effectId: Option[Int] = None, onsetDelay: Option[Int] = None, durationOfAction: Option[Int] = None, numberOfPairs: Option[Int] = None, valuePredictingHighOutcome: Option[Double] = None, valuePredictingLowOutcome: Option[Double] = None, optimalPearsonProduct: Option[Double] = None, vote: Option[Double] = None, numberOfUsers: Option[Int] = None, numberOfCorrelations: Option[Int] = None, statisticalSignificance: Option[Double] = None, causeUnit: Option[String] = None, causeUnitId: Option[Int] = None, causeChanges: Option[Int] = None, effectChanges: Option[Int] = None, aggregateQmScore: Option[Double] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, status: Option[String] = None, errorMessage: Option[String] = None, lastSuccessfulUpdateTime: Option[String] = None, reversePearsonCorrelationCoefficient: Option[Double] = None, predictivePearsonCorrelationCoefficient: Option[Double] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200] =
    ApiRequest[Inline_response_200](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/aggregatedCorrelations", "application/json")
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
      .withQueryParam("number_of_users", numberOfUsers)
      .withQueryParam("number_of_correlations", numberOfCorrelations)
      .withQueryParam("statistical_significance", statisticalSignificance)
      .withQueryParam("cause_unit", causeUnit)
      .withQueryParam("cause_unit_id", causeUnitId)
      .withQueryParam("cause_changes", causeChanges)
      .withQueryParam("effect_changes", effectChanges)
      .withQueryParam("aggregate_qm_score", aggregateQmScore)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("status", status)
      .withQueryParam("error_message", errorMessage)
      .withQueryParam("last_successful_update_time", lastSuccessfulUpdateTime)
      .withQueryParam("reverse_pearson_correlation_coefficient", reversePearsonCorrelationCoefficient)
      .withQueryParam("predictive_pearson_correlation_coefficient", predictivePearsonCorrelationCoefficient)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200](200)
      
  /**
   * Store AggregatedCorrelation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_1 (successful operation)
   * 
   * @param body AggregatedCorrelation that should be stored
   */
  def aggregatedCorrelationsPost(body: Option[AggregatedCorrelation] = None): ApiRequest[Inline_response_200_1] =
    ApiRequest[Inline_response_200_1](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/aggregatedCorrelations", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_1](200)
      
  /**
   * Get AggregatedCorrelation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_1 (successful operation)
   * 
   * @param id id of AggregatedCorrelation
   */
  def aggregatedCorrelationsIdGet(id: Int): ApiRequest[Inline_response_200_1] =
    ApiRequest[Inline_response_200_1](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/aggregatedCorrelations/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_1](200)
      
  /**
   * Update AggregatedCorrelation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of AggregatedCorrelation
   * @param body AggregatedCorrelation that should be updated
   */
  def aggregatedCorrelationsIdPut(id: Int, body: Option[AggregatedCorrelation] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/aggregatedCorrelations/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete AggregatedCorrelation
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of AggregatedCorrelation
   */
  def aggregatedCorrelationsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/aggregatedCorrelations/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

