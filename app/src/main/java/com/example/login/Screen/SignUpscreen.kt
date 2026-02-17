package com.example.login.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.R

@Composable
fun SignUpscreen(modifier: Modifier = Modifier)    {

    var email by remember {
        mutableStateOf("")
    }

    var name by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }





    Column(modifier = modifier.fillMaxSize().padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ){
        Text(
            text = "Hello There!",
            modifier = modifier.fillMaxWidth(),

                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                )


            )



        Text(
            text = "Create an account!",
            modifier = modifier.fillMaxWidth(),

            style = TextStyle(
                fontSize = 22.sp,

            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(

            painter = painterResource(id = R.drawable.barner2),
            contentDescription = "Barner",
            modifier = Modifier.fillMaxWidth().height(200.dp)
        )


        Spacer(modifier = Modifier.height(20.dp))




        OutlinedTextField(value =  email ,onValueChange = {
            email = it
        },

                label = {
                    Text(text = "Email address")

                },
                modifier = modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(20.dp))


        OutlinedTextField(value =  name ,onValueChange = {
            name = it
        },

            label = {
                Text(text = "name")

            },
            modifier = modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(20.dp))


        OutlinedTextField(value =  password ,onValueChange = {
           password = it
        },

            label = {
                Text(text = "Password")

            },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()


        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
        },

            modifier = Modifier.fillMaxWidth().

            height(60.dp)
        ) {
            Text(text = "Signup",
                fontSize = 22.sp)


        }





    }
}