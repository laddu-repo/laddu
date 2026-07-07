package w1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends c {
    public final int B;
    public final byte[] C;
    public final DatagramPacket D;
    public Uri E;
    public DatagramSocket F;
    public MulticastSocket G;
    public InetAddress H;
    public boolean I;
    public int J;

    public c0(int i6) {
        super(true);
        this.B = i6;
        byte[] bArr = new byte[2000];
        this.C = bArr;
        this.D = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // w1.h
    public final void close() {
        this.E = null;
        MulticastSocket multicastSocket = this.G;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.H;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.G = null;
        }
        DatagramSocket datagramSocket = this.F;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.F = null;
        }
        this.H = null;
        this.J = 0;
        if (this.I) {
            this.I = false;
            c();
        }
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.J;
        DatagramPacket datagramPacket = this.D;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.F;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.J = length;
                b(length);
            } catch (SocketTimeoutException e10) {
                throw new j(e10, 2002);
            } catch (IOException e11) {
                throw new j(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.J;
        int min = Math.min(i12, i10);
        System.arraycopy(this.C, length2 - i12, bArr, i6, min);
        this.J -= min;
        return min;
    }

    @Override // w1.h
    public final long y(l lVar) {
        Uri uri = lVar.f13542a;
        this.E = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.E.getPort();
        f();
        try {
            this.H = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.H, port);
            if (this.H.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.G = multicastSocket;
                multicastSocket.joinGroup(this.H);
                this.F = this.G;
            } else {
                this.F = new DatagramSocket(inetSocketAddress);
            }
            this.F.setSoTimeout(this.B);
            this.I = true;
            g(lVar);
            return -1L;
        } catch (IOException e10) {
            throw new j(e10, 2001);
        } catch (SecurityException e11) {
            throw new j(e11, 2006);
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.E;
    }
}
