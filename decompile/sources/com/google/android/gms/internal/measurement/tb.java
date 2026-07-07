package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class tb extends Exception {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3107v;

    private final synchronized Throwable a() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f3107v) {
            case 1:
                a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(int i, String str) {
        super(str);
        this.f3107v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(String str, Throwable th) {
        super(str, th);
        this.f3107v = 3;
    }
}
