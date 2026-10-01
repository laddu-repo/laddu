package me;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends CancellationException {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient d1 f8741v;

    public w0(String str, Throwable th, d1 d1Var) {
        super(str);
        this.f8741v = d1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return de.i.a(w0Var.getMessage(), getMessage()) && de.i.a(w0Var.f8741v, this.f8741v) && de.i.a(w0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        de.i.b(message);
        int iHashCode = (this.f8741v.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8741v;
    }
}
