package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        BigDecimal priceComp = new BigDecimal("800");
        BigDecimal priceMon = new BigDecimal("200");
        BigDecimal priceOfKeyboard = new BigDecimal("10");

        Product computer = new Product("PC");
        Product monitor = new Product( "LG Monitor");
        Product keyboard = new Product("Keyboard");
        Product mouse = new Product("Mouse");

        Item school = new Item(12,computer, priceComp);
        Item player = new Item(1, monitor, priceMon);
        Item user = new Item(322, keyboard, priceOfKeyboard);

        computer.getItems().add(school);
        monitor.getItems().add(player);
        keyboard.getItems().add(player);
        mouse.getItems().add(user);

        ArrayList<Item> items = new ArrayList<>();
        items.add(school);
        items.add(player);
        items.add(user);

        //When
        Invoice invoice = new Invoice("873565638", items);
        Invoice savedInvoice = invoiceDao.save(invoice);

        //Then
        Assert.assertNotEquals(0, savedInvoice.getId());

        //CleanUp
        invoiceDao.delete(savedInvoice);
    }
}