package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Correlation (
  /* id */
  id: Option[Int],
  /* Time at which correlation was calculated */
  timestamp: Int,
  /* ID of user that owns this correlation */
  userId: Int,
  /* Pearson correlation coefficient between cause and effect measurements */
  correlation: Float,
  /* variable ID of the cause variable for which the user desires correlations */
  causeId: Int,
  /* variable ID of the effect variable for which the user desires correlations */
  effectId: Int,
  /* User estimated or default time after cause measurement before a perceivable effect is observed */
  onsetDelay: Int,
  /* Time over which the cause is expected to produce a perceivable effect following the onset delay */
  durationOfAction: Int,
  /* Number of points that went into the correlation calculation */
  numberOfPairs: Int,
  /* cause value that predicts an above average effect value (in default unit for cause variable) */
  valuePredictingHighOutcome: Float,
  /* cause value that predicts a below average effect value (in default unit for cause variable) */
  valuePredictingLowOutcome: Float,
  /* Optimal Pearson Product */
  optimalPearsonProduct: Float,
  /* Vote */
  vote: Float,
  /* A function of the effect size and sample size */
  statisticalSignificance: Float,
  /* Unit of Cause */
  causeUnit: String,
  /* Unit ID of Cause */
  causeUnitId: Int,
  /* Cause changes */
  causeChanges: Int,
  /* Effect changes */
  effectChanges: Int,
  /* QM Score */
  qmScore: Float,
  /* error */
  error: String,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation */
  reversePearsonCorrelationCoefficient: Float,
  /* Predictive Pearson Correlation Coefficient */
  predictivePearsonCorrelationCoefficient: Float)
   extends ApiModel


