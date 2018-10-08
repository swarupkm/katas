import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuilderPatternTest {

    @Test
    public void should_create_a_user_builder() {
        User user = new User.Builder("swarup")
                .setGender("M")
                .build();
        assertThat(user.getGender(), is("M"));
    }


}
