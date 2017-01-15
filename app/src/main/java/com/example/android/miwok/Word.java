package com.example.android.miwok;

import android.media.Image;

/**
 * Created by kneto on 12/4/16.
 */

public class Word {

    private String defaultWord;
    private String minworkWord;
    private int imageResourceId;
    private int soundResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    private static final int NO_SOUND_PROVIDED = -1;


    public Word(String defaultWord, String minworkWord, int imageResourceId, int soundResourceId) {
        this.defaultWord = defaultWord;
        this.minworkWord = minworkWord;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = soundResourceId;
    }

    public Word(String defaultWord, String minworkWord, int imageResourceId) {
        this.defaultWord = defaultWord;
        this.minworkWord = minworkWord;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = NO_SOUND_PROVIDED;
    }

    public Word(String defaultWord, String minworkWord) {
        this.defaultWord = defaultWord;
        this.minworkWord = minworkWord;
        this.imageResourceId = NO_IMAGE_PROVIDED;
        this.soundResourceId = NO_SOUND_PROVIDED;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public String getMinworkWord() {
        return minworkWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public void setMinworkWord(String minworkWord) {
        this.minworkWord = minworkWord;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public void setSoundResourceId(int soundResourceId) {
        this.soundResourceId = soundResourceId;
    }
}
