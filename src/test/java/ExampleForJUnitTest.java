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
        int[] resultMass = new int[2], mass = new int[6];
        int[] resultMass1 = new int[3], mass1 = new int[6];
        int[] resultMass2 = new int[1], mass2 = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        mass[3] = 4;
        mass[4] = 1;
        mass[5] = 7;
        resultMass[0] = mass[5];
        resultMass[1] = mass[4];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 4;
        mass1[3] = 2;
        mass1[4] = 1;
        mass1[5] = 7;
        resultMass1[0] = mass1[5];
        resultMass1[1] = mass1[4];
        resultMass1[2] = mass1[3];
        mass2[0] = 1;
        mass2[1] = 4;
        mass2[2] = 7;
        resultMass2[0] = 7;

        out.add(Arguments.arguments(resultMass, mass));
        out.add(Arguments.arguments(resultMass1, mass1));
        out.add(Arguments.arguments(resultMass2, mass2));
        return out.stream();
    }

    @Test
    public void testAfterPast4massWithoutBorderElement() {
        int[] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        Assertions.assertThrows(RuntimeException.class, () -> exampleForJUnit.afterPast4mass(mass));
    }

    @ParameterizedTest
    @MethodSource("dataHavingBorderElementTest")
    public void testHavingBorderElement(boolean value, int[] mass) {
        Assertions.assertEquals(value, exampleForJUnit.havingBorderElement(mass));
    }

    public static Stream<Arguments> dataHavingBorderElementTest() {
        List<Arguments> out = new ArrayList<>();
        int[] mass = new int[6];
        int[] mass1 = new int[4];
        int[] mass2 = new int[4];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        mass[3] = 4;
        mass[4] = 1;
        mass[5] = 7;
        mass1[0] = 2;
        mass1[0] = 2;
        mass1[0] = 2;
        mass1[0] = 2;
        mass2[0] = 1;
        mass2[0] = 2;
        mass2[0] = 2;
        mass2[0] = 2;
        out.add(Arguments.arguments(true, mass));
        out.add(Arguments.arguments(false, mass1));
        out.add(Arguments.arguments(false, mass2));
        return out.stream();
    }
}