package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    @author igormakovijcuk
    @project ArabicToRoman
    @class UtilTest
    @version 1.0.0
    @since 02.03.2024 - 13.23
*/

class UtilTest {

    @Test
    public void whenNumberIsGreaterThan4MillionThenException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.convertToRoman(4000001);
        });
    }
    @Test
    public void whenInputIsEmptyThenException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.convertToRoman("");
        });
        assertEquals("Input value cannot be empty", exception.getMessage());
    }

    @Test
    public void whenInputIsNullThenException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.convertToRoman((String) null);
        });
        assertEquals("Input value cannot be empty", exception.getMessage());
    }

    @Test
    public void whenInputIsNotNumberThenException() {
        assertThrows(NumberFormatException.class, () -> {
            Util.convertToRoman("not a number");
        });
    }

    @Test
    public void whenInputIsZeroThenException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.convertToRoman(0);
        });
    }

    @Test
    public void whenInputIsNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.convertToRoman("-1");
        });
        assertEquals("Input value must be a positive integer", exception.getMessage());
    }

    @Test
    public void whenNumberIs1ThenI() {
        assertEquals("I", Util.convertToRoman(1));
    }

    @Test
    public void whenNumberIs2ThenII() {
        assertEquals("II", Util.convertToRoman(2));
    }

    @Test
    public void whenNumberIs3ThenIII() {
        assertEquals("III", Util.convertToRoman(3));
    }

    @Test
    public void whenNumberIs4ThenIV() {
        assertEquals("IV", Util.convertToRoman(4));
    }

    @Test
    public void whenNumberIs5ThenV() {
        assertEquals("V", Util.convertToRoman(5));
    }

    @Test
    public void whenNumberIs9ThenIX() {
        assertEquals("IX", Util.convertToRoman(9));
    }

    @Test
    public void whenNumberIs10ThenX() {
        assertEquals("X", Util.convertToRoman(10));
    }

    @Test
    public void whenNumberIs49ThenXLIX() {
        assertEquals("XLIX", Util.convertToRoman(49));
    }

    @Test
    public void whenNumberIs50ThenL() {
        assertEquals("L", Util.convertToRoman(50));
    }

    @Test
    public void whenNumberIs90ThenXC() {
        assertEquals("XC", Util.convertToRoman(90));
    }

    @Test
    public void whenNumberIs100ThenC() {
        assertEquals("C", Util.convertToRoman(100));
    }

    @Test
    public void whenNumberIs400ThenCD() {
        assertEquals("CD", Util.convertToRoman(400));
    }

    @Test
    public void whenNumberIs500ThenD() {
        assertEquals("D", Util.convertToRoman(500));
    }

    @Test
    public void whenNumberIs900ThenCM() {
        assertEquals("CM", Util.convertToRoman(900));
    }

    @Test
    public void whenNumberIs1000ThenM() {
        assertEquals("M", Util.convertToRoman(1000));
    }

    @Test
    public void whenNumberIs354ThenCCCLIV() {
        assertEquals("CCCLIV", Util.convertToRoman(354));
    }

    @Test
    public void whenNumberIs2019ThenMMXIX() {
        assertEquals("MMXIX", Util.convertToRoman(2019));
    }

    @Test
    public void whenNumberIs3000000Then_M_M_M() {
        assertEquals("_M_M_M", Util.convertToRoman(3000000));
    }

    @Test
    public void whenNumberIs789ThenDCCLXXXIX() {
        assertEquals("DCCLXXXIX", Util.convertToRoman(789));
    }

    @Test
    public void whenNumberIs3345234Then_M_M_M_C_C_C_XL_VCCXXXIV() {
        assertEquals("_M_M_M_C_C_C_XL_VCCXXXIV", Util.convertToRoman(3345234));
    }

    @Test
    public void whenNumberIs3435234Then_M_M_M_C_D_X_X_X_VCCXXXIV() {
        assertEquals("_M_M_M_C_D_X_X_X_VCCXXXIV", Util.convertToRoman(3435234));
    }

    @Test
    public void whenNumberIs3000001Then_M_M_MI() {
        assertEquals("_M_M_MI", Util.convertToRoman(3000001));
    }

    @Test
    public void whenNumberIs2000005Then_M_MV() {
        assertEquals("_M_MV", Util.convertToRoman(2000005));
    }

    @Test
    public void whenNumberIs2000034Then_M_MXXXIV() {
        assertEquals("_M_MXXXIV", Util.convertToRoman(2000034));
    }

    @Test
    public void whenNumberIs3000023Then_M_M_C_C_X_X_XMMMCCXXXIII() {
        assertEquals("_M_M_C_C_X_X_XMMMCCXXXIII", Util.convertToRoman(2233233));
    }

    @Test
    public void whenNumberIs2233233Then_M_M_C_C_X_X_XMMMCCXXXIII() {
        assertEquals("_M_M_C_C_X_X_XMMMCCXXXIII", Util.convertToRoman(2233233));
    }

    @Test
    public void whenNumberIs2233454Then_M_M_C_C_X_X_XMMMCDLIV() {
        assertEquals("_M_M_C_C_X_X_XMMMCDLIV", Util.convertToRoman(2233454));
    }

    @Test
    public void whenNumberIs2233674Then_M_M_C_C_X_X_XMMMDCLXXIV(){
        assertEquals("_M_M_C_C_X_X_XMMMDCLXXIV",Util.convertToRoman(2233674));
    }

    @Test
    public void whenNumberIs3456345Then_M_M_M_C_D_L_VMCCCXLV(){
        assertEquals("_M_M_M_C_D_L_VMCCCXLV",Util.convertToRoman(3456345));
    }

}