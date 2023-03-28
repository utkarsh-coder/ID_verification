package com.android.adhaarid;

import java.io.IOException;

public interface SessionTokenCallback {
    void onSessionTokenReceived(String sessionToken) throws IOException;
}
