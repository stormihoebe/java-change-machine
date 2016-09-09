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

  @Test
  public void newChangeMachine_beginsWith20Nickels_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getNickels());
  }

  @Test
  public void newChangeMachine_beginsWith20Pennies_20() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(20, testChangeMachine.getPennies());
  }

  @Test
  public void changeMachine_determinesNumberOfQuartersNeeded_4() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(4, testChangeMachine.makeQuarterChange(1.15f));
  }

  @Test
  public void changeMachine_determinesNumberOfDimesNeeded_7() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(7, testChangeMachine.makeDimeChange(0.73f));
  }



}
