package ob;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import c6.h;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import db.k0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import le.g;
import ma.n;
import qb.d;
import r2.m;
import u1.c;
import u2.p;
import y2.f0;
import y2.q;
import y2.z;
import ya.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public /* synthetic */ class a implements d, p8.a, m, p, sd.b, g, q {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a f10040x = new Object();

    public static RectF e(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.f2749e0 && (view instanceof j)) {
            j jVar = (j) view;
            int contentWidth = jVar.getContentWidth();
            int contentHeight = jVar.getContentHeight();
            int d10 = (int) n.d(jVar.getContext(), 24);
            if (contentWidth < d10) {
                contentWidth = d10;
            }
            int right = (jVar.getRight() + jVar.getLeft()) / 2;
            int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
            int i6 = contentWidth / 2;
            return new RectF(right - i6, bottom - (contentHeight / 2), i6 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static byte[] g(long j, k0 k0Var) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(k0Var.size());
        Iterator<E> it = k0Var.iterator();
        while (it.hasNext()) {
            t1.b bVar = (t1.b) it.next();
            Bundle b10 = bVar.b();
            Bitmap bitmap = bVar.f12461d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                c.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                b10.putByteArray(t1.b.f12455x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(b10);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // y2.q
    public f0 A(int i6, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.m
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // r2.m
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // qb.d
    public /* synthetic */ Object d(h hVar) {
        return AnalyticsConnectorRegistrar.zza(hVar);
    }

    @Override // p8.a
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    public void h(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        RectF e10 = e(tabLayout, view);
        RectF e11 = e(tabLayout, view2);
        drawable.setBounds(u9.a.c(f3, (int) e10.left, (int) e11.left), drawable.getBounds().top, u9.a.c(f3, (int) e10.right, (int) e11.right), drawable.getBounds().bottom);
    }

    @Override // y2.q
    public void n(z zVar) {
        throw new UnsupportedOperationException();
    }

    @Override // r2.m
    public boolean next() {
        return false;
    }

    @Override // y2.q
    public void t() {
        throw new UnsupportedOperationException();
    }

    @Override // u2.p
    public void b() {
    }
}
