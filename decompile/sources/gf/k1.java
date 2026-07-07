package gf;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 extends CancellationException {

    /* renamed from: x, reason: collision with root package name */
    public final transient t1 f5684x;

    public k1(String str, Throwable th, t1 t1Var) {
        super(str);
        this.f5684x = t1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (!kotlin.jvm.internal.k.a(k1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.k.a(k1Var.f5684x, this.f5684x) || !kotlin.jvm.internal.k.a(k1Var.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i6;
        String message = getMessage();
        kotlin.jvm.internal.k.b(message);
        int hashCode = (this.f5684x.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i6 = cause.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f5684x;
    }
}
