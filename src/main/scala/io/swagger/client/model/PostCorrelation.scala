package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class PostCorrelation (
  /* Cause variable name */
  cause: String,
  /* Effect variable name */
  effect: String,
  /* Correlation value */
  correlation: Double,
  /* Vote: 0 or 1 */
  vote: Option[Int])
   extends ApiModel


