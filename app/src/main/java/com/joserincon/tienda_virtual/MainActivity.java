package com.joserincon.tienda_virtual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listProducts = new ArrayList<>();
    private RecyclerView rvProductsMain;

    private Toolbar topAppBar;
    private User userSession = new User();

    private ImageView userImageProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFakeData();


        userImageProfile =findViewById(R.id.iv_profile_home_user);
        Picasso.get().load(userSession.getUrlImageProfile()).into(userImageProfile);

        rvProductsMain= findViewById(R.id.rv_product_main);

        topAppBar = findViewById(R.id.top_app_bar_list_product);



        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.itemm_add_product){
                    startActivity(new Intent(MainActivity.this,FormProductActivity.class));
                    return true;

                } else if (menuItem.getItemId() == R.id.itemm_add_category) {
                    Toast.makeText(MainActivity.this, "Click en categoria", Toast.LENGTH_SHORT).show();
                    return true;

                }
                return false;
            }
        });

        ProductAdapter myAdapter = new ProductAdapter(listProducts);

        rvProductsMain.setAdapter(myAdapter);
        StaggeredGridLayoutManager myStagger = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        GridLayoutManager myGrid = new GridLayoutManager(getApplicationContext(),3);
        rvProductsMain.setLayoutManager(myStagger);
    }



    private void loadFakeData(){
        Product product1 = new Product("Computador Asus","El mejor pc gamer",11000000.0,"https://rampcrosario.com/wp-content/uploads/2019/03/pc-gamer.png");

        Product product2 = new Product("Teclado Asus","El mejor teclado gamer",800000.0,"https://d22fxaf9t8d39k.cloudfront.net/f65ad7c8036f1e99b17e1e3fbcd89625026e26a0e81e4af34b1dc8b0cf7d235c169554.png");

        Product product3 = new Product("Celular Asus","El mejor celular gamer",7000000.0,"https://static.vecteezy.com/system/resources/previews/009/269/552/original/3d-mobile-gaming-object-png.png");
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

        userSession.setName("Jose");
        userSession.setEmail("jrincon668@umab.edu.co");
        userSession.setPassword("hola");
        userSession.setPhone("3154844363");
        userSession.setUrlImageProfile("https://www.dzoom.org.es/wp-content/uploads/2020/02/portada-foto-perfil-redes-sociales-consejos.jpg");
    }
}