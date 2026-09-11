package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab04.ui.theme.Lab04Theme
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Button
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}

@Composable
fun MiLista() {
    LazyColumn {
        items(5) { index -> Text(text = "Elemento $index") }
    }
}
//boton
@Composable
fun MiBotonFlotante() {
    FloatingActionButton(onClick = { /* Acción */ }) {
        Text("+")
    }
}

//AlertDialog
@Composable
fun MiAlerta() {
    AlertDialog(
        onDismissRequest = { },
        confirmButton = { Button(onClick = {}) { Text("Aceptar") } },
        title = { Text("Aviso") },
        text = { Text("Este es un diálogo de prueba.") }
    )
}