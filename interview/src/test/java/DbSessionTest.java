import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DbSessionTest {
    @Test
    public void test_db_session_creattion() {
        System.out.println(DbSession.getDbSession());
        System.out.println(DbSession.getDbSession());
        System.out.println(DbSession.getDbSession());
        System.out.println(DbSession.getDbSession());
    }

    @Test
    public void added() {
        Adder a= Adder.getInstance();

        a.initialize(2,4);
        int op = a.addmethod();
        assertThat(op, is(6));

        String s = "sadasd";
        String s1 = "sadasd";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        assertTrue(s.hashCode() == s1.hashCode());

        Set<String> v = new HashSet<>();
        v.add("sss");
        v.add("sss");
        v.add("ss");
        v.add("ss1");


    }
}
