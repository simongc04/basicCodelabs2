import androidx.compose.runtime.mutableStateOf
import java.awt.Label


class  WellnessTask(
    val id: Int,
    val label: String,
    initialChecked ; Boolean = false
){
    var checked by mutableStateOf(initialChecked)
}