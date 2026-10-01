package bg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f1727a;

    public k0(Socket socket) {
        kotlin.jvm.internal.k.e(socket, "socket");
        this.f1727a = socket;
    }

    @Override // bg.g
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // bg.g
    public final void timedOut() {
        Socket socket = this.f1727a;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (b.g(e10)) {
                a0.f1688a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            a0.f1688a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
