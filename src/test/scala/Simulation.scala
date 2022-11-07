import Request.{continue, done, nextStep, nextStep5, start}
import io.gatling.core.Predef
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

object Simulation {
  def getOrdersScen = Predef.scenario("first")
    .exec(start)
    .pause(2 seconds )
    .exec(continue)
    .pause(2 seconds )
    .exec(nextStep)
    .pause(2 seconds )
    .exec(nextStep5)
    .pause(2 seconds )
    .exec(done)
}