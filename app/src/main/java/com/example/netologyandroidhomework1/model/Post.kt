package com.example.netologyandroidhomework1.model

data class Post(
    val id:Int,
    val author:String= "Нетология. Университет интернет-профессий будущего",
    val published:String =  "21 мая в 21:56",
    val content:String = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
    val videoUrl:String = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
    var countLiked: Int = 0,
    var countShared: Int = 0,
    var isLiked: Boolean = false
):java.io.Serializable