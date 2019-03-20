package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void kortinSaldoAlussaOikein() {
        assertEquals("saldo: 0.10",kortti.toString());
    }
    
    @Test
    public void rahanLataaminenKortilleToimii() {
        kortti.lataaRahaa(125);
        
        assertEquals("saldo: 1.35", kortti.toString());
    }
    
    @Test
    public void rahaVaheneeOikeinJosRahaaOn() {
        kortti.otaRahaa(5);
        
        assertEquals("saldo: 0.5", kortti.toString());
    }
    
    @Test
    public void rahaEiVaheneJosOtettavaMaaraYlittaaSaldon() {
        kortti.otaRahaa(20);
        
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    @Test
    public void OtaRahaaPalauttaaOikeatTotuusarvot() {
        assertTrue(kortti.otaRahaa(10));
        assertFalse(kortti.otaRahaa(20));
    }
    
    @Test
    public void SaldoOikein() {
        assertEquals(10, kortti.saldo());
    }
}
