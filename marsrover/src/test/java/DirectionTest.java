import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class DirectionTest {

    @Test
    @Parameters(method = "rightDirectionInput")
    public void should_give_right_direction(Direction given, Direction expected){
        assertThat(given.right(), is(expected));
    }

    @Test
    @Parameters(method = "leftDirectionInput")
    public void should_give_left_direction(Direction given, Direction expected){
        assertThat(given.left(), is(expected));
    }

    private Object[] rightDirectionInput(){
        return new Object[]{
          new Object[]{Direction.EAST , Direction.SOUTH},
          new Object[]{Direction.SOUTH , Direction.WEST},
          new Object[]{Direction.WEST , Direction.NORTH},
          new Object[]{Direction.NORTH , Direction.EAST}
        };
    }

    private Object[] leftDirectionInput(){
        return new Object[]{
          new Object[]{Direction.EAST , Direction.NORTH},
          new Object[]{Direction.NORTH , Direction.WEST},
          new Object[]{Direction.WEST , Direction.SOUTH},
          new Object[]{Direction.SOUTH , Direction.EAST}
        };
    }
}
