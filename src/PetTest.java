

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void testGetname()
    {
       Pet dog=new Pet("Karo");
       String petName= dog.Name();
       assertEquals("Karo",dog.Name());


    }
}


