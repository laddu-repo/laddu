package ca;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2000b;

    public /* synthetic */ e(int i6, int i10) {
        this.f1999a = i10;
        this.f2000b = i6;
    }

    public static void a(String str) {
        int i6;
        boolean z10;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                if (!z11) {
                    i6 = i10;
                } else {
                    i6 = length;
                }
                if (k.g(str.charAt(i6), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i10++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }
    }

    public static String b(int i6) {
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) ((i6 >> 24) & 255)) + ((char) ((i6 >> 16) & 255)) + ((char) ((i6 >> 8) & 255)) + ((char) (i6 & 255));
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract void i(i5.c cVar);

    public abstract void j(i5.c cVar, int i6, int i10);

    public abstract void k(i5.c cVar);

    public abstract void l(i5.c cVar, int i6, int i10);

    public String toString() {
        switch (this.f1999a) {
            case 2:
                return b(this.f2000b);
            default:
                return super.toString();
        }
    }

    public void h(i5.c cVar) {
    }
}
