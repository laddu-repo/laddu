package m2;

import a2.e1;
import db.c1;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements Closeable {
    public static final Charset D = StandardCharsets.UTF_8;
    public y A;
    public Socket B;
    public volatile boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final j1.f0 f8552x;

    /* renamed from: y, reason: collision with root package name */
    public final u2.o f8553y = new u2.o("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: z, reason: collision with root package name */
    public final Map f8554z = Collections.synchronizedMap(new HashMap());

    public z(j1.f0 f0Var) {
        this.f8552x = f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.C) {
            return;
        }
        try {
            y yVar = this.A;
            if (yVar != null) {
                yVar.close();
            }
            this.f8553y.e(null);
            Socket socket = this.B;
            if (socket != null) {
                socket.close();
            }
            this.C = true;
        } catch (Throwable th) {
            this.C = true;
            throw th;
        }
    }

    public final void d(Socket socket) {
        this.B = socket;
        this.A = new y(this, socket.getOutputStream());
        this.f8553y.f(new x(this, socket.getInputStream()), new ua.f(this), 0);
    }

    public final void f(c1 c1Var) {
        u1.c.h(this.A);
        y yVar = this.A;
        yVar.getClass();
        yVar.f8551z.post(new e1(yVar, new cb.f(a0.f8429h).b(c1Var).getBytes(D), c1Var, 16));
    }
}
