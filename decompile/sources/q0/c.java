package q0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v.k f10795a = new v.k(2);

    /* renamed from: b, reason: collision with root package name */
    public static final d2.a f10796b = new d2.a(7);

    public static f4.f a(Context context, List list) {
        String str;
        Typeface c10;
        a8.f.F("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < list.size(); i6++) {
                d dVar = (d) list.get(i6);
                if (Build.VERSION.SDK_INT >= 31 && (c10 = l0.f.c((str = dVar.f10801e))) != null && l0.f.d(c10) != null) {
                    arrayList.add(new i[]{new i(str, dVar.f10802f)});
                } else {
                    ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                    if (b10 == null) {
                        return new f4.f();
                    }
                    arrayList.add(c(context, dVar, b10.authority));
                }
            }
            return new f4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [q0.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        d2.a aVar = f10796b;
        v.k kVar = f10795a;
        a8.f.F("FontProvider.getProvider");
        try {
            List list = dVar.f10800d;
            String str = dVar.f10797a;
            String str2 = dVar.f10798b;
            if (list == null) {
                list = k0.b.k(resources, 0);
            }
            ?? obj = new Object();
            obj.f10792a = str;
            obj.f10793b = str2;
            obj.f10794c = list;
            ProviderInfo providerInfo = (ProviderInfo) kVar.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, aVar);
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i6));
                        Collections.sort(arrayList2, aVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                    break;
                                }
                            }
                            kVar.l(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lc.c] */
    public static i[] c(Context context, d dVar, String str) {
        k7.d dVar2;
        int i6;
        int i10;
        ArrayList arrayList;
        Uri withAppendedId;
        int i11;
        boolean z10;
        a8.f.F("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                dVar2 = new k7.d(context, build);
            } else {
                ?? obj = new Object();
                obj.f8328x = context.getContentResolver().acquireUnstableContentProviderClient(build);
                dVar2 = obj;
            }
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                a8.f.F("ContentQueryWrapper.query");
                try {
                    cursor = dVar2.t(build, strArr, new String[]{dVar.f10799c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i6 = cursor.getInt(columnIndex);
                            } else {
                                i6 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i10 = cursor.getInt(columnIndex4);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex3 == -1) {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i11 = cursor.getInt(columnIndex5);
                            } else {
                                i11 = CommonGatewayClient.CODE_400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(new i(uri, i10, i11, z10, i6));
                            arrayList3 = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    dVar2.close();
                    return (i[]) arrayList2.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                dVar2.close();
                throw th;
            }
        } finally {
        }
    }
}
