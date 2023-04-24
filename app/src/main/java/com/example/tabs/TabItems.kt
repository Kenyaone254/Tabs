package com.example.tabs

import androidx.compose.runtime.Composable

sealed class TabItems
typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Music : TabItem(R.drawable.cake, "Music", { MusicScreen() })
    object Movies : TabItem(R.drawable.curry, "Movies", { MoviesScreen() })
    object Books : TabItem(R.drawable.pizza, "Books", { BooksScreen() })
}
