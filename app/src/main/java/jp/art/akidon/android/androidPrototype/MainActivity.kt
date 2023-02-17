package jp.art.akidon.android.androidPrototype

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
import jp.art.akidon.android.androidPrototype.model.Article
import jp.art.akidon.android.androidPrototype.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("a", "b"), dummyArticle("c", "d"))

        val listView: ListView = findViewById<ListView>(R.id.list_view)
        listView.adapter = listAdapter

//        val articleView = ArticleView(applicationContext)
//
//        articleView.setArticle(Article(id = "123",
//        title = "kotlin",
//        url = "aaa",
//        user = User(id = "234", name = "aaa", profileImageUrl = "aa")
//        ))
//        setContentView(articleView)
    }
    private fun dummyArticle(title: String, userName: String): Article = Article(id = "", title = title, url = "http", user = User(id = "234", name = "aaa", profileImageUrl = "aa"))


}