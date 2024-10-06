package com.bservan.androidjoystick

import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.util.Log

class AndroidJoystickEvent(ctx: Context) : View(ctx) {
  override fun dispatchGenericMotionEvent(event: MotionEvent?): Boolean {
    /// TODO: Implement this method.
    return super.dispatchGenericMotionEvent(event)
  }
}
