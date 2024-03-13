package com.joserincon.tienda_virtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listProducts = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private void loadFakeData(){
        Product product1 = new Product("Computador Asus","El mejor pc gamer",11000000.0,"https://rampcrosario.com/wp-content/uploads/2019/03/pc-gamer.png");

        Product product2 = new Product("Teclado Asus","El mejor teclado gamer",800000.0,"https://d22fxaf9t8d39k.cloudfront.net/f65ad7c8036f1e99b17e1e3fbcd89625026e26a0e81e4af34b1dc8b0cf7d235c169554.png");

        Product product3 = new Product("Celular Asus","El mejor celular gamer",7000000.0,"https://d22fxaf9t8d39k.cloudfront.net/f65ad7c8036f1e99b17e1e3fbcd89625026e26a0e81e4af34b1dc8b0cf7d235c169554.png");

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
    }
}