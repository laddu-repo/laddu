package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ie.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        k.e(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> additionalStores) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        k.e(additionalStores, "additionalStores");
        AndroidKnownStore[] values = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AndroidKnownStore androidKnownStore : values) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List Z = j.Z(new LinkedHashSet(j.P(additionalStores, arrayList)));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : Z) {
            String str = (String) obj;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(str, of2);
                } else {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
                if (packageInfo != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
