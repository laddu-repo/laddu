package v2;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import h8.c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13257a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13258b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13259c;

    /* renamed from: d, reason: collision with root package name */
    public static long f13260d;

    public static long a() {
        SocketTimeoutException socketTimeoutException;
        char c10;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (f13258b) {
            }
            datagramSocket.setSoTimeout(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
            c();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i6 = 0;
            int i10 = 0;
            while (i6 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i6], 123);
                bArr2[b10] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                    c10 = 0;
                } else {
                    long j = currentTimeMillis / 1000;
                    Long.signum(j);
                    long j10 = currentTimeMillis - (j * 1000);
                    socketTimeoutException = socketTimeoutException2;
                    c10 = 0;
                    long j11 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j11 >> 24);
                    bArr[41] = (byte) (j11 >> 16);
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) j11;
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j13 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b11 = bArr3[c10];
                    int i11 = bArr3[1] & 255;
                    long e10 = e(24, bArr3);
                    long e11 = e(32, bArr3);
                    long e12 = e(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i11, e12);
                    long j14 = (j13 + (((e12 - j13) + (e11 - e10)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j14;
                } catch (SocketTimeoutException e13) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e13;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e13);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i12 = i10 + 1;
                    if (i10 >= 10) {
                        break;
                    }
                    i6++;
                    i10 = i12;
                    b10 = 0;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b10, byte b11, int i6, long j) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(c.i(b11, "SNTP: Untrusted mode: "));
            }
            if (i6 != 0 && i6 <= 15) {
                if (j != 0) {
                    return;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            }
            throw new IOException(c.i(i6, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void c() {
        synchronized (f13258b) {
        }
    }

    public static long d(int i6, byte[] bArr) {
        int i10 = bArr[i6];
        int i11 = bArr[i6 + 1];
        int i12 = bArr[i6 + 2];
        int i13 = bArr[i6 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long e(int i6, byte[] bArr) {
        long d10 = d(i6, bArr);
        long d11 = d(i6 + 4, bArr);
        if (d10 == 0 && d11 == 0) {
            return 0L;
        }
        return ((d11 * 1000) / 4294967296L) + ((d10 - 2208988800L) * 1000);
    }
}
