package e8;

import db.k0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m2.a0;
import m2.z;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f4468a;

    /* renamed from: b, reason: collision with root package name */
    public long f4469b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4470c;

    public b(int i6, URL url, long j) {
        this.f4468a = i6;
        this.f4470c = url;
        this.f4469b = j;
    }

    public static byte[] b(byte b10, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b10, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public k0 a(byte[] bArr) {
        boolean z10;
        long j;
        ArrayList arrayList = (ArrayList) this.f4470c;
        if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        String str = new String(bArr, 0, bArr.length - 2, z.D);
        arrayList.add(str);
        int i6 = this.f4468a;
        if (i6 != 1) {
            if (i6 == 2) {
                try {
                    Matcher matcher = a0.f8424c.matcher(str);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        j = Long.parseLong(group);
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        this.f4469b = j;
                    }
                    if (str.isEmpty()) {
                        if (this.f4469b > 0) {
                            this.f4468a = 3;
                            return null;
                        }
                        k0 k8 = k0.k(arrayList);
                        arrayList.clear();
                        this.f4468a = 1;
                        this.f4469b = 0L;
                        return k8;
                    }
                    return null;
                } catch (NumberFormatException e10) {
                    throw l0.b(str, e10);
                }
            }
            throw new IllegalStateException();
        }
        if (a0.f8422a.matcher(str).matches() || a0.f8423b.matcher(str).matches()) {
            this.f4468a = 2;
            return null;
        }
        return null;
    }
}
