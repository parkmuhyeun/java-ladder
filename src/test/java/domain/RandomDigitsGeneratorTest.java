package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RandomDigitsGeneratorTest {

    @Test
    @DisplayName("")
    void randomDigitsGenerator(){
        new RandomDigitsGenerator();
    }

    @RepeatedTest(50)
    @DisplayName("")
    void generate() {
        RandomDigitsGenerator generator = new RandomDigitsGenerator();

        Assertions.assertThat(generator.generate())
                .matches(value -> value == 1 || value == 0);
    }
}
