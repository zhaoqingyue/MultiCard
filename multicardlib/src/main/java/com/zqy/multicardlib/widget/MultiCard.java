package com.zqy.multicardlib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zqy.multicardlib.R;

/**
 * Created by zhaoqy on 2018/4/11.
 */

/**
 * 多功能卡片
 */
public class MultiCard extends LinearLayout  {

    private TextView mLetter;
    private ImageView mIcon;
    private TextView mTitle;
    private TextView mContent;
    private ImageView mArrow;

    private boolean hasletter;
    private int iconid;
    private String title;
    private int title_color;
    private boolean hascontent;
    private String content;
    private int content_color;
    private boolean ismobile;
    private boolean alignRight;
    private boolean hasarrow;
    private int arrowid;
    private boolean hasline;

    public MultiCard(Context context) {
        super(context);
    }

    @SuppressLint("Recycle")
    public MultiCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        handleTypedArray(context, attrs);
        initView(context);
    }

    private void handleTypedArray(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.MultiCard);
        hasletter = typedArray.getBoolean(R.styleable.MultiCard_mc_hasletter,
                false);
        iconid = typedArray.getResourceId(R.styleable.MultiCard_mc_icon, -1);

        title = typedArray.getString(R.styleable.MultiCard_mc_title);
        int def_color = getResources().getColor(R.color.colorNormal);
        title_color = typedArray.getColor(
                R.styleable.MultiCard_mc_title_color, def_color);

        hascontent = typedArray.getBoolean(
                R.styleable.MultiCard_mc_hascontent, false);
        content = typedArray.getString(R.styleable.MultiCard_mc_content);
        content_color = typedArray.getColor(
                R.styleable.MultiCard_mc_content_color, def_color);
        ismobile = typedArray.getBoolean(R.styleable.MultiCard_mc_ismobile,
                false);
        alignRight = typedArray.getBoolean(
                R.styleable.MultiCard_mc_alignRight, true);

        hasarrow = typedArray.getBoolean(R.styleable.MultiCard_mc_hasarrow,
                true);
        arrowid = typedArray.getResourceId(R.styleable.MultiCard_mc_arrowicon, -1);

        hasline = typedArray.getBoolean(R.styleable.MultiCard_mc_hasline,
                true);

        typedArray.recycle();
    }

    private void initView(Context context) {
        inflate(context, R.layout.layout_multicard, this);

        /**
         * 设置第一个字符
         */
        if (hasletter && !TextUtils.isEmpty(title)) {
            mLetter = (TextView) findViewById(R.id.tv_letter);
            mLetter.setText(title.subSequence(0, 1));
            mLetter.setVisibility(View.VISIBLE);
        }

        /**
         * 设置图标
         */
        if (iconid > 0) {
            mIcon = (ImageView) findViewById(R.id.iv_icon);
            mIcon.setImageResource(iconid);
            mIcon.setVisibility(View.VISIBLE);
        }

        /**
         * 设置标题
         */
        mTitle = (TextView) findViewById(R.id.tv_title);
        mTitle.setText(title);
        mTitle.setTextColor(title_color);

        /**
         * 设置内容可见
         */
        if (hascontent) {
            mContent = (TextView) findViewById(R.id.tv_content);
            mContent.setVisibility(View.VISIBLE);
            mContent.setText(content);
            mTitle.setTextColor(content_color);

            if (!alignRight) {
                /**
                 * content左对齐
                 */
                mContent.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
            } else {
                /**
                 * content右对齐
                 */
                mContent.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
            }

            if (ismobile) {
                int mobile_color = getResources()
                        .getColor(R.color.mobile_color);
                mContent.setTextColor(mobile_color);
                mContent.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                //mContent.setOnClickListener(this);
            }
        }

        /**
         * 显示右箭头
         */
        if (hasarrow) {
            mArrow = (ImageView) findViewById(R.id.iv_arrow);
            mArrow.setVisibility(View.VISIBLE);
            if (arrowid > 0) {
                mArrow.setImageResource(arrowid);
            }
        }

        /**
         * 间隔线不可见
         */
        if (!hasline) {
            View line = findViewById(R.id.v_line);
            line.setVisibility(View.GONE);
        }
    }

    public void setContent(String content) {
        mContent.setText(content);
    }

    public String getContent() {
        return mContent.getText().toString().trim();
    }


}
