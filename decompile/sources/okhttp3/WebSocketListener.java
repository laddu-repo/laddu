package okhttp3;

import bg.n;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i6, String reason) {
        k.e(webSocket, "webSocket");
        k.e(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i6, String reason) {
        k.e(webSocket, "webSocket");
        k.e(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        k.e(webSocket, "webSocket");
        k.e(t10, "t");
    }

    public void onMessage(WebSocket webSocket, n bytes) {
        k.e(webSocket, "webSocket");
        k.e(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        k.e(webSocket, "webSocket");
        k.e(response, "response");
    }

    public void onMessage(WebSocket webSocket, String text) {
        k.e(webSocket, "webSocket");
        k.e(text, "text");
    }
}
