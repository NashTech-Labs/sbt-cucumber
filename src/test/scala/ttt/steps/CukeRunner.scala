package ttt.steps

import cucumber.api.{DataTable, PendingException}
import cucumber.api.junit.Cucumber
import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
class CukeRunner extends ScalaDsl with EN {

  Given("""^A the below tic tac toe map as one dimensional array$"""){ (arg0:DataTable) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }
  When("""^A Player plays a tic tac toe step (\d+)$"""){ (arg0:Int) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }
  Then("""^The Tic tac toe should be in the following state$"""){ (arg0:DataTable) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

}
