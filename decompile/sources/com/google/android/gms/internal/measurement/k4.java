package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k4 {

    /* renamed from: x, reason: collision with root package name */
    public static volatile cb.g f2317x = null;

    /* renamed from: y, reason: collision with root package name */
    public static Toast f2318y = null;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f2319z = true;

    public static void b(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(w1.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final int i(Cursor c10, String str) {
        String str2;
        kotlin.jvm.internal.k.e(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c10.getColumnNames();
                    kotlin.jvm.internal.k.b(columnNames);
                    String concat = ".".concat(str);
                    String b10 = w8.k.b('`', ".", str);
                    int length = columnNames.length;
                    int i6 = 0;
                    int i10 = 0;
                    while (i10 < length) {
                        String str3 = columnNames[i10];
                        int i11 = i6 + 1;
                        if (str3.length() >= str.length() + 2 && (df.u.z(str3, concat, false) || (str3.charAt(0) == '`' && df.u.z(str3, b10, false)))) {
                            columnIndex = i6;
                            break;
                        }
                        i10++;
                        i6 = i11;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c10.getColumnNames();
            kotlin.jvm.internal.k.d(columnNames2, "getColumnNames(...)");
            StringBuilder sb2 = new StringBuilder();
            ie.i.o0(columnNames2, sb2, ", ", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", null);
            str2 = sb2.toString();
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static String j(e1.m context, int i6) {
        kotlin.jvm.internal.k.e(context, "context");
        if (i6 <= 16777215) {
            return String.valueOf(i6);
        }
        try {
            String resourceName = context.f4172a.getResources().getResourceName(i6);
            kotlin.jvm.internal.k.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i6);
        }
    }

    public static String k(Context context, ArrayList arrayList) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList2.addAll(arrayList);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    public static String l(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i6 = 0; i6 < str.length(); i6++) {
                sb2.append(str.charAt(i6));
                if (str2.length() > i6) {
                    sb2.append(str2.charAt(i6));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static void q(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            o5.a0.b(viewGroup, z10);
        } else if (f2319z) {
            try {
                o5.a0.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f2319z = false;
            }
        }
    }

    public abstract boolean c(hb.o oVar, hb.c cVar, hb.c cVar2);

    public abstract boolean d(hb.o oVar, Object obj, Object obj2);

    public abstract boolean e(hb.o oVar, hb.n nVar, hb.n nVar2);

    public abstract hb.c g(hb.o oVar);

    public abstract hb.n h(hb.o oVar);

    public abstract View m(int i6);

    public abstract boolean n();

    public abstract void o(hb.n nVar, hb.n nVar2);

    public abstract void p(hb.n nVar, Thread thread);
}
