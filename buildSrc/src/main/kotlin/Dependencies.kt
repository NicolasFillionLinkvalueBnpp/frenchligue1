object Dependencies {
    val coreAndroidX by lazy {"androidx.core:core-ktx:${Versions.coreAndroidX}"}
    val lifeCycleRuntime by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntime}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy {"androidx.compose.ui:${Versions.composeUi}"}
    val composeGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val composeUiToolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 by lazy {"androidx.compose.material3:material3"}

    val junit by lazy {"junit:junit:${Versions.junit}"}
    val androidTestJUnit by lazy {"androidx.test.ext:junit:${Versions.androidTestJUnit}"}
    val androidTestEspresso by lazy {"androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"}
    val androidTestComposeBom by lazy {"androidx.compose:compose-bom:${Versions.androidTestComposeBom}"}
    val androidTestComposeUi by lazy {"androidx.compose.ui:${Versions.androidTestComposeUi}"}
    val debugComposeUiTooling by lazy {"androidx.compose.ui:${Versions.debugComposeUiTooling}"}
    val debugComposeUiTestManifest by lazy {"androidx.compose.ui:${Versions.debugComposeUiTestManifest}"}
}