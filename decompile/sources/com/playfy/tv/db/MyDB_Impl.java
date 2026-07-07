package com.playfy.tv.db;

import com.playfy.tv.db.MyDB_Impl;
import e1.g;
import he.a;
import he.m;
import ie.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.x;
import pd.b;
import x4.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MyDB_Impl extends MyDB {

    /* renamed from: l, reason: collision with root package name */
    public final m f3370l;

    /* renamed from: m, reason: collision with root package name */
    public final m f3371m;

    /* renamed from: n, reason: collision with root package name */
    public final m f3372n;

    public MyDB_Impl() {
        final int i6 = 0;
        this.f3370l = a.d(new ve.a(this) { // from class: hd.f

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ MyDB_Impl f6058y;

            {
                this.f6058y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new e(this.f6058y);
                    case 1:
                        return new i(this.f6058y);
                    default:
                        return new pd.b(this.f6058y);
                }
            }
        });
        final int i10 = 1;
        this.f3371m = a.d(new ve.a(this) { // from class: hd.f

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ MyDB_Impl f6058y;

            {
                this.f6058y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new e(this.f6058y);
                    case 1:
                        return new i(this.f6058y);
                    default:
                        return new pd.b(this.f6058y);
                }
            }
        });
        final int i11 = 2;
        this.f3372n = a.d(new ve.a(this) { // from class: hd.f

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ MyDB_Impl f6058y;

            {
                this.f6058y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new e(this.f6058y);
                    case 1:
                        return new i(this.f6058y);
                    default:
                        return new pd.b(this.f6058y);
                }
            }
        });
    }

    @Override // x4.w
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // x4.w
    public final i e() {
        return new i(this, new LinkedHashMap(), new LinkedHashMap(), "favorites", "playlistFav", "playlists");
    }

    @Override // x4.w
    public final g f() {
        return new hd.g(this);
    }

    @Override // x4.w
    public final Set l() {
        return new LinkedHashSet();
    }

    @Override // x4.w
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e a10 = x.a(hd.e.class);
        r rVar = r.f6846x;
        linkedHashMap.put(a10, rVar);
        linkedHashMap.put(x.a(hd.i.class), rVar);
        linkedHashMap.put(x.a(b.class), rVar);
        return linkedHashMap;
    }

    @Override // com.playfy.tv.db.MyDB
    public final hd.e t() {
        return (hd.e) this.f3370l.getValue();
    }

    @Override // com.playfy.tv.db.MyDB
    public final b u() {
        return (b) this.f3372n.getValue();
    }

    @Override // com.playfy.tv.db.MyDB
    public final hd.i v() {
        return (hd.i) this.f3371m.getValue();
    }
}
