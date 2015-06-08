package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Correlation (
  /* Pearson correlation coefficient between cause and effect measurements */
  correlationCoefficient: Double,
  /* ORIGINAL variable name of the cause variable for which the user desires correlations. */
  cause: String,
  /* ORIGINAL variable name of the effect variable for which the user desires correlations. */
  effect: String,
  /* User estimated or default time after cause measurement before a perceivable effect is observed */
  onsetDelay: Double,
  /* Time over which the cause is expected to produce a perceivable effect following the onset delay */
  durationOfAction: Double,
  /* Number of points that went into the correlation calculation */
  numberOfPairs: Double,
  /* Magnitude of the effects of a cause indicating whether it's practically meaningful. */
  effectSize: Option[String],
  /* A function of the effect size and sample size */
  statisticalSignificance: Option[String],
  /* Time at which correlation was calculated */
  timestamp: Double,
  /* Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation. */
  reverseCorrelation: Option[Double],
  /*  */
  causalityFactor: Option[Double],
  /* Variable category of the cause variable. */
  causeCategory: Option[String],
  /* Variable category of the effect variable. */
  effectCategory: Option[String])
   extends ApiModel


