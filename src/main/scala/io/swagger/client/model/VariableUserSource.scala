/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class VariableUserSource (
  /* ID of User */
  userId: Option[Int],
  /* ID of variable */
  variableId: Int,
  /* ID of source */
  sourceId: Int,
  /* Time that this measurement occurred Uses epoch minute (epoch time divided by 60) */
  timestamp: Int,
  /* Earliest measurement time */
  earliestMeasurementTime: Int,
  /* Latest measurement time */
  latestMeasurementTime: Int,
  /* When the record was first created. Use ISO 8601 datetime format */
  createdAt: Option[DateTime],
  /* When the record in the database was last updated. Use ISO 8601 datetime format */
  updatedAt: Option[DateTime])
   extends ApiModel


