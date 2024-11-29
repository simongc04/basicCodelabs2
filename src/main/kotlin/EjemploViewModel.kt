import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import java.awt.List


private fun getWellnessTask() = List (30) {i -> WellnessTask(i, "Task # $i")}

class EjemploViewModel : ViewModel(){
    private  val _task = getWellnessTask().toMutableStateList()

    val task: List<WellnessTask> get() = _task

    fun remove(item: WellnessTask){
        _task.remove(item)
    }

    fun  ChangeTaskChecked(item: WellnessTask, checked : Boolean) =
        task.find { it.id == item.id}?.let { task ->
            task.checked = checked

        }

}