package Curry予想アプリ.miki.mikiso.carry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Size
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf("大山","藤浪","梅野","津田")
    val food = arrayOf("かれー","みそしる","ちゃーはん","えびちり","からあげ","スープ")
    val menu = arrayOf("よそえました^^","よそえませんでした")
    val textsize = arrayOf(12F,30F)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verbTextView.textSize = 18F
    }

    fun serveFood(view: View?){

        //Randomクラスの新しいインスタンスを初期化
        val randomName = Random
        val index = randomName.nextInt(4)//0-3までの乱数を生成
        val name = people[index]
        nameTextView.text = name + "に"
        foodTextView.text = food[Random.nextInt(6)] + "を"

        val index1 = randomName.nextInt(2)
        verbTextView.text = menu[index1]
        verbTextView.textSize = textsize[index1]

    }
}