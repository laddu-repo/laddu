package y1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c {
    public final byte[] A;
    public final DatagramPacket B;
    public Uri C;
    public DatagramSocket D;
    public MulticastSocket E;
    public InetAddress F;
    public boolean G;
    public int H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14363z;

    public b0() {
        super(true);
        this.f14363z = 8000;
        byte[] bArr = new byte[2000];
        this.A = bArr;
        this.B = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // y1.h
    public final void close() {
        this.C = null;
        MulticastSocket multicastSocket = this.E;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.F;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.E = null;
        }
        DatagramSocket datagramSocket = this.D;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.D = null;
        }
        this.F = null;
        this.H = 0;
        if (this.G) {
            this.G = false;
            d();
        }
    }

    @Override // y1.h
    public final long h(k kVar) throws a0 {
        Uri uri = kVar.f14377a;
        this.C = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.C.getPort();
        e();
        try {
            this.F = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.F, port);
            if (this.F.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.E = multicastSocket;
                multicastSocket.joinGroup(this.F);
                this.D = this.E;
            } else {
                this.D = new DatagramSocket(inetSocketAddress);
            }
            this.D.setSoTimeout(this.f14363z);
            this.G = true;
            f(kVar);
            return -1L;
        } catch (IOException e7) {
            throw new a0(e7, 2001);
        } catch (SecurityException e10) {
            throw new a0(e10, 2006);
        }
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) throws a0 {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.H;
        DatagramPacket datagramPacket = this.B;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.D;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.H = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new a0(e7, 2002);
            } catch (IOException e10) {
                throw new a0(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.H;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.A, length2 - i12, bArr, i, iMin);
        this.H -= iMin;
        return iMin;
    }

    @Override // y1.h
    public final Uri s() {
        return this.C;
    }
}
