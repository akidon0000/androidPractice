package jp.art.akidon.android.androidPrototype

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import jp.art.akidon.android.androidPrototype.model.Article
import jp.art.akidon.android.androidPrototype.view.ArticleView
import java.util.Collections.emptyList

class ArticleListAdapter(private val context: Context) : BaseAdapter() {

    var articles: List<Article> = emptyList()

    override fun getCount(): Int = articles.size

    override fun getItem(position: Int): Any? = articles[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View =
        ((convertView as? ArticleView) ?: ArticleView(context)).apply {
            setArticle(getItem(position))
        }

    public inline fuc <T> T.apply(block: T.() -> Unit): T { block(); return this }
}