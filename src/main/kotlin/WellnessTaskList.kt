import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

data class WellnessTask(val id: Int, val label: String)

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTasksList() {
    modifier : Modifier = Modifier,
    listaItems: List<WellnessTask> = remember { getWellnessTasks() }
        LazyColumn {



        }

}
