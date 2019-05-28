package ru.geekbrains.lesson_03.ui.base

abstract class BaseActivity<T, S : BaseViewState<T>> : AppCompatActivity() {
    abstract val viewState: BaseViewModel<T, S>
    abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
        viewState.getViewState().observe(this, Observer<S> {
            override fun onChanged(t: S?) {
                t ->
                if (t == null) return
                if (t.error != null) {
                    renderError(t.data)
                    return@Observer
                }
                renderData(t.data)
            }
        })
    }

    protected fun renderError(error: Throwable?) {
        error?.let {
            Timber.e(it) { it.message ?: "" }
            if (it.message != null) showError(it.message)
        }

        Toast.makeText(this, error, Toast)
    }

    protected fun showError(error: String) {
        Toast.makeText(this, error, )
    }
}