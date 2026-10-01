package bg;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class x extends q {
    @Override // bg.q
    public final j0 a(c0 file) {
        kotlin.jvm.internal.k.e(file, "file");
        File file2 = file.toFile();
        Logger logger = a0.f1688a;
        return new e(1, new FileOutputStream(file2, true), new Object());
    }

    @Override // bg.q
    public void b(c0 source, c0 target) {
        kotlin.jvm.internal.k.e(source, "source");
        kotlin.jvm.internal.k.e(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // bg.q
    public final void c(c0 c0Var) {
        if (!c0Var.toFile().mkdir()) {
            b0.e i6 = i(c0Var);
            if (i6 == null || !i6.f1229c) {
                throw new IOException("failed to create directory: " + c0Var);
            }
        }
    }

    @Override // bg.q
    public final void d(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        if (!Thread.interrupted()) {
            File file = path.toFile();
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // bg.q
    public final List g(c0 c0Var) {
        File file = c0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!file.exists()) {
                throw new FileNotFoundException("no such file: " + c0Var);
            }
            throw new IOException("failed to list " + c0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.k.b(str);
            arrayList.add(c0Var.d(str));
        }
        ie.o.y(arrayList);
        return arrayList;
    }

    @Override // bg.q
    public b0.e i(c0 path) {
        kotlin.jvm.internal.k.e(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new b0.e(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // bg.q
    public final w j(c0 c0Var) {
        return new w(new RandomAccessFile(c0Var.toFile(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    @Override // bg.q
    public final j0 k(c0 file) {
        kotlin.jvm.internal.k.e(file, "file");
        return b.j(file.toFile());
    }

    @Override // bg.q
    public final l0 l(c0 file) {
        kotlin.jvm.internal.k.e(file, "file");
        return b.k(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
