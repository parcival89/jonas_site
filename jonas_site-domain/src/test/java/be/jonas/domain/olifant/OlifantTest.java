package be.jonas.domain.olifant;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OlifantTest {

    @Test
    public void roepNaam_geeftNaamVanOlifantInAllCaps(){
        assertThat(new Olifant("Parcival").roepNaam()).isEqualTo("PARCIVAL");
    }
}