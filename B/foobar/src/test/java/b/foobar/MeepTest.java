package b.foobar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Meep!")
class MeepTest {

  @DisplayName("say it ...")
  @Nested
  class SayIt{


    @Test
    void sayIt() {

      String expected = "Meep!";
      String resolved = Meep.sayIt();

      assertEquals(expected, resolved);

    }


  }

  @DisplayName("say it louder ...")
  @Nested
  class SayItLouder{


    @Test
    void sayIt() {

      String expected = "Meep!";
      String resolved = Meep.sayIt();

      assertEquals(expected, resolved);

    }


  }

  @DisplayName("say it louder still ...")
  @Nested
  class SayItEvenLouder{


    @Test
    void sayIt() {

      String expected = "Meep!";
      String resolved = Meep.sayIt();

      assertEquals(expected, resolved);

    }


  }

}