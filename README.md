# MultiCard


- 效果图

![image](https://github.com/zhaoqingyue/MultiCard/blob/master/img/11.png)

![image](https://github.com/zhaoqingyue/MultiCard/blob/master/img/22.png)


- **gradle引用**


```
compile 'com.zhaoqy:multicard:1.0.0'
```

- 属性参数


属性参数 | 参数含义
---|---
mc_hasletter | 是否显示第一个字符
mc_icon | icon图标
mc_title | 标题
mc_title_color | 标题颜色值
mc_hascontent | 是否有内容
mc_content | 内容
mc_content_color | 内容文本颜色值
mc_ismobile | 内容是否是手机号
mc_alignRight | 内容是否右对齐
mc_hasarrow | 是否有箭头
mc_arrowicon | 箭头icon图标
mc_hasline | 是否有间隔线


- 代码参考


```
<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    android:layout_marginTop="15dp"
    app:mc_hasarrow="false"
    app:mc_hasline="false"
    app:mc_title="Normal"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    android:layout_marginTop="15dp"
    app:mc_icon="@mipmap/icon_default"
    app:mc_title="设置图标"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_hasletter="true"
    app:mc_title="显示第一次字符"
    app:mc_hasline="false"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    android:layout_marginTop="15dp"
    app:mc_hasarrow="true"
    app:mc_title="显示箭头"
    app:mc_hascontent="true"
    app:mc_content="默认箭头向右"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_hasarrow="true"
    app:mc_title="设置右箭头图标"
    app:mc_arrowicon="@mipmap/icon_down"
    app:mc_hasline="false"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    android:layout_marginTop="15dp"
    app:mc_title="设置标题颜色值"
    app:mc_title_color="@color/colorAccent"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_content="我是内容"
    app:mc_hascontent="true"
    app:mc_title="设置内容"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_content="内容默认右对齐"
    app:mc_content_color="@color/colorAccent"
    app:mc_hascontent="true"
    app:mc_title="设置内容颜色值"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_alignRight="false"
    app:mc_content="我是内容"
    app:mc_hascontent="true"
    app:mc_title="设置内容左对齐"/>

<com.zqy.multicardlib.widget.MultiCard
    android:layout_width="match_parent"
    android:layout_height="55dp"
    app:mc_content="13421812821"
    app:mc_hascontent="true"
    app:mc_title="设置手机号码"
    app:mc_ismobile="true"/>
```

