package cf;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.d1;
import com.playfy.tv.R;
import com.playfy.tv.db.MyDB;
import fd.h0;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import he.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kd.d0;
import kotlin.jvm.internal.x;
import l4.v;
import n4.f;
import od.c0;
import od.i0;
import od.k0;
import od.n0;
import okhttp3.CacheControl;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2074x;

    public /* synthetic */ p(int i6) {
        this.f2074x = i6;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g5.c d02;
        Integer valueOf;
        ContextWrapper contextWrapper;
        switch (this.f2074x) {
            case 0:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                Resources resources = (Resources) obj;
                kotlin.jvm.internal.k.e(resources, "resources");
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                kotlin.jvm.internal.k.e((Resources) obj, "<unused var>");
                return Boolean.TRUE;
            case 3:
                if (((Character) obj).charValue() == '-') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 4:
                if (((Character) obj).charValue() == '-') {
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 5:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z14 = false;
                } else {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 6:
                if (((Character) obj).charValue() == ':') {
                    z15 = true;
                } else {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case 7:
                if (((Character) obj).charValue() == ':') {
                    z16 = true;
                } else {
                    z16 = false;
                }
                return Boolean.valueOf(z16);
            case 8:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    z17 = true;
                } else {
                    z17 = false;
                }
                return Boolean.valueOf(z17);
            case 9:
                g5.a _connection = (g5.a) obj;
                kotlin.jvm.internal.k.e(_connection, "_connection");
                d02 = _connection.d0("SELECT * FROM favorites");
                try {
                    int p10 = jb.b.p(d02, "id");
                    int p11 = jb.b.p(d02, "title");
                    int p12 = jb.b.p(d02, "image");
                    int p13 = jb.b.p(d02, "formats");
                    ArrayList arrayList = new ArrayList();
                    while (d02.X()) {
                        long j = d02.getLong(p10);
                        String M = d02.M(p11);
                        String M2 = d02.M(p12);
                        String value = d02.M(p13);
                        kotlin.jvm.internal.k.e(value, "value");
                        arrayList.add(new kd.l(j, M, M2, df.m.b0(value, new String[]{"*"})));
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                g5.a _connection2 = (g5.a) obj;
                kotlin.jvm.internal.k.e(_connection2, "_connection");
                d02 = _connection2.d0("SELECT * FROM playlists");
                try {
                    int p14 = jb.b.p(d02, "id");
                    int p15 = jb.b.p(d02, "title");
                    int p16 = jb.b.p(d02, "path");
                    ArrayList arrayList2 = new ArrayList();
                    while (d02.X()) {
                        if (d02.isNull(p14)) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf((int) d02.getLong(p14));
                        }
                        arrayList2.add(new d0(d02.M(p15), valueOf, d02.M(p16)));
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                ng.a module = (ng.a) obj;
                kotlin.jvm.internal.k.e(module, "$this$module");
                h0 h0Var = new h0(1);
                kotlin.jvm.internal.e a10 = x.a(MyDB.class);
                qg.b bVar = rg.b.f11954e;
                jg.b bVar2 = jg.b.f7488x;
                module.a(new lg.b(new jg.a(bVar, a10, h0Var, bVar2)));
                h0 h0Var2 = new h0(2);
                kotlin.jvm.internal.e a11 = x.a(hd.e.class);
                jg.b bVar3 = jg.b.f7489y;
                module.a(new lg.b(new jg.a(bVar, a11, h0Var2, bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(pd.b.class), new h0(3), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(hd.i.class), new h0(4), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(xf.c.class), new h0(5), bVar2)));
                module.a(new lg.b(new jg.a(bVar, x.a(id.h.class), new h0(6), bVar2)));
                module.a(new lg.b(new jg.a(bVar, x.a(SharedPreferences.class), new h0(7), bVar2)));
                module.a(new lg.b(new jg.a(bVar, x.a(n0.class), new id.i(0), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(od.q.class), new id.i(1), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(i0.class), new id.i(2), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(od.u.class), new id.i(3), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(k0.class), new id.i(4), bVar3)));
                module.a(new lg.b(new jg.a(bVar, x.a(c0.class), new id.i(5), bVar3)));
                return y.f6101a;
            case 12:
                bf.d it = (bf.d) obj;
                kotlin.jvm.internal.k.e(it, "it");
                return ug.a.a(it);
            case 13:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.k.e(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 14:
                Context it3 = (Context) obj;
                kotlin.jvm.internal.k.e(it3, "it");
                if (it3 instanceof ContextWrapper) {
                    return ((ContextWrapper) it3).getBaseContext();
                }
                return null;
            case 15:
                o1.c initializer = (o1.c) obj;
                kotlin.jvm.internal.k.e(initializer, "$this$initializer");
                return new l4.m();
            case 16:
                Context it4 = (Context) obj;
                kotlin.jvm.internal.k.e(it4, "it");
                if (it4 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) it4;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 17:
                Context it5 = (Context) obj;
                kotlin.jvm.internal.k.e(it5, "it");
                if (it5 instanceof Activity) {
                    return (Activity) it5;
                }
                return null;
            case 18:
                l4.u it6 = (l4.u) obj;
                kotlin.jvm.internal.k.e(it6, "it");
                return it6.f8196z;
            case 19:
                l4.u it7 = (l4.u) obj;
                kotlin.jvm.internal.k.e(it7, "it");
                if (it7 instanceof v) {
                    v vVar = (v) it7;
                    return vVar.h(vVar.D.f12259a);
                }
                return null;
            case 20:
                View it8 = (View) obj;
                kotlin.jvm.internal.k.e(it8, "it");
                Object parent = it8.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 21:
                View it9 = (View) obj;
                kotlin.jvm.internal.k.e(it9, "it");
                Object tag = it9.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (l4.x) ((WeakReference) tag).get();
                }
                if (tag instanceof l4.x) {
                    return (l4.x) tag;
                }
                return null;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                o1.c initializer2 = (o1.c) obj;
                kotlin.jvm.internal.k.e(initializer2, "$this$initializer");
                return new f.a();
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                o1.c initializer3 = (o1.c) obj;
                kotlin.jvm.internal.k.e(initializer3, "$this$initializer");
                return new o4.b(d1.c(initializer3));
            case 24:
                l4.u destination = (l4.u) obj;
                kotlin.jvm.internal.k.e(destination, "destination");
                v vVar2 = destination.f8196z;
                if (vVar2 == null || vVar2.D.f12259a != destination.f8195y.f9924a) {
                    return null;
                }
                return vVar2;
            case 25:
                l4.u destination2 = (l4.u) obj;
                kotlin.jvm.internal.k.e(destination2, "destination");
                v vVar3 = destination2.f8196z;
                if (vVar3 == null || vVar3.D.f12259a != destination2.f8195y.f9924a) {
                    return null;
                }
                return vVar3;
            case 26:
                l4.u it10 = (l4.u) obj;
                kotlin.jvm.internal.k.e(it10, "it");
                return Integer.valueOf(it10.f8195y.f9924a);
            case 27:
                String it11 = (String) obj;
                kotlin.jvm.internal.k.e(it11, "it");
                return df.m.i0(it11, ";");
            case 28:
                y7.c cVar = (y7.c) obj;
                CacheControl cacheControl = CacheControl.FORCE_NETWORK;
                cVar.getClass();
                kotlin.jvm.internal.k.e(cacheControl, "cacheControl");
                cVar.f15009d.cacheControl(cacheControl);
                return y.f6101a;
            default:
                y7.c cVar2 = (y7.c) obj;
                cVar2.f15009d.addHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 17_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Mobile/15E148 Safari/605.1.15/Clipbox+/2.2.8");
                Request.Builder builder = cVar2.f15009d;
                builder.addHeader("Accept-Language", "en-US,en;q=0.9");
                builder.tag(r7.a.class, r7.a.f11842z);
                return y.f6101a;
        }
    }
}
