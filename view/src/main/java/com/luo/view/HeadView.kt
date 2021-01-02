package com.luo.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

/**
 * 自定义控件，用于顶部显示页面名称以及返回按钮
 * @author Luo-DH
 */
class HeadView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private lateinit var title: String

    init {
        // 获取相关属性
        initAttrs(attrs)
        // 初始化页面
        initView()
        // 设置相关属性
        setupAttrs()
        // 设置相关事件
        setupEvent()
    }

    private fun initView() {
        // 加载页面资源文件
        LayoutInflater.from(context).inflate(
            R.layout.head, this, true
        )

    }

    private fun initAttrs(attrs: AttributeSet?) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.HeadView)
        title = a.getString(R.styleable.HeadView_headTitle).toString()
        a.recycle()
    }

    private fun setupAttrs() {
        findViewById<TextView>(R.id.tv_head).text = title
    }

    private fun setupEvent() {
        findViewById<ImageView>(R.id.iv_back).setOnClickListener {

        }
    }
}