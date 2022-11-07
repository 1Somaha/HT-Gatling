import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.core.Predef._


object Request {
  def start: ChainBuilder = {
    exec(
      http("start")
        .get("/step/2")
        .check(status.is(200))

    )
  };

  def continue: ChainBuilder = {
    exec(
      http("continue")
        .get("/step/3")
        .check(status.is(500))

    )
  };

  def nextStep: ChainBuilder = {
    exec(
      http("nextStep")
        .get("/step/4")
        .check(status.is(500))

    )
  };

  def nextStep5: ChainBuilder = {
    exec(
      http("nextStep5")
        .get("/step/5")
        .check(status.is(200)))
  }

  def done: ChainBuilder = {
    exec(
      http("done")
        .get("/done")
        .check(status.is(200))

    )
  };

}