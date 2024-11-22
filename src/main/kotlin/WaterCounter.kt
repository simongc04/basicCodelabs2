import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun WaterCounter (){
    var vasosContador by rememberSaveable() { mutableStateOf(0) }
    var showTask by rememberSaveable() { mutableStateOf(false) }
        Column {
            if (vasosContador > 0);
            if (showTask){
                WellnessTaskItem("HOLA" {showTask = false )
                }
            }
            val vasosTexto = if (vasosContador == 1) "vaso" else "vasos"
    Text("Te has bebido ${vasosContador}  ${vasosTexto} vasos de agua")
        }

            Column {
            Row {
                Button(
                    onClick = {
                vasosContador++
            }
    ) {
        Text("Beber agua")
                }
            }
        }
    }

