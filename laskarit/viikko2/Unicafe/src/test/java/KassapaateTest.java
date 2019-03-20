

import com.mycompany.unicafe.Kassapaate;
import com.mycompany.unicafe.Maksukortti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti maksukortti;
    
    public KassapaateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        maksukortti = new Maksukortti(400);
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void rahamaaraJaMyytyjenLounaudenMaaraOikea() {
        assertEquals(100000, kassapaate.kassassaRahaa());
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void kateisostoToimiiEdullisenLounaanKohdalla() {
        assertEquals(5, kassapaate.syoEdullisesti(245));
        assertEquals(100240, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
        
        assertEquals(235, kassapaate.syoEdullisesti(235));
        assertEquals(100240, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
        
    }
    
    @Test
    public void kateisostoToimiiMaukkaanLounaanKohdalla() {
        assertEquals(0, kassapaate.syoMaukkaasti(400));
        assertEquals(100400, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
        
        assertEquals(235, kassapaate.syoMaukkaasti(235));
        assertEquals(100400, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
        
    }
    
    @Test 
    public void korttiostoToimiiEdullisenLounaanKohdalla() {
        assertTrue(kassapaate.syoEdullisesti(maksukortti));
        kassapaate.syoEdullisesti(maksukortti);
        assertEquals(160,maksukortti.saldo());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
        
        //saldo nyt 1,60e
        assertFalse(kassapaate.syoEdullisesti(maksukortti));
        kassapaate.syoEdullisesti(maksukortti);
        assertEquals(160,maksukortti.saldo());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
        
        assertEquals(100000, kassapaate.kassassaRahaa());
        
    }
    
    @Test
    public void korttiostoToimiiMaukkaanLounaanKohdalla() {
        assertTrue(kassapaate.syoMaukkaasti(maksukortti));
        kassapaate.syoMaukkaasti(maksukortti);
        assertEquals(0,maksukortti.saldo());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
        
        //saldo nyt 0,0e
        assertFalse(kassapaate.syoMaukkaasti(maksukortti));
        kassapaate.syoMaukkaasti(maksukortti);
        assertEquals(0,maksukortti.saldo());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
        
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void arvonLataaminenKortilleToimii() {
        kassapaate.lataaRahaaKortille(maksukortti, 200);
        assertEquals(600, maksukortti.saldo());
        assertEquals(100200, kassapaate.kassassaRahaa());
        kassapaate.lataaRahaaKortille(maksukortti, -5);
        assertEquals(600, maksukortti.saldo());
        assertEquals(100200, kassapaate.kassassaRahaa());
    }
}
