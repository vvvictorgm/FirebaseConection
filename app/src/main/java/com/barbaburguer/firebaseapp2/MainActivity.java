package com.barbaburguer.firebaseapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia.child("pontos").setValue("300");
        //referencia.child("usuarios").child("nome").setValue("Victor");
        /*
        DatabaseReference usuarios = referencia.child("usuarios");
        Usuario usuario = new Usuario();
        usuario.setNome("Victor");
        usuario.setSobrenome("Frazatto");
        usuario.setIdade(28);
        usuarios.child("001").setValue(usuario);

         */
        DatabaseReference produtos = referencia.child("produtos");
        Produtos produto = new Produtos();
        produto.setDescricao("notebook de alta perfomance");
        produto.setMarca("Avell");
        produto.setPreco(5999);

        produtos.child("001").setValue(produto);

        produto.setDescricao("Iphone 11");
        produto.setMarca("Apple");
        produto.setPreco(9999);

        produtos.child("002").setValue(produto);



    }
}
