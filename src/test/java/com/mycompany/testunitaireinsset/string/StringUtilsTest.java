/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author talend
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

       /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void testIsChaineValideOK() {
         String name ="Bonjour";
         StringUtils instance = new StringUtils();
         boolean expResult = true;
         boolean resutl = instance.isChaineValide(name);    
         assertEquals(expResult,resutl);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testIsChaineValideNO() {
         String name ="B";
         StringUtils instance = new StringUtils();
         boolean resutl = instance.isChaineValide(name);   
         
    }
    
    @org.junit.Test
    public void testIsPalladiumOk()
    {
        String name="Radar";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean resutl = instance.isPalindrome(name);    
        assertEquals(expResult,resutl);
    }
    
    @org.junit.Test
    public void testcompterOccurences()
    {
        String text ="papa";
        StringUtils instance = new StringUtils();
        Map<String, Integer> map;
        map  = instance.compterOccurences(text);
       
        Map<String, Integer> MapResult;
        MapResult= new TreeMap<>();
        MapResult.put("p", 2);
        MapResult.put("a", 2);
        boolean resul = false;
        boolean resulAttend = true;
        if(map.equals(MapResult))
        {
            resul = true;
        }
        else
        {
            resul = false;
        }
        assertEquals(resulAttend,resul);
    }
    
    /*@org.junit.Test
    public void testIsPalladiumNull()
    {
        String name = null;
        StringUtils instance = new StringUtils();
        boolean result  = instance.isPalindrome(name);
        boolean expResult = true;
        
        assertEquals(expResult,result);
             
    }*/
    
    
    @org.junit.Test
    public void testIsPalladiumNo()
    {
        String name="Rader";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean resutl = instance.isPalindrome(name);    
        assertEquals(expResult,resutl);
    }
    
    @org.junit.Test
    public void testChaineInverse()
    {
        String name ="lalo";
        StringUtils instance = new StringUtils();
        String result  = instance.inverse(name);
        
        assertEquals("olal", result);
             
    }
    
    /*@org.junit.Test
    public void testChaineInverseNull()
    {
        String name = null;
        StringUtils instance = new StringUtils();
        String result  = instance.inverse(name);
        
        assertEquals("olal", result);
             
    }*/
}
