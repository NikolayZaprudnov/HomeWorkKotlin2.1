@file:Suppress("DEPRECATION")

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateComissionVk_pay() {
        val amount = 5000.0
        val card = "Vk pay"
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(0.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMirCard(){
        val amount = 500000.0
        val card = "Мир"
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(3750.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMastercardCard(){
        val amount = 500000.0
        val card = "MasterCard"
        val moneyInMounth = 80000.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(3000.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMastercardCardNoComission(){
        val amount = 500000.0
        val card = "MasterCard"
        val moneyInMounth = 60000.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(0.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMirCardMinComission(){
        val amount = 500.0
        val card = "Мир"
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(35.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMaestroCard(){
        val amount = 500000.0
        val card = "Maestro"
        val moneyInMounth = 80000.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(3000.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithMaestrodCardNoComission(){
        val amount = 500000.0
        val card = "Maestro"
        val moneyInMounth = 60000.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(0.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithVisaCardMinComission(){
        val amount = 500.0
        val card = "Visa"
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(35.0, result, 0.5)
    }
    @Test
    fun calculateComiisionWithVisaCard(){
        val amount = 500000.0
        val card = "Visa"
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(3750.0, result, 0.5)
    }
    @Test
    fun calculateComissionNoComission() {
        val amount = 5000.0
        val card = " "
        val moneyInMounth = 0.0
        val result = calculateComission(amount, card, moneyInMounth)
        assertEquals(0.0, result, 0.5)
    }
    
}