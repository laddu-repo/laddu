package w5;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14107a = o.h("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f14108b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23 && databasePath.exists()) {
            String str = f14107a;
            o.f().b(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i6 >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i6 < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str2 : f14108b) {
                    hashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        o.f().i(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    o.f().b(str, format, new Throwable[0]);
                }
            }
        }
    }
}
