package u4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f12894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12895b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12896c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12897d;

    public d(int i6, int i10, long j, long j10) {
        this.f12894a = i6;
        this.f12895b = i10;
        this.f12896c = j;
        this.f12897d = j10;
    }

    public static d a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            d dVar = new d(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return dVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f12894a);
            dataOutputStream.writeInt(this.f12895b);
            dataOutputStream.writeLong(this.f12896c);
            dataOutputStream.writeLong(this.f12897d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            if (this.f12895b == dVar.f12895b && this.f12896c == dVar.f12896c && this.f12894a == dVar.f12894a && this.f12897d == dVar.f12897d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12895b), Long.valueOf(this.f12896c), Integer.valueOf(this.f12894a), Long.valueOf(this.f12897d));
    }
}
