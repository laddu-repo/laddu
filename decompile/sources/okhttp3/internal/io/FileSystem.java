package okhttp3.internal.io;

import bg.b;
import bg.j0;
import bg.l0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public j0 appendingSink(File file) {
                k.e(file, "file");
                try {
                    return b.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return b.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) {
                k.e(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) {
                k.e(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            deleteContents(file);
                        }
                        if (!file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + directory);
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                k.e(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File from, File to) {
                k.e(from, "from");
                k.e(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            public j0 sink(File file) {
                k.e(file, "file");
                try {
                    return b.j(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return b.j(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                k.e(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public l0 source(File file) {
                k.e(file, "file");
                return b.k(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    j0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    j0 sink(File file);

    long size(File file);

    l0 source(File file);
}
