package okhttp3.internal.http2;

import bg.m;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i6, m source, int i10, boolean z10) {
                k.e(source, "source");
                source.skip(i10);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i6, List<Header> responseHeaders, boolean z10) {
                k.e(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i6, List<Header> requestHeaders) {
                k.e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i6, ErrorCode errorCode) {
                k.e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i6, m mVar, int i10, boolean z10);

    boolean onHeaders(int i6, List<Header> list, boolean z10);

    boolean onRequest(int i6, List<Header> list);

    void onReset(int i6, ErrorCode errorCode);
}
