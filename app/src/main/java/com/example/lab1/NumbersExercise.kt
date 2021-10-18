package com.example.lab1
import kotlin.random.Random


class NumbersExercise
{
    val numbers: List<Int> = List(15){ Random.nextInt(-50, 50)}

    fun firstnegative(list: List<Int>):Int
    {
        return list.indexOfFirst { el -> el < 0 }
    }

    fun lastpositive(list: List<Int>):Int
    {
        return list.indexOfLast { el -> el > 0 }
    }
}