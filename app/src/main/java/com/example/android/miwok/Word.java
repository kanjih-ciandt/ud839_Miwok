package com.example.android.miwok;

/**
 * Created by kneto on 12/4/16.
 */

public class Word {

    private String defaultWord;
    private String minworkWord;

    public Word(String defaultWord, String minworkWord) {
        this.defaultWord = defaultWord;
        this.minworkWord = minworkWord;
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


}
