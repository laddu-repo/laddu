package md;

import com.google.android.gms.internal.measurement.ag;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IOException f8668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8669w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qc.k f8670x;

    public j(qc.k kVar) {
        this.f8670x = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8670x.f8672a.bind(new InetSocketAddress(1120));
            this.f8669w = true;
            do {
                try {
                    Socket socketAccept = this.f8670x.f8672a.accept();
                    socketAccept.setSoTimeout(5000);
                    InputStream inputStream = socketAccept.getInputStream();
                    qc.k kVar = this.f8670x;
                    kVar.f8674c.F(new ag(kVar, inputStream, socketAccept, 11, false));
                } catch (IOException e7) {
                    k.f8671d.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                }
            } while (!this.f8670x.f8672a.isClosed());
        } catch (IOException e10) {
            this.f8668v = e10;
        }
    }
}
