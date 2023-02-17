package jp.art.akidon.android.androidPrototype.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import jp.art.akidon.android.androidPrototype.R
import jp.art.akidon.android.androidPrototype.model.Article

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context!!)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context!!, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context!!, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context!!, attrs, defStyleAttr, defStyleRes)

    private var profileImageView: ImageView? = null
    private var titleTextView: TextView? = null
    private var userNameTextView: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
        profileImageView = findViewById<ImageView>(R.id.profile_image_view)
        titleTextView = findViewById<TextView>(R.id.title_text_view)
        userNameTextView = findViewById<TextView>(R.id.user_name_text_view)
    }

    fun setArticle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name

        profileImageView?.setBackgroundColor(Color.RED)
    }

}