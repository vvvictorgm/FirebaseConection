package com.barbaburguer.firebaseapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth usuario = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Verificar usuario logado*/

        if(usuario.getCurrentUser() != null){
            Log.i("CreateUser", "Usuario logado");

        }else{
            Log.i("CreateUser", "Usuario não logado");


        }

        /*Cadastrando um usuario
        usuario.createUserWithEmailAndPassword("victorfrazatto@hotmail.com","victorjava")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Log.i("CreateUser", "Sucesso ao cadastrar usuário");
                        }else{
                            Log.i("CreateUser", "Erro ao cadastrar usuário");
                        }
                    }
                });

        DatabaseReference usuarios = referencia.child("usuarios");
        DatabaseReference produtos = referencia.child("produtos");

        usuarios.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        /*

        Usuario usuario = new Usuario();
        usuario.setNome("Victor");
        usuario.setSobrenome("Frazatto");
        usuario.setIdade(28);
        usuarios.child("001").setValue(usuario);



        Produtos produto = new Produtos();
        produto.setDescricao("notebook de alta perfomance");
        produto.setMarca("Avell");
        produto.setPreco(5999);

        produtos.child("001").setValue(produto);

        produto.setDescricao("Iphone 11");
        produto.setMarca("Apple");
        produto.setPreco(9999);

        produtos.child("002").setValue(produto);

         */



    }
}
