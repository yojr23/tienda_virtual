    package com.joserincon.tienda_virtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

    public class FormProductActivity extends AppCompatActivity {
    private Button btnSaveForm;
    private TextInputLayout nameTextField, descriptionTextField,priceTextFile,imageUrlTextField;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);
        btnSaveForm = findViewById(R.id.btn_save_product_form);

        nameTextField=findViewById(R.id.et_name_product_form);
        descriptionTextField=findViewById(R.id.et_description_product_form);
        priceTextFile=findViewById(R.id.et_price_product_form);
        imageUrlTextField=findViewById(R.id.et_image_url_product_form);

        btnSaveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo lo q escriba de aqui para abajo se activa
                //cuando el usuario de click en el boton
                String name =nameTextField.getEditText().getText().toString().trim();
                String descripcion =descriptionTextField.getEditText().getText().toString().trim();
                String price =priceTextFile.getEditText().getText().toString().trim();
                String urlImage =imageUrlTextField.getEditText().getText().toString().trim();

                if (name.isEmpty()) {
                    nameTextField.setError("Por Favor Ingresar el nombre");
                    return;
                }else if(name.length()>20){
                    nameTextField.setError(("Se Excedio de 20"));
                    return;
                }

                if (descripcion.isEmpty()) {
                    nameTextField.setError("Por Favor Ingresar la descripcion");
                    return;
                }

                if (price.isEmpty()) {
                    nameTextField.setError("Por Favor Ingresar el precio");
                    return;
                }

                if (urlImage.isEmpty()) {
                    nameTextField.setError("Por Favor Ingresar la url");
                    return;
                }

                Product myNewProduct = new Product("Computador","descripcion",55000.0,"no hay magen");


                Toast.makeText(FormProductActivity.this, "EPAA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

//comentario