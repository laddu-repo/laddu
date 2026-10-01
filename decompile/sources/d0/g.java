package d0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements s3.b, w1.g {

    /* renamed from: x, reason: collision with root package name */
    public int f3547x;

    /* renamed from: y, reason: collision with root package name */
    public int f3548y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3549z;

    public g(Context context) {
        this.f3548y = 0;
        this.f3549z = context;
    }

    @Override // s3.b
    public int a() {
        return this.f3547x;
    }

    @Override // s3.b
    public int b() {
        return this.f3548y;
    }

    @Override // w1.g
    public w1.h c() {
        return new w1.p(this.f3547x, this.f3548y, (s8.l) this.f3549z);
    }

    @Override // s3.b
    public int d() {
        int i6 = this.f3547x;
        if (i6 == -1) {
            return ((u1.t) this.f3549z).C();
        }
        return i6;
    }

    public synchronized int e() {
        PackageInfo packageInfo;
        if (this.f3547x == 0) {
            try {
                packageInfo = c9.c.a((Context) this.f3549z).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3547x = packageInfo.versionCode;
            }
        }
        return this.f3547x;
    }

    public synchronized int f() {
        int i6 = this.f3548y;
        if (i6 != 0) {
            return i6;
        }
        Context context = (Context) this.f3549z;
        PackageManager packageManager = context.getPackageManager();
        if (c9.c.a(context).f1989a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!a9.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3548y = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f3548y = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == a9.b.d()) {
            i10 = 2;
        }
        this.f3548y = i10;
        return i10;
    }

    public g() {
        this.f3549z = new s8.l(14);
        this.f3547x = 8000;
        this.f3548y = 8000;
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3549z = new ArrayList();
        this.f3548y = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f3651h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                this.f3547x = obtainStyledAttributes.getResourceId(index, this.f3547x);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3548y);
                this.f3548y = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public g(int i6, int i10, SparseArray sparseArray) {
        this.f3547x = i6;
        this.f3548y = i10;
        this.f3549z = sparseArray;
    }

    public g(v1.d dVar, r1.q qVar) {
        u1.t tVar = dVar.f13192c;
        this.f3549z = tVar;
        tVar.K(12);
        int C = tVar.C();
        if ("audio/raw".equals(qVar.f11670n)) {
            int s = a0.s(qVar.H) * qVar.F;
            if (C == 0 || C % s != 0) {
                u1.a.p("BoxParsers", "Audio sample size mismatch. stsd sample size: " + s + ", stsz sample size: " + C);
                C = s;
            }
        }
        this.f3547x = C == 0 ? -1 : C;
        this.f3548y = tVar.C();
    }
}
