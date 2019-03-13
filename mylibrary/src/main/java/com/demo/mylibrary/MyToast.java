package com.demo.mylibrary;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class MyToast {
    private static Toast toast = null;
    private static final int LENGTH_DEFAULT = Toast.LENGTH_SHORT;

    /**
     * 通用，吐司提示。
     */
    public static void cancel() {
        if (toast != null) {
            toast.cancel();
        }
    }

    /**
     * 通用，吐司提示。
     * @param context
     * @param textId
     */
    public static void show(Context context, int textId) {
        show(context, textId, LENGTH_DEFAULT);
    }

    /**
     * 通用，吐司提示。
     * @param context
     * @param text
     */
    public static void show(Context context, String text) {
        show(context, text, LENGTH_DEFAULT);
    }

    /**
     * 通用，吐司提示。
     * @param context
     * @param textId
     * @param duration LENGTH_SHORT或LENGTH_LONG
     */
    public static void show(Context context, int textId, int duration) {
        String text = context.getString(textId);
        show(context, text, duration);
    }

    /**
     * 通用，吐司提示。
     * @param context
     * @param text
     * @param duration LENGTH_SHORT或LENGTH_LONG
     */
    public static void show(Context context, String text, int duration) {
        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
