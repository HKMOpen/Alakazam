package com.commit451.alakazam;

import android.view.View;

import java.lang.ref.WeakReference;

/**
 * Hides the view when run. Usually used with {@link android.view.ViewPropertyAnimator#withEndAction(Runnable)}
 */
public class HideRunnable implements Runnable {

    private WeakReference<View> viewWeakReference;

    public HideRunnable(View view) {
        viewWeakReference = new WeakReference<>(view);
    }

    @Override
    public void run() {
        if (viewWeakReference != null) {
            View view = viewWeakReference.get();
            if (view != null) {
                view.setVisibility(View.GONE);
            }
        }
    }
}
