import level3.lesson6.ExampleForJUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleForJUnitTest {
    private ExampleForJUnit exampleForJUnit;
    private boolean expected;

    @BeforeEach
    public void init() {
        expected = false;
        exampleForJUnit = new ExampleForJUnit();
    }

    @ParameterizedTest
    @MethodSource("dataForAfterPast4massTest")
    public void testAfterPast4mass(int[] resultMass, int[] mass) {
        Assertions.assertArrayEquals(resultMass, exampleForJUnit.afterPast4mass(mass));
    }

    public static Stream<Arguments> dataForAfterPast4massTest() {
        List<Arguments> out = new ArrayList<>();
        int[] resultMass = new int[]{7, 1}, mass = new int[]{1, 2, 3, 4, 1, 7};
        int[] resultMass1 = new int[]{7, 1, 2}, mass1 = new int[]{1, 2, 4, 2, 1, 7};
        int[] resultMass2 = new int[]{7}, mass2 = new int[]{1, 4, 7};

        out.add(Arguments.arguments(resultMass, mass));
        out.add(Arguments.arguments(resultMass1, mass1));
        out.add(Arguments.arguments(resultMass2, mass2));
        return out.stream();
    }

    @Test
    public void testAfterPast4massWithoutBorderElement() {
        int[] mass = new int[]{1, 2, 3};
        Assertions.assertThrows(RuntimeException.class, () -> exampleForJUnit.afterPast4mass(mass));
    }

    @ParameterizedTest
    @MethodSource("dataHavingBorderElementTest")
    public void testHavingBorderElement(boolean value, int[] mass) {
        Assertions.assertEquals(value, exampleForJUnit.havingBorderElement(mass));
    }

    public static Stream<Arguments> dataHavingBorderElementTest() {
        List<Arguments> out = new ArrayList<>();
        int[] mass = new int[]{1, 2, 3, 4, 1, 7};
        int[] mass1 = new int[]{2, 2, 2, 2};
        int[] mass2 = new int[]{1, 2, 2, 2};
        out.add(Arguments.arguments(true, mass));
        out.add(Arguments.arguments(false, mass1));
        out.add(Arguments.arguments(false, mass2));
        return out.stream();
    }
}