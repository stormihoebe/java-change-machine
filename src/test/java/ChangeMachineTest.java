import org.junit.*;
import static org.junit.Assert.*;

public class ChangeMachineTest {

  @Test
  public void newRectangle_instantiatesCorrectly() {
    ChangeMachine testChangeMachine = new ChangeMachine();
    assertEquals(true, testRectangle instanceof ChangeMachine);
  }

}
