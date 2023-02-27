package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    @DisplayName("equals 재정의 되었는지 확인")
    void checkEquals() {
        Result result1 = new Result("꽝");
        Result result2 = new Result("꽝");

        assertThat(result1).isEqualTo(result2);
    }

}