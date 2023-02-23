package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    @DisplayName("높이에 0이하의 값을 입력하면 예외 발생")
    void validateHeight(int height) {
        assertThatThrownBy(() -> new Ladder(height, 4, new RandomPointGenerator()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Ladder.INVALID_HEIGHT_ERROR);
    }
}
