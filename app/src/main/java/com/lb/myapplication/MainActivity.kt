package com.lb.myapplication

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lb.myapplication.javabenchmarks.binarytrees.binarytreesjava
import com.lb.myapplication.javabenchmarks.fannkuchredux.fannkuchreduxjava
import com.lb.myapplication.javabenchmarks.fasta.fastajava
import com.lb.myapplication.javabenchmarks.mandelbrot.mandelbrotjava
import com.lb.myapplication.javabenchmarks.spectralnorm.spectralnormjava
import kotlinbenchmarks.conv.binarytrees.binarytreesktconv
import kotlinbenchmarks.conv.fasta.fastaktconv
import kotlinbenchmarks.conv.mandelbrot.mandelbrotktconv
import kotlinbenchmarks.conv.spectralnorm.spectralnormktconv
import kotlinbenchmarks.idiom.binarytrees.binarytreesktidiom
import kotlinbenchmarks.idiom.fannkuchredux.fannkuchreduxktidiom
import kotlinbenchmarks.idiom.fasta.fastaktidiom
import kotlinbenchmarks.idiom.spectralnorm.spectralnormktidiom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null)
            AsyncTask.execute {
                val emptyParams = arrayOf<String>()
                Log.d("AppLog", "Java")
                //
                var startTime = System.currentTimeMillis()
                binarytreesjava.main(emptyParams)
                var endTime = System.currentTimeMillis()
                Log.d("AppLog", "binarytreesjava time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                fannkuchreduxjava.main(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "fannkuchreduxjava time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                fastajava.main(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "fastajava time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                mandelbrotjava.main(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "mandelbrotjava time taken: ${endTime - startTime}")
                //
//            startTime = System.currentTimeMillis()
//            nbodyjava.main(emptyParams)
//            endTime = System.currentTimeMillis()
//            Log.d("AppLog", "nbodyjava time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                spectralnormjava.main(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "spectralnormjava time taken: ${endTime - startTime}")
                ////////////////////////////////////////////////////////////////////////////////////////
                Log.d("AppLog", "-------------------------")
                Log.d("AppLog", "kotlin converted")
                startTime = System.currentTimeMillis()
                binarytreesktconv.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "binarytreesktconv time taken: ${endTime - startTime}")
                //
//            startTime = System.currentTimeMillis()
//            fannkuchreduxktconv.execute(emptyParams)
//            endTime = System.currentTimeMillis()
//            Log.d("AppLog", "fannkuchreduxktconv time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                fastaktconv.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "fastaktconv time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                mandelbrotktconv.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "mandelbrotktconv time taken: ${endTime - startTime}")
                //
//            startTime = System.currentTimeMillis()
//            nbodyktconv.execute(emptyParams)
//            endTime = System.currentTimeMillis()
//            Log.d("AppLog", "nbodyktconv time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                spectralnormktconv.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "spectralnormktconv time taken: ${endTime - startTime}")
                ////////////////////////////////////////////////////////////////////////////////////////
                Log.d("AppLog", "-------------------------")
                Log.d("AppLog", "kotlin idiomatic")
                startTime = System.currentTimeMillis()
                binarytreesktidiom.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "binarytreesktidiom time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                fannkuchreduxktidiom.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "fannkuchreduxktidiom time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                fastaktidiom.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "fastaktidiom time taken: ${endTime - startTime}")
                //
//                startTime = System.currentTimeMillis()
//                mandelbrotktidiom.execute(emptyParams)
//                endTime = System.currentTimeMillis()
//                Log.d("AppLog", "mandelbrotktidiom time taken: ${endTime - startTime}")
                //
//            startTime = System.currentTimeMillis()
//            nbodyktidiom.execute(emptyParams)
//            endTime = System.currentTimeMillis()
//            Log.d("AppLog", "nbodyktidiom time taken: ${endTime - startTime}")
                //
                startTime = System.currentTimeMillis()
                spectralnormktidiom.execute(emptyParams)
                endTime = System.currentTimeMillis()
                Log.d("AppLog", "spectralnormktidiom time taken: ${endTime - startTime}")
                Log.d("AppLog", "done with all tests")
            }
    }
}
