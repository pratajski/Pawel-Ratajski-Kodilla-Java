package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Test
    public void testInvoiceDaoSave(){
        //Given
        BigDecimal priceComp = new BigDecimal("800");
        BigDecimal valueComp = new BigDecimal("999.99");
        BigDecimal priceMon = new BigDecimal("200");
        BigDecimal valueMon = new BigDecimal("299.99");
        BigDecimal priceOfKeyboard = new BigDecimal("10");
        BigDecimal valueOfKeyboard = new BigDecimal("19.99");
        Product computer = new Product(1, "PC");
        Product monitor = new Product(2, "LG Monitor");
        Product keyboard = new Product(3, "Keyboard");
        Product mouse = new Product(4, "Mouse");

        Item school = new Item(1,computer,priceComp, 1, valueComp);
        Item player = new Item(2,monitor, priceMon, 2, valueMon);
        Item user = new Item(3, keyboard, priceOfKeyboard, 1, valueOfKeyboard);

        computer.getItems().add(school);
        monitor.getItems().add(player);
        keyboard.getItems().add(player);
        mouse.getItems().add(user);


        //When
        InvoiceDao.save(computer);




        //Then

        //CleanUp

    }
}
