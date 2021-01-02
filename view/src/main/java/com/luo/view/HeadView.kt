package com.luo.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

/**
 * 自定义控件，用于顶部显示页面名称以及返回按钮
 * @author Luo-DH
 */
class HeadView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        // 加载页面资源文件
        LayoutInflater.from(context).inflate(
            R.layout.head, this, true
        )
    }
}