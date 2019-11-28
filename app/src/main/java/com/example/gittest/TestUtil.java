package com.example.gittest;

public class TestUtil {
    private TestUtil mInstance;

    public TestUtil getmInstance() {
        if (mInstance == null) {
            mInstance = new TestUtil();
        }
        return mInstance;
    }
}
