package com.yuyashuai.frameanimation.io

import android.graphics.Bitmap
import com.yuyashuai.frameanimation.repeatmode.RepeatStrategy

/**
 * @author yuyashuai   2019-04-24.
 * a pool store the bitmaps resident in memory
 */
interface BitmapPool {
    /**
     * take an bitmap from the pool，maybe a blacking method
     * @return null if the pool stop running
     */
    fun take(): Bitmap?

    /**
     * Start running,
     * @param repeatStrategy bitmap order
     */
    fun start(repeatStrategy: RepeatStrategy, index: Int)

    /**
     * recycler the bitmap for reuse
     */
    fun recycle(bitmap: Bitmap)

    fun setInteractionListener(listener: AnimationInteractionListener?)
    /**
     * release all resources, like thread, bitmap...
     */
    fun release()

    fun getRepeatStrategy(): RepeatStrategy?
}