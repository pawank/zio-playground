package dev.xymox.zio.playground.zstack.zmx

import zio.zmx.metrics._

object ServiceMetrics {
  val createCountAll: MetricAspect[Any] = MetricAspect.count("api_item", ("operation", "create"))
  val listCountAll: MetricAspect[Any]   = MetricAspect.count("api_item", ("operation", "list"))
}