package com.stud.hellomoon.app;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by ken.cui on 2/18/2016.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c) {
        if (mPlayer == null) {
            mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stop();
                }
            });
        }
        mPlayer.start();
    }

    public void pause() {
        if (mPlayer != null) {
            mPlayer.pause();
        }
    }
}
