package com.example.myapplication.utils

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by msaycon on 28,Nov,2019
 */

inline fun <reified T : ViewModel> FragmentActivity.viewModel(
    factory: ViewModelProvider.Factory,
    body: T.() -> Unit
): T {
    val vm = ViewModelProvider(this, factory)[T::class.java]
    vm.body()
    return vm
}