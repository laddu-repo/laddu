package d;

import a2.l1;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends f.h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f3474h;

    public p(q qVar) {
        this.f3474h = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h
    public final void b(int i6, g.a aVar, Object obj) {
        Bundle bundle;
        int i10;
        String[] strArr;
        q qVar = this.f3474h;
        u5.r b10 = aVar.b(qVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new l1(this, i6, b10, 1));
            return;
        }
        Intent a10 = aVar.a(qVar, obj);
        if (a10.getExtras() != null) {
            Bundle extras = a10.getExtras();
            kotlin.jvm.internal.k.b(extras);
            if (extras.getClassLoader() == null) {
                a10.setExtrasClassLoader(qVar.getClassLoader());
            }
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i11])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    throw new IllegalArgumentException(r4.a.o(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                        if (!hashSet.contains(Integer.valueOf(i13))) {
                            strArr[i12] = stringArrayExtra[i13];
                            i12++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (qVar instanceof h0.c) {
                }
                h0.a.e(qVar, stringArrayExtra, i6);
                return;
            } else {
                if (qVar instanceof h0.b) {
                    new Handler(Looper.getMainLooper()).post(new d6.e(strArr, qVar, i6, 1));
                    return;
                }
                return;
            }
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            f.i iVar = (f.i) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.k.b(iVar);
                i10 = i6;
                try {
                    qVar.startIntentSenderForResult(iVar.f4607x, i10, iVar.f4608y, iVar.f4609z, iVar.A, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    new Handler(Looper.getMainLooper()).post(new l1(this, i10, e, 2));
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i10 = i6;
            }
        } else {
            qVar.startActivityForResult(a10, i6, bundle2);
        }
    }
}
