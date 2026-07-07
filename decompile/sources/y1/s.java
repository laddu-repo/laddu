package y1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class s extends i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14393x;

    public s(int i) {
        super(i == 2000 ? 2001 : i);
        this.f14393x = 1;
    }

    public static s a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !com.bumptech.glide.f.U(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new r(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new s(iOException, i10, i);
    }

    public s(int i, String str) {
        super(i == 2000 ? 2001 : i, str);
        this.f14393x = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(IOException iOException, int i, int i10) {
        if (i == 2000 && i10 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.f14393x = i10;
    }

    public s(int i, IOException iOException, String str) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f14393x = 1;
    }
}
