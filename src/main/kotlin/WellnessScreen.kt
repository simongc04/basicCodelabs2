import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import  androidx.lifecycle.viewmodel.compose.viewModel
@Composable
fun  WellnesScren(
    modifier: Modifier = Modifier,
    WellnessViewModel : EjemploViewModel = viewModel()
){

    WellnessTasksList(
        List = wellnessViewModel.tasks,
        onCheked = { task, checked ->
            wellnessViewModel.changeTaskChecked(task, checked)
        },
        onCloseTask = { task ->
            WellnessViewModel.remove(task)

        }
    )
}