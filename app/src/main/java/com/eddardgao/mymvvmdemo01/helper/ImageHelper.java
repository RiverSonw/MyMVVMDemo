package com.eddardgao.mymvvmdemo01.helper;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/19
 * @describe ::
 * @Version ::
 */
public class ImageHelper {

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView,String url ){
        Glide.with(imageView.getContext()).load(url)
                .into(imageView);

    }


}
