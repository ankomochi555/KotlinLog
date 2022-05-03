package jp.techacademy.arisa.takeishi.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable{

    constructor(name: String, age: Int, hobby: String): super(name, age, hobby)


    //Animalクラスのメソッドをオーバーライド
    override fun say() {

        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")

    }

    //Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}