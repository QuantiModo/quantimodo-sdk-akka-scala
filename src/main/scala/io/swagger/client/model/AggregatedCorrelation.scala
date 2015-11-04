package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class AggregatedCorrelation (
  /* id */
  id: Option[Int],
  /* correlation */
  correlation: Float,
  /* cause_id */
  causeId: Int,
  /* effect_id */
  effectId: Int,
  /* onset_delay */
  onsetDelay: Int,
  /* duration_of_action */
  durationOfAction: Int,
  /* number_of_pairs */
  numberOfPairs: Int,
  /* value_predicting_high_outcome */
  valuePredictingHighOutcome: Float,
  /* value_predicting_low_outcome */
  valuePredictingLowOutcome: Float,
  /* optimal_pearson_product */
  optimalPearsonProduct: Float,
  /* vote */
  vote: Float,
  /* number_of_users */
  numberOfUsers: Int,
  /* number_of_correlations */
  numberOfCorrelations: Int,
  /* statistical_significance */
  statisticalSignificance: Float,
  /* cause_unit */
  causeUnit: String,
  /* cause_unit_id */
  causeUnitId: Int,
  /* cause_changes */
  causeChanges: Int,
  /* effect_changes */
  effectChanges: Int,
  /* aggregate_qm_score */
  aggregateQmScore: Float,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* status */
  status: String,
  /* error_message */
  errorMessage: String,
  /* last_successful_update_time */
  lastSuccessfulUpdateTime: DateTime,
  /* reverse_pearson_correlation_coefficient */
  reversePearsonCorrelationCoefficient: Float,
  /* predictive_pearson_correlation_coefficient */
  predictivePearsonCorrelationCoefficient: Float)
   extends ApiModel


