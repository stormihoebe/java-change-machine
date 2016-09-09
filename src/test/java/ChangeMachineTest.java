import org.junit.*;
import static org.junit.Assert.*;

public class ChangeMachineTest {

  @Test
  public void newChangeMachine_instantiatesCorrectly() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(true, testChangeMachine instanceof ChangeMachine);
  }

  @Test
  public void newChangeMachine_beginsWith20Quarters_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getQuarters());
  }

  @Test
  public void newChangeMachine_beginsWith20Dimes_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getDimes());
  }

}
