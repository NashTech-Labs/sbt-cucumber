import akka.actor.{ActorSystem}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class TicTacToeSpec() extends TestKit(ActorSystem("MySpec")) with ImplicitSender
  with WordSpecLike with Matchers with BeforeAndAfterAll {

  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }

  "An Game actor" should {

    "be able to change and return the state of tic tac toe game" in {
    }

    "be able to send Tic Tac Toe Map and a GameOver when a condition is met" in {
    }

    "be able to send PlaceAlreadyFilled Message when a PlayStep is sent on a non empty step" in {
    }
  }
}