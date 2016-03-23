package User;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shull on 3/23/2016.
 */
public class UserFactoryTest {

    @Test
    public void incearca_crearea() {
        UserProt user=UserFactory.create("admin");
        String ceva = user.getName();
        System.out.println(ceva);
        assertEquals(ceva,"admin");

        fail("Eroare de creare user");
    }

}