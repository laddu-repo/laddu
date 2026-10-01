package m4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8442d;

    public e(int i, int i10, long j8, long j9) {
        this.f8439a = i;
        this.f8440b = i10;
        this.f8441c = j8;
        this.f8442d = j9;
    }

    public static e a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            e eVar = new e(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return eVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f8439a);
            dataOutputStream.writeInt(this.f8440b);
            dataOutputStream.writeLong(this.f8441c);
            dataOutputStream.writeLong(this.f8442d);
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
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (this.f8440b == eVar.f8440b && this.f8441c == eVar.f8441c && this.f8439a == eVar.f8439a && this.f8442d == eVar.f8442d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8440b), Long.valueOf(this.f8441c), Integer.valueOf(this.f8439a), Long.valueOf(this.f8442d));
    }
}
