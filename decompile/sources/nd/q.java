package nd;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import p.a3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9714a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Filterable f9715b;

    public /* synthetic */ q() {
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.f9714a) {
            case 1:
                return ((a3) ((x0.a) this.f9715b)).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r8) {
        /*
            r7 = this;
            int r0 = r7.f9714a
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            android.widget.Filterable r0 = r7.f9715b
            x0.a r0 = (x0.a) r0
            p.a3 r0 = (p.a3) r0
            androidx.appcompat.widget.SearchView r1 = r0.H
            if (r8 != 0) goto L12
            java.lang.String r8 = ""
            goto L16
        L12:
            java.lang.String r8 = r8.toString()
        L16:
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L38
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L24
            goto L38
        L24:
            android.app.SearchableInfo r1 = r0.I     // Catch: java.lang.RuntimeException -> L30
            android.database.Cursor r8 = r0.g(r1, r8)     // Catch: java.lang.RuntimeException -> L30
            if (r8 == 0) goto L38
            r8.getCount()     // Catch: java.lang.RuntimeException -> L30
            goto L39
        L30:
            r8 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r8)
        L38:
            r8 = r3
        L39:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r8 == 0) goto L49
            int r1 = r8.getCount()
            r0.count = r1
            r0.values = r8
            goto L4e
        L49:
            r8 = 0
            r0.count = r8
            r0.values = r3
        L4e:
            return r0
        L4f:
            android.widget.Filterable r0 = r7.f9715b
            nd.r r0 = (nd.r) r0
            java.util.List r0 = r0.B
            java.lang.String r1 = "toLowerCase(...)"
            java.lang.String r2 = "getDefault(...)"
            if (r8 == 0) goto L7a
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L7a
            java.lang.CharSequence r8 = df.m.n0(r8)
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L7a
            java.util.Locale r3 = java.util.Locale.getDefault()
            kotlin.jvm.internal.k.d(r3, r2)
            java.lang.String r8 = r8.toLowerCase(r3)
            kotlin.jvm.internal.k.d(r8, r1)
            goto L7b
        L7a:
            r8 = 0
        L7b:
            if (r8 != 0) goto L7f
            java.lang.String r8 = ""
        L7f:
            int r3 = r8.length()
            if (r3 != 0) goto L86
            goto Lb6
        L86:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.util.Locale r6 = java.util.Locale.getDefault()
            kotlin.jvm.internal.k.d(r6, r2)
            java.lang.String r5 = r5.toLowerCase(r6)
            kotlin.jvm.internal.k.d(r5, r1)
            r6 = 0
            boolean r5 = df.m.I(r5, r8, r6)
            if (r5 == 0) goto L8f
            r3.add(r4)
            goto L8f
        Lb5:
            r0 = r3
        Lb6:
            android.widget.Filter$FilterResults r8 = new android.widget.Filter$FilterResults
            r8.<init>()
            r8.values = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.q.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        switch (this.f9714a) {
            case 0:
                r rVar = (r) this.f9715b;
                ArrayList arrayList = rVar.C;
                List list = null;
                if (filterResults != null) {
                    obj = filterResults.values;
                } else {
                    obj = null;
                }
                if (obj instanceof List) {
                    list = (List) obj;
                }
                if (list == null) {
                    list = ie.r.f6846x;
                }
                arrayList.clear();
                arrayList.addAll(list);
                rVar.f13929x.b();
                return;
            default:
                x0.a aVar = (x0.a) this.f9715b;
                Cursor cursor = aVar.f14456z;
                Object obj2 = filterResults.values;
                if (obj2 != null && obj2 != cursor) {
                    ((a3) aVar).b((Cursor) obj2);
                    return;
                }
                return;
        }
    }

    public q(r rVar) {
        this.f9715b = rVar;
    }
}
