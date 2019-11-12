package app.easylink.koltin_variables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Timber.d("Hello, $name")
        /*
        if we don't assign the dataTypes then we must intialize the value
         */

        val greeting="hello Abdul"
        val count=2
        val my_char='H'

        // Explicitly defining the type of variables
        val greeting1: String = "Hello, World"
        val year: Int = 2018
        //arrays in Kotlin
        var numbers = arrayOf(1, 2, 3, 4, 5)
        var animals = arrayOf("Cat", "Dog", "Lion", "Tiger")
        val num2=(3..20).toList().toTypedArray()

        //Arrays
        val myCharArray = charArrayOf('K', 'O', 'T')  // CharArray (corresponds to Java 'char[]')
        val myIntArray = intArrayOf(1, 3, 5, 7)		// IntArray (corresponds to Java 'int[]')

        // creating TextView programmatically
        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        tv_dynamic.text = "This is a dynamic TextView generated programmatically in Kotlin"


        // add TextView to LinearLayout
       // LinearLayout layout=(LinearLayout)findViewById(R.id.l1)
        ll_main_layout.addView(tv_dynamic)

        editText1.setText("This is Text"+ greeting)
        editInt.setText("This is Int"+ count + numbers[2])
        editChar.setText("This is Character"+ my_char)
       // Arrays built in methods
        val nums = intArrayOf(1, 2, 3, 4, 5)

        val avg = nums.average()
        println("The average is $avg")

        val nOfValues = nums.count()
        println("There are $nOfValues elements")

        val sumOfValues = nums.sum()
        println("The sum of values is $sumOfValues")

        val maxValue = nums.max()
        println("The maximum is $maxValue")

        val minValue = nums.min()
        println("The minimum is $minValue")

        val nums1 = arrayOf(7, 3, 3, 4, 5, 9, 1)

        val sortedNums = nums1.sortedArray()
        println(Arrays.toString(sortedNums))

        val sortedNumsDesc = nums.sortedArrayDescending()
        println(Arrays.toString(sortedNumsDesc))


    }
}
